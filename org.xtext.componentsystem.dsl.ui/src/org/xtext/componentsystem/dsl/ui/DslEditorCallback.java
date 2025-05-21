package org.xtext.componentsystem.dsl.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

public class DslEditorCallback implements IXtextEditorCallback {

    @Override
    public void afterSave(XtextEditor editor) {
        IXtextDocument document = editor.getDocument();
        if (document == null) return;

        document.readOnly(resource -> {
            if (resource instanceof XtextResource) {
                saveAsXMI((XtextResource) resource);
            }
            return null;
        });
    }

    private void saveAsXMI(Resource resource) {
        try {
            ResourceSet resourceSet = resource.getResourceSet();
            URI xmiUri = resource.getURI().trimFileExtension().appendFileExtension("xmi");

            // Remove existing resource
            Resource existing = resourceSet.getResource(xmiUri, false);
            if (existing != null) {
            	existing.unload();
                resourceSet.getResources().remove(existing);
            }
            
            // Create new resource
            Resource xmiResource = resourceSet.createResource(xmiUri, "xmi");
            xmiResource.getContents().clear();
            xmiResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));
            xmiResource.save(null);
            System.out.println("Saved .xmi to: " + xmiUri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Stub implementations for other IXtextEditorCallback methods
    @Override
    public void beforeSetInput(XtextEditor editor) {}

    @Override
    public void afterSetInput(XtextEditor editor) {}

    @Override
    public void afterCreatePartControl(XtextEditor editor) {}

    @Override
    public void beforeDispose(XtextEditor editor) {}

    @Override
    public boolean onValidateEditorInputState(XtextEditor editor) {
        return true;
    }
}
