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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentSystem'", "'{'", "'repositories'", "','", "'}'", "'systems'", "'Repository'", "'components'", "'interfaces'", "'types'", "'System'", "'('", "')'", "'assembly'", "'allocation'", "'environment'", "'BasicComponent'", "'providedInterfaces'", "'requiredInterfaces'", "'providedServices'", "'behaviorDescription'", "'Interface'", "';'", "'Service'", "'for'", "'void'", "'ExternalCall'", "'InternalAction'", "'Branch'", "'condition'", "'actions'", "'Loop'", "'ComplexType'", "'SimpleType'", "'type'", "'Assembly'", "'assemblyContexts'", "'compositeComponents'", "'assemblyConnectors'", "'delegationConnectors'", "'Allocation'", "'allocationContexts'", "'Environment'", "'links'", "'containers'", "'AssemblyContext'", "'component'", "'providedRoles'", "'requiredRoles'", "'CompositeComponent'", "':'", "'-(o-'", "'->'", "'Role'", "'from'", "'AllocationContext'", "'-[]->'", "'Container'", "'Link'", "'<=>'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Int'", "'Long'", "'Map'", "'String'"
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
            else if ( (LA4_0==44) ) {
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
    // InternalDsl.g:307:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_components_8_0 = null;

        EObject lv_interfaces_12_0 = null;

        EObject lv_interfaces_14_0 = null;

        EObject lv_types_18_0 = null;

        EObject lv_types_20_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:313:2: ( ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalDsl.g:314:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalDsl.g:314:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalDsl.g:315:3: () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )? (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalDsl.g:315:3: ()
            // InternalDsl.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            // InternalDsl.g:326:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:327:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:327:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:328:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:349:3: (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:350:4: otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleBasicComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:358:4: ( (lv_components_6_0= ruleBasicComponent ) )
                    // InternalDsl.g:359:5: (lv_components_6_0= ruleBasicComponent )
                    {
                    // InternalDsl.g:359:5: (lv_components_6_0= ruleBasicComponent )
                    // InternalDsl.g:360:6: lv_components_6_0= ruleBasicComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsBasicComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_6_0=ruleBasicComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_6_0,
                    							"org.xtext.componentsystem.dsl.Dsl.BasicComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:377:4: (otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:378:5: otherlv_7= ',' ( (lv_components_8_0= ruleBasicComponent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:382:5: ( (lv_components_8_0= ruleBasicComponent ) )
                    	    // InternalDsl.g:383:6: (lv_components_8_0= ruleBasicComponent )
                    	    {
                    	    // InternalDsl.g:383:6: (lv_components_8_0= ruleBasicComponent )
                    	    // InternalDsl.g:384:7: lv_components_8_0= ruleBasicComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsBasicComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_8_0=ruleBasicComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_8_0,
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

                    otherlv_9=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:407:3: (otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:408:4: otherlv_10= 'interfaces' otherlv_11= '{' ( (lv_interfaces_12_0= ruleInterface ) ) (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getInterfacesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:416:4: ( (lv_interfaces_12_0= ruleInterface ) )
                    // InternalDsl.g:417:5: (lv_interfaces_12_0= ruleInterface )
                    {
                    // InternalDsl.g:417:5: (lv_interfaces_12_0= ruleInterface )
                    // InternalDsl.g:418:6: lv_interfaces_12_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interfaces_12_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_12_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:435:4: (otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:436:5: otherlv_13= ',' ( (lv_interfaces_14_0= ruleInterface ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:440:5: ( (lv_interfaces_14_0= ruleInterface ) )
                    	    // InternalDsl.g:441:6: (lv_interfaces_14_0= ruleInterface )
                    	    {
                    	    // InternalDsl.g:441:6: (lv_interfaces_14_0= ruleInterface )
                    	    // InternalDsl.g:442:7: lv_interfaces_14_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interfaces_14_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_14_0,
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

                    otherlv_15=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:465:3: (otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:466:4: otherlv_16= 'types' otherlv_17= '{' ( (lv_types_18_0= ruleType ) ) (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getTypesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:474:4: ( (lv_types_18_0= ruleType ) )
                    // InternalDsl.g:475:5: (lv_types_18_0= ruleType )
                    {
                    // InternalDsl.g:475:5: (lv_types_18_0= ruleType )
                    // InternalDsl.g:476:6: lv_types_18_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_types_18_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_18_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:493:4: (otherlv_19= ',' ( (lv_types_20_0= ruleType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:494:5: otherlv_19= ',' ( (lv_types_20_0= ruleType ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRepositoryAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:498:5: ( (lv_types_20_0= ruleType ) )
                    	    // InternalDsl.g:499:6: (lv_types_20_0= ruleType )
                    	    {
                    	    // InternalDsl.g:499:6: (lv_types_20_0= ruleType )
                    	    // InternalDsl.g:500:7: lv_types_20_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getTypesTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_types_20_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_20_0,
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

                    otherlv_21=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_21, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalDsl.g:531:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDsl.g:531:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDsl.g:532:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalDsl.g:538:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' ) ;
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
            // InternalDsl.g:544:2: ( (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' ) )
            // InternalDsl.g:545:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' )
            {
            // InternalDsl.g:545:2: (otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}' )
            // InternalDsl.g:546:3: otherlv_0= 'System' otherlv_1= '{' otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'assembly' ( (lv_assembly_9_0= ruleAssembly ) ) otherlv_10= 'allocation' ( (lv_allocation_11_0= ruleAllocation ) ) otherlv_12= 'environment' ( (lv_environment_13_0= ruleEnvironment ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getInterfacesKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDsl.g:562:3: ( ( ruleEString ) )
            // InternalDsl.g:563:4: ( ruleEString )
            {
            // InternalDsl.g:563:4: ( ruleEString )
            // InternalDsl.g:564:5: ruleEString
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

            // InternalDsl.g:578:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:579:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDsl.g:583:4: ( ( ruleEString ) )
            	    // InternalDsl.g:584:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:584:5: ( ruleEString )
            	    // InternalDsl.g:585:6: ruleEString
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
            		
            // InternalDsl.g:608:3: ( (lv_assembly_9_0= ruleAssembly ) )
            // InternalDsl.g:609:4: (lv_assembly_9_0= ruleAssembly )
            {
            // InternalDsl.g:609:4: (lv_assembly_9_0= ruleAssembly )
            // InternalDsl.g:610:5: lv_assembly_9_0= ruleAssembly
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
            		
            // InternalDsl.g:631:3: ( (lv_allocation_11_0= ruleAllocation ) )
            // InternalDsl.g:632:4: (lv_allocation_11_0= ruleAllocation )
            {
            // InternalDsl.g:632:4: (lv_allocation_11_0= ruleAllocation )
            // InternalDsl.g:633:5: lv_allocation_11_0= ruleAllocation
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
            		
            // InternalDsl.g:654:3: ( (lv_environment_13_0= ruleEnvironment ) )
            // InternalDsl.g:655:4: (lv_environment_13_0= ruleEnvironment )
            {
            // InternalDsl.g:655:4: (lv_environment_13_0= ruleEnvironment )
            // InternalDsl.g:656:5: lv_environment_13_0= ruleEnvironment
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
    // InternalDsl.g:681:1: entryRuleBasicComponent returns [EObject current=null] : iv_ruleBasicComponent= ruleBasicComponent EOF ;
    public final EObject entryRuleBasicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicComponent = null;


        try {
            // InternalDsl.g:681:55: (iv_ruleBasicComponent= ruleBasicComponent EOF )
            // InternalDsl.g:682:2: iv_ruleBasicComponent= ruleBasicComponent EOF
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
    // InternalDsl.g:688:1: ruleBasicComponent returns [EObject current=null] : ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalDsl.g:694:2: ( ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalDsl.g:695:2: ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalDsl.g:695:2: ( () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalDsl.g:696:3: () otherlv_1= 'BasicComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )? (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalDsl.g:696:3: ()
            // InternalDsl.g:697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicComponentAccess().getBasicComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicComponentAccess().getBasicComponentKeyword_1());
            		
            // InternalDsl.g:707:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:708:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:708:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:709:5: lv_name_2_0= ruleEString
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
            		
            // InternalDsl.g:730:3: (otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:731:4: otherlv_4= 'providedInterfaces' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicComponentAccess().getProvidedInterfacesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBasicComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:739:4: ( ( ruleEString ) )
                    // InternalDsl.g:740:5: ( ruleEString )
                    {
                    // InternalDsl.g:740:5: ( ruleEString )
                    // InternalDsl.g:741:6: ruleEString
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

                    // InternalDsl.g:755:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:756:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBasicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:760:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:761:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:761:6: ( ruleEString )
                    	    // InternalDsl.g:762:7: ruleEString
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

            // InternalDsl.g:782:3: (otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:783:4: otherlv_10= 'requiredInterfaces' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getBasicComponentAccess().getRequiredInterfacesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getBasicComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:791:4: ( ( ruleEString ) )
                    // InternalDsl.g:792:5: ( ruleEString )
                    {
                    // InternalDsl.g:792:5: ( ruleEString )
                    // InternalDsl.g:793:6: ruleEString
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

                    // InternalDsl.g:807:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDsl.g:808:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBasicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:812:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:813:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:813:6: ( ruleEString )
                    	    // InternalDsl.g:814:7: ruleEString
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

            // InternalDsl.g:834:3: (otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:835:4: otherlv_16= 'providedServices' otherlv_17= '{' ( (lv_providedServices_18_0= ruleService ) ) (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getBasicComponentAccess().getProvidedServicesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:843:4: ( (lv_providedServices_18_0= ruleService ) )
                    // InternalDsl.g:844:5: (lv_providedServices_18_0= ruleService )
                    {
                    // InternalDsl.g:844:5: (lv_providedServices_18_0= ruleService )
                    // InternalDsl.g:845:6: lv_providedServices_18_0= ruleService
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

                    // InternalDsl.g:862:4: (otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDsl.g:863:5: otherlv_19= ',' ( (lv_providedServices_20_0= ruleService ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBasicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:867:5: ( (lv_providedServices_20_0= ruleService ) )
                    	    // InternalDsl.g:868:6: (lv_providedServices_20_0= ruleService )
                    	    {
                    	    // InternalDsl.g:868:6: (lv_providedServices_20_0= ruleService )
                    	    // InternalDsl.g:869:7: lv_providedServices_20_0= ruleService
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

            // InternalDsl.g:892:3: (otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:893:4: otherlv_22= 'behaviorDescription' otherlv_23= '{' ( (lv_behaviorDescription_24_0= ruleAction ) ) (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getBasicComponentAccess().getBehaviorDescriptionKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:901:4: ( (lv_behaviorDescription_24_0= ruleAction ) )
                    // InternalDsl.g:902:5: (lv_behaviorDescription_24_0= ruleAction )
                    {
                    // InternalDsl.g:902:5: (lv_behaviorDescription_24_0= ruleAction )
                    // InternalDsl.g:903:6: lv_behaviorDescription_24_0= ruleAction
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

                    // InternalDsl.g:920:4: (otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDsl.g:921:5: otherlv_25= ',' ( (lv_behaviorDescription_26_0= ruleAction ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getBasicComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:925:5: ( (lv_behaviorDescription_26_0= ruleAction ) )
                    	    // InternalDsl.g:926:6: (lv_behaviorDescription_26_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:926:6: (lv_behaviorDescription_26_0= ruleAction )
                    	    // InternalDsl.g:927:7: lv_behaviorDescription_26_0= ruleAction
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
    // InternalDsl.g:958:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDsl.g:958:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDsl.g:959:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalDsl.g:965:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signatures_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:971:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDsl.g:972:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDsl.g:972:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDsl.g:973:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalDsl.g:973:3: ()
            // InternalDsl.g:974:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalDsl.g:984:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:985:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:985:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:986:5: lv_name_2_0= ruleEString
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
            		
            // InternalDsl.g:1007:3: ( ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1008:4: ( (lv_signatures_4_0= ruleSignature ) ) otherlv_5= ';'
            	    {
            	    // InternalDsl.g:1008:4: ( (lv_signatures_4_0= ruleSignature ) )
            	    // InternalDsl.g:1009:5: (lv_signatures_4_0= ruleSignature )
            	    {
            	    // InternalDsl.g:1009:5: (lv_signatures_4_0= ruleSignature )
            	    // InternalDsl.g:1010:6: lv_signatures_4_0= ruleSignature
            	    {

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_signatures_4_0=ruleSignature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"signatures",
            	    							lv_signatures_4_0,
            	    							"org.xtext.componentsystem.dsl.Dsl.Signature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,33,FOLLOW_32); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:1040:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:1040:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:1041:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:1047:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1053:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:1054:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:1054:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1055:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1063:3: this_ID_1= RULE_ID
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
    // InternalDsl.g:1074:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDsl.g:1074:48: (iv_ruleService= ruleService EOF )
            // InternalDsl.g:1075:2: iv_ruleService= ruleService EOF
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
    // InternalDsl.g:1081:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleEString ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1087:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleEString ) ) ) )
            // InternalDsl.g:1088:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:1088:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleEString ) ) )
            // InternalDsl.g:1089:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'for' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalDsl.g:1093:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1094:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1094:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1095:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getForKeyword_2());
            		
            // InternalDsl.g:1116:3: ( ( ruleEString ) )
            // InternalDsl.g:1117:4: ( ruleEString )
            {
            // InternalDsl.g:1117:4: ( ruleEString )
            // InternalDsl.g:1118:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_3_0());
            				
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleSignature"
    // InternalDsl.g:1136:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalDsl.g:1136:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalDsl.g:1137:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalDsl.g:1143:1: ruleSignature returns [EObject current=null] : ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) ;
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
            // InternalDsl.g:1149:2: ( ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' ) )
            // InternalDsl.g:1150:2: ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            {
            // InternalDsl.g:1150:2: ( () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )
            // InternalDsl.g:1151:3: () ( ( ( ruleEString ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
            {
            // InternalDsl.g:1151:3: ()
            // InternalDsl.g:1152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1158:3: ( ( ( ruleEString ) ) | otherlv_2= 'void' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1159:4: ( ( ruleEString ) )
                    {
                    // InternalDsl.g:1159:4: ( ( ruleEString ) )
                    // InternalDsl.g:1160:5: ( ruleEString )
                    {
                    // InternalDsl.g:1160:5: ( ruleEString )
                    // InternalDsl.g:1161:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1176:4: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getVoidKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1181:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDsl.g:1182:4: (lv_name_3_0= ruleEString )
            {
            // InternalDsl.g:1182:4: (lv_name_3_0= ruleEString )
            // InternalDsl.g:1183:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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
            		
            // InternalDsl.g:1204:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1205:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalDsl.g:1205:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalDsl.g:1206:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalDsl.g:1206:5: (lv_parameters_5_0= ruleParameter )
                    // InternalDsl.g:1207:6: lv_parameters_5_0= ruleParameter
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

                    // InternalDsl.g:1224:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDsl.g:1225:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:1229:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalDsl.g:1230:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalDsl.g:1230:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalDsl.g:1231:7: lv_parameters_7_0= ruleParameter
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
                    	    break loop24;
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
    // InternalDsl.g:1258:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:1258:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:1259:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDsl.g:1265:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1271:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDsl.g:1272:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDsl.g:1272:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalDsl.g:1273:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDsl.g:1273:3: ( ( ruleEString ) )
            // InternalDsl.g:1274:4: ( ruleEString )
            {
            // InternalDsl.g:1274:4: ( ruleEString )
            // InternalDsl.g:1275:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1289:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1290:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1290:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1291:5: lv_name_1_0= ruleEString
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
    // InternalDsl.g:1312:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDsl.g:1312:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDsl.g:1313:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalDsl.g:1319:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1325:2: ( ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1326:2: ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1326:2: ( () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1327:3: () otherlv_1= 'ExternalCall' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1327:3: ()
            // InternalDsl.g:1328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getExternalCallKeyword_1());
            		
            // InternalDsl.g:1338:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1339:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1339:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1340:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1361:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalDsl.g:1361:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalDsl.g:1362:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalDsl.g:1368:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1374:2: ( ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:1375:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:1375:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:1376:3: () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:1376:3: ()
            // InternalDsl.g:1377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		
            // InternalDsl.g:1387:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1388:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1388:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1389:5: lv_name_2_0= ruleEString
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
    // InternalDsl.g:1410:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalDsl.g:1410:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalDsl.g:1411:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalDsl.g:1417:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalDsl.g:1423:2: ( (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:1424:2: (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1424:2: (otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:1425:3: otherlv_0= 'Branch' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            // InternalDsl.g:1429:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1430:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1430:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1431:5: lv_name_1_0= ruleEString
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
            		
            otherlv_3=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getConditionKeyword_3());
            		
            // InternalDsl.g:1456:3: ( (lv_condition_4_0= ruleEString ) )
            // InternalDsl.g:1457:4: (lv_condition_4_0= ruleEString )
            {
            // InternalDsl.g:1457:4: (lv_condition_4_0= ruleEString )
            // InternalDsl.g:1458:5: lv_condition_4_0= ruleEString
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

            // InternalDsl.g:1475:3: (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1476:4: otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBranchAccess().getActionsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1484:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalDsl.g:1485:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalDsl.g:1485:5: (lv_actions_7_0= ruleAction )
                    // InternalDsl.g:1486:6: lv_actions_7_0= ruleAction
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

                    // InternalDsl.g:1503:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDsl.g:1504:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1508:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalDsl.g:1509:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:1509:6: (lv_actions_9_0= ruleAction )
                    	    // InternalDsl.g:1510:7: lv_actions_9_0= ruleAction
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
                    	    break loop26;
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
    // InternalDsl.g:1541:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalDsl.g:1541:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalDsl.g:1542:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalDsl.g:1548:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalDsl.g:1554:2: ( (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDsl.g:1555:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDsl.g:1555:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDsl.g:1556:3: otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'condition' ( (lv_condition_4_0= ruleEString ) ) (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            // InternalDsl.g:1560:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1561:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1561:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1562:5: lv_name_1_0= ruleEString
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
            		
            otherlv_3=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getConditionKeyword_3());
            		
            // InternalDsl.g:1587:3: ( (lv_condition_4_0= ruleEString ) )
            // InternalDsl.g:1588:4: (lv_condition_4_0= ruleEString )
            {
            // InternalDsl.g:1588:4: (lv_condition_4_0= ruleEString )
            // InternalDsl.g:1589:5: lv_condition_4_0= ruleEString
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

            // InternalDsl.g:1606:3: (otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1607:4: otherlv_5= 'actions' otherlv_6= '{' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getActionsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1615:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalDsl.g:1616:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalDsl.g:1616:5: (lv_actions_7_0= ruleAction )
                    // InternalDsl.g:1617:6: lv_actions_7_0= ruleAction
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

                    // InternalDsl.g:1634:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDsl.g:1635:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1639:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalDsl.g:1640:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:1640:6: (lv_actions_9_0= ruleAction )
                    	    // InternalDsl.g:1641:7: lv_actions_9_0= ruleAction
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
                    	    break loop28;
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
    // InternalDsl.g:1672:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalDsl.g:1672:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalDsl.g:1673:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalDsl.g:1679:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1685:2: ( (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalDsl.g:1686:2: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalDsl.g:1686:2: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalDsl.g:1687:3: otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
            		
            // InternalDsl.g:1691:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1692:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1692:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1693:5: lv_name_1_0= ruleEString
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
            		
            // InternalDsl.g:1714:3: ( ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:1715:4: ( (lv_attributes_3_0= ruleParameter ) ) otherlv_4= ';'
            	    {
            	    // InternalDsl.g:1715:4: ( (lv_attributes_3_0= ruleParameter ) )
            	    // InternalDsl.g:1716:5: (lv_attributes_3_0= ruleParameter )
            	    {
            	    // InternalDsl.g:1716:5: (lv_attributes_3_0= ruleParameter )
            	    // InternalDsl.g:1717:6: lv_attributes_3_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getComplexTypeAccess().getAttributesParameterParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_attributes_3_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_3_0,
            	    							"org.xtext.componentsystem.dsl.Dsl.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_38); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDsl.g:1747:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalDsl.g:1747:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalDsl.g:1748:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalDsl.g:1754:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' ) ;
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
            // InternalDsl.g:1760:2: ( (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' ) )
            // InternalDsl.g:1761:2: (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:1761:2: (otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}' )
            // InternalDsl.g:1762:3: otherlv_0= 'SimpleType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleTypeEnum ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            // InternalDsl.g:1766:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1767:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1767:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1768:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleTypeAccess().getTypeKeyword_3());
            		
            // InternalDsl.g:1793:3: ( (lv_type_4_0= ruleSimpleTypeEnum ) )
            // InternalDsl.g:1794:4: (lv_type_4_0= ruleSimpleTypeEnum )
            {
            // InternalDsl.g:1794:4: (lv_type_4_0= ruleSimpleTypeEnum )
            // InternalDsl.g:1795:5: lv_type_4_0= ruleSimpleTypeEnum
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


    // $ANTLR start "entryRuleAssembly"
    // InternalDsl.g:1820:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalDsl.g:1820:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalDsl.g:1821:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalDsl.g:1827:1: ruleAssembly returns [EObject current=null] : ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // InternalDsl.g:1833:2: ( ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalDsl.g:1834:2: ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalDsl.g:1834:2: ( () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalDsl.g:1835:3: () otherlv_1= 'Assembly' otherlv_2= '{' (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )? (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )? (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalDsl.g:1835:3: ()
            // InternalDsl.g:1836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssemblyAccess().getAssemblyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getAssemblyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1850:3: (otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1851:4: otherlv_3= 'assemblyContexts' otherlv_4= '{' ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) ) (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getAssemblyContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:1859:4: ( (lv_assemblyContexts_5_0= ruleAssemblyContext ) )
                    // InternalDsl.g:1860:5: (lv_assemblyContexts_5_0= ruleAssemblyContext )
                    {
                    // InternalDsl.g:1860:5: (lv_assemblyContexts_5_0= ruleAssemblyContext )
                    // InternalDsl.g:1861:6: lv_assemblyContexts_5_0= ruleAssemblyContext
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

                    // InternalDsl.g:1878:4: (otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDsl.g:1879:5: otherlv_6= ',' ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssemblyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:1883:5: ( (lv_assemblyContexts_7_0= ruleAssemblyContext ) )
                    	    // InternalDsl.g:1884:6: (lv_assemblyContexts_7_0= ruleAssemblyContext )
                    	    {
                    	    // InternalDsl.g:1884:6: (lv_assemblyContexts_7_0= ruleAssemblyContext )
                    	    // InternalDsl.g:1885:7: lv_assemblyContexts_7_0= ruleAssemblyContext
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

            // InternalDsl.g:1908:3: (otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1909:4: otherlv_9= 'compositeComponents' otherlv_10= '{' ( (lv_compositeComponents_11_0= ruleCompositeComponent ) ) (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getCompositeComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:1917:4: ( (lv_compositeComponents_11_0= ruleCompositeComponent ) )
                    // InternalDsl.g:1918:5: (lv_compositeComponents_11_0= ruleCompositeComponent )
                    {
                    // InternalDsl.g:1918:5: (lv_compositeComponents_11_0= ruleCompositeComponent )
                    // InternalDsl.g:1919:6: lv_compositeComponents_11_0= ruleCompositeComponent
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

                    // InternalDsl.g:1936:4: (otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDsl.g:1937:5: otherlv_12= ',' ( (lv_compositeComponents_13_0= ruleCompositeComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_44); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAssemblyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:1941:5: ( (lv_compositeComponents_13_0= ruleCompositeComponent ) )
                    	    // InternalDsl.g:1942:6: (lv_compositeComponents_13_0= ruleCompositeComponent )
                    	    {
                    	    // InternalDsl.g:1942:6: (lv_compositeComponents_13_0= ruleCompositeComponent )
                    	    // InternalDsl.g:1943:7: lv_compositeComponents_13_0= ruleCompositeComponent
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

            // InternalDsl.g:1966:3: (otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1967:4: otherlv_15= 'assemblyConnectors' otherlv_16= '{' ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) ) (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAssemblyAccess().getAssemblyConnectorsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:1975:4: ( (lv_assemblyConnectors_17_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:1976:5: (lv_assemblyConnectors_17_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:1976:5: (lv_assemblyConnectors_17_0= ruleAssemblyConnector )
                    // InternalDsl.g:1977:6: lv_assemblyConnectors_17_0= ruleAssemblyConnector
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

                    // InternalDsl.g:1994:4: (otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalDsl.g:1995:5: otherlv_18= ',' ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getAssemblyAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:1999:5: ( (lv_assemblyConnectors_19_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:2000:6: (lv_assemblyConnectors_19_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:2000:6: (lv_assemblyConnectors_19_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:2001:7: lv_assemblyConnectors_19_0= ruleAssemblyConnector
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

            // InternalDsl.g:2024:3: (otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2025:4: otherlv_21= 'delegationConnectors' otherlv_22= '{' ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) ) (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getAssemblyAccess().getDelegationConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_22, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2033:4: ( (lv_delegationConnectors_23_0= ruleDelegationConnector ) )
                    // InternalDsl.g:2034:5: (lv_delegationConnectors_23_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:2034:5: (lv_delegationConnectors_23_0= ruleDelegationConnector )
                    // InternalDsl.g:2035:6: lv_delegationConnectors_23_0= ruleDelegationConnector
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

                    // InternalDsl.g:2052:4: (otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDsl.g:2053:5: otherlv_24= ',' ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getAssemblyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2057:5: ( (lv_delegationConnectors_25_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:2058:6: (lv_delegationConnectors_25_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:2058:6: (lv_delegationConnectors_25_0= ruleDelegationConnector )
                    	    // InternalDsl.g:2059:7: lv_delegationConnectors_25_0= ruleDelegationConnector
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
    // InternalDsl.g:2090:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalDsl.g:2090:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalDsl.g:2091:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalDsl.g:2097:1: ruleAllocation returns [EObject current=null] : ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalDsl.g:2103:2: ( ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:2104:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:2104:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:2105:3: () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:2105:3: ()
            // InternalDsl.g:2106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllocationAccess().getAllocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getAllocationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2120:3: (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2121:4: otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:2129:4: ( (lv_allocationContexts_5_0= ruleAllocationContext ) )
                    // InternalDsl.g:2130:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    {
                    // InternalDsl.g:2130:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    // InternalDsl.g:2131:6: lv_allocationContexts_5_0= ruleAllocationContext
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

                    // InternalDsl.g:2148:4: (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDsl.g:2149:5: otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAllocationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2153:5: ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    // InternalDsl.g:2154:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    {
                    	    // InternalDsl.g:2154:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    // InternalDsl.g:2155:7: lv_allocationContexts_7_0= ruleAllocationContext
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
    // InternalDsl.g:2186:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalDsl.g:2186:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalDsl.g:2187:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalDsl.g:2193:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalDsl.g:2199:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:2200:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:2200:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:2201:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )? (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:2201:3: ()
            // InternalDsl.g:2202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2216:3: (otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2217:4: otherlv_3= 'links' otherlv_4= '{' ( (lv_links_5_0= ruleLink ) ) (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLinksKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:2225:4: ( (lv_links_5_0= ruleLink ) )
                    // InternalDsl.g:2226:5: (lv_links_5_0= ruleLink )
                    {
                    // InternalDsl.g:2226:5: (lv_links_5_0= ruleLink )
                    // InternalDsl.g:2227:6: lv_links_5_0= ruleLink
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

                    // InternalDsl.g:2244:4: (otherlv_6= ',' ( (lv_links_7_0= ruleLink ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDsl.g:2245:5: otherlv_6= ',' ( (lv_links_7_0= ruleLink ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2249:5: ( (lv_links_7_0= ruleLink ) )
                    	    // InternalDsl.g:2250:6: (lv_links_7_0= ruleLink )
                    	    {
                    	    // InternalDsl.g:2250:6: (lv_links_7_0= ruleLink )
                    	    // InternalDsl.g:2251:7: lv_links_7_0= ruleLink
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

            // InternalDsl.g:2274:3: (otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2275:4: otherlv_9= 'containers' otherlv_10= '{' ( (lv_containers_11_0= ruleContainer ) ) (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getContainersKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:2283:4: ( (lv_containers_11_0= ruleContainer ) )
                    // InternalDsl.g:2284:5: (lv_containers_11_0= ruleContainer )
                    {
                    // InternalDsl.g:2284:5: (lv_containers_11_0= ruleContainer )
                    // InternalDsl.g:2285:6: lv_containers_11_0= ruleContainer
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

                    // InternalDsl.g:2302:4: (otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDsl.g:2303:5: otherlv_12= ',' ( (lv_containers_13_0= ruleContainer ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:2307:5: ( (lv_containers_13_0= ruleContainer ) )
                    	    // InternalDsl.g:2308:6: (lv_containers_13_0= ruleContainer )
                    	    {
                    	    // InternalDsl.g:2308:6: (lv_containers_13_0= ruleContainer )
                    	    // InternalDsl.g:2309:7: lv_containers_13_0= ruleContainer
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
    // InternalDsl.g:2340:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalDsl.g:2340:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalDsl.g:2341:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalDsl.g:2347:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedRoles_7_0 = null;

        EObject lv_providedRoles_9_0 = null;

        EObject lv_requiredRoles_13_0 = null;

        EObject lv_requiredRoles_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2353:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalDsl.g:2354:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalDsl.g:2354:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalDsl.g:2355:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )? (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalDsl.g:2359:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2360:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2360:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2361:5: lv_name_1_0= ruleEString
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
            		
            otherlv_3=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalDsl.g:2386:3: ( ( ruleEString ) )
            // InternalDsl.g:2387:4: ( ruleEString )
            {
            // InternalDsl.g:2387:4: ( ruleEString )
            // InternalDsl.g:2388:5: ruleEString
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

            // InternalDsl.g:2402:3: (otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2403:4: otherlv_5= 'providedRoles' otherlv_6= '{' ( (lv_providedRoles_7_0= ruleRole ) ) (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2411:4: ( (lv_providedRoles_7_0= ruleRole ) )
                    // InternalDsl.g:2412:5: (lv_providedRoles_7_0= ruleRole )
                    {
                    // InternalDsl.g:2412:5: (lv_providedRoles_7_0= ruleRole )
                    // InternalDsl.g:2413:6: lv_providedRoles_7_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedRoles_7_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_7_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2430:4: (otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDsl.g:2431:5: otherlv_8= ',' ( (lv_providedRoles_9_0= ruleRole ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_55); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2435:5: ( (lv_providedRoles_9_0= ruleRole ) )
                    	    // InternalDsl.g:2436:6: (lv_providedRoles_9_0= ruleRole )
                    	    {
                    	    // InternalDsl.g:2436:6: (lv_providedRoles_9_0= ruleRole )
                    	    // InternalDsl.g:2437:7: lv_providedRoles_9_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleParserRuleCall_5_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_56); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2460:3: (otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2461:4: otherlv_11= 'requiredRoles' otherlv_12= '{' ( (lv_requiredRoles_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2469:4: ( (lv_requiredRoles_13_0= ruleRole ) )
                    // InternalDsl.g:2470:5: (lv_requiredRoles_13_0= ruleRole )
                    {
                    // InternalDsl.g:2470:5: (lv_requiredRoles_13_0= ruleRole )
                    // InternalDsl.g:2471:6: lv_requiredRoles_13_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredRoles_13_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_13_0,
                    							"org.xtext.componentsystem.dsl.Dsl.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2488:4: (otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDsl.g:2489:5: otherlv_14= ',' ( (lv_requiredRoles_15_0= ruleRole ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_55); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2493:5: ( (lv_requiredRoles_15_0= ruleRole ) )
                    	    // InternalDsl.g:2494:6: (lv_requiredRoles_15_0= ruleRole )
                    	    {
                    	    // InternalDsl.g:2494:6: (lv_requiredRoles_15_0= ruleRole )
                    	    // InternalDsl.g:2495:7: lv_requiredRoles_15_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleParserRuleCall_6_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalDsl.g:2526:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalDsl.g:2526:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalDsl.g:2527:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalDsl.g:2533:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' ) ;
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
            // InternalDsl.g:2539:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' ) )
            // InternalDsl.g:2540:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' )
            {
            // InternalDsl.g:2540:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}' )
            // InternalDsl.g:2541:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )? (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )? otherlv_27= 'assemblyContexts' otherlv_28= '{' ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) ) (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )* otherlv_32= '}' (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )? (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )? otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalDsl.g:2545:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2546:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2546:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2547:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2568:3: (otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2569:4: otherlv_3= 'providedInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDsl.g:2577:4: ( ( ruleEString ) )
                    // InternalDsl.g:2578:5: ( ruleEString )
                    {
                    // InternalDsl.g:2578:5: ( ruleEString )
                    // InternalDsl.g:2579:6: ruleEString
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

                    // InternalDsl.g:2593:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDsl.g:2594:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:2598:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:2599:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:2599:6: ( ruleEString )
                    	    // InternalDsl.g:2600:7: ruleEString
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2620:3: (otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:2621:4: otherlv_9= 'requiredInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:2629:4: ( ( ruleEString ) )
                    // InternalDsl.g:2630:5: ( ruleEString )
                    {
                    // InternalDsl.g:2630:5: ( ruleEString )
                    // InternalDsl.g:2631:6: ruleEString
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

                    // InternalDsl.g:2645:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalDsl.g:2646:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:2650:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:2651:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:2651:6: ( ruleEString )
                    	    // InternalDsl.g:2652:7: ruleEString
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_59); 

                    				newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2672:3: (otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:2673:4: otherlv_15= 'providedServices' otherlv_16= '{' ( (lv_providedServices_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getProvidedServicesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2681:4: ( (lv_providedServices_17_0= ruleService ) )
                    // InternalDsl.g:2682:5: (lv_providedServices_17_0= ruleService )
                    {
                    // InternalDsl.g:2682:5: (lv_providedServices_17_0= ruleService )
                    // InternalDsl.g:2683:6: lv_providedServices_17_0= ruleService
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

                    // InternalDsl.g:2700:4: (otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDsl.g:2701:5: otherlv_18= ',' ( (lv_providedServices_19_0= ruleService ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2705:5: ( (lv_providedServices_19_0= ruleService ) )
                    	    // InternalDsl.g:2706:6: (lv_providedServices_19_0= ruleService )
                    	    {
                    	    // InternalDsl.g:2706:6: (lv_providedServices_19_0= ruleService )
                    	    // InternalDsl.g:2707:7: lv_providedServices_19_0= ruleService
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_60); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2730:3: (otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDsl.g:2731:4: otherlv_21= 'behaviorDescription' otherlv_22= '{' ( (lv_behaviorDescription_23_0= ruleAction ) ) (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2739:4: ( (lv_behaviorDescription_23_0= ruleAction ) )
                    // InternalDsl.g:2740:5: (lv_behaviorDescription_23_0= ruleAction )
                    {
                    // InternalDsl.g:2740:5: (lv_behaviorDescription_23_0= ruleAction )
                    // InternalDsl.g:2741:6: lv_behaviorDescription_23_0= ruleAction
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

                    // InternalDsl.g:2758:4: (otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalDsl.g:2759:5: otherlv_24= ',' ( (lv_behaviorDescription_25_0= ruleAction ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2763:5: ( (lv_behaviorDescription_25_0= ruleAction ) )
                    	    // InternalDsl.g:2764:6: (lv_behaviorDescription_25_0= ruleAction )
                    	    {
                    	    // InternalDsl.g:2764:6: (lv_behaviorDescription_25_0= ruleAction )
                    	    // InternalDsl.g:2765:7: lv_behaviorDescription_25_0= ruleAction
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_61); 

                    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getAssemblyContextsKeyword_7());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalDsl.g:2796:3: ( (lv_assemblyContexts_29_0= ruleAssemblyContext ) )
            // InternalDsl.g:2797:4: (lv_assemblyContexts_29_0= ruleAssemblyContext )
            {
            // InternalDsl.g:2797:4: (lv_assemblyContexts_29_0= ruleAssemblyContext )
            // InternalDsl.g:2798:5: lv_assemblyContexts_29_0= ruleAssemblyContext
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

            // InternalDsl.g:2815:3: (otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==14) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDsl.g:2816:4: otherlv_30= ',' ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_42); 

            	    				newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDsl.g:2820:4: ( (lv_assemblyContexts_31_0= ruleAssemblyContext ) )
            	    // InternalDsl.g:2821:5: (lv_assemblyContexts_31_0= ruleAssemblyContext )
            	    {
            	    // InternalDsl.g:2821:5: (lv_assemblyContexts_31_0= ruleAssemblyContext )
            	    // InternalDsl.g:2822:6: lv_assemblyContexts_31_0= ruleAssemblyContext
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
            	    break loop57;
                }
            } while (true);

            otherlv_32=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalDsl.g:2844:3: (otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==49) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDsl.g:2845:4: otherlv_33= 'assemblyConnectors' otherlv_34= '{' ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) ) (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getCompositeComponentAccess().getAssemblyConnectorsKeyword_12_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalDsl.g:2853:4: ( (lv_assemblyConnectors_35_0= ruleAssemblyConnector ) )
                    // InternalDsl.g:2854:5: (lv_assemblyConnectors_35_0= ruleAssemblyConnector )
                    {
                    // InternalDsl.g:2854:5: (lv_assemblyConnectors_35_0= ruleAssemblyConnector )
                    // InternalDsl.g:2855:6: lv_assemblyConnectors_35_0= ruleAssemblyConnector
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

                    // InternalDsl.g:2872:4: (otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDsl.g:2873:5: otherlv_36= ',' ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getCompositeComponentAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalDsl.g:2877:5: ( (lv_assemblyConnectors_37_0= ruleAssemblyConnector ) )
                    	    // InternalDsl.g:2878:6: (lv_assemblyConnectors_37_0= ruleAssemblyConnector )
                    	    {
                    	    // InternalDsl.g:2878:6: (lv_assemblyConnectors_37_0= ruleAssemblyConnector )
                    	    // InternalDsl.g:2879:7: lv_assemblyConnectors_37_0= ruleAssemblyConnector
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_38, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2902:3: (otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==50) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDsl.g:2903:4: otherlv_39= 'delegationConnectors' otherlv_40= '{' ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) ) (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )* otherlv_44= '}'
                    {
                    otherlv_39=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_39, grammarAccess.getCompositeComponentAccess().getDelegationConnectorsKeyword_13_0());
                    			
                    otherlv_40=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_40, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalDsl.g:2911:4: ( (lv_delegationConnectors_41_0= ruleDelegationConnector ) )
                    // InternalDsl.g:2912:5: (lv_delegationConnectors_41_0= ruleDelegationConnector )
                    {
                    // InternalDsl.g:2912:5: (lv_delegationConnectors_41_0= ruleDelegationConnector )
                    // InternalDsl.g:2913:6: lv_delegationConnectors_41_0= ruleDelegationConnector
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

                    // InternalDsl.g:2930:4: (otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalDsl.g:2931:5: otherlv_42= ',' ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) )
                    	    {
                    	    otherlv_42=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_42, grammarAccess.getCompositeComponentAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalDsl.g:2935:5: ( (lv_delegationConnectors_43_0= ruleDelegationConnector ) )
                    	    // InternalDsl.g:2936:6: (lv_delegationConnectors_43_0= ruleDelegationConnector )
                    	    {
                    	    // InternalDsl.g:2936:6: (lv_delegationConnectors_43_0= ruleDelegationConnector )
                    	    // InternalDsl.g:2937:7: lv_delegationConnectors_43_0= ruleDelegationConnector
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
                    	    break loop60;
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
    // InternalDsl.g:2968:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalDsl.g:2968:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalDsl.g:2969:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalDsl.g:2975:1: ruleAssemblyConnector returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '-(o-' ( ( ruleEString ) ) ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2981:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '-(o-' ( ( ruleEString ) ) ) )
            // InternalDsl.g:2982:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '-(o-' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:2982:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '-(o-' ( ( ruleEString ) ) )
            // InternalDsl.g:2983:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '-(o-' ( ( ruleEString ) )
            {
            // InternalDsl.g:2983:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:2984:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:2984:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:2985:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_62);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyConnectorAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3006:3: ( ( ruleEString ) )
            // InternalDsl.g:3007:4: ( ruleEString )
            {
            // InternalDsl.g:3007:4: ( ruleEString )
            // InternalDsl.g:3008:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getOKeyword_3());
            		
            // InternalDsl.g:3026:3: ( ( ruleEString ) )
            // InternalDsl.g:3027:4: ( ruleEString )
            {
            // InternalDsl.g:3027:4: ( ruleEString )
            // InternalDsl.g:3028:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_4_0());
            				
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
    // InternalDsl.g:3046:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalDsl.g:3046:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalDsl.g:3047:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
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
    // InternalDsl.g:3053:1: ruleDelegationConnector returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3059:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalDsl.g:3060:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:3060:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalDsl.g:3061:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalDsl.g:3061:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:3062:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:3062:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:3063:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_62);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.componentsystem.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorAccess().getColonKeyword_1());
            		
            // InternalDsl.g:3084:3: ( ( ruleEString ) )
            // InternalDsl.g:3085:4: ( ruleEString )
            {
            // InternalDsl.g:3085:4: ( ruleEString )
            // InternalDsl.g:3086:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_2_0());
            				
            pushFollow(FOLLOW_64);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalDsl.g:3104:3: ( ( ruleEString ) )
            // InternalDsl.g:3105:4: ( ruleEString )
            {
            // InternalDsl.g:3105:4: ( ruleEString )
            // InternalDsl.g:3106:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getDelegatedInterfaceInterfaceCrossReference_4_0());
            				
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
    // InternalDsl.g:3124:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:3124:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:3125:2: iv_ruleRole= ruleRole EOF
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
    // InternalDsl.g:3131:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3137:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) ) )
            // InternalDsl.g:3138:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) )
            {
            // InternalDsl.g:3138:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) )
            // InternalDsl.g:3139:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalDsl.g:3143:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3144:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3144:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3145:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_2=(Token)match(input,65,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getFromKeyword_2());
            		
            // InternalDsl.g:3166:3: ( ( ruleEString ) )
            // InternalDsl.g:3167:4: ( ruleEString )
            {
            // InternalDsl.g:3167:4: ( ruleEString )
            // InternalDsl.g:3168:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_3_0());
            				
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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalDsl.g:3186:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalDsl.g:3186:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalDsl.g:3187:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalDsl.g:3193:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) otherlv_4= '-[]->' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3199:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) otherlv_4= '-[]->' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalDsl.g:3200:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) otherlv_4= '-[]->' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDsl.g:3200:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) otherlv_4= '-[]->' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalDsl.g:3201:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) otherlv_4= '-[]->' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalDsl.g:3205:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3206:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3206:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3207:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3228:3: ( ( ruleEString ) )
            // InternalDsl.g:3229:4: ( ruleEString )
            {
            // InternalDsl.g:3229:4: ( ruleEString )
            // InternalDsl.g:3230:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblyContextAssemblyContextCrossReference_3_0());
            				
            pushFollow(FOLLOW_66);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getHyphenMinusLeftSquareBracketRightSquareBracketHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalDsl.g:3248:3: ( ( ruleEString ) )
            // InternalDsl.g:3249:4: ( ruleEString )
            {
            // InternalDsl.g:3249:4: ( ruleEString )
            // InternalDsl.g:3250:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalDsl.g:3272:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:3272:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:3273:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalDsl.g:3279:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3285:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDsl.g:3286:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDsl.g:3286:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDsl.g:3287:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDsl.g:3287:3: ()
            // InternalDsl.g:3288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalDsl.g:3298:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:3299:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:3299:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:3300:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalDsl.g:3321:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:3321:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:3322:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:3328:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) (otherlv_4= '<=>' ( ( ruleEString ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:3334:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) (otherlv_4= '<=>' ( ( ruleEString ) ) )+ otherlv_6= '}' ) )
            // InternalDsl.g:3335:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) (otherlv_4= '<=>' ( ( ruleEString ) ) )+ otherlv_6= '}' )
            {
            // InternalDsl.g:3335:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) (otherlv_4= '<=>' ( ( ruleEString ) ) )+ otherlv_6= '}' )
            // InternalDsl.g:3336:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ruleEString ) ) (otherlv_4= '<=>' ( ( ruleEString ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:3340:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:3341:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:3341:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:3342:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:3363:3: ( ( ruleEString ) )
            // InternalDsl.g:3364:4: ( ruleEString )
            {
            // InternalDsl.g:3364:4: ( ruleEString )
            // InternalDsl.g:3365:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:3379:3: (otherlv_4= '<=>' ( ( ruleEString ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==70) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDsl.g:3380:4: otherlv_4= '<=>' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,70,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4_0());
            	    			
            	    // InternalDsl.g:3384:4: ( ( ruleEString ) )
            	    // InternalDsl.g:3385:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:3385:5: ( ruleEString )
            	    // InternalDsl.g:3386:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDsl.g:3409:1: ruleSimpleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) ;
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
            // InternalDsl.g:3415:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) )
            // InternalDsl.g:3416:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            {
            // InternalDsl.g:3416:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            int alt63=10;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt63=1;
                }
                break;
            case 72:
                {
                alt63=2;
                }
                break;
            case 73:
                {
                alt63=3;
                }
                break;
            case 74:
                {
                alt63=4;
                }
                break;
            case 75:
                {
                alt63=5;
                }
                break;
            case 76:
                {
                alt63=6;
                }
                break;
            case 77:
                {
                alt63=7;
                }
                break;
            case 78:
                {
                alt63=8;
                }
                break;
            case 79:
                {
                alt63=9;
                }
                break;
            case 80:
                {
                alt63=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalDsl.g:3417:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalDsl.g:3417:3: (enumLiteral_0= 'Boolean' )
                    // InternalDsl.g:3418:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeEnumAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3425:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalDsl.g:3425:3: (enumLiteral_1= 'Char' )
                    // InternalDsl.g:3426:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeEnumAccess().getCharEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3433:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalDsl.g:3433:3: (enumLiteral_2= 'Date' )
                    // InternalDsl.g:3434:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeEnumAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:3441:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalDsl.g:3441:3: (enumLiteral_3= 'Double' )
                    // InternalDsl.g:3442:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeEnumAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:3449:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalDsl.g:3449:3: (enumLiteral_4= 'Float' )
                    // InternalDsl.g:3450:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeEnumAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:3457:3: (enumLiteral_5= 'List' )
                    {
                    // InternalDsl.g:3457:3: (enumLiteral_5= 'List' )
                    // InternalDsl.g:3458:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeEnumAccess().getListEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:3465:3: (enumLiteral_6= 'Int' )
                    {
                    // InternalDsl.g:3465:3: (enumLiteral_6= 'Int' )
                    // InternalDsl.g:3466:4: enumLiteral_6= 'Int'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeEnumAccess().getIntEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:3473:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalDsl.g:3473:3: (enumLiteral_7= 'Long' )
                    // InternalDsl.g:3474:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeEnumAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:3481:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalDsl.g:3481:3: (enumLiteral_8= 'Map' )
                    // InternalDsl.g:3482:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeEnumAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeEnumAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:3489:3: (enumLiteral_9= 'String' )
                    {
                    // InternalDsl.g:3489:3: (enumLiteral_9= 'String' )
                    // InternalDsl.g:3490:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_2); 

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000F0008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000004E000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000008030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x000000000001FF80L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0007800000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0006000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00C0000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0C00000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00008000F0000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00008000E0000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00008000C0000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000040L});

}