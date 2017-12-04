package fr.imta.renaud.ssinigaglia.parser.antlr.internal;

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
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "'{'", "'open_browser'", "'}'", "'PROCEDURE'", "'('", "'){'", "'PROC:'", "')'", "'go'", "'LINK'", "'BUTTON'", "'IMAGE'", "'click'", "'SEARCH_FIELD'", "'DIV'", "'CHECKBOX'", "'check'", "'uncheck'", "'COMBO_BOX'", "'select'", "'PAGE'", "'store'", "'in'", "'count'", "'set'", "':'", "'PARENT'", "'FIRST'", "'LAST'", "'ALL'", "'verify'", "'contains'", "'TEXT'", "'equals'", "'VAR:'", "'chrome'", "'firefox'", "'safari'", "'edge'", "'ie'", "'A'", "'LABEL'", "'ID'", "'CLASS'", "'ALT'", "'VALUE'", "'HREF'", "'TITLE'", "'NAME'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalWebDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWebDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWebDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWebDsl.g"; }



     	private WebDslGrammarAccess grammarAccess;

        public InternalWebDslParser(TokenStream input, WebDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WebDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWebDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWebDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWebDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWebDsl.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_cores_1_0= ruleCore ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;

        EObject lv_cores_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:78:2: ( ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_cores_1_0= ruleCore ) )* ) )
            // InternalWebDsl.g:79:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_cores_1_0= ruleCore ) )* )
            {
            // InternalWebDsl.g:79:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_cores_1_0= ruleCore ) )* )
            // InternalWebDsl.g:80:3: ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_cores_1_0= ruleCore ) )*
            {
            // InternalWebDsl.g:80:3: ( (lv_procedures_0_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWebDsl.g:81:4: (lv_procedures_0_0= ruleProcedure )
            	    {
            	    // InternalWebDsl.g:81:4: (lv_procedures_0_0= ruleProcedure )
            	    // InternalWebDsl.g:82:5: lv_procedures_0_0= ruleProcedure
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getProceduresProcedureParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_procedures_0_0=ruleProcedure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"procedures",
            	    						lv_procedures_0_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Procedure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalWebDsl.g:99:3: ( (lv_cores_1_0= ruleCore ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWebDsl.g:100:4: (lv_cores_1_0= ruleCore )
            	    {
            	    // InternalWebDsl.g:100:4: (lv_cores_1_0= ruleCore )
            	    // InternalWebDsl.g:101:5: lv_cores_1_0= ruleCore
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getCoresCoreParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_cores_1_0=ruleCore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cores",
            	    						lv_cores_1_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Core");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCore"
    // InternalWebDsl.g:122:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // InternalWebDsl.g:122:45: (iv_ruleCore= ruleCore EOF )
            // InternalWebDsl.g:123:2: iv_ruleCore= ruleCore EOF
            {
             newCompositeNode(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCore=ruleCore();

            state._fsp--;

             current =iv_ruleCore; 
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
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalWebDsl.g:129:1: ruleCore returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'open_browser' ( (lv_browser_4_0= ruleBrowser ) ) ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_browser_4_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:135:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'open_browser' ( (lv_browser_4_0= ruleBrowser ) ) ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:136:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'open_browser' ( (lv_browser_4_0= ruleBrowser ) ) ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:136:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'open_browser' ( (lv_browser_4_0= ruleBrowser ) ) ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            // InternalWebDsl.g:137:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'open_browser' ( (lv_browser_4_0= ruleBrowser ) ) ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getTestKeyword_0());
            		
            // InternalWebDsl.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWebDsl.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWebDsl.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalWebDsl.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCoreAccess().getOpen_browserKeyword_3());
            		
            // InternalWebDsl.g:167:3: ( (lv_browser_4_0= ruleBrowser ) )
            // InternalWebDsl.g:168:4: (lv_browser_4_0= ruleBrowser )
            {
            // InternalWebDsl.g:168:4: (lv_browser_4_0= ruleBrowser )
            // InternalWebDsl.g:169:5: lv_browser_4_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getCoreAccess().getBrowserBrowserEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_browser_4_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoreRule());
            					}
            					set(
            						current,
            						"browser",
            						lv_browser_4_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebDsl.g:186:3: ( (lv_actions_5_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||(LA3_0>=20 && LA3_0<=23)||(LA3_0>=25 && LA3_0<=27)||LA3_0==30||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWebDsl.g:187:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalWebDsl.g:187:4: (lv_actions_5_0= ruleAction )
            	    // InternalWebDsl.g:188:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleProcedure"
    // InternalWebDsl.g:213:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalWebDsl.g:213:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalWebDsl.g:214:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalWebDsl.g:220:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_var_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:226:2: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:227:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:227:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            // InternalWebDsl.g:228:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
            		
            // InternalWebDsl.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWebDsl.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWebDsl.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalWebDsl.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalWebDsl.g:254:3: ( (lv_var_3_0= ruleVar ) )
            // InternalWebDsl.g:255:4: (lv_var_3_0= ruleVar )
            {
            // InternalWebDsl.g:255:4: (lv_var_3_0= ruleVar )
            // InternalWebDsl.g:256:5: lv_var_3_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getVarVarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_var_3_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_3_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
            		
            // InternalWebDsl.g:277:3: ( (lv_actions_5_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||(LA4_0>=20 && LA4_0<=23)||(LA4_0>=25 && LA4_0<=27)||LA4_0==30||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWebDsl.g:278:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalWebDsl.g:278:4: (lv_actions_5_0= ruleAction )
            	    // InternalWebDsl.g:279:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleAction"
    // InternalWebDsl.g:304:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalWebDsl.g:304:47: (iv_ruleAction= ruleAction EOF )
            // InternalWebDsl.g:305:2: iv_ruleAction= ruleAction EOF
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
    // InternalWebDsl.g:311:1: ruleAction returns [EObject current=null] : (this_GoAction_0= ruleGoAction | this_Selection_1= ruleSelection | this_CallProcedure_2= ruleCallProcedure ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GoAction_0 = null;

        EObject this_Selection_1 = null;

        EObject this_CallProcedure_2 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:317:2: ( (this_GoAction_0= ruleGoAction | this_Selection_1= ruleSelection | this_CallProcedure_2= ruleCallProcedure ) )
            // InternalWebDsl.g:318:2: (this_GoAction_0= ruleGoAction | this_Selection_1= ruleSelection | this_CallProcedure_2= ruleCallProcedure )
            {
            // InternalWebDsl.g:318:2: (this_GoAction_0= ruleGoAction | this_Selection_1= ruleSelection | this_CallProcedure_2= ruleCallProcedure )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 30:
            case 32:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebDsl.g:319:3: this_GoAction_0= ruleGoAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGoActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoAction_0=ruleGoAction();

                    state._fsp--;


                    			current = this_GoAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:328:3: this_Selection_1= ruleSelection
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSelectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selection_1=ruleSelection();

                    state._fsp--;


                    			current = this_Selection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:337:3: this_CallProcedure_2= ruleCallProcedure
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCallProcedureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcedure_2=ruleCallProcedure();

                    state._fsp--;


                    			current = this_CallProcedure_2;
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


    // $ANTLR start "entryRuleCallProcedure"
    // InternalWebDsl.g:349:1: entryRuleCallProcedure returns [EObject current=null] : iv_ruleCallProcedure= ruleCallProcedure EOF ;
    public final EObject entryRuleCallProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedure = null;


        try {
            // InternalWebDsl.g:349:54: (iv_ruleCallProcedure= ruleCallProcedure EOF )
            // InternalWebDsl.g:350:2: iv_ruleCallProcedure= ruleCallProcedure EOF
            {
             newCompositeNode(grammarAccess.getCallProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcedure=ruleCallProcedure();

            state._fsp--;

             current =iv_ruleCallProcedure; 
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
    // $ANTLR end "entryRuleCallProcedure"


    // $ANTLR start "ruleCallProcedure"
    // InternalWebDsl.g:356:1: ruleCallProcedure returns [EObject current=null] : (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleCallProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_arg_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWebDsl.g:362:2: ( (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalWebDsl.g:363:2: (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalWebDsl.g:363:2: (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalWebDsl.g:364:3: otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCallProcedureAccess().getPROCKeyword_0());
            		
            // InternalWebDsl.g:368:3: ( (otherlv_1= RULE_ID ) )
            // InternalWebDsl.g:369:4: (otherlv_1= RULE_ID )
            {
            // InternalWebDsl.g:369:4: (otherlv_1= RULE_ID )
            // InternalWebDsl.g:370:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getCallProcedureAccess().getRefProcedureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalWebDsl.g:385:3: ( (lv_arg_3_0= RULE_STRING ) )
            // InternalWebDsl.g:386:4: (lv_arg_3_0= RULE_STRING )
            {
            // InternalWebDsl.g:386:4: (lv_arg_3_0= RULE_STRING )
            // InternalWebDsl.g:387:5: lv_arg_3_0= RULE_STRING
            {
            lv_arg_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_arg_3_0, grammarAccess.getCallProcedureAccess().getArgSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arg",
            						lv_arg_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCallProcedure"


    // $ANTLR start "entryRuleGoAction"
    // InternalWebDsl.g:411:1: entryRuleGoAction returns [EObject current=null] : iv_ruleGoAction= ruleGoAction EOF ;
    public final EObject entryRuleGoAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoAction = null;


        try {
            // InternalWebDsl.g:411:49: (iv_ruleGoAction= ruleGoAction EOF )
            // InternalWebDsl.g:412:2: iv_ruleGoAction= ruleGoAction EOF
            {
             newCompositeNode(grammarAccess.getGoActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoAction=ruleGoAction();

            state._fsp--;

             current =iv_ruleGoAction; 
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
    // $ANTLR end "entryRuleGoAction"


    // $ANTLR start "ruleGoAction"
    // InternalWebDsl.g:418:1: ruleGoAction returns [EObject current=null] : (otherlv_0= 'go' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:424:2: ( (otherlv_0= 'go' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:425:2: (otherlv_0= 'go' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:425:2: (otherlv_0= 'go' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalWebDsl.g:426:3: otherlv_0= 'go' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGoActionAccess().getGoKeyword_0());
            		
            // InternalWebDsl.g:430:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalWebDsl.g:431:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalWebDsl.g:431:4: (lv_url_1_0= RULE_STRING )
            // InternalWebDsl.g:432:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGoActionAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGoAction"


    // $ANTLR start "entryRuleSelection"
    // InternalWebDsl.g:452:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalWebDsl.g:452:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalWebDsl.g:453:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalWebDsl.g:459:1: ruleSelection returns [EObject current=null] : (this_LinkButtonSelection_0= ruleLinkButtonSelection | this_GeneralSelection_1= ruleGeneralSelection | this_CheckboxSelection_2= ruleCheckboxSelection | this_ComboboxSelection_3= ruleComboboxSelection | this_PageSelection_4= rulePageSelection ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        EObject this_LinkButtonSelection_0 = null;

        EObject this_GeneralSelection_1 = null;

        EObject this_CheckboxSelection_2 = null;

        EObject this_ComboboxSelection_3 = null;

        EObject this_PageSelection_4 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:465:2: ( (this_LinkButtonSelection_0= ruleLinkButtonSelection | this_GeneralSelection_1= ruleGeneralSelection | this_CheckboxSelection_2= ruleCheckboxSelection | this_ComboboxSelection_3= ruleComboboxSelection | this_PageSelection_4= rulePageSelection ) )
            // InternalWebDsl.g:466:2: (this_LinkButtonSelection_0= ruleLinkButtonSelection | this_GeneralSelection_1= ruleGeneralSelection | this_CheckboxSelection_2= ruleCheckboxSelection | this_ComboboxSelection_3= ruleComboboxSelection | this_PageSelection_4= rulePageSelection )
            {
            // InternalWebDsl.g:466:2: (this_LinkButtonSelection_0= ruleLinkButtonSelection | this_GeneralSelection_1= ruleGeneralSelection | this_CheckboxSelection_2= ruleCheckboxSelection | this_ComboboxSelection_3= ruleComboboxSelection | this_PageSelection_4= rulePageSelection )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
                {
                alt6=1;
                }
                break;
            case 25:
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 32:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWebDsl.g:467:3: this_LinkButtonSelection_0= ruleLinkButtonSelection
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getLinkButtonSelectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkButtonSelection_0=ruleLinkButtonSelection();

                    state._fsp--;


                    			current = this_LinkButtonSelection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:476:3: this_GeneralSelection_1= ruleGeneralSelection
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getGeneralSelectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralSelection_1=ruleGeneralSelection();

                    state._fsp--;


                    			current = this_GeneralSelection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:485:3: this_CheckboxSelection_2= ruleCheckboxSelection
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getCheckboxSelectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckboxSelection_2=ruleCheckboxSelection();

                    state._fsp--;


                    			current = this_CheckboxSelection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:494:3: this_ComboboxSelection_3= ruleComboboxSelection
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getComboboxSelectionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComboboxSelection_3=ruleComboboxSelection();

                    state._fsp--;


                    			current = this_ComboboxSelection_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:503:3: this_PageSelection_4= rulePageSelection
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getPageSelectionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageSelection_4=rulePageSelection();

                    state._fsp--;


                    			current = this_PageSelection_4;
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleLinkButtonSelection"
    // InternalWebDsl.g:515:1: entryRuleLinkButtonSelection returns [EObject current=null] : iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF ;
    public final EObject entryRuleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkButtonSelection = null;


        try {
            // InternalWebDsl.g:515:60: (iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF )
            // InternalWebDsl.g:516:2: iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF
            {
             newCompositeNode(grammarAccess.getLinkButtonSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkButtonSelection=ruleLinkButtonSelection();

            state._fsp--;

             current =iv_ruleLinkButtonSelection; 
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
    // $ANTLR end "entryRuleLinkButtonSelection"


    // $ANTLR start "ruleLinkButtonSelection"
    // InternalWebDsl.g:522:1: ruleLinkButtonSelection returns [EObject current=null] : ( ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        Token lv_typeElement_0_1=null;
        Token lv_typeElement_0_2=null;
        Token lv_typeElement_0_3=null;
        Token otherlv_2=null;
        Token lv_clicks_4_0=null;
        Token otherlv_5=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:528:2: ( ( ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )* otherlv_5= '}' ) )
            // InternalWebDsl.g:529:2: ( ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )* otherlv_5= '}' )
            {
            // InternalWebDsl.g:529:2: ( ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )* otherlv_5= '}' )
            // InternalWebDsl.g:530:3: ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )* otherlv_5= '}'
            {
            // InternalWebDsl.g:530:3: ( ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) ) )
            // InternalWebDsl.g:531:4: ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) )
            {
            // InternalWebDsl.g:531:4: ( (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' ) )
            // InternalWebDsl.g:532:5: (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' )
            {
            // InternalWebDsl.g:532:5: (lv_typeElement_0_1= 'LINK' | lv_typeElement_0_2= 'BUTTON' | lv_typeElement_0_3= 'IMAGE' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalWebDsl.g:533:6: lv_typeElement_0_1= 'LINK'
                    {
                    lv_typeElement_0_1=(Token)match(input,21,FOLLOW_14); 

                    						newLeafNode(lv_typeElement_0_1, grammarAccess.getLinkButtonSelectionAccess().getTypeElementLINKKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkButtonSelectionRule());
                    						}
                    						setWithLastConsumed(current, "typeElement", lv_typeElement_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:544:6: lv_typeElement_0_2= 'BUTTON'
                    {
                    lv_typeElement_0_2=(Token)match(input,22,FOLLOW_14); 

                    						newLeafNode(lv_typeElement_0_2, grammarAccess.getLinkButtonSelectionAccess().getTypeElementBUTTONKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkButtonSelectionRule());
                    						}
                    						setWithLastConsumed(current, "typeElement", lv_typeElement_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:555:6: lv_typeElement_0_3= 'IMAGE'
                    {
                    lv_typeElement_0_3=(Token)match(input,23,FOLLOW_14); 

                    						newLeafNode(lv_typeElement_0_3, grammarAccess.getLinkButtonSelectionAccess().getTypeElementIMAGEKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkButtonSelectionRule());
                    						}
                    						setWithLastConsumed(current, "typeElement", lv_typeElement_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalWebDsl.g:568:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:569:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:569:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:570:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:591:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | ( (lv_clicks_4_0= 'click' ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=23)||(LA8_0>=25 && LA8_0<=27)||LA8_0==30||(LA8_0>=32 && LA8_0<=33)||LA8_0==36) ) {
                    alt8=1;
                }
                else if ( (LA8_0==24) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWebDsl.g:592:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:592:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:593:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:593:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:594:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:612:4: ( (lv_clicks_4_0= 'click' ) )
            	    {
            	    // InternalWebDsl.g:612:4: ( (lv_clicks_4_0= 'click' ) )
            	    // InternalWebDsl.g:613:5: (lv_clicks_4_0= 'click' )
            	    {
            	    // InternalWebDsl.g:613:5: (lv_clicks_4_0= 'click' )
            	    // InternalWebDsl.g:614:6: lv_clicks_4_0= 'click'
            	    {
            	    lv_clicks_4_0=(Token)match(input,24,FOLLOW_15); 

            	    						newLeafNode(lv_clicks_4_0, grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkButtonSelectionRule());
            	    						}
            	    						addWithLastConsumed(current, "clicks", lv_clicks_4_0, "click");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLinkButtonSelection"


    // $ANTLR start "entryRuleGeneralSelection"
    // InternalWebDsl.g:635:1: entryRuleGeneralSelection returns [EObject current=null] : iv_ruleGeneralSelection= ruleGeneralSelection EOF ;
    public final EObject entryRuleGeneralSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralSelection = null;


        try {
            // InternalWebDsl.g:635:57: (iv_ruleGeneralSelection= ruleGeneralSelection EOF )
            // InternalWebDsl.g:636:2: iv_ruleGeneralSelection= ruleGeneralSelection EOF
            {
             newCompositeNode(grammarAccess.getGeneralSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralSelection=ruleGeneralSelection();

            state._fsp--;

             current =iv_ruleGeneralSelection; 
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
    // $ANTLR end "entryRuleGeneralSelection"


    // $ANTLR start "ruleGeneralSelection"
    // InternalWebDsl.g:642:1: ruleGeneralSelection returns [EObject current=null] : ( ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( (lv_generalActions_3_0= ruleGeneralAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleGeneralSelection() throws RecognitionException {
        EObject current = null;

        Token lv_typeElement_0_1=null;
        Token lv_typeElement_0_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:648:2: ( ( ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( (lv_generalActions_3_0= ruleGeneralAction ) )* otherlv_4= '}' ) )
            // InternalWebDsl.g:649:2: ( ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( (lv_generalActions_3_0= ruleGeneralAction ) )* otherlv_4= '}' )
            {
            // InternalWebDsl.g:649:2: ( ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( (lv_generalActions_3_0= ruleGeneralAction ) )* otherlv_4= '}' )
            // InternalWebDsl.g:650:3: ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( (lv_generalActions_3_0= ruleGeneralAction ) )* otherlv_4= '}'
            {
            // InternalWebDsl.g:650:3: ( ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) ) )
            // InternalWebDsl.g:651:4: ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) )
            {
            // InternalWebDsl.g:651:4: ( (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' ) )
            // InternalWebDsl.g:652:5: (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' )
            {
            // InternalWebDsl.g:652:5: (lv_typeElement_0_1= 'SEARCH_FIELD' | lv_typeElement_0_2= 'DIV' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWebDsl.g:653:6: lv_typeElement_0_1= 'SEARCH_FIELD'
                    {
                    lv_typeElement_0_1=(Token)match(input,25,FOLLOW_14); 

                    						newLeafNode(lv_typeElement_0_1, grammarAccess.getGeneralSelectionAccess().getTypeElementSEARCH_FIELDKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralSelectionRule());
                    						}
                    						setWithLastConsumed(current, "typeElement", lv_typeElement_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:664:6: lv_typeElement_0_2= 'DIV'
                    {
                    lv_typeElement_0_2=(Token)match(input,26,FOLLOW_14); 

                    						newLeafNode(lv_typeElement_0_2, grammarAccess.getGeneralSelectionAccess().getTypeElementDIVKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralSelectionRule());
                    						}
                    						setWithLastConsumed(current, "typeElement", lv_typeElement_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalWebDsl.g:677:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:678:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:678:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:679:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:700:3: ( (lv_generalActions_3_0= ruleGeneralAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=23)||(LA10_0>=25 && LA10_0<=27)||LA10_0==30||(LA10_0>=32 && LA10_0<=33)||LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWebDsl.g:701:4: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:701:4: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:702:5: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generalActions",
            	    						lv_generalActions_3_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGeneralSelection"


    // $ANTLR start "entryRuleCheckboxSelection"
    // InternalWebDsl.g:727:1: entryRuleCheckboxSelection returns [EObject current=null] : iv_ruleCheckboxSelection= ruleCheckboxSelection EOF ;
    public final EObject entryRuleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxSelection = null;


        try {
            // InternalWebDsl.g:727:58: (iv_ruleCheckboxSelection= ruleCheckboxSelection EOF )
            // InternalWebDsl.g:728:2: iv_ruleCheckboxSelection= ruleCheckboxSelection EOF
            {
             newCompositeNode(grammarAccess.getCheckboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxSelection=ruleCheckboxSelection();

            state._fsp--;

             current =iv_ruleCheckboxSelection; 
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
    // $ANTLR end "entryRuleCheckboxSelection"


    // $ANTLR start "ruleCheckboxSelection"
    // InternalWebDsl.g:734:1: ruleCheckboxSelection returns [EObject current=null] : ( ( (lv_typeElement_0_0= 'CHECKBOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        Token lv_typeElement_0_0=null;
        Token otherlv_2=null;
        Token lv_action_3_1=null;
        Token lv_action_3_2=null;
        Token otherlv_4=null;
        EObject lv_typeSelection_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:740:2: ( ( ( (lv_typeElement_0_0= 'CHECKBOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) ) otherlv_4= '}' ) )
            // InternalWebDsl.g:741:2: ( ( (lv_typeElement_0_0= 'CHECKBOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) ) otherlv_4= '}' )
            {
            // InternalWebDsl.g:741:2: ( ( (lv_typeElement_0_0= 'CHECKBOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) ) otherlv_4= '}' )
            // InternalWebDsl.g:742:3: ( (lv_typeElement_0_0= 'CHECKBOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) ) otherlv_4= '}'
            {
            // InternalWebDsl.g:742:3: ( (lv_typeElement_0_0= 'CHECKBOX' ) )
            // InternalWebDsl.g:743:4: (lv_typeElement_0_0= 'CHECKBOX' )
            {
            // InternalWebDsl.g:743:4: (lv_typeElement_0_0= 'CHECKBOX' )
            // InternalWebDsl.g:744:5: lv_typeElement_0_0= 'CHECKBOX'
            {
            lv_typeElement_0_0=(Token)match(input,27,FOLLOW_14); 

            					newLeafNode(lv_typeElement_0_0, grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxSelectionRule());
            					}
            					setWithLastConsumed(current, "typeElement", lv_typeElement_0_0, "CHECKBOX");
            				

            }


            }

            // InternalWebDsl.g:756:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:757:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:757:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:758:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:779:3: ( ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) ) )
            // InternalWebDsl.g:780:4: ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) )
            {
            // InternalWebDsl.g:780:4: ( (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' ) )
            // InternalWebDsl.g:781:5: (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' )
            {
            // InternalWebDsl.g:781:5: (lv_action_3_1= 'check' | lv_action_3_2= 'uncheck' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalWebDsl.g:782:6: lv_action_3_1= 'check'
                    {
                    lv_action_3_1=(Token)match(input,28,FOLLOW_18); 

                    						newLeafNode(lv_action_3_1, grammarAccess.getCheckboxSelectionAccess().getActionCheckKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckboxSelectionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:793:6: lv_action_3_2= 'uncheck'
                    {
                    lv_action_3_2=(Token)match(input,29,FOLLOW_18); 

                    						newLeafNode(lv_action_3_2, grammarAccess.getCheckboxSelectionAccess().getActionUncheckKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckboxSelectionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCheckboxSelection"


    // $ANTLR start "entryRuleComboboxSelection"
    // InternalWebDsl.g:814:1: entryRuleComboboxSelection returns [EObject current=null] : iv_ruleComboboxSelection= ruleComboboxSelection EOF ;
    public final EObject entryRuleComboboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboboxSelection = null;


        try {
            // InternalWebDsl.g:814:58: (iv_ruleComboboxSelection= ruleComboboxSelection EOF )
            // InternalWebDsl.g:815:2: iv_ruleComboboxSelection= ruleComboboxSelection EOF
            {
             newCompositeNode(grammarAccess.getComboboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComboboxSelection=ruleComboboxSelection();

            state._fsp--;

             current =iv_ruleComboboxSelection; 
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
    // $ANTLR end "entryRuleComboboxSelection"


    // $ANTLR start "ruleComboboxSelection"
    // InternalWebDsl.g:821:1: ruleComboboxSelection returns [EObject current=null] : ( ( (lv_typeElement_0_0= 'COMBO_BOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) ;
    public final EObject ruleComboboxSelection() throws RecognitionException {
        EObject current = null;

        Token lv_typeElement_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:827:2: ( ( ( (lv_typeElement_0_0= 'COMBO_BOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:828:2: ( ( (lv_typeElement_0_0= 'COMBO_BOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:828:2: ( ( (lv_typeElement_0_0= 'COMBO_BOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            // InternalWebDsl.g:829:3: ( (lv_typeElement_0_0= 'COMBO_BOX' ) ) ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}'
            {
            // InternalWebDsl.g:829:3: ( (lv_typeElement_0_0= 'COMBO_BOX' ) )
            // InternalWebDsl.g:830:4: (lv_typeElement_0_0= 'COMBO_BOX' )
            {
            // InternalWebDsl.g:830:4: (lv_typeElement_0_0= 'COMBO_BOX' )
            // InternalWebDsl.g:831:5: lv_typeElement_0_0= 'COMBO_BOX'
            {
            lv_typeElement_0_0=(Token)match(input,30,FOLLOW_14); 

            					newLeafNode(lv_typeElement_0_0, grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxSelectionRule());
            					}
            					setWithLastConsumed(current, "typeElement", lv_typeElement_0_0, "COMBO_BOX");
            				

            }


            }

            // InternalWebDsl.g:843:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:844:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:844:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:845:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getComboboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboboxSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:866:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=23)||(LA12_0>=25 && LA12_0<=27)||LA12_0==30||(LA12_0>=32 && LA12_0<=33)||LA12_0==36) ) {
                    alt12=1;
                }
                else if ( (LA12_0==31) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebDsl.g:867:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:867:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:868:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:868:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:869:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getComboboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComboboxSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:887:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    {
            	    // InternalWebDsl.g:887:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    // InternalWebDsl.g:888:5: otherlv_4= 'select' this_STRING_5= RULE_STRING
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0());
            	    				
            	    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    					newLeafNode(this_STRING_5, grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComboboxSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComboboxSelection"


    // $ANTLR start "entryRulePageSelection"
    // InternalWebDsl.g:906:1: entryRulePageSelection returns [EObject current=null] : iv_rulePageSelection= rulePageSelection EOF ;
    public final EObject entryRulePageSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageSelection = null;


        try {
            // InternalWebDsl.g:906:54: (iv_rulePageSelection= rulePageSelection EOF )
            // InternalWebDsl.g:907:2: iv_rulePageSelection= rulePageSelection EOF
            {
             newCompositeNode(grammarAccess.getPageSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageSelection=rulePageSelection();

            state._fsp--;

             current =iv_rulePageSelection; 
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
    // $ANTLR end "entryRulePageSelection"


    // $ANTLR start "rulePageSelection"
    // InternalWebDsl.g:913:1: rulePageSelection returns [EObject current=null] : ( ( (lv_typeElement_0_0= 'PAGE' ) ) otherlv_1= '{' ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePageSelection() throws RecognitionException {
        EObject current = null;

        Token lv_typeElement_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_storeActions_2_0 = null;

        EObject lv_assertions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:919:2: ( ( ( (lv_typeElement_0_0= 'PAGE' ) ) otherlv_1= '{' ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )* otherlv_4= '}' ) )
            // InternalWebDsl.g:920:2: ( ( (lv_typeElement_0_0= 'PAGE' ) ) otherlv_1= '{' ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            {
            // InternalWebDsl.g:920:2: ( ( (lv_typeElement_0_0= 'PAGE' ) ) otherlv_1= '{' ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            // InternalWebDsl.g:921:3: ( (lv_typeElement_0_0= 'PAGE' ) ) otherlv_1= '{' ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )* otherlv_4= '}'
            {
            // InternalWebDsl.g:921:3: ( (lv_typeElement_0_0= 'PAGE' ) )
            // InternalWebDsl.g:922:4: (lv_typeElement_0_0= 'PAGE' )
            {
            // InternalWebDsl.g:922:4: (lv_typeElement_0_0= 'PAGE' )
            // InternalWebDsl.g:923:5: lv_typeElement_0_0= 'PAGE'
            {
            lv_typeElement_0_0=(Token)match(input,32,FOLLOW_6); 

            					newLeafNode(lv_typeElement_0_0, grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageSelectionRule());
            					}
            					setWithLastConsumed(current, "typeElement", lv_typeElement_0_0, "PAGE");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWebDsl.g:939:3: ( ( (lv_storeActions_2_0= ruleStoreAction ) ) | ( (lv_assertions_3_0= ruleAssert ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }
                else if ( (LA13_0==42) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWebDsl.g:940:4: ( (lv_storeActions_2_0= ruleStoreAction ) )
            	    {
            	    // InternalWebDsl.g:940:4: ( (lv_storeActions_2_0= ruleStoreAction ) )
            	    // InternalWebDsl.g:941:5: (lv_storeActions_2_0= ruleStoreAction )
            	    {
            	    // InternalWebDsl.g:941:5: (lv_storeActions_2_0= ruleStoreAction )
            	    // InternalWebDsl.g:942:6: lv_storeActions_2_0= ruleStoreAction
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getStoreActionsStoreActionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_storeActions_2_0=ruleStoreAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"storeActions",
            	    							lv_storeActions_2_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.StoreAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:960:4: ( (lv_assertions_3_0= ruleAssert ) )
            	    {
            	    // InternalWebDsl.g:960:4: ( (lv_assertions_3_0= ruleAssert ) )
            	    // InternalWebDsl.g:961:5: (lv_assertions_3_0= ruleAssert )
            	    {
            	    // InternalWebDsl.g:961:5: (lv_assertions_3_0= ruleAssert )
            	    // InternalWebDsl.g:962:6: lv_assertions_3_0= ruleAssert
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getAssertionsAssertParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_assertions_3_0=ruleAssert();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assertions",
            	    							lv_assertions_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.Assert");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageSelectionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePageSelection"


    // $ANTLR start "entryRuleGeneralAction"
    // InternalWebDsl.g:988:1: entryRuleGeneralAction returns [EObject current=null] : iv_ruleGeneralAction= ruleGeneralAction EOF ;
    public final EObject entryRuleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralAction = null;


        try {
            // InternalWebDsl.g:988:54: (iv_ruleGeneralAction= ruleGeneralAction EOF )
            // InternalWebDsl.g:989:2: iv_ruleGeneralAction= ruleGeneralAction EOF
            {
             newCompositeNode(grammarAccess.getGeneralActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralAction=ruleGeneralAction();

            state._fsp--;

             current =iv_ruleGeneralAction; 
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
    // $ANTLR end "entryRuleGeneralAction"


    // $ANTLR start "ruleGeneralAction"
    // InternalWebDsl.g:995:1: ruleGeneralAction returns [EObject current=null] : (this_SetAction_0= ruleSetAction | this_StoreAction_1= ruleStoreAction | this_Selection_2= ruleSelection ) ;
    public final EObject ruleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject this_SetAction_0 = null;

        EObject this_StoreAction_1 = null;

        EObject this_Selection_2 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1001:2: ( (this_SetAction_0= ruleSetAction | this_StoreAction_1= ruleStoreAction | this_Selection_2= ruleSelection ) )
            // InternalWebDsl.g:1002:2: (this_SetAction_0= ruleSetAction | this_StoreAction_1= ruleStoreAction | this_Selection_2= ruleSelection )
            {
            // InternalWebDsl.g:1002:2: (this_SetAction_0= ruleSetAction | this_StoreAction_1= ruleStoreAction | this_Selection_2= ruleSelection )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 30:
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalWebDsl.g:1003:3: this_SetAction_0= ruleSetAction
                    {

                    			newCompositeNode(grammarAccess.getGeneralActionAccess().getSetActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetAction_0=ruleSetAction();

                    state._fsp--;


                    			current = this_SetAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1012:3: this_StoreAction_1= ruleStoreAction
                    {

                    			newCompositeNode(grammarAccess.getGeneralActionAccess().getStoreActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreAction_1=ruleStoreAction();

                    state._fsp--;


                    			current = this_StoreAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1021:3: this_Selection_2= ruleSelection
                    {

                    			newCompositeNode(grammarAccess.getGeneralActionAccess().getSelectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selection_2=ruleSelection();

                    state._fsp--;


                    			current = this_Selection_2;
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
    // $ANTLR end "ruleGeneralAction"


    // $ANTLR start "entryRuleStoreAction"
    // InternalWebDsl.g:1033:1: entryRuleStoreAction returns [EObject current=null] : iv_ruleStoreAction= ruleStoreAction EOF ;
    public final EObject entryRuleStoreAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreAction = null;


        try {
            // InternalWebDsl.g:1033:52: (iv_ruleStoreAction= ruleStoreAction EOF )
            // InternalWebDsl.g:1034:2: iv_ruleStoreAction= ruleStoreAction EOF
            {
             newCompositeNode(grammarAccess.getStoreActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreAction=ruleStoreAction();

            state._fsp--;

             current =iv_ruleStoreAction; 
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
    // $ANTLR end "entryRuleStoreAction"


    // $ANTLR start "ruleStoreAction"
    // InternalWebDsl.g:1040:1: ruleStoreAction returns [EObject current=null] : (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) ) ;
    public final EObject ruleStoreAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_val_2_0 = null;

        EObject lv_count_3_0 = null;

        EObject lv_var_6_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1046:2: ( (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) ) )
            // InternalWebDsl.g:1047:2: (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) )
            {
            // InternalWebDsl.g:1047:2: (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) )
            // InternalWebDsl.g:1048:3: otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreActionAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWebDsl.g:1056:3: ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=53 && LA15_0<=60)) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalWebDsl.g:1057:4: ( (lv_val_2_0= ruleAttribute ) )
                    {
                    // InternalWebDsl.g:1057:4: ( (lv_val_2_0= ruleAttribute ) )
                    // InternalWebDsl.g:1058:5: (lv_val_2_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1058:5: (lv_val_2_0= ruleAttribute )
                    // InternalWebDsl.g:1059:6: lv_val_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getStoreActionAccess().getValAttributeEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_val_2_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStoreActionRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1077:4: ( (lv_count_3_0= ruleCountAction ) )
                    {
                    // InternalWebDsl.g:1077:4: ( (lv_count_3_0= ruleCountAction ) )
                    // InternalWebDsl.g:1078:5: (lv_count_3_0= ruleCountAction )
                    {
                    // InternalWebDsl.g:1078:5: (lv_count_3_0= ruleCountAction )
                    // InternalWebDsl.g:1079:6: lv_count_3_0= ruleCountAction
                    {

                    						newCompositeNode(grammarAccess.getStoreActionAccess().getCountCountActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_count_3_0=ruleCountAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStoreActionRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_3_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.CountAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreActionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreActionAccess().getInKeyword_4());
            		
            // InternalWebDsl.g:1105:3: ( (lv_var_6_0= ruleVar ) )
            // InternalWebDsl.g:1106:4: (lv_var_6_0= ruleVar )
            {
            // InternalWebDsl.g:1106:4: (lv_var_6_0= ruleVar )
            // InternalWebDsl.g:1107:5: lv_var_6_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_6_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreActionRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_6_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Var");
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
    // $ANTLR end "ruleStoreAction"


    // $ANTLR start "entryRuleCountAction"
    // InternalWebDsl.g:1128:1: entryRuleCountAction returns [EObject current=null] : iv_ruleCountAction= ruleCountAction EOF ;
    public final EObject entryRuleCountAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAction = null;


        try {
            // InternalWebDsl.g:1128:52: (iv_ruleCountAction= ruleCountAction EOF )
            // InternalWebDsl.g:1129:2: iv_ruleCountAction= ruleCountAction EOF
            {
             newCompositeNode(grammarAccess.getCountActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountAction=ruleCountAction();

            state._fsp--;

             current =iv_ruleCountAction; 
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
    // $ANTLR end "entryRuleCountAction"


    // $ANTLR start "ruleCountAction"
    // InternalWebDsl.g:1135:1: ruleCountAction returns [EObject current=null] : (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) ) ;
    public final EObject ruleCountAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_htmlElement_1_0 = null;

        EObject lv_typeSelection_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1141:2: ( (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) ) )
            // InternalWebDsl.g:1142:2: (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) )
            {
            // InternalWebDsl.g:1142:2: (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) )
            // InternalWebDsl.g:1143:3: otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getCountActionAccess().getCountKeyword_0());
            		
            // InternalWebDsl.g:1147:3: ( (lv_htmlElement_1_0= ruleHtmlElement ) )
            // InternalWebDsl.g:1148:4: (lv_htmlElement_1_0= ruleHtmlElement )
            {
            // InternalWebDsl.g:1148:4: (lv_htmlElement_1_0= ruleHtmlElement )
            // InternalWebDsl.g:1149:5: lv_htmlElement_1_0= ruleHtmlElement
            {

            					newCompositeNode(grammarAccess.getCountActionAccess().getHtmlElementHtmlElementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_htmlElement_1_0=ruleHtmlElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountActionRule());
            					}
            					set(
            						current,
            						"htmlElement",
            						lv_htmlElement_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.HtmlElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebDsl.g:1166:3: ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            // InternalWebDsl.g:1167:4: (lv_typeSelection_2_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:1167:4: (lv_typeSelection_2_0= ruleTypeSelection )
            // InternalWebDsl.g:1168:5: lv_typeSelection_2_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getCountActionAccess().getTypeSelectionTypeSelectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeSelection_2_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountActionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_2_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
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
    // $ANTLR end "ruleCountAction"


    // $ANTLR start "entryRuleVar"
    // InternalWebDsl.g:1189:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalWebDsl.g:1189:44: (iv_ruleVar= ruleVar EOF )
            // InternalWebDsl.g:1190:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalWebDsl.g:1196:1: ruleVar returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1202:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWebDsl.g:1203:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWebDsl.g:1203:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWebDsl.g:1204:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWebDsl.g:1204:3: (lv_name_0_0= RULE_ID )
            // InternalWebDsl.g:1205:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleSetAction"
    // InternalWebDsl.g:1224:1: entryRuleSetAction returns [EObject current=null] : iv_ruleSetAction= ruleSetAction EOF ;
    public final EObject entryRuleSetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAction = null;


        try {
            // InternalWebDsl.g:1224:50: (iv_ruleSetAction= ruleSetAction EOF )
            // InternalWebDsl.g:1225:2: iv_ruleSetAction= ruleSetAction EOF
            {
             newCompositeNode(grammarAccess.getSetActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetAction=ruleSetAction();

            state._fsp--;

             current =iv_ruleSetAction; 
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
    // $ANTLR end "entryRuleSetAction"


    // $ANTLR start "ruleSetAction"
    // InternalWebDsl.g:1231:1: ruleSetAction returns [EObject current=null] : (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Enumerator lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1237:2: ( (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:1238:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:1238:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalWebDsl.g:1239:3: otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSetActionAccess().getSetKeyword_0());
            		
            // InternalWebDsl.g:1243:3: ( (lv_attribute_1_0= ruleAttribute ) )
            // InternalWebDsl.g:1244:4: (lv_attribute_1_0= ruleAttribute )
            {
            // InternalWebDsl.g:1244:4: (lv_attribute_1_0= ruleAttribute )
            // InternalWebDsl.g:1245:5: lv_attribute_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_attribute_1_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSetActionAccess().getColonKeyword_2());
            		
            // InternalWebDsl.g:1266:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalWebDsl.g:1267:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalWebDsl.g:1267:4: (lv_value_3_0= RULE_STRING )
            // InternalWebDsl.g:1268:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSetActionAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSetAction"


    // $ANTLR start "entryRuleTypeSelection"
    // InternalWebDsl.g:1288:1: entryRuleTypeSelection returns [EObject current=null] : iv_ruleTypeSelection= ruleTypeSelection EOF ;
    public final EObject entryRuleTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelection = null;


        try {
            // InternalWebDsl.g:1288:54: (iv_ruleTypeSelection= ruleTypeSelection EOF )
            // InternalWebDsl.g:1289:2: iv_ruleTypeSelection= ruleTypeSelection EOF
            {
             newCompositeNode(grammarAccess.getTypeSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSelection=ruleTypeSelection();

            state._fsp--;

             current =iv_ruleTypeSelection; 
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
    // $ANTLR end "entryRuleTypeSelection"


    // $ANTLR start "ruleTypeSelection"
    // InternalWebDsl.g:1295:1: ruleTypeSelection returns [EObject current=null] : ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' ) ;
    public final EObject ruleTypeSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_attribute_0_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1301:2: ( ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' ) )
            // InternalWebDsl.g:1302:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' )
            {
            // InternalWebDsl.g:1302:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            case 41:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalWebDsl.g:1303:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
                    {
                    // InternalWebDsl.g:1303:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
                    // InternalWebDsl.g:1304:4: ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalWebDsl.g:1304:4: ( (lv_attribute_0_0= ruleAttribute ) )
                    // InternalWebDsl.g:1305:5: (lv_attribute_0_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1305:5: (lv_attribute_0_0= ruleAttribute )
                    // InternalWebDsl.g:1306:6: lv_attribute_0_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getTypeSelectionAccess().getAttributeAttributeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_attribute_0_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeSelectionRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_0_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1());
                    			
                    // InternalWebDsl.g:1327:4: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalWebDsl.g:1328:5: ( (lv_value_2_0= RULE_STRING ) )
                            {
                            // InternalWebDsl.g:1328:5: ( (lv_value_2_0= RULE_STRING ) )
                            // InternalWebDsl.g:1329:6: (lv_value_2_0= RULE_STRING )
                            {
                            // InternalWebDsl.g:1329:6: (lv_value_2_0= RULE_STRING )
                            // InternalWebDsl.g:1330:7: lv_value_2_0= RULE_STRING
                            {
                            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_value_2_0, grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeSelectionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalWebDsl.g:1347:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalWebDsl.g:1347:5: ( (otherlv_3= RULE_ID ) )
                            // InternalWebDsl.g:1348:6: (otherlv_3= RULE_ID )
                            {
                            // InternalWebDsl.g:1348:6: (otherlv_3= RULE_ID )
                            // InternalWebDsl.g:1349:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeSelectionRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_3, grammarAccess.getTypeSelectionAccess().getVarVarCrossReference_0_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1363:3: otherlv_4= 'PARENT'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1368:3: otherlv_5= 'FIRST'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1373:3: otherlv_6= 'LAST'
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getTypeSelectionAccess().getLASTKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1378:3: otherlv_7= 'ALL'
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

                    			newLeafNode(otherlv_7, grammarAccess.getTypeSelectionAccess().getALLKeyword_4());
                    		

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
    // $ANTLR end "ruleTypeSelection"


    // $ANTLR start "entryRuleAssert"
    // InternalWebDsl.g:1386:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalWebDsl.g:1386:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalWebDsl.g:1387:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
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
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalWebDsl.g:1393:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'verify' (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals ) ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AssertContains_1 = null;

        EObject this_AssertEquals_2 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1399:2: ( (otherlv_0= 'verify' (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals ) ) )
            // InternalWebDsl.g:1400:2: (otherlv_0= 'verify' (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals ) )
            {
            // InternalWebDsl.g:1400:2: (otherlv_0= 'verify' (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals ) )
            // InternalWebDsl.g:1401:3: otherlv_0= 'verify' (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getVerifyKeyword_0());
            		
            // InternalWebDsl.g:1405:3: (this_AssertContains_1= ruleAssertContains | this_AssertEquals_2= ruleAssertEquals )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING||LA18_0==16||LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalWebDsl.g:1406:4: this_AssertContains_1= ruleAssertContains
                    {

                    				newCompositeNode(grammarAccess.getAssertAccess().getAssertContainsParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_AssertContains_1=ruleAssertContains();

                    state._fsp--;


                    				current = this_AssertContains_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1415:4: this_AssertEquals_2= ruleAssertEquals
                    {

                    				newCompositeNode(grammarAccess.getAssertAccess().getAssertEqualsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AssertEquals_2=ruleAssertEquals();

                    state._fsp--;


                    				current = this_AssertEquals_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleAssertContains"
    // InternalWebDsl.g:1428:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalWebDsl.g:1428:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalWebDsl.g:1429:2: iv_ruleAssertContains= ruleAssertContains EOF
            {
             newCompositeNode(grammarAccess.getAssertContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertContains=ruleAssertContains();

            state._fsp--;

             current =iv_ruleAssertContains; 
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
    // $ANTLR end "entryRuleAssertContains"


    // $ANTLR start "ruleAssertContains"
    // InternalWebDsl.g:1435:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Enumerator lv_htmlElement_1_0 = null;

        Enumerator lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1441:2: ( (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:1442:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:1442:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            // InternalWebDsl.g:1443:3: otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getContainsKeyword_0());
            		
            // InternalWebDsl.g:1447:3: ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | ( (lv_text_3_0= 'TEXT' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=21 && LA19_0<=23)||(LA19_0>=26 && LA19_0<=27)||LA19_0==30||LA19_0==52) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalWebDsl.g:1448:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    {
                    // InternalWebDsl.g:1448:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    // InternalWebDsl.g:1449:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) )
                    {
                    // InternalWebDsl.g:1449:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1450:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1450:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    // InternalWebDsl.g:1451:7: lv_htmlElement_1_0= ruleHtmlElement
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getHtmlElementHtmlElementEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_htmlElement_1_0=ruleHtmlElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertContainsRule());
                    							}
                    							set(
                    								current,
                    								"htmlElement",
                    								lv_htmlElement_1_0,
                    								"fr.imta.renaud.ssinigaglia.WebDsl.HtmlElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalWebDsl.g:1468:5: ( (lv_attribute_2_0= ruleAttribute ) )
                    // InternalWebDsl.g:1469:6: (lv_attribute_2_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1469:6: (lv_attribute_2_0= ruleAttribute )
                    // InternalWebDsl.g:1470:7: lv_attribute_2_0= ruleAttribute
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getAttributeAttributeEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_attribute_2_0=ruleAttribute();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertContainsRule());
                    							}
                    							set(
                    								current,
                    								"attribute",
                    								lv_attribute_2_0,
                    								"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1489:4: ( (lv_text_3_0= 'TEXT' ) )
                    {
                    // InternalWebDsl.g:1489:4: ( (lv_text_3_0= 'TEXT' ) )
                    // InternalWebDsl.g:1490:5: (lv_text_3_0= 'TEXT' )
                    {
                    // InternalWebDsl.g:1490:5: (lv_text_3_0= 'TEXT' )
                    // InternalWebDsl.g:1491:6: lv_text_3_0= 'TEXT'
                    {
                    lv_text_3_0=(Token)match(input,44,FOLLOW_25); 

                    						newLeafNode(lv_text_3_0, grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssertContainsRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_3_0, "TEXT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAssertContainsAccess().getColonKeyword_2());
            		
            // InternalWebDsl.g:1508:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalWebDsl.g:1509:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalWebDsl.g:1509:4: (lv_value_5_0= RULE_STRING )
            // InternalWebDsl.g:1510:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getAssertContainsAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertContainsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAssertContains"


    // $ANTLR start "entryRuleAssertEquals"
    // InternalWebDsl.g:1530:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalWebDsl.g:1530:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalWebDsl.g:1531:2: iv_ruleAssertEquals= ruleAssertEquals EOF
            {
             newCompositeNode(grammarAccess.getAssertEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertEquals=ruleAssertEquals();

            state._fsp--;

             current =iv_ruleAssertEquals; 
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
    // $ANTLR end "entryRuleAssertEquals"


    // $ANTLR start "ruleAssertEquals"
    // InternalWebDsl.g:1537:1: ruleAssertEquals returns [EObject current=null] : ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1543:2: ( ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) )
            // InternalWebDsl.g:1544:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            {
            // InternalWebDsl.g:1544:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            // InternalWebDsl.g:1545:3: ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) )
            {
            // InternalWebDsl.g:1545:3: ( (lv_c1_0_0= ruleComparable ) )
            // InternalWebDsl.g:1546:4: (lv_c1_0_0= ruleComparable )
            {
            // InternalWebDsl.g:1546:4: (lv_c1_0_0= ruleComparable )
            // InternalWebDsl.g:1547:5: lv_c1_0_0= ruleComparable
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_c1_0_0=ruleComparable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					set(
            						current,
            						"c1",
            						lv_c1_0_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Comparable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1());
            		
            // InternalWebDsl.g:1568:3: ( (lv_c2_2_0= ruleComparable ) )
            // InternalWebDsl.g:1569:4: (lv_c2_2_0= ruleComparable )
            {
            // InternalWebDsl.g:1569:4: (lv_c2_2_0= ruleComparable )
            // InternalWebDsl.g:1570:5: lv_c2_2_0= ruleComparable
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getC2ComparableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_c2_2_0=ruleComparable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					set(
            						current,
            						"c2",
            						lv_c2_2_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Comparable");
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
    // $ANTLR end "ruleAssertEquals"


    // $ANTLR start "entryRuleComparable"
    // InternalWebDsl.g:1591:1: entryRuleComparable returns [EObject current=null] : iv_ruleComparable= ruleComparable EOF ;
    public final EObject entryRuleComparable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparable = null;


        try {
            // InternalWebDsl.g:1591:51: (iv_ruleComparable= ruleComparable EOF )
            // InternalWebDsl.g:1592:2: iv_ruleComparable= ruleComparable EOF
            {
             newCompositeNode(grammarAccess.getComparableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparable=ruleComparable();

            state._fsp--;

             current =iv_ruleComparable; 
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
    // $ANTLR end "entryRuleComparable"


    // $ANTLR start "ruleComparable"
    // InternalWebDsl.g:1598:1: ruleComparable returns [EObject current=null] : ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) ;
    public final EObject ruleComparable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        EObject lv_var_1_0 = null;

        Enumerator lv_htmlElement_3_0 = null;

        Enumerator lv_attribute_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1604:2: ( ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) )
            // InternalWebDsl.g:1605:2: ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            {
            // InternalWebDsl.g:1605:2: ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt20=1;
                }
                break;
            case 16:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalWebDsl.g:1606:3: (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) )
                    {
                    // InternalWebDsl.g:1606:3: (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) )
                    // InternalWebDsl.g:1607:4: otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparableAccess().getVARKeyword_0_0());
                    			
                    // InternalWebDsl.g:1611:4: ( (lv_var_1_0= ruleVar ) )
                    // InternalWebDsl.g:1612:5: (lv_var_1_0= ruleVar )
                    {
                    // InternalWebDsl.g:1612:5: (lv_var_1_0= ruleVar )
                    // InternalWebDsl.g:1613:6: lv_var_1_0= ruleVar
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getVarVarParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_var_1_0=ruleVar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparableRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_1_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Var");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1632:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    {
                    // InternalWebDsl.g:1632:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    // InternalWebDsl.g:1633:4: otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalWebDsl.g:1637:4: ( (lv_htmlElement_3_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1638:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1638:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    // InternalWebDsl.g:1639:6: lv_htmlElement_3_0= ruleHtmlElement
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getHtmlElementHtmlElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_htmlElement_3_0=ruleHtmlElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparableRule());
                    						}
                    						set(
                    							current,
                    							"htmlElement",
                    							lv_htmlElement_3_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.HtmlElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWebDsl.g:1656:4: ( (lv_attribute_4_0= ruleAttribute ) )
                    // InternalWebDsl.g:1657:5: (lv_attribute_4_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1657:5: (lv_attribute_4_0= ruleAttribute )
                    // InternalWebDsl.g:1658:6: lv_attribute_4_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getAttributeAttributeEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attribute_4_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparableRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_4_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1681:3: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_6, grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleComparable"


    // $ANTLR start "ruleBrowser"
    // InternalWebDsl.g:1689:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1695:2: ( ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) )
            // InternalWebDsl.g:1696:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            {
            // InternalWebDsl.g:1696:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt21=1;
                }
                break;
            case 48:
                {
                alt21=2;
                }
                break;
            case 49:
                {
                alt21=3;
                }
                break;
            case 50:
                {
                alt21=4;
                }
                break;
            case 51:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalWebDsl.g:1697:3: (enumLiteral_0= 'chrome' )
                    {
                    // InternalWebDsl.g:1697:3: (enumLiteral_0= 'chrome' )
                    // InternalWebDsl.g:1698:4: enumLiteral_0= 'chrome'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1705:3: (enumLiteral_1= 'firefox' )
                    {
                    // InternalWebDsl.g:1705:3: (enumLiteral_1= 'firefox' )
                    // InternalWebDsl.g:1706:4: enumLiteral_1= 'firefox'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1713:3: (enumLiteral_2= 'safari' )
                    {
                    // InternalWebDsl.g:1713:3: (enumLiteral_2= 'safari' )
                    // InternalWebDsl.g:1714:4: enumLiteral_2= 'safari'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1721:3: (enumLiteral_3= 'edge' )
                    {
                    // InternalWebDsl.g:1721:3: (enumLiteral_3= 'edge' )
                    // InternalWebDsl.g:1722:4: enumLiteral_3= 'edge'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1729:3: (enumLiteral_4= 'ie' )
                    {
                    // InternalWebDsl.g:1729:3: (enumLiteral_4= 'ie' )
                    // InternalWebDsl.g:1730:4: enumLiteral_4= 'ie'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleHtmlElement"
    // InternalWebDsl.g:1740:1: ruleHtmlElement returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) ;
    public final Enumerator ruleHtmlElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1746:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) )
            // InternalWebDsl.g:1747:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            {
            // InternalWebDsl.g:1747:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt22=1;
                }
                break;
            case 22:
                {
                alt22=2;
                }
                break;
            case 27:
                {
                alt22=3;
                }
                break;
            case 30:
                {
                alt22=4;
                }
                break;
            case 26:
                {
                alt22=5;
                }
                break;
            case 23:
                {
                alt22=6;
                }
                break;
            case 52:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalWebDsl.g:1748:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalWebDsl.g:1748:3: (enumLiteral_0= 'LINK' )
                    // InternalWebDsl.g:1749:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1756:3: (enumLiteral_1= 'BUTTON' )
                    {
                    // InternalWebDsl.g:1756:3: (enumLiteral_1= 'BUTTON' )
                    // InternalWebDsl.g:1757:4: enumLiteral_1= 'BUTTON'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1764:3: (enumLiteral_2= 'CHECKBOX' )
                    {
                    // InternalWebDsl.g:1764:3: (enumLiteral_2= 'CHECKBOX' )
                    // InternalWebDsl.g:1765:4: enumLiteral_2= 'CHECKBOX'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1772:3: (enumLiteral_3= 'COMBO_BOX' )
                    {
                    // InternalWebDsl.g:1772:3: (enumLiteral_3= 'COMBO_BOX' )
                    // InternalWebDsl.g:1773:4: enumLiteral_3= 'COMBO_BOX'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1780:3: (enumLiteral_4= 'DIV' )
                    {
                    // InternalWebDsl.g:1780:3: (enumLiteral_4= 'DIV' )
                    // InternalWebDsl.g:1781:4: enumLiteral_4= 'DIV'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1788:3: (enumLiteral_5= 'IMAGE' )
                    {
                    // InternalWebDsl.g:1788:3: (enumLiteral_5= 'IMAGE' )
                    // InternalWebDsl.g:1789:4: enumLiteral_5= 'IMAGE'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1796:3: (enumLiteral_6= 'A' )
                    {
                    // InternalWebDsl.g:1796:3: (enumLiteral_6= 'A' )
                    // InternalWebDsl.g:1797:4: enumLiteral_6= 'A'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleHtmlElement"


    // $ANTLR start "ruleAttribute"
    // InternalWebDsl.g:1807:1: ruleAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) | (enumLiteral_7= 'NAME' ) ) ;
    public final Enumerator ruleAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1813:2: ( ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) | (enumLiteral_7= 'NAME' ) ) )
            // InternalWebDsl.g:1814:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) | (enumLiteral_7= 'NAME' ) )
            {
            // InternalWebDsl.g:1814:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) | (enumLiteral_7= 'NAME' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
                }
                break;
            case 56:
                {
                alt23=4;
                }
                break;
            case 57:
                {
                alt23=5;
                }
                break;
            case 58:
                {
                alt23=6;
                }
                break;
            case 59:
                {
                alt23=7;
                }
                break;
            case 60:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalWebDsl.g:1815:3: (enumLiteral_0= 'LABEL' )
                    {
                    // InternalWebDsl.g:1815:3: (enumLiteral_0= 'LABEL' )
                    // InternalWebDsl.g:1816:4: enumLiteral_0= 'LABEL'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1823:3: (enumLiteral_1= 'ID' )
                    {
                    // InternalWebDsl.g:1823:3: (enumLiteral_1= 'ID' )
                    // InternalWebDsl.g:1824:4: enumLiteral_1= 'ID'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1831:3: (enumLiteral_2= 'CLASS' )
                    {
                    // InternalWebDsl.g:1831:3: (enumLiteral_2= 'CLASS' )
                    // InternalWebDsl.g:1832:4: enumLiteral_2= 'CLASS'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1839:3: (enumLiteral_3= 'ALT' )
                    {
                    // InternalWebDsl.g:1839:3: (enumLiteral_3= 'ALT' )
                    // InternalWebDsl.g:1840:4: enumLiteral_3= 'ALT'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1847:3: (enumLiteral_4= 'VALUE' )
                    {
                    // InternalWebDsl.g:1847:3: (enumLiteral_4= 'VALUE' )
                    // InternalWebDsl.g:1848:4: enumLiteral_4= 'VALUE'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1855:3: (enumLiteral_5= 'HREF' )
                    {
                    // InternalWebDsl.g:1855:3: (enumLiteral_5= 'HREF' )
                    // InternalWebDsl.g:1856:4: enumLiteral_5= 'HREF'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1863:3: (enumLiteral_6= 'TITLE' )
                    {
                    // InternalWebDsl.g:1863:3: (enumLiteral_6= 'TITLE' )
                    // InternalWebDsl.g:1864:4: enumLiteral_6= 'TITLE'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalWebDsl.g:1871:3: (enumLiteral_7= 'NAME' )
                    {
                    // InternalWebDsl.g:1871:3: (enumLiteral_7= 'NAME' )
                    // InternalWebDsl.g:1872:4: enumLiteral_7= 'NAME'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getNAMEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getAttributeAccess().getNAMEEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000014EF44000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1FE003C000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000134FE04000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000134EE04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000013CEE04000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040200004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1FE0000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001000004CE00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1FE0000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000480000010020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001010004CE00000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});

}