package org.xtext.componentsystem.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.componentsystem.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentSystem'", "'{'", "'repositories'", "','", "'}'", "'systems'", "'Repository'", "'components'", "'interfaces'", "'types'", "'System'", "'('", "')'", "'assembly'", "'allocation'", "'environment'", "'BasicComponent'", "'providedInterfaces'", "'requiredInterfaces'", "'providedServices'", "'behaviorDescription'", "'Interface'", "'signatures'", "'Service'", "'correspondingSignature'", "'void'", "'ExternalCall'", "'InternalAction'", "'Branch'", "'condition'", "'actions'", "'Loop'", "'ComplexType'", "'type'", "'SimpleType'", "'EJavaClass'", "'Assembly'", "'assemblyContexts'", "'compositeComponents'", "'assemblyConnectors'", "'delegationConnectors'", "'Allocation'", "'allocationContexts'", "'Environment'", "'links'", "'containers'", "'AssemblyContext'", "'component'", "'allocationContext'", "'providedRoles'", "'requiredRoles'", "'CompositeComponent'", "'-(o-'", "'-->'", "'Role'", "'interface'", "'AllocationContext'", "'container'", "'assemblyContext'", "'Container'", "'Link'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Int'", "'Long'", "'Map'", "'String'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentSystem";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentSystem"
    // InternalDsl.g:65:1: entryRuleComponentSystem returns [EObject current=null] : iv_ruleComponentSystem= ruleComponentSystem EOF ;
    public final EObject entryRuleComponentSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSystem = null;


        try {
            // InternalDsl.g:65:56: (iv_ruleComponentSystem= ruleComponentSystem EOF )
            // InternalDsl.g:66:2: iv_ruleComponentSystem= ruleComponentSystem EOF
            {
             newCompositeNode(grammarAccess.getComponentSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentSystem=ruleComponentSystem();

            state._fsp--;

             current =iv_ruleComponentSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentSystem"


    // $ANTLR start "ruleComponentSystem"
    // InternalDsl.g:72:1: ruleComponentSystem returns [EObject current=null] : (otherlv_0= 'ComponentSystem' otherlv_1= '{' otherlv_2= 'repositories' otherlv_3= '{' ( (lv_repositories_4_0= ruleRepository ) ) (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )* otherlv_7= '}' (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleComponentSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_repositories_4_0 = null;

        EObject lv_repositories_6_0 = null;

        EObject lv_systems_10_0 = null;

        EObject lv_systems_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'ComponentSystem' otherlv_1= '{' otherlv_2= 'repositories' otherlv_3= '{' ( (lv_repositories_4_0= ruleRepository ) ) (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )* otherlv_7= '}' (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalDsl.g:79:2: (otherlv_0= 'ComponentSystem' otherlv_1= '{' otherlv_2= 'repositories' otherlv_3= '{' ( (lv_repositories_4_0= ruleRepository ) ) (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )* otherlv_7= '}' (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'ComponentSystem' otherlv_1= '{' otherlv_2= 'repositories' otherlv_3= '{' ( (lv_repositories_4_0= ruleRepository ) ) (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )* otherlv_7= '}' (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalDsl.g:80:3: otherlv_0= 'ComponentSystem' otherlv_1= '{' otherlv_2= 'repositories' otherlv_3= '{' ( (lv_repositories_4_0= ruleRepository ) ) (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )* otherlv_7= '}' (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSystemAccess().getComponentSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentSystemAccess().getRepositoriesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:96:3: ( (lv_repositories_4_0= ruleRepository ) )
            // InternalDsl.g:97:4: (lv_repositories_4_0= ruleRepository )
            {
            // InternalDsl.g:97:4: (lv_repositories_4_0= ruleRepository )
            // InternalDsl.g:98:5: lv_repositories_4_0= ruleRepository
            {

            					newCompositeNode(grammarAccess.getComponentSystemAccess().getRepositoriesRepositoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_repositories_4_0=ruleRepository();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentSystemRule());
            					}
            					add(
            						current,
            						"repositories",
            						lv_repositories_4_0,
            						"org.xtext.componentsystem.dsl.Dsl.Repository");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:115:3: (otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:116:4: otherlv_5= ',' ( (lv_repositories_6_0= ruleRepository ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:120:4: ( (lv_repositories_6_0= ruleRepository ) )
            	    // InternalDsl.g:121:5: (lv_repositories_6_0= ruleRepository )
            	    {
            	    // InternalDsl.g:121:5: (lv_repositories_6_0= ruleRepository )
            	    // InternalDsl.g:122:6: lv_repositories_6_0= ruleRepository
            	    {

            	    						newCompositeNode(grammarAccess.getComponentSystemAccess().getRepositoriesRepositoryParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_repositories_6_0=ruleRepository();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"repositories",
            	    							lv_repositories_6_0,
            	    							"org.xtext.componentsystem.dsl.Dsl.Repository");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentSystemAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalDsl.g:144:3: (otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:145:4: otherlv_8= 'systems' otherlv_9= '{' ( (lv_systems_10_0= ruleSystem ) ) (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentSystemAccess().getSystemsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentSystemAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:153:4: ( (lv_systems_10_0= ruleSystem ) )
                    // InternalDsl.g:154:5: (lv_systems_10_0= ruleSystem )
                    {
                    // InternalDsl.g:154:5: (lv_systems_10_0= ruleSystem )
                    // InternalDsl.g:155:6: lv_systems_10_0= ruleSystem
                    {

                    						newCompositeNode(grammarAccess.getComponentSystemAccess().getSystemsSystemParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_systems_10_0=ruleSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentSystemRule());
                    						}
                    						add(
                    							current,
                    							"systems",
                    							lv_systems_10_0,
                    							"org.xtext.componentsystem.dsl.Dsl.System");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:172:4: (otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDsl.g:173:5: otherlv_11= ',' ( (lv_systems_12_0= ruleSystem ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComponentSystemAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:177:5: ( (lv_systems_12_0= ruleSystem ) )
                    	    // InternalDsl.g:178:6: (lv_systems_12_0= ruleSystem )
                    	    {
                    	    // InternalDsl.g:178:6: (lv_systems_12_0= ruleSystem )
                    	    // InternalDsl.g:179:7: lv_systems_12_0= ruleSystem
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentSystemAccess().getSystemsSystemParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_systems_12_0=ruleSystem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systems",
                    	    								lv_systems_12_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.System");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentSystemAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentSystemAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentSystem"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:210:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:210:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:211:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:217:1: ruleType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_SimpleType_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:223:2: ( (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) )
            // InternalDsl.g:224:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            {
            // InternalDsl.g:224:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:225:3: this_ComplexType_0= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:234:3: this_SimpleType_1= ruleSimpleType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleType_1=ruleSimpleType();

                    state._fsp--;


                    			current = this_SimpleType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:246:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:246:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:247:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:253:1: ruleAction returns [EObject current=null] : (this_ExternalCall_0= ruleExternalCall | this_InternalAction_1= ruleInternalAction | this_Branch_2= ruleBranch | this_Loop_3= ruleLoop ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalCall_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_Branch_2 = null;

        EObject this_Loop_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:259:2: ( (this_ExternalCall_0= ruleExternalCall | this_InternalAction_1= ruleInternalAction | this_Branch_2= ruleBranch | this_Loop_3= ruleLoop ) )
            // InternalDsl.g:260:2: (this_ExternalCall_0= ruleExternalCall | this_InternalAction_1= ruleInternalAction | this_Branch_2= ruleBranch | this_Loop_3= ruleLoop )
            {
            // InternalDsl.g:260:2: (this_ExternalCall_0= ruleExternalCall | this_InternalAction_1= ruleInternalAction | this_Branch_2= ruleBranch | this_Loop_3= ruleLoop )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:261:3: this_ExternalCall_0= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getExternalCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_0=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:270:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:279:3: this_Branch_2= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBranchParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_2=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:288:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleRepository"
    // InternalDsl.g:300:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalDsl.g:300:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalDsl.g:301:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalDsl.g:307:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_components_5_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_interfaces_11_0 = null;

        EObject lv_interfaces_13_0 = null;

        EObject lv_types_17_0 = null;

        EObject lv_types_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:313:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:314:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:314:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:315:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )? (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:315:3: ()
            // InternalDsl.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:330:3: (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:331:4: otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleBasicComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getComponentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:339:4: ( (lv_components_5_0= ruleBasicComponent ) )
                    // InternalDsl.g:340:5: (lv_components_5_0= ruleBasicComponent )
                    {
                    // InternalDsl.g:340:5: (lv_components_5_0= ruleBasicComponent )
                    // InternalDsl.g:341:6: lv_components_5_0= ruleBasicComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsBasicComponentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_5_0=ruleBasicComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_5_0,
                    							"org.xtext.componentsystem.dsl.Dsl.BasicComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:358:4: (otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:359:5: otherlv_6= ',' ( (lv_components_7_0= ruleBasicComponent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:363:5: ( (lv_components_7_0= ruleBasicComponent ) )
                    	    // InternalDsl.g:364:6: (lv_components_7_0= ruleBasicComponent )
                    	    {
                    	    // InternalDsl.g:364:6: (lv_components_7_0= ruleBasicComponent )
                    	    // InternalDsl.g:365:7: lv_components_7_0= ruleBasicComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsBasicComponentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_7_0=ruleBasicComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_7_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.BasicComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:388:3: (otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:389:4: otherlv_9= 'interfaces' otherlv_10= '{' ( (lv_interfaces_11_0= ruleInterface ) ) (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getInterfacesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:397:4: ( (lv_interfaces_11_0= ruleInterface ) )
                    // InternalDsl.g:398:5: (lv_interfaces_11_0= ruleInterface )
                    {
                    // InternalDsl.g:398:5: (lv_interfaces_11_0= ruleInterface )
                    // InternalDsl.g:399:6: lv_interfaces_11_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interfaces_11_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_11_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:416:4: (otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:417:5: otherlv_12= ',' ( (lv_interfaces_13_0= ruleInterface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:421:5: ( (lv_interfaces_13_0= ruleInterface ) )
                    	    // InternalDsl.g:422:6: (lv_interfaces_13_0= ruleInterface )
                    	    {
                    	    // InternalDsl.g:422:6: (lv_interfaces_13_0= ruleInterface )
                    	    // InternalDsl.g:423:7: lv_interfaces_13_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interfaces_13_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_13_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:446:3: (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:447:4: otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:455:4: ( (lv_types_17_0= ruleType ) )
                    // InternalDsl.g:456:5: (lv_types_17_0= ruleType )
                    {
                    // InternalDsl.g:456:5: (lv_types_17_0= ruleType )
                    // InternalDsl.g:457:6: lv_types_17_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_types_17_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_17_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:474:4: (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:475:5: otherlv_18= ',' ( (lv_types_19_0= ruleType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:479:5: ( (lv_types_19_0= ruleType ) )
                    	    // InternalDsl.g:480:6: (lv_types_19_0= ruleType )
                    	    {
                    	    // InternalDsl.g:480:6: (lv_types_19_0= ruleType )
                    	    // InternalDsl.g:481:7: lv_types_19_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_types_19_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_19_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleSystem"
    // InternalDsl.g:512:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDsl.g:512:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDsl.g:513:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDsl.g:519:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_assembly_9_0 = null;

        EObject lv_allocation_11_0 = null;

        EObject lv_environment_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:525:2: ( (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' ) )
            // InternalDsl.g:526:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' )
            {
            // InternalDsl.g:526:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' )
            // InternalDsl.g:527:3: otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getInterfacesKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:543:3: ( ( ruleEString ) )
            // InternalDsl.g:544:4: ( ruleEString )
            {
            // InternalDsl.g:544:4: ( ruleEString )
            // InternalDsl.g:545:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getInterfacesInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:559:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:560:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_18); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:564:4: ( ( ruleEString ) )
            	    // InternalDsl.g:565:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:565:5: ( ruleEString )
            	    // InternalDsl.g:566:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemAccess().getInterfacesInterfaceCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getAssemblyKeyword_7());
            		
            // InternalDsl.g:589:3: ( (lv_assembly_9_0= ruleAssembly ) )
            // InternalDsl.g:590:4: (lv_assembly_9_0= ruleAssembly )
            {
            // InternalDsl.g:590:4: (lv_assembly_9_0= ruleAssembly )
            // InternalDsl.g:591:5: lv_assembly_9_0= ruleAssembly
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAssemblyAssemblyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
            lv_assembly_9_0=ruleAssembly();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"assembly",
            						lv_assembly_9_0,
            						"org.xtext.componentsystem.dsl.Dsl.Assembly");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getAllocationKeyword_9());
            		
            // InternalDsl.g:612:3: ( (lv_allocation_11_0= ruleAllocation ) )
            // InternalDsl.g:613:4: (lv_allocation_11_0= ruleAllocation )
            {
            // InternalDsl.g:613:4: (lv_allocation_11_0= ruleAllocation )
            // InternalDsl.g:614:5: lv_allocation_11_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getAllocationAllocationParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_24);
            lv_allocation_11_0=ruleAllocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"allocation",
            						lv_allocation_11_0,
            						"org.xtext.componentsystem.dsl.Dsl.Allocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getEnvironmentKeyword_11());
            		
            // InternalDsl.g:635:3: ( (lv_environment_13_0= ruleEnvironment ) )
            // InternalDsl.g:636:4: (lv_environment_13_0= ruleEnvironment )
            {
            // InternalDsl.g:636:4: (lv_environment_13_0= ruleEnvironment )
            // InternalDsl.g:637:5: lv_environment_13_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getEnvironmentEnvironmentParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_environment_13_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_13_0,
            						"org.xtext.componentsystem.dsl.Dsl.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleBasicComponent"
    // InternalDsl.g:662:1: entryRuleBasicComponent returns [EObject current=null] : iv_ruleBasicComponent= ruleBasicComponent EOF ;
    public final EObject entryRuleBasicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicComponent = null;


        try {
            // InternalDsl.g:662:55: (iv_ruleBasicComponent= ruleBasicComponent EOF )
            // InternalDsl.g:663:2: iv_ruleBasicComponent= ruleBasicComponent EOF
            {
             newCompositeNode(grammarAccess.getBasicComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicComponent=ruleBasicComponent();

            state._fsp--;

             current =iv_ruleBasicComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicComponent"


    // $ANTLR start "ruleBasicComponent"
    // InternalDsl.g:669:1: ruleBasicComponent returns [EObject current=null] : ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleBasicComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedServices_18_0 = null;

        EObject lv_providedServices_20_0 = null;

        EObject lv_behaviorDescription_24_0 = null;

        EObject lv_behaviorDescription_26_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:675:2: ( ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalDsl.g:676:2: ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalDsl.g:676:2: ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalDsl.g:677:3: () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalDsl.g:677:3: ()
            // InternalDsl.g:678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicComponentAccess().getBasicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicComponentAccess().getBasicComponentKeyword_1());
            		
            // InternalDsl.g:688:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:689:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:689:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:690:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBasicComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:711:3: (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:712:4: otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicComponentAccess().getProvidedInterfacesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getBasicComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:720:4: ( ( ruleEString ) )
                    // InternalDsl.g:721:5: ( ruleEString )
                    {
                    // InternalDsl.g:721:5: ( ruleEString )
                    // InternalDsl.g:722:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedInterfacesInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:736:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:737:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBasicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:741:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:742:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:742:6: ( ruleEString )
                    	    // InternalDsl.g:743:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedInterfacesInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getBasicComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:763:3: (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:764:4: otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getBasicComponentAccess().getRequiredInterfacesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getBasicComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:772:4: ( ( ruleEString ) )
                    // InternalDsl.g:773:5: ( ruleEString )
                    {
                    // InternalDsl.g:773:5: ( ruleEString )
                    // InternalDsl.g:774:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getRequiredInterfacesInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:788:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDsl.g:789:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBasicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:793:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:794:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:794:6: ( ruleEString )
                    	    // InternalDsl.g:795:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getRequiredInterfacesInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getBasicComponentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:815:3: (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:816:4: otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getBasicComponentAccess().getProvidedServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:824:4: ( (lv_providedServices_18_0= ruleService ) )
                    // InternalDsl.g:825:5: (lv_providedServices_18_0= ruleService )
                    {
                    // InternalDsl.g:825:5: (lv_providedServices_18_0= ruleService )
                    // InternalDsl.g:826:6: lv_providedServices_18_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedServicesServiceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedServices_18_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedServices",
                    							lv_providedServices_18_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:843:4: (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDsl.g:844:5: otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBasicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:848:5: ( (lv_providedServices_20_0= ruleService ) )
                    	    // InternalDsl.g:849:6: (lv_providedServices_20_0= ruleService )
                    	    {
                    	    // InternalDsl.g:849:6: (lv_providedServices_20_0= ruleService )
                    	    // InternalDsl.g:850:7: lv_providedServices_20_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedServicesServiceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_providedServices_20_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedServices",
                    	    								lv_providedServices_20_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_21, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:873:3: (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:874:4: otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getBasicComponentAccess().getBehaviorDescriptionKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:882:4: ( (lv_behaviorDescription_24_0= ruleAction ) )
                    // InternalDsl.g:883:5: (lv_behaviorDescription_24_0= ruleAction )
                    {
                    // InternalDsl.g:883:5: (lv_behaviorDescription_24_0= ruleAction )
                    // InternalDsl.g:884:6: lv_behaviorDescription_24_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getBehaviorDescriptionActionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_behaviorDescription_24_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviorDescription",
                    							lv_behaviorDescription_24_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:901:4: (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDsl.g:902:5: otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getBasicComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:906:5: ( (lv_behaviorDescription_26_0= ruleAction ) )
                    	    // InternalDsl.g:907:6: (lv_behaviorDescription_26_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:907:6: (lv_behaviorDescription_26_0= ruleAction )
                    	    // InternalDsl.g:908:7: lv_behaviorDescription_26_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getBehaviorDescriptionActionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_behaviorDescription_26_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorDescription",
                    	    								lv_behaviorDescription_26_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_27, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicComponent"


    // $ANTLR start "entryRuleInterface"
    // InternalDsl.g:939:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDsl.g:939:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDsl.g:940:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDsl.g:946:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signatures_6_0 = null;

        EObject lv_signatures_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:952:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:953:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:953:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:954:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:954:3: ()
            // InternalDsl.g:955:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalDsl.g:965:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:966:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:966:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:967:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:988:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:989:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:997:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalDsl.g:998:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalDsl.g:998:5: (lv_signatures_6_0= ruleSignature )
                    // InternalDsl.g:999:6: lv_signatures_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_signatures_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signatures",
                    							lv_signatures_6_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1016:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDsl.g:1017:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1021:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalDsl.g:1022:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalDsl.g:1022:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalDsl.g:1023:7: lv_signatures_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_signatures_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signatures",
                    	    								lv_signatures_8_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:1054:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1054:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1055:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:1061:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1067:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1069:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1077:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleService"
    // InternalDsl.g:1088:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDsl.g:1088:48: (iv_ruleService= ruleService EOF )
            // InternalDsl.g:1089:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDsl.g:1095:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1101:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalDsl.g:1102:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:1102:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalDsl.g:1103:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:1107:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1108:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1108:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1109:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3());
            		
            // InternalDsl.g:1134:3: ( ( ruleEString ) )
            // InternalDsl.g:1135:4: ( ruleEString )
            {
            // InternalDsl.g:1135:4: ( ruleEString )
            // InternalDsl.g:1136:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleSignature"
    // InternalDsl.g:1158:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalDsl.g:1158:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalDsl.g:1159:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalDsl.g:1165:1: ruleSignature returns [EObject current=null] : ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1171:2: ( ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) )
            // InternalDsl.g:1172:2: ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            {
            // InternalDsl.g:1172:2: ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            // InternalDsl.g:1173:3: () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
            {
            // InternalDsl.g:1173:3: ()
            // InternalDsl.g:1174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1180:3: ( ( ( ruleEString ) ) | otherlv_2= 'void' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1181:4: ( ( ruleEString ) )
                    {
                    // InternalDsl.g:1181:4: ( ( ruleEString ) )
                    // InternalDsl.g:1182:5: ( ruleEString )
                    {
                    // InternalDsl.g:1182:5: ( ruleEString )
                    // InternalDsl.g:1183:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1198:4: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getVoidKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1203:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDsl.g:1204:4: (lv_name_3_0= ruleEString )
            {
            // InternalDsl.g:1204:4: (lv_name_3_0= ruleEString )
            // InternalDsl.g:1205:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:1226:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1227:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalDsl.g:1227:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalDsl.g:1228:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalDsl.g:1228:5: (lv_parameters_5_0= ruleParameter )
                    // InternalDsl.g:1229:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1246:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDsl.g:1247:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:1251:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalDsl.g:1252:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalDsl.g:1252:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalDsl.g:1253:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalDsl.g:1280:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:1280:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:1281:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDsl.g:1287:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1293:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDsl.g:1294:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDsl.g:1294:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalDsl.g:1295:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDsl.g:1295:3: ( ( ruleEString ) )
            // InternalDsl.g:1296:4: ( ruleEString )
            {
            // InternalDsl.g:1296:4: ( ruleEString )
            // InternalDsl.g:1297:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1311:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1312:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1312:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1313:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleExternalCall"
    // InternalDsl.g:1334:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDsl.g:1334:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDsl.g:1335:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalDsl.g:1341:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1347:2: ( ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1348:2: ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1348:2: ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1349:3: () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1349:3: ()
            // InternalDsl.g:1350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getExternalCallKeyword_1());
            		
            // InternalDsl.g:1360:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1361:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1361:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1362:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalCallAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleInternalAction"
    // InternalDsl.g:1383:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalDsl.g:1383:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalDsl.g:1384:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalDsl.g:1390:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1396:2: ( ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1397:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1397:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1398:3: () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1398:3: ()
            // InternalDsl.g:1399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		
            // InternalDsl.g:1409:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1410:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1410:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1411:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInternalActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInternalActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleBranch"
    // InternalDsl.g:1432:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalDsl.g:1432:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalDsl.g:1433:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalDsl.g:1439:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1445:2: ( (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:1446:2: (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1446:2: (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:1447:3: otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            // InternalDsl.g:1451:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1452:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1452:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1453:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getConditionKeyword_3());
            		
            // InternalDsl.g:1478:3: ( (lv_condition_4_0= ruleEString ) )
            // InternalDsl.g:1479:4: (lv_condition_4_0= ruleEString )
            {
            // InternalDsl.g:1479:4: (lv_condition_4_0= ruleEString )
            // InternalDsl.g:1480:5: lv_condition_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchAccess().getConditionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_condition_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1497:3: (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1498:4: otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBranchAccess().getActionsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1506:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalDsl.g:1507:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalDsl.g:1507:5: (lv_actions_7_0= ruleAction )
                    // InternalDsl.g:1508:6: lv_actions_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1525:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDsl.g:1526:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1530:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalDsl.g:1531:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:1531:6: (lv_actions_9_0= ruleAction )
                    	    // InternalDsl.g:1532:7: lv_actions_9_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_9_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_9_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleLoop"
    // InternalDsl.g:1563:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalDsl.g:1563:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalDsl.g:1564:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalDsl.g:1570:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1576:2: ( (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:1577:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1577:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:1578:3: otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            // InternalDsl.g:1582:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1583:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1583:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1584:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getConditionKeyword_3());
            		
            // InternalDsl.g:1609:3: ( (lv_condition_4_0= ruleEString ) )
            // InternalDsl.g:1610:4: (lv_condition_4_0= ruleEString )
            {
            // InternalDsl.g:1610:4: (lv_condition_4_0= ruleEString )
            // InternalDsl.g:1611:5: lv_condition_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getConditionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_condition_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1628:3: (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1629:4: otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getActionsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1637:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalDsl.g:1638:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalDsl.g:1638:5: (lv_actions_7_0= ruleAction )
                    // InternalDsl.g:1639:6: lv_actions_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1656:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDsl.g:1657:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1661:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalDsl.g:1662:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:1662:6: (lv_actions_9_0= ruleAction )
                    	    // InternalDsl.g:1663:7: lv_actions_9_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_9_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_9_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleComplexType"
    // InternalDsl.g:1694:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalDsl.g:1694:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalDsl.g:1695:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalDsl.g:1701:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaClass ) ) otherlv_5= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1707:2: ( (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaClass ) ) otherlv_5= '}' ) )
            // InternalDsl.g:1708:2: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaClass ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:1708:2: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaClass ) ) otherlv_5= '}' )
            // InternalDsl.g:1709:3: otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleEJavaClass ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
            		
            // InternalDsl.g:1713:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1714:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1714:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1715:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getTypeKeyword_3());
            		
            // InternalDsl.g:1740:3: ( (lv_type_4_0= ruleEJavaClass ) )
            // InternalDsl.g:1741:4: (lv_type_4_0= ruleEJavaClass )
            {
            // InternalDsl.g:1741:4: (lv_type_4_0= ruleEJavaClass )
            // InternalDsl.g:1742:5: lv_type_4_0= ruleEJavaClass
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getTypeEJavaClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_4_0=ruleEJavaClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.componentsystem.dsl.Dsl.EJavaClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalDsl.g:1767:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalDsl.g:1767:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalDsl.g:1768:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalDsl.g:1774:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1780:2: ( (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' ) )
            // InternalDsl.g:1781:2: (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:1781:2: (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' )
            // InternalDsl.g:1782:3: otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            // InternalDsl.g:1786:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1787:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1787:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1788:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleTypeAccess().getTypeKeyword_3());
            		
            // InternalDsl.g:1813:3: ( (lv_type_4_0= ruleSimpleTypeEnum ) )
            // InternalDsl.g:1814:4: (lv_type_4_0= ruleSimpleTypeEnum )
            {
            // InternalDsl.g:1814:4: (lv_type_4_0= ruleSimpleTypeEnum )
            // InternalDsl.g:1815:5: lv_type_4_0= ruleSimpleTypeEnum
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_4_0=ruleSimpleTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.componentsystem.dsl.Dsl.SimpleTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEJavaClass"
    // InternalDsl.g:1840:1: entryRuleEJavaClass returns [String current=null] : iv_ruleEJavaClass= ruleEJavaClass EOF ;
    public final String entryRuleEJavaClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaClass = null;


        try {
            // InternalDsl.g:1840:50: (iv_ruleEJavaClass= ruleEJavaClass EOF )
            // InternalDsl.g:1841:2: iv_ruleEJavaClass= ruleEJavaClass EOF
            {
             newCompositeNode(grammarAccess.getEJavaClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJavaClass=ruleEJavaClass();

            state._fsp--;

             current =iv_ruleEJavaClass.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEJavaClass"


    // $ANTLR start "ruleEJavaClass"
    // InternalDsl.g:1847:1: ruleEJavaClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaClass' ;
    public final AntlrDatatypeRuleToken ruleEJavaClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1853:2: (kw= 'EJavaClass' )
            // InternalDsl.g:1854:2: kw= 'EJavaClass'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEJavaClassAccess().getEJavaClassKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEJavaClass"


    // $ANTLR start "entryRuleAssembly"
    // InternalDsl.g:1862:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalDsl.g:1862:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalDsl.g:1863:2: iv_ruleAssembly= ruleAssembly EOF
            {
             newCompositeNode(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;

             current =iv_ruleAssembly; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalDsl.g:1869:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_assemblyContexts_5_0 = null;

        EObject lv_assemblyContexts_7_0 = null;

        EObject lv_compositeComponents_11_0 = null;

        EObject lv_compositeComponents_13_0 = null;

        EObject lv_assemblyConnectors_17_0 = null;

        EObject lv_assemblyConnectors_19_0 = null;

        EObject lv_delegationConnectors_23_0 = null;

        EObject lv_delegationConnectors_25_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1875:2: ( ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalDsl.g:1876:2: ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalDsl.g:1876:2: ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalDsl.g:1877:3: () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalDsl.g:1877:3: ()
            // InternalDsl.g:1878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1892:3: (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1893:4: otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getAssemblyContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:1901:4: ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) )
                    // InternalDsl.g:1902:5: (lv_assemblyContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalDsl.g:1902:5: (lv_assemblyContexts_5_0= ruleAssemblyContext )
                    // InternalDsl.g:1903:6: lv_assemblyContexts_5_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyContextsAssemblyContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_assemblyContexts_5_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						add(
                    							current,
                    							"assemblyContexts",
                    							lv_assemblyContexts_5_0,
                    							"org.xtext.componentsystem.dsl.Dsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1920:4: (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDsl.g:1921:5: otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssemblyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:1925:5: ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalDsl.g:1926:6: (lv_assemblyContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalDsl.g:1926:6: (lv_assemblyContexts_7_0= ruleAssemblyContext )
                    	    // InternalDsl.g:1927:7: lv_assemblyContexts_7_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyContextsAssemblyContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_assemblyContexts_7_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyContexts",
                    	    								lv_assemblyContexts_7_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1950:3: (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1951:4: otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getCompositeComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1959:4: ( (lv_compositeComponents_11_0= ruleCompositeComponent ) )
                    // InternalDsl.g:1960:5: (lv_compositeComponents_11_0= ruleCompositeComponent )
                    {
                    // InternalDsl.g:1960:5: (lv_compositeComponents_11_0= ruleCompositeComponent )
                    // InternalDsl.g:1961:6: lv_compositeComponents_11_0= ruleCompositeComponent
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_compositeComponents_11_0=ruleCompositeComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						add(
                    							current,
                    							"compositeComponents",
                    							lv_compositeComponents_11_0,
                    							"org.xtext.componentsystem.dsl.Dsl.CompositeComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1978:4: (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDsl.g:1979:5: otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_44); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAssemblyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1983:5: ( (lv_compositeComponents_13_0= ruleCompositeComponent ) )
                    	    // InternalDsl.g:1984:6: (lv_compositeComponents_13_0= ruleCompositeComponent )
                    	    {
                    	    // InternalDsl.g:1984:6: (lv_compositeComponents_13_0= ruleCompositeComponent )
                    	    // InternalDsl.g:1985:7: lv_compositeComponents_13_0= ruleCompositeComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getCompositeComponentsCompositeComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_compositeComponents_13_0=ruleCompositeComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"compositeComponents",
                    	    								lv_compositeComponents_13_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.CompositeComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2008:3: (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2009:4: otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAssemblyAccess().getAssemblyConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2017:4: ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:2018:5: (lv_assemblyConnectors_17_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:2018:5: (lv_assemblyConnectors_17_0= ruleAssemblyConnector )
                    // InternalDsl.g:2019:6: lv_assemblyConnectors_17_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_assemblyConnectors_17_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						add(
                    							current,
                    							"assemblyConnectors",
                    							lv_assemblyConnectors_17_0,
                    							"org.xtext.componentsystem.dsl.Dsl.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2036:4: (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalDsl.g:2037:5: otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getAssemblyAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2041:5: ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:2042:6: (lv_assemblyConnectors_19_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:2042:6: (lv_assemblyConnectors_19_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:2043:7: lv_assemblyConnectors_19_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_assemblyConnectors_19_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyConnectors",
                    	    								lv_assemblyConnectors_19_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_20, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2066:3: (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2067:4: otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getAssemblyAccess().getDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2075:4: ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) )
                    // InternalDsl.g:2076:5: (lv_delegationConnectors_23_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:2076:5: (lv_delegationConnectors_23_0= ruleDelegationConnector )
                    // InternalDsl.g:2077:6: lv_delegationConnectors_23_0= ruleDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_delegationConnectors_23_0=ruleDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						add(
                    							current,
                    							"delegationConnectors",
                    							lv_delegationConnectors_23_0,
                    							"org.xtext.componentsystem.dsl.Dsl.DelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2094:4: (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDsl.g:2095:5: otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getAssemblyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2099:5: ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:2100:6: (lv_delegationConnectors_25_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:2100:6: (lv_delegationConnectors_25_0= ruleDelegationConnector )
                    	    // InternalDsl.g:2101:7: lv_delegationConnectors_25_0= ruleDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_delegationConnectors_25_0=ruleDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"delegationConnectors",
                    	    								lv_delegationConnectors_25_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.DelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleAllocation"
    // InternalDsl.g:2132:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalDsl.g:2132:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalDsl.g:2133:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalDsl.g:2139:1: ruleAllocation returns [EObject current=null] : ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_allocationContexts_5_0 = null;

        EObject lv_allocationContexts_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2145:2: ( ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:2146:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:2146:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:2147:3: () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:2147:3: ()
            // InternalDsl.g:2148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllocationAccess().getAllocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getAllocationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2162:3: (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2163:4: otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:2171:4: ( (lv_allocationContexts_5_0= ruleAllocationContext ) )
                    // InternalDsl.g:2172:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    {
                    // InternalDsl.g:2172:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    // InternalDsl.g:2173:6: lv_allocationContexts_5_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_allocationContexts_5_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_5_0,
                    							"org.xtext.componentsystem.dsl.Dsl.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2190:4: (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDsl.g:2191:5: otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAllocationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2195:5: ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    // InternalDsl.g:2196:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    {
                    	    // InternalDsl.g:2196:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    // InternalDsl.g:2197:7: lv_allocationContexts_7_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_allocationContexts_7_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_7_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.AllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleEnvironment"
    // InternalDsl.g:2228:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalDsl.g:2228:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalDsl.g:2229:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalDsl.g:2235:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_links_5_0 = null;

        EObject lv_links_7_0 = null;

        EObject lv_containers_11_0 = null;

        EObject lv_containers_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2241:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:2242:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:2242:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:2243:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:2243:3: ()
            // InternalDsl.g:2244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2258:3: (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2259:4: otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLinksKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:2267:4: ( (lv_links_5_0= ruleLink ) )
                    // InternalDsl.g:2268:5: (lv_links_5_0= ruleLink )
                    {
                    // InternalDsl.g:2268:5: (lv_links_5_0= ruleLink )
                    // InternalDsl.g:2269:6: lv_links_5_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_links_5_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_5_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2286:4: (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDsl.g:2287:5: otherlv_6= ',' ( (lv_links_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2291:5: ( (lv_links_7_0= ruleLink ) )
                    	    // InternalDsl.g:2292:6: (lv_links_7_0= ruleLink )
                    	    {
                    	    // InternalDsl.g:2292:6: (lv_links_7_0= ruleLink )
                    	    // InternalDsl.g:2293:7: lv_links_7_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_links_7_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_7_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_51); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2316:3: (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2317:4: otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getContainersKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:2325:4: ( (lv_containers_11_0= ruleContainer ) )
                    // InternalDsl.g:2326:5: (lv_containers_11_0= ruleContainer )
                    {
                    // InternalDsl.g:2326:5: (lv_containers_11_0= ruleContainer )
                    // InternalDsl.g:2327:6: lv_containers_11_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_containers_11_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"containers",
                    							lv_containers_11_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2344:4: (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDsl.g:2345:5: otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:2349:5: ( (lv_containers_13_0= ruleContainer ) )
                    	    // InternalDsl.g:2350:6: (lv_containers_13_0= ruleContainer )
                    	    {
                    	    // InternalDsl.g:2350:6: (lv_containers_13_0= ruleContainer )
                    	    // InternalDsl.g:2351:7: lv_containers_13_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_containers_13_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containers",
                    	    								lv_containers_13_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalDsl.g:2382:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalDsl.g:2382:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalDsl.g:2383:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalDsl.g:2389:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedRoles_9_0 = null;

        EObject lv_providedRoles_11_0 = null;

        EObject lv_requiredRoles_15_0 = null;

        EObject lv_requiredRoles_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2395:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalDsl.g:2396:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalDsl.g:2396:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalDsl.g:2397:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )? (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalDsl.g:2401:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2402:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2402:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2403:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,58,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalDsl.g:2428:3: ( ( ruleEString ) )
            // InternalDsl.g:2429:4: ( ruleEString )
            {
            // InternalDsl.g:2429:4: ( ruleEString )
            // InternalDsl.g:2430:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2444:3: (otherlv_5= 'allocationContext' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2445:4: otherlv_5= 'allocationContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_5_0());
                    			
                    // InternalDsl.g:2449:4: ( ( ruleEString ) )
                    // InternalDsl.g:2450:5: ( ruleEString )
                    {
                    // InternalDsl.g:2450:5: ( ruleEString )
                    // InternalDsl.g:2451:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2466:3: (otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2467:4: otherlv_7= 'providedRoles' otherlv_8= '{' ( (lv_providedRoles_9_0= ruleRole ) ) (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2475:4: ( (lv_providedRoles_9_0= ruleRole ) )
                    // InternalDsl.g:2476:5: (lv_providedRoles_9_0= ruleRole )
                    {
                    // InternalDsl.g:2476:5: (lv_providedRoles_9_0= ruleRole )
                    // InternalDsl.g:2477:6: lv_providedRoles_9_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedRoles_9_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_9_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2494:4: (otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDsl.g:2495:5: otherlv_10= ',' ( (lv_providedRoles_11_0= ruleRole ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2499:5: ( (lv_providedRoles_11_0= ruleRole ) )
                    	    // InternalDsl.g:2500:6: (lv_providedRoles_11_0= ruleRole )
                    	    {
                    	    // InternalDsl.g:2500:6: (lv_providedRoles_11_0= ruleRole )
                    	    // InternalDsl.g:2501:7: lv_providedRoles_11_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_providedRoles_11_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_11_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_57); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2524:3: (otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2525:4: otherlv_13= 'requiredRoles' otherlv_14= '{' ( (lv_requiredRoles_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:2533:4: ( (lv_requiredRoles_15_0= ruleRole ) )
                    // InternalDsl.g:2534:5: (lv_requiredRoles_15_0= ruleRole )
                    {
                    // InternalDsl.g:2534:5: (lv_requiredRoles_15_0= ruleRole )
                    // InternalDsl.g:2535:6: lv_requiredRoles_15_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredRoles_15_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_15_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2552:4: (otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalDsl.g:2553:5: otherlv_16= ',' ( (lv_requiredRoles_17_0= ruleRole ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:2557:5: ( (lv_requiredRoles_17_0= ruleRole ) )
                    	    // InternalDsl.g:2558:6: (lv_requiredRoles_17_0= ruleRole )
                    	    {
                    	    // InternalDsl.g:2558:6: (lv_requiredRoles_17_0= ruleRole )
                    	    // InternalDsl.g:2559:7: lv_requiredRoles_17_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requiredRoles_17_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_17_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalDsl.g:2590:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalDsl.g:2590:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalDsl.g:2591:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalDsl.g:2597:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedServices_17_0 = null;

        EObject lv_providedServices_19_0 = null;

        EObject lv_behaviorDescription_23_0 = null;

        EObject lv_behaviorDescription_25_0 = null;

        EObject lv_assemblyContexts_29_0 = null;

        EObject lv_assemblyContexts_31_0 = null;

        EObject lv_assemblyConnectors_35_0 = null;

        EObject lv_assemblyConnectors_37_0 = null;

        EObject lv_delegationConnectors_41_0 = null;

        EObject lv_delegationConnectors_43_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2603:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' ) )
            // InternalDsl.g:2604:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' )
            {
            // InternalDsl.g:2604:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' )
            // InternalDsl.g:2605:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalDsl.g:2609:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2610:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2610:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2611:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2632:3: (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2633:4: otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDsl.g:2641:4: ( ( ruleEString ) )
                    // InternalDsl.g:2642:5: ( ruleEString )
                    {
                    // InternalDsl.g:2642:5: ( ruleEString )
                    // InternalDsl.g:2643:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2657:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDsl.g:2658:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2662:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:2663:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:2663:6: ( ruleEString )
                    	    // InternalDsl.g:2664:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_59); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2684:3: (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:2685:4: otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:2693:4: ( ( ruleEString ) )
                    // InternalDsl.g:2694:5: ( ruleEString )
                    {
                    // InternalDsl.g:2694:5: ( ruleEString )
                    // InternalDsl.g:2695:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2709:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDsl.g:2710:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:2714:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:2715:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:2715:6: ( ruleEString )
                    	    // InternalDsl.g:2716:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_60); 

                    				newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2736:3: (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDsl.g:2737:4: otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getProvidedServicesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2745:4: ( (lv_providedServices_17_0= ruleService ) )
                    // InternalDsl.g:2746:5: (lv_providedServices_17_0= ruleService )
                    {
                    // InternalDsl.g:2746:5: (lv_providedServices_17_0= ruleService )
                    // InternalDsl.g:2747:6: lv_providedServices_17_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServicesServiceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedServices_17_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedServices",
                    							lv_providedServices_17_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2764:4: (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalDsl.g:2765:5: otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2769:5: ( (lv_providedServices_19_0= ruleService ) )
                    	    // InternalDsl.g:2770:6: (lv_providedServices_19_0= ruleService )
                    	    {
                    	    // InternalDsl.g:2770:6: (lv_providedServices_19_0= ruleService )
                    	    // InternalDsl.g:2771:7: lv_providedServices_19_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServicesServiceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_providedServices_19_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedServices",
                    	    								lv_providedServices_19_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_61); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2794:3: (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDsl.g:2795:4: otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2803:4: ( (lv_behaviorDescription_23_0= ruleAction ) )
                    // InternalDsl.g:2804:5: (lv_behaviorDescription_23_0= ruleAction )
                    {
                    // InternalDsl.g:2804:5: (lv_behaviorDescription_23_0= ruleAction )
                    // InternalDsl.g:2805:6: lv_behaviorDescription_23_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_behaviorDescription_23_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviorDescription",
                    							lv_behaviorDescription_23_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2822:4: (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==14) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDsl.g:2823:5: otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2827:5: ( (lv_behaviorDescription_25_0= ruleAction ) )
                    	    // InternalDsl.g:2828:6: (lv_behaviorDescription_25_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:2828:6: (lv_behaviorDescription_25_0= ruleAction )
                    	    // InternalDsl.g:2829:7: lv_behaviorDescription_25_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_behaviorDescription_25_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorDescription",
                    	    								lv_behaviorDescription_25_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_62); 

                    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getAssemblyContextsKeyword_7());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalDsl.g:2860:3: ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) )
            // InternalDsl.g:2861:4: (lv_assemblyContexts_29_0= ruleAssemblyContext )
            {
            // InternalDsl.g:2861:4: (lv_assemblyContexts_29_0= ruleAssemblyContext )
            // InternalDsl.g:2862:5: lv_assemblyContexts_29_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyContextsAssemblyContextParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_assemblyContexts_29_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"assemblyContexts",
            						lv_assemblyContexts_29_0,
            						"org.xtext.componentsystem.dsl.Dsl.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2879:3: (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==14) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDsl.g:2880:4: otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_42); 

            	    				newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDsl.g:2884:4: ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) )
            	    // InternalDsl.g:2885:5: (lv_assemblyContexts_31_0= ruleAssemblyContext )
            	    {
            	    // InternalDsl.g:2885:5: (lv_assemblyContexts_31_0= ruleAssemblyContext )
            	    // InternalDsl.g:2886:6: lv_assemblyContexts_31_0= ruleAssemblyContext
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyContextsAssemblyContextParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_assemblyContexts_31_0=ruleAssemblyContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assemblyContexts",
            	    							lv_assemblyContexts_31_0,
            	    							"org.xtext.componentsystem.dsl.Dsl.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_32=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalDsl.g:2908:3: (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDsl.g:2909:4: otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsKeyword_12_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalDsl.g:2917:4: ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:2918:5: (lv_assemblyConnectors_35_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:2918:5: (lv_assemblyConnectors_35_0= ruleAssemblyConnector )
                    // InternalDsl.g:2919:6: lv_assemblyConnectors_35_0= ruleAssemblyConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_assemblyConnectors_35_0=ruleAssemblyConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"assemblyConnectors",
                    							lv_assemblyConnectors_35_0,
                    							"org.xtext.componentsystem.dsl.Dsl.AssemblyConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2936:4: (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalDsl.g:2937:5: otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getCompositeComponentAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalDsl.g:2941:5: ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:2942:6: (lv_assemblyConnectors_37_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:2942:6: (lv_assemblyConnectors_37_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:2943:7: lv_assemblyConnectors_37_0= ruleAssemblyConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsAssemblyConnectorParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_assemblyConnectors_37_0=ruleAssemblyConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assemblyConnectors",
                    	    								lv_assemblyConnectors_37_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.AssemblyConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_38, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2966:3: (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==51) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDsl.g:2967:4: otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}'
                    {
                    otherlv_39=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_39, grammarAccess.getCompositeComponentAccess().getDelegationConnectorsKeyword_13_0());
                    			
                    otherlv_40=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_40, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalDsl.g:2975:4: ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) )
                    // InternalDsl.g:2976:5: (lv_delegationConnectors_41_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:2976:5: (lv_delegationConnectors_41_0= ruleDelegationConnector )
                    // InternalDsl.g:2977:6: lv_delegationConnectors_41_0= ruleDelegationConnector
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_delegationConnectors_41_0=ruleDelegationConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"delegationConnectors",
                    							lv_delegationConnectors_41_0,
                    							"org.xtext.componentsystem.dsl.Dsl.DelegationConnector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2994:4: (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDsl.g:2995:5: otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_42=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_42, grammarAccess.getCompositeComponentAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalDsl.g:2999:5: ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:3000:6: (lv_delegationConnectors_43_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:3000:6: (lv_delegationConnectors_43_0= ruleDelegationConnector )
                    	    // InternalDsl.g:3001:7: lv_delegationConnectors_43_0= ruleDelegationConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationConnectorsDelegationConnectorParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_delegationConnectors_43_0=ruleDelegationConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"delegationConnectors",
                    	    								lv_delegationConnectors_43_0,
                    	    								"org.xtext.componentsystem.dsl.Dsl.DelegationConnector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_44, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_45=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_45, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalDsl.g:3032:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalDsl.g:3032:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalDsl.g:3033:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalDsl.g:3039:1: ruleAssemblyConnector returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '-(o-' ( ( ruleEString ) ) ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3045:2: ( ( ( ( ruleEString ) ) otherlv_1= '-(o-' ( ( ruleEString ) ) ) )
            // InternalDsl.g:3046:2: ( ( ( ruleEString ) ) otherlv_1= '-(o-' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:3046:2: ( ( ( ruleEString ) ) otherlv_1= '-(o-' ( ( ruleEString ) ) )
            // InternalDsl.g:3047:3: ( ( ruleEString ) ) otherlv_1= '-(o-' ( ( ruleEString ) )
            {
            // InternalDsl.g:3047:3: ( ( ruleEString ) )
            // InternalDsl.g:3048:4: ( ruleEString )
            {
            // InternalDsl.g:3048:4: ( ruleEString )
            // InternalDsl.g:3049:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_0_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,63,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyConnectorAccess().getOKeyword_1());
            		
            // InternalDsl.g:3067:3: ( ( ruleEString ) )
            // InternalDsl.g:3068:4: ( ruleEString )
            {
            // InternalDsl.g:3068:4: ( ruleEString )
            // InternalDsl.g:3069:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalDsl.g:3087:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalDsl.g:3087:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalDsl.g:3088:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnector=ruleDelegationConnector();

            state._fsp--;

             current =iv_ruleDelegationConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalDsl.g:3094:1: ruleDelegationConnector returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '-->' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3100:2: ( ( ( ( ruleEString ) ) otherlv_1= '-->' ( ( ruleEString ) ) ) )
            // InternalDsl.g:3101:2: ( ( ( ruleEString ) ) otherlv_1= '-->' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:3101:2: ( ( ( ruleEString ) ) otherlv_1= '-->' ( ( ruleEString ) ) )
            // InternalDsl.g:3102:3: ( ( ruleEString ) ) otherlv_1= '-->' ( ( ruleEString ) )
            {
            // InternalDsl.g:3102:3: ( ( ruleEString ) )
            // InternalDsl.g:3103:4: ( ruleEString )
            {
            // InternalDsl.g:3103:4: ( ruleEString )
            // InternalDsl.g:3104:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_0_0());
            				
            pushFollow(FOLLOW_64);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,64,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDsl.g:3122:3: ( ( ruleEString ) )
            // InternalDsl.g:3123:4: ( ruleEString )
            {
            // InternalDsl.g:3123:4: ( ruleEString )
            // InternalDsl.g:3124:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getDelegatedInterfaceInterfaceCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:3142:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:3142:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:3143:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:3149:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3155:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalDsl.g:3156:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:3156:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalDsl.g:3157:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalDsl.g:3161:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3162:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3162:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3163:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getInterfaceKeyword_3());
            		
            // InternalDsl.g:3188:3: ( ( ruleEString ) )
            // InternalDsl.g:3189:4: ( ruleEString )
            {
            // InternalDsl.g:3189:4: ( ruleEString )
            // InternalDsl.g:3190:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalDsl.g:3212:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalDsl.g:3212:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalDsl.g:3213:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalDsl.g:3219:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' ( ( ruleEString ) ) otherlv_5= 'assemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3225:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' ( ( ruleEString ) ) otherlv_5= 'assemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalDsl.g:3226:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' ( ( ruleEString ) ) otherlv_5= 'assemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalDsl.g:3226:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' ( ( ruleEString ) ) otherlv_5= 'assemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalDsl.g:3227:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'container' ( ( ruleEString ) ) otherlv_5= 'assemblyContext' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalDsl.g:3231:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3232:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3232:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3233:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,68,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getContainerKeyword_3());
            		
            // InternalDsl.g:3258:3: ( ( ruleEString ) )
            // InternalDsl.g:3259:4: ( ruleEString )
            {
            // InternalDsl.g:3259:4: ( ruleEString )
            // InternalDsl.g:3260:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_4_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getAssemblyContextKeyword_5());
            		
            // InternalDsl.g:3278:3: ( ( ruleEString ) )
            // InternalDsl.g:3279:4: ( ruleEString )
            {
            // InternalDsl.g:3279:4: ( ruleEString )
            // InternalDsl.g:3280:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:3302:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:3302:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:3303:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:3309:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3315:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalDsl.g:3316:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalDsl.g:3316:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalDsl.g:3317:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalDsl.g:3317:3: ()
            // InternalDsl.g:3318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalDsl.g:3328:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3329:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3329:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3330:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:3351:3: (otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==55) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDsl.g:3352:4: otherlv_4= 'links' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getLinksKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:3360:4: ( ( ruleEString ) )
                    // InternalDsl.g:3361:5: ( ruleEString )
                    {
                    // InternalDsl.g:3361:5: ( ruleEString )
                    // InternalDsl.g:3362:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3376:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalDsl.g:3377:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:3381:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:3382:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:3382:6: ( ruleEString )
                    	    // InternalDsl.g:3383:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContainerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:3411:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:3411:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:3412:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:3418:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3424:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalDsl.g:3425:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalDsl.g:3425:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalDsl.g:3426:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:3430:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3431:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3431:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3432:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDsl.g:3461:3: ( ( ruleEString ) )
            // InternalDsl.g:3462:4: ( ruleEString )
            {
            // InternalDsl.g:3462:4: ( ruleEString )
            // InternalDsl.g:3463:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:3477:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==14) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalDsl.g:3478:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_18); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDsl.g:3482:4: ( ( ruleEString ) )
            	    // InternalDsl.g:3483:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:3483:5: ( ruleEString )
            	    // InternalDsl.g:3484:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "ruleSimpleTypeEnum"
    // InternalDsl.g:3511:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) ;
    public final Enumerator ruleSimpleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalDsl.g:3517:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) )
            // InternalDsl.g:3518:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            {
            // InternalDsl.g:3518:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            int alt66=10;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt66=1;
                }
                break;
            case 73:
                {
                alt66=2;
                }
                break;
            case 74:
                {
                alt66=3;
                }
                break;
            case 75:
                {
                alt66=4;
                }
                break;
            case 76:
                {
                alt66=5;
                }
                break;
            case 77:
                {
                alt66=6;
                }
                break;
            case 78:
                {
                alt66=7;
                }
                break;
            case 79:
                {
                alt66=8;
                }
                break;
            case 80:
                {
                alt66=9;
                }
                break;
            case 81:
                {
                alt66=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalDsl.g:3519:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalDsl.g:3519:3: (enumLiteral_0= 'Boolean' )
                    // InternalDsl.g:3520:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3527:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalDsl.g:3527:3: (enumLiteral_1= 'Char' )
                    // InternalDsl.g:3528:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3535:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalDsl.g:3535:3: (enumLiteral_2= 'Date' )
                    // InternalDsl.g:3536:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:3543:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalDsl.g:3543:3: (enumLiteral_3= 'Double' )
                    // InternalDsl.g:3544:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:3551:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalDsl.g:3551:3: (enumLiteral_4= 'Float' )
                    // InternalDsl.g:3552:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:3559:3: (enumLiteral_5= 'List' )
                    {
                    // InternalDsl.g:3559:3: (enumLiteral_5= 'List' )
                    // InternalDsl.g:3560:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getListEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:3567:3: (enumLiteral_6= 'Int' )
                    {
                    // InternalDsl.g:3567:3: (enumLiteral_6= 'Int' )
                    // InternalDsl.g:3568:4: enumLiteral_6= 'Int'
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:3575:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalDsl.g:3575:3: (enumLiteral_7= 'Long' )
                    // InternalDsl.g:3576:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:3583:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalDsl.g:3583:3: (enumLiteral_8= 'Map' )
                    // InternalDsl.g:3584:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeEnumAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:3591:3: (enumLiteral_9= 'String' )
                    {
                    // InternalDsl.g:3591:3: (enumLiteral_9= 'String' )
                    // InternalDsl.g:3592:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getSimpleTypeEnumAccess().getStringEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000F0008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000004E000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x000000000003FF00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000F000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000C000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0180000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3800000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x3000000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00010000F0000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00010000E0000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00010000C0000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000080000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0100000000000000L});

}