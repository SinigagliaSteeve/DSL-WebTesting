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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open_browser'", "'PROCEDURE'", "'('", "'){'", "'}'", "'PROC:'", "')'", "'go'", "'LINK'", "'BUTTON'", "'{'", "'click'", "'SEARCH_FIELD'", "'DIV'", "'A'", "'CHECKBOX'", "'check'", "'uncheck'", "'COMBO_BOX'", "'select'", "'PAGE'", "'store'", "'in'", "'count'", "'set'", "':'", "'PARENT'", "'FIRST'", "'LAST'", "'ALL'", "'verify'", "'contains'", "'TEXT'", "'equals'", "'VAR:'", "'chrome'", "'firefox'", "'safari'", "'edge'", "'ie'", "'IMAGE'", "'LABEL'", "'ID'", "'CLASS'", "'ALT'", "'VALUE'", "'HREF'", "'TITLE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    // InternalWebDsl.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_core_1_0= ruleCore ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;

        EObject lv_core_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:78:2: ( ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_core_1_0= ruleCore ) ) ) )
            // InternalWebDsl.g:79:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_core_1_0= ruleCore ) ) )
            {
            // InternalWebDsl.g:79:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_core_1_0= ruleCore ) ) )
            // InternalWebDsl.g:80:3: ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_core_1_0= ruleCore ) )
            {
            // InternalWebDsl.g:80:3: ( (lv_procedures_0_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
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

            // InternalWebDsl.g:99:3: ( (lv_core_1_0= ruleCore ) )
            // InternalWebDsl.g:100:4: (lv_core_1_0= ruleCore )
            {
            // InternalWebDsl.g:100:4: (lv_core_1_0= ruleCore )
            // InternalWebDsl.g:101:5: lv_core_1_0= ruleCore
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getCoreCoreParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_core_1_0=ruleCore();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"core",
            						lv_core_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Core");
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
    // InternalWebDsl.g:129:1: ruleCore returns [EObject current=null] : (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_name_1_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:135:2: ( (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* ) )
            // InternalWebDsl.g:136:2: (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* )
            {
            // InternalWebDsl.g:136:2: (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* )
            // InternalWebDsl.g:137:3: otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getOpen_browserKeyword_0());
            		
            // InternalWebDsl.g:141:3: ( (lv_name_1_0= ruleBrowser ) )
            // InternalWebDsl.g:142:4: (lv_name_1_0= ruleBrowser )
            {
            // InternalWebDsl.g:142:4: (lv_name_1_0= ruleBrowser )
            // InternalWebDsl.g:143:5: lv_name_1_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getCoreAccess().getNameBrowserEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebDsl.g:160:3: ( (lv_actions_2_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=18 && LA2_0<=20)||(LA2_0>=23 && LA2_0<=26)||LA2_0==29||LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWebDsl.g:161:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalWebDsl.g:161:4: (lv_actions_2_0= ruleAction )
            	    // InternalWebDsl.g:162:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Action");
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
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleProcedure"
    // InternalWebDsl.g:183:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalWebDsl.g:183:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalWebDsl.g:184:2: iv_ruleProcedure= ruleProcedure EOF
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
    // InternalWebDsl.g:190:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) ;
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
            // InternalWebDsl.g:196:2: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:197:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:197:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' )
            // InternalWebDsl.g:198:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_var_3_0= ruleVar ) ) otherlv_4= '){' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
            		
            // InternalWebDsl.g:202:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWebDsl.g:203:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWebDsl.g:203:4: (lv_name_1_0= RULE_ID )
            // InternalWebDsl.g:204:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalWebDsl.g:224:3: ( (lv_var_3_0= ruleVar ) )
            // InternalWebDsl.g:225:4: (lv_var_3_0= ruleVar )
            {
            // InternalWebDsl.g:225:4: (lv_var_3_0= ruleVar )
            // InternalWebDsl.g:226:5: lv_var_3_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getVarVarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
            		
            // InternalWebDsl.g:247:3: ( (lv_actions_5_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=18 && LA3_0<=20)||(LA3_0>=23 && LA3_0<=26)||LA3_0==29||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWebDsl.g:248:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalWebDsl.g:248:4: (lv_actions_5_0= ruleAction )
            	    // InternalWebDsl.g:249:5: lv_actions_5_0= ruleAction
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
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalWebDsl.g:274:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalWebDsl.g:274:47: (iv_ruleAction= ruleAction EOF )
            // InternalWebDsl.g:275:2: iv_ruleAction= ruleAction EOF
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
    // InternalWebDsl.g:281:1: ruleAction returns [EObject current=null] : ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) | ( (lv_callProcedure_2_0= ruleCallProcedure ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_goAction_0_0 = null;

        EObject lv_selection_1_0 = null;

        EObject lv_callProcedure_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:287:2: ( ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) | ( (lv_callProcedure_2_0= ruleCallProcedure ) ) ) )
            // InternalWebDsl.g:288:2: ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) | ( (lv_callProcedure_2_0= ruleCallProcedure ) ) )
            {
            // InternalWebDsl.g:288:2: ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) | ( (lv_callProcedure_2_0= ruleCallProcedure ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 29:
            case 31:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalWebDsl.g:289:3: ( (lv_goAction_0_0= ruleGoAction ) )
                    {
                    // InternalWebDsl.g:289:3: ( (lv_goAction_0_0= ruleGoAction ) )
                    // InternalWebDsl.g:290:4: (lv_goAction_0_0= ruleGoAction )
                    {
                    // InternalWebDsl.g:290:4: (lv_goAction_0_0= ruleGoAction )
                    // InternalWebDsl.g:291:5: lv_goAction_0_0= ruleGoAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getGoActionGoActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goAction_0_0=ruleGoAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"goAction",
                    						lv_goAction_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.GoAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:309:3: ( (lv_selection_1_0= ruleSelection ) )
                    {
                    // InternalWebDsl.g:309:3: ( (lv_selection_1_0= ruleSelection ) )
                    // InternalWebDsl.g:310:4: (lv_selection_1_0= ruleSelection )
                    {
                    // InternalWebDsl.g:310:4: (lv_selection_1_0= ruleSelection )
                    // InternalWebDsl.g:311:5: lv_selection_1_0= ruleSelection
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getSelectionSelectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selection_1_0=ruleSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"selection",
                    						lv_selection_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.Selection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:329:3: ( (lv_callProcedure_2_0= ruleCallProcedure ) )
                    {
                    // InternalWebDsl.g:329:3: ( (lv_callProcedure_2_0= ruleCallProcedure ) )
                    // InternalWebDsl.g:330:4: (lv_callProcedure_2_0= ruleCallProcedure )
                    {
                    // InternalWebDsl.g:330:4: (lv_callProcedure_2_0= ruleCallProcedure )
                    // InternalWebDsl.g:331:5: lv_callProcedure_2_0= ruleCallProcedure
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getCallProcedureCallProcedureParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_callProcedure_2_0=ruleCallProcedure();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"callProcedure",
                    						lv_callProcedure_2_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.CallProcedure");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCallProcedure"
    // InternalWebDsl.g:352:1: entryRuleCallProcedure returns [EObject current=null] : iv_ruleCallProcedure= ruleCallProcedure EOF ;
    public final EObject entryRuleCallProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedure = null;


        try {
            // InternalWebDsl.g:352:54: (iv_ruleCallProcedure= ruleCallProcedure EOF )
            // InternalWebDsl.g:353:2: iv_ruleCallProcedure= ruleCallProcedure EOF
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
    // InternalWebDsl.g:359:1: ruleCallProcedure returns [EObject current=null] : (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleCallProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_arg_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWebDsl.g:365:2: ( (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalWebDsl.g:366:2: (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalWebDsl.g:366:2: (otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalWebDsl.g:367:3: otherlv_0= 'PROC:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCallProcedureAccess().getPROCKeyword_0());
            		
            // InternalWebDsl.g:371:3: ( (otherlv_1= RULE_ID ) )
            // InternalWebDsl.g:372:4: (otherlv_1= RULE_ID )
            {
            // InternalWebDsl.g:372:4: (otherlv_1= RULE_ID )
            // InternalWebDsl.g:373:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getCallProcedureAccess().getRefProcedureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalWebDsl.g:388:3: ( (lv_arg_3_0= RULE_STRING ) )
            // InternalWebDsl.g:389:4: (lv_arg_3_0= RULE_STRING )
            {
            // InternalWebDsl.g:389:4: (lv_arg_3_0= RULE_STRING )
            // InternalWebDsl.g:390:5: lv_arg_3_0= RULE_STRING
            {
            lv_arg_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalWebDsl.g:414:1: entryRuleGoAction returns [EObject current=null] : iv_ruleGoAction= ruleGoAction EOF ;
    public final EObject entryRuleGoAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoAction = null;


        try {
            // InternalWebDsl.g:414:49: (iv_ruleGoAction= ruleGoAction EOF )
            // InternalWebDsl.g:415:2: iv_ruleGoAction= ruleGoAction EOF
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
    // InternalWebDsl.g:421:1: ruleGoAction returns [EObject current=null] : (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:427:2: ( (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:428:2: (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:428:2: (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalWebDsl.g:429:3: otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGoActionAccess().getGoKeyword_0());
            		
            // InternalWebDsl.g:433:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalWebDsl.g:434:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalWebDsl.g:434:4: (lv_name_1_0= RULE_STRING )
            // InternalWebDsl.g:435:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoActionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalWebDsl.g:455:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalWebDsl.g:455:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalWebDsl.g:456:2: iv_ruleSelection= ruleSelection EOF
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
    // InternalWebDsl.g:462:1: ruleSelection returns [EObject current=null] : ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        EObject lv_linkButtonSelection_0_0 = null;

        EObject lv_generalSelection_1_0 = null;

        EObject lv_checkboxSelection_2_0 = null;

        EObject lv_comboboxSelection_3_0 = null;

        EObject lv_pageSelection_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:468:2: ( ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) ) )
            // InternalWebDsl.g:469:2: ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) )
            {
            // InternalWebDsl.g:469:2: ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt5=1;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebDsl.g:470:3: ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) )
                    {
                    // InternalWebDsl.g:470:3: ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) )
                    // InternalWebDsl.g:471:4: (lv_linkButtonSelection_0_0= ruleLinkButtonSelection )
                    {
                    // InternalWebDsl.g:471:4: (lv_linkButtonSelection_0_0= ruleLinkButtonSelection )
                    // InternalWebDsl.g:472:5: lv_linkButtonSelection_0_0= ruleLinkButtonSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getLinkButtonSelectionLinkButtonSelectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_linkButtonSelection_0_0=ruleLinkButtonSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"linkButtonSelection",
                    						lv_linkButtonSelection_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.LinkButtonSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:490:3: ( (lv_generalSelection_1_0= ruleGeneralSelection ) )
                    {
                    // InternalWebDsl.g:490:3: ( (lv_generalSelection_1_0= ruleGeneralSelection ) )
                    // InternalWebDsl.g:491:4: (lv_generalSelection_1_0= ruleGeneralSelection )
                    {
                    // InternalWebDsl.g:491:4: (lv_generalSelection_1_0= ruleGeneralSelection )
                    // InternalWebDsl.g:492:5: lv_generalSelection_1_0= ruleGeneralSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getGeneralSelectionGeneralSelectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_generalSelection_1_0=ruleGeneralSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"generalSelection",
                    						lv_generalSelection_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.GeneralSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:510:3: ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) )
                    {
                    // InternalWebDsl.g:510:3: ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) )
                    // InternalWebDsl.g:511:4: (lv_checkboxSelection_2_0= ruleCheckboxSelection )
                    {
                    // InternalWebDsl.g:511:4: (lv_checkboxSelection_2_0= ruleCheckboxSelection )
                    // InternalWebDsl.g:512:5: lv_checkboxSelection_2_0= ruleCheckboxSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getCheckboxSelectionCheckboxSelectionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_checkboxSelection_2_0=ruleCheckboxSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"checkboxSelection",
                    						lv_checkboxSelection_2_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.CheckboxSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:530:3: ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) )
                    {
                    // InternalWebDsl.g:530:3: ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) )
                    // InternalWebDsl.g:531:4: (lv_comboboxSelection_3_0= ruleComboboxSelection )
                    {
                    // InternalWebDsl.g:531:4: (lv_comboboxSelection_3_0= ruleComboboxSelection )
                    // InternalWebDsl.g:532:5: lv_comboboxSelection_3_0= ruleComboboxSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getComboboxSelectionComboboxSelectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comboboxSelection_3_0=ruleComboboxSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"comboboxSelection",
                    						lv_comboboxSelection_3_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.ComboboxSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:550:3: ( (lv_pageSelection_4_0= rulePageSelection ) )
                    {
                    // InternalWebDsl.g:550:3: ( (lv_pageSelection_4_0= rulePageSelection ) )
                    // InternalWebDsl.g:551:4: (lv_pageSelection_4_0= rulePageSelection )
                    {
                    // InternalWebDsl.g:551:4: (lv_pageSelection_4_0= rulePageSelection )
                    // InternalWebDsl.g:552:5: lv_pageSelection_4_0= rulePageSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getPageSelectionPageSelectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pageSelection_4_0=rulePageSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"pageSelection",
                    						lv_pageSelection_4_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.PageSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleLinkButtonSelection"
    // InternalWebDsl.g:573:1: entryRuleLinkButtonSelection returns [EObject current=null] : iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF ;
    public final EObject entryRuleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkButtonSelection = null;


        try {
            // InternalWebDsl.g:573:60: (iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF )
            // InternalWebDsl.g:574:2: iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF
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
    // InternalWebDsl.g:580:1: ruleLinkButtonSelection returns [EObject current=null] : ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' ) ;
    public final EObject ruleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_2_0 = null;

        EObject lv_generalActions_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:586:2: ( ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' ) )
            // InternalWebDsl.g:587:2: ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:587:2: ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' )
            // InternalWebDsl.g:588:3: (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}'
            {
            // InternalWebDsl.g:588:3: (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWebDsl.g:589:4: otherlv_0= 'LINK'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLinkButtonSelectionAccess().getLINKKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:594:4: otherlv_1= 'BUTTON'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLinkButtonSelectionAccess().getBUTTONKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalWebDsl.g:599:3: ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            // InternalWebDsl.g:600:4: (lv_typeSelection_2_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:600:4: (lv_typeSelection_2_0= ruleTypeSelection )
            // InternalWebDsl.g:601:5: lv_typeSelection_2_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_typeSelection_2_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_2_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:622:3: ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=20)||(LA7_0>=23 && LA7_0<=26)||LA7_0==29||(LA7_0>=31 && LA7_0<=32)||LA7_0==35) ) {
                    alt7=1;
                }
                else if ( (LA7_0==22) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWebDsl.g:623:4: ( (lv_generalActions_4_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:623:4: ( (lv_generalActions_4_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:624:5: (lv_generalActions_4_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:624:5: (lv_generalActions_4_0= ruleGeneralAction )
            	    // InternalWebDsl.g:625:6: lv_generalActions_4_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_generalActions_4_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_4_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:643:4: otherlv_5= 'click'
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLinkButtonSelectionAccess().getClickKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalWebDsl.g:656:1: entryRuleGeneralSelection returns [EObject current=null] : iv_ruleGeneralSelection= ruleGeneralSelection EOF ;
    public final EObject entryRuleGeneralSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralSelection = null;


        try {
            // InternalWebDsl.g:656:57: (iv_ruleGeneralSelection= ruleGeneralSelection EOF )
            // InternalWebDsl.g:657:2: iv_ruleGeneralSelection= ruleGeneralSelection EOF
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
    // InternalWebDsl.g:663:1: ruleGeneralSelection returns [EObject current=null] : ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleGeneralSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_3_0 = null;

        EObject lv_generalActions_5_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:669:2: ( ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:670:2: ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:670:2: ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' )
            // InternalWebDsl.g:671:3: (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}'
            {
            // InternalWebDsl.g:671:3: (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWebDsl.g:672:4: otherlv_0= 'SEARCH_FIELD'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getGeneralSelectionAccess().getSEARCH_FIELDKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:677:4: otherlv_1= 'DIV'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getGeneralSelectionAccess().getDIVKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:682:4: otherlv_2= 'A'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeneralSelectionAccess().getAKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalWebDsl.g:687:3: ( (lv_typeSelection_3_0= ruleTypeSelection ) )
            // InternalWebDsl.g:688:4: (lv_typeSelection_3_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:688:4: (lv_typeSelection_3_0= ruleTypeSelection )
            // InternalWebDsl.g:689:5: lv_typeSelection_3_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_typeSelection_3_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_3_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:710:3: ( (lv_generalActions_5_0= ruleGeneralAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=20)||(LA9_0>=23 && LA9_0<=26)||LA9_0==29||(LA9_0>=31 && LA9_0<=32)||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebDsl.g:711:4: (lv_generalActions_5_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:711:4: (lv_generalActions_5_0= ruleGeneralAction )
            	    // InternalWebDsl.g:712:5: lv_generalActions_5_0= ruleGeneralAction
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_generalActions_5_0=ruleGeneralAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generalActions",
            	    						lv_generalActions_5_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalWebDsl.g:737:1: entryRuleCheckboxSelection returns [EObject current=null] : iv_ruleCheckboxSelection= ruleCheckboxSelection EOF ;
    public final EObject entryRuleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxSelection = null;


        try {
            // InternalWebDsl.g:737:58: (iv_ruleCheckboxSelection= ruleCheckboxSelection EOF )
            // InternalWebDsl.g:738:2: iv_ruleCheckboxSelection= ruleCheckboxSelection EOF
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
    // InternalWebDsl.g:744:1: ruleCheckboxSelection returns [EObject current=null] : (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' ) ;
    public final EObject ruleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:750:2: ( (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' ) )
            // InternalWebDsl.g:751:2: (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:751:2: (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' )
            // InternalWebDsl.g:752:3: otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxSelectionAccess().getCHECKBOXKeyword_0());
            		
            // InternalWebDsl.g:756:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:757:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:757:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:758:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:779:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )*
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case 19:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                case 29:
                case 31:
                case 32:
                case 35:
                    {
                    alt10=1;
                    }
                    break;
                case 27:
                    {
                    alt10=2;
                    }
                    break;
                case 28:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalWebDsl.g:780:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:780:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:781:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:781:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:782:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCheckboxSelectionRule());
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
            	    // InternalWebDsl.g:800:4: otherlv_4= 'check'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalWebDsl.g:805:4: otherlv_5= 'uncheck'
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalWebDsl.g:818:1: entryRuleComboboxSelection returns [EObject current=null] : iv_ruleComboboxSelection= ruleComboboxSelection EOF ;
    public final EObject entryRuleComboboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboboxSelection = null;


        try {
            // InternalWebDsl.g:818:58: (iv_ruleComboboxSelection= ruleComboboxSelection EOF )
            // InternalWebDsl.g:819:2: iv_ruleComboboxSelection= ruleComboboxSelection EOF
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
    // InternalWebDsl.g:825:1: ruleComboboxSelection returns [EObject current=null] : (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) ;
    public final EObject ruleComboboxSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:831:2: ( (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:832:2: (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:832:2: (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            // InternalWebDsl.g:833:3: otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxSelectionAccess().getCOMBO_BOXKeyword_0());
            		
            // InternalWebDsl.g:837:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:838:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:838:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:839:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getComboboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:860:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=20)||(LA11_0>=23 && LA11_0<=26)||LA11_0==29||(LA11_0>=31 && LA11_0<=32)||LA11_0==35) ) {
                    alt11=1;
                }
                else if ( (LA11_0==30) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWebDsl.g:861:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:861:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:862:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:862:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:863:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getComboboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    // InternalWebDsl.g:881:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    {
            	    // InternalWebDsl.g:881:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    // InternalWebDsl.g:882:5: otherlv_4= 'select' this_STRING_5= RULE_STRING
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_10); 

            	    					newLeafNode(otherlv_4, grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0());
            	    				
            	    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    					newLeafNode(this_STRING_5, grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalWebDsl.g:900:1: entryRulePageSelection returns [EObject current=null] : iv_rulePageSelection= rulePageSelection EOF ;
    public final EObject entryRulePageSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageSelection = null;


        try {
            // InternalWebDsl.g:900:54: (iv_rulePageSelection= rulePageSelection EOF )
            // InternalWebDsl.g:901:2: iv_rulePageSelection= rulePageSelection EOF
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
    // InternalWebDsl.g:907:1: rulePageSelection returns [EObject current=null] : (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePageSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_storeAction_2_0 = null;

        EObject lv_assertion_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:913:2: ( (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' ) )
            // InternalWebDsl.g:914:2: (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            {
            // InternalWebDsl.g:914:2: (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            // InternalWebDsl.g:915:3: otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPageSelectionAccess().getPAGEKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWebDsl.g:923:3: ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }
                else if ( (LA12_0==41) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebDsl.g:924:4: ( (lv_storeAction_2_0= ruleStoreAction ) )
            	    {
            	    // InternalWebDsl.g:924:4: ( (lv_storeAction_2_0= ruleStoreAction ) )
            	    // InternalWebDsl.g:925:5: (lv_storeAction_2_0= ruleStoreAction )
            	    {
            	    // InternalWebDsl.g:925:5: (lv_storeAction_2_0= ruleStoreAction )
            	    // InternalWebDsl.g:926:6: lv_storeAction_2_0= ruleStoreAction
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getStoreActionStoreActionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_storeAction_2_0=ruleStoreAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"storeAction",
            	    							lv_storeAction_2_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.StoreAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:944:4: ( (lv_assertion_3_0= ruleAssert ) )
            	    {
            	    // InternalWebDsl.g:944:4: ( (lv_assertion_3_0= ruleAssert ) )
            	    // InternalWebDsl.g:945:5: (lv_assertion_3_0= ruleAssert )
            	    {
            	    // InternalWebDsl.g:945:5: (lv_assertion_3_0= ruleAssert )
            	    // InternalWebDsl.g:946:6: lv_assertion_3_0= ruleAssert
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getAssertionAssertParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_assertion_3_0=ruleAssert();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"assertion",
            	    							lv_assertion_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.Assert");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalWebDsl.g:972:1: entryRuleGeneralAction returns [EObject current=null] : iv_ruleGeneralAction= ruleGeneralAction EOF ;
    public final EObject entryRuleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralAction = null;


        try {
            // InternalWebDsl.g:972:54: (iv_ruleGeneralAction= ruleGeneralAction EOF )
            // InternalWebDsl.g:973:2: iv_ruleGeneralAction= ruleGeneralAction EOF
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
    // InternalWebDsl.g:979:1: ruleGeneralAction returns [EObject current=null] : ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) ) ;
    public final EObject ruleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject lv_setAction_0_0 = null;

        EObject lv_storeAction_1_0 = null;

        EObject lv_selection_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:985:2: ( ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) ) )
            // InternalWebDsl.g:986:2: ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) )
            {
            // InternalWebDsl.g:986:2: ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 29:
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalWebDsl.g:987:3: ( (lv_setAction_0_0= ruleSetAction ) )
                    {
                    // InternalWebDsl.g:987:3: ( (lv_setAction_0_0= ruleSetAction ) )
                    // InternalWebDsl.g:988:4: (lv_setAction_0_0= ruleSetAction )
                    {
                    // InternalWebDsl.g:988:4: (lv_setAction_0_0= ruleSetAction )
                    // InternalWebDsl.g:989:5: lv_setAction_0_0= ruleSetAction
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getSetActionSetActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_setAction_0_0=ruleSetAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"setAction",
                    						lv_setAction_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.SetAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1007:3: ( (lv_storeAction_1_0= ruleStoreAction ) )
                    {
                    // InternalWebDsl.g:1007:3: ( (lv_storeAction_1_0= ruleStoreAction ) )
                    // InternalWebDsl.g:1008:4: (lv_storeAction_1_0= ruleStoreAction )
                    {
                    // InternalWebDsl.g:1008:4: (lv_storeAction_1_0= ruleStoreAction )
                    // InternalWebDsl.g:1009:5: lv_storeAction_1_0= ruleStoreAction
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getStoreActionStoreActionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_storeAction_1_0=ruleStoreAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"storeAction",
                    						lv_storeAction_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.StoreAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1027:3: ( (lv_selection_2_0= ruleSelection ) )
                    {
                    // InternalWebDsl.g:1027:3: ( (lv_selection_2_0= ruleSelection ) )
                    // InternalWebDsl.g:1028:4: (lv_selection_2_0= ruleSelection )
                    {
                    // InternalWebDsl.g:1028:4: (lv_selection_2_0= ruleSelection )
                    // InternalWebDsl.g:1029:5: lv_selection_2_0= ruleSelection
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getSelectionSelectionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selection_2_0=ruleSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"selection",
                    						lv_selection_2_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.Selection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleGeneralAction"


    // $ANTLR start "entryRuleStoreAction"
    // InternalWebDsl.g:1050:1: entryRuleStoreAction returns [EObject current=null] : iv_ruleStoreAction= ruleStoreAction EOF ;
    public final EObject entryRuleStoreAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreAction = null;


        try {
            // InternalWebDsl.g:1050:52: (iv_ruleStoreAction= ruleStoreAction EOF )
            // InternalWebDsl.g:1051:2: iv_ruleStoreAction= ruleStoreAction EOF
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
    // InternalWebDsl.g:1057:1: ruleStoreAction returns [EObject current=null] : (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) ) ;
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
            // InternalWebDsl.g:1063:2: ( (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) ) )
            // InternalWebDsl.g:1064:2: (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) )
            {
            // InternalWebDsl.g:1064:2: (otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) ) )
            // InternalWebDsl.g:1065:3: otherlv_0= 'store' otherlv_1= '(' ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) ) otherlv_4= ')' otherlv_5= 'in' ( (lv_var_6_0= ruleVar ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreActionAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWebDsl.g:1073:3: ( ( (lv_val_2_0= ruleAttribute ) ) | ( (lv_count_3_0= ruleCountAction ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=52 && LA14_0<=58)) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWebDsl.g:1074:4: ( (lv_val_2_0= ruleAttribute ) )
                    {
                    // InternalWebDsl.g:1074:4: ( (lv_val_2_0= ruleAttribute ) )
                    // InternalWebDsl.g:1075:5: (lv_val_2_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1075:5: (lv_val_2_0= ruleAttribute )
                    // InternalWebDsl.g:1076:6: lv_val_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getStoreActionAccess().getValAttributeEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
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
                    // InternalWebDsl.g:1094:4: ( (lv_count_3_0= ruleCountAction ) )
                    {
                    // InternalWebDsl.g:1094:4: ( (lv_count_3_0= ruleCountAction ) )
                    // InternalWebDsl.g:1095:5: (lv_count_3_0= ruleCountAction )
                    {
                    // InternalWebDsl.g:1095:5: (lv_count_3_0= ruleCountAction )
                    // InternalWebDsl.g:1096:6: lv_count_3_0= ruleCountAction
                    {

                    						newCompositeNode(grammarAccess.getStoreActionAccess().getCountCountActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreActionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreActionAccess().getInKeyword_4());
            		
            // InternalWebDsl.g:1122:3: ( (lv_var_6_0= ruleVar ) )
            // InternalWebDsl.g:1123:4: (lv_var_6_0= ruleVar )
            {
            // InternalWebDsl.g:1123:4: (lv_var_6_0= ruleVar )
            // InternalWebDsl.g:1124:5: lv_var_6_0= ruleVar
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
    // InternalWebDsl.g:1145:1: entryRuleCountAction returns [EObject current=null] : iv_ruleCountAction= ruleCountAction EOF ;
    public final EObject entryRuleCountAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAction = null;


        try {
            // InternalWebDsl.g:1145:52: (iv_ruleCountAction= ruleCountAction EOF )
            // InternalWebDsl.g:1146:2: iv_ruleCountAction= ruleCountAction EOF
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
    // InternalWebDsl.g:1152:1: ruleCountAction returns [EObject current=null] : (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) ) ;
    public final EObject ruleCountAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_htmlElement_1_0 = null;

        EObject lv_typeSelection_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1158:2: ( (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) ) )
            // InternalWebDsl.g:1159:2: (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) )
            {
            // InternalWebDsl.g:1159:2: (otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) )
            // InternalWebDsl.g:1160:3: otherlv_0= 'count' ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCountActionAccess().getCountKeyword_0());
            		
            // InternalWebDsl.g:1164:3: ( (lv_htmlElement_1_0= ruleHtmlElement ) )
            // InternalWebDsl.g:1165:4: (lv_htmlElement_1_0= ruleHtmlElement )
            {
            // InternalWebDsl.g:1165:4: (lv_htmlElement_1_0= ruleHtmlElement )
            // InternalWebDsl.g:1166:5: lv_htmlElement_1_0= ruleHtmlElement
            {

            					newCompositeNode(grammarAccess.getCountActionAccess().getHtmlElementHtmlElementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalWebDsl.g:1183:3: ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            // InternalWebDsl.g:1184:4: (lv_typeSelection_2_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:1184:4: (lv_typeSelection_2_0= ruleTypeSelection )
            // InternalWebDsl.g:1185:5: lv_typeSelection_2_0= ruleTypeSelection
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
    // InternalWebDsl.g:1206:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalWebDsl.g:1206:44: (iv_ruleVar= ruleVar EOF )
            // InternalWebDsl.g:1207:2: iv_ruleVar= ruleVar EOF
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
    // InternalWebDsl.g:1213:1: ruleVar returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1219:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWebDsl.g:1220:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWebDsl.g:1220:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWebDsl.g:1221:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWebDsl.g:1221:3: (lv_name_0_0= RULE_ID )
            // InternalWebDsl.g:1222:4: lv_name_0_0= RULE_ID
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
    // InternalWebDsl.g:1241:1: entryRuleSetAction returns [EObject current=null] : iv_ruleSetAction= ruleSetAction EOF ;
    public final EObject entryRuleSetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAction = null;


        try {
            // InternalWebDsl.g:1241:50: (iv_ruleSetAction= ruleSetAction EOF )
            // InternalWebDsl.g:1242:2: iv_ruleSetAction= ruleSetAction EOF
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
    // InternalWebDsl.g:1248:1: ruleSetAction returns [EObject current=null] : (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Enumerator lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1254:2: ( (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:1255:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:1255:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalWebDsl.g:1256:3: otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSetActionAccess().getSetKeyword_0());
            		
            // InternalWebDsl.g:1260:3: ( (lv_attribute_1_0= ruleAttribute ) )
            // InternalWebDsl.g:1261:4: (lv_attribute_1_0= ruleAttribute )
            {
            // InternalWebDsl.g:1261:4: (lv_attribute_1_0= ruleAttribute )
            // InternalWebDsl.g:1262:5: lv_attribute_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSetActionAccess().getColonKeyword_2());
            		
            // InternalWebDsl.g:1283:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalWebDsl.g:1284:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalWebDsl.g:1284:4: (lv_value_3_0= RULE_STRING )
            // InternalWebDsl.g:1285:5: lv_value_3_0= RULE_STRING
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
    // InternalWebDsl.g:1305:1: entryRuleTypeSelection returns [EObject current=null] : iv_ruleTypeSelection= ruleTypeSelection EOF ;
    public final EObject entryRuleTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelection = null;


        try {
            // InternalWebDsl.g:1305:54: (iv_ruleTypeSelection= ruleTypeSelection EOF )
            // InternalWebDsl.g:1306:2: iv_ruleTypeSelection= ruleTypeSelection EOF
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
    // InternalWebDsl.g:1312:1: ruleTypeSelection returns [EObject current=null] : ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' ) ;
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
            // InternalWebDsl.g:1318:2: ( ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' ) )
            // InternalWebDsl.g:1319:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' )
            {
            // InternalWebDsl.g:1319:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) | otherlv_4= 'PARENT' | otherlv_5= 'FIRST' | otherlv_6= 'LAST' | otherlv_7= 'ALL' )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalWebDsl.g:1320:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
                    {
                    // InternalWebDsl.g:1320:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
                    // InternalWebDsl.g:1321:4: ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalWebDsl.g:1321:4: ( (lv_attribute_0_0= ruleAttribute ) )
                    // InternalWebDsl.g:1322:5: (lv_attribute_0_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1322:5: (lv_attribute_0_0= ruleAttribute )
                    // InternalWebDsl.g:1323:6: lv_attribute_0_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getTypeSelectionAccess().getAttributeAttributeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_1=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1());
                    			
                    // InternalWebDsl.g:1344:4: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_STRING) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalWebDsl.g:1345:5: ( (lv_value_2_0= RULE_STRING ) )
                            {
                            // InternalWebDsl.g:1345:5: ( (lv_value_2_0= RULE_STRING ) )
                            // InternalWebDsl.g:1346:6: (lv_value_2_0= RULE_STRING )
                            {
                            // InternalWebDsl.g:1346:6: (lv_value_2_0= RULE_STRING )
                            // InternalWebDsl.g:1347:7: lv_value_2_0= RULE_STRING
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
                            // InternalWebDsl.g:1364:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalWebDsl.g:1364:5: ( (otherlv_3= RULE_ID ) )
                            // InternalWebDsl.g:1365:6: (otherlv_3= RULE_ID )
                            {
                            // InternalWebDsl.g:1365:6: (otherlv_3= RULE_ID )
                            // InternalWebDsl.g:1366:7: otherlv_3= RULE_ID
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
                    // InternalWebDsl.g:1380:3: otherlv_4= 'PARENT'
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1385:3: otherlv_5= 'FIRST'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1390:3: otherlv_6= 'LAST'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getTypeSelectionAccess().getLASTKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1395:3: otherlv_7= 'ALL'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_2); 

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
    // InternalWebDsl.g:1403:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalWebDsl.g:1403:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalWebDsl.g:1404:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalWebDsl.g:1410:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_assertContain_1_0 = null;

        EObject lv_assertEquals_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1416:2: ( (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) ) )
            // InternalWebDsl.g:1417:2: (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) )
            {
            // InternalWebDsl.g:1417:2: (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) )
            // InternalWebDsl.g:1418:3: otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getVerifyKeyword_0());
            		
            // InternalWebDsl.g:1422:3: ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING||LA17_0==13||LA17_0==45) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalWebDsl.g:1423:4: ( (lv_assertContain_1_0= ruleAssertContains ) )
                    {
                    // InternalWebDsl.g:1423:4: ( (lv_assertContain_1_0= ruleAssertContains ) )
                    // InternalWebDsl.g:1424:5: (lv_assertContain_1_0= ruleAssertContains )
                    {
                    // InternalWebDsl.g:1424:5: (lv_assertContain_1_0= ruleAssertContains )
                    // InternalWebDsl.g:1425:6: lv_assertContain_1_0= ruleAssertContains
                    {

                    						newCompositeNode(grammarAccess.getAssertAccess().getAssertContainAssertContainsParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assertContain_1_0=ruleAssertContains();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertRule());
                    						}
                    						set(
                    							current,
                    							"assertContain",
                    							lv_assertContain_1_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.AssertContains");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1443:4: ( (lv_assertEquals_2_0= ruleAssertEquals ) )
                    {
                    // InternalWebDsl.g:1443:4: ( (lv_assertEquals_2_0= ruleAssertEquals ) )
                    // InternalWebDsl.g:1444:5: (lv_assertEquals_2_0= ruleAssertEquals )
                    {
                    // InternalWebDsl.g:1444:5: (lv_assertEquals_2_0= ruleAssertEquals )
                    // InternalWebDsl.g:1445:6: lv_assertEquals_2_0= ruleAssertEquals
                    {

                    						newCompositeNode(grammarAccess.getAssertAccess().getAssertEqualsAssertEqualsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assertEquals_2_0=ruleAssertEquals();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertRule());
                    						}
                    						set(
                    							current,
                    							"assertEquals",
                    							lv_assertEquals_2_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.AssertEquals");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // InternalWebDsl.g:1467:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalWebDsl.g:1467:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalWebDsl.g:1468:2: iv_ruleAssertContains= ruleAssertContains EOF
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
    // InternalWebDsl.g:1474:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Enumerator lv_htmlElement_1_0 = null;

        Enumerator lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1480:2: ( (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING ) )
            // InternalWebDsl.g:1481:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING )
            {
            // InternalWebDsl.g:1481:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING )
            // InternalWebDsl.g:1482:3: otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING
            {
            otherlv_0=(Token)match(input,42,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getContainsKeyword_0());
            		
            // InternalWebDsl.g:1486:3: ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=19 && LA18_0<=20)||(LA18_0>=24 && LA18_0<=26)||LA18_0==29||LA18_0==51) ) {
                alt18=1;
            }
            else if ( (LA18_0==43) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalWebDsl.g:1487:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    {
                    // InternalWebDsl.g:1487:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    // InternalWebDsl.g:1488:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) )
                    {
                    // InternalWebDsl.g:1488:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1489:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1489:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    // InternalWebDsl.g:1490:7: lv_htmlElement_1_0= ruleHtmlElement
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getHtmlElementHtmlElementEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_22);
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

                    // InternalWebDsl.g:1507:5: ( (lv_attribute_2_0= ruleAttribute ) )
                    // InternalWebDsl.g:1508:6: (lv_attribute_2_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1508:6: (lv_attribute_2_0= ruleAttribute )
                    // InternalWebDsl.g:1509:7: lv_attribute_2_0= ruleAttribute
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getAttributeAttributeEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
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
                    // InternalWebDsl.g:1528:4: otherlv_3= 'TEXT'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssertContainsAccess().getTEXTKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAssertContainsAccess().getColonKeyword_2());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_5, grammarAccess.getAssertContainsAccess().getSTRINGTerminalRuleCall_3());
            		

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
    // InternalWebDsl.g:1545:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalWebDsl.g:1545:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalWebDsl.g:1546:2: iv_ruleAssertEquals= ruleAssertEquals EOF
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
    // InternalWebDsl.g:1552:1: ruleAssertEquals returns [EObject current=null] : ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1558:2: ( ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) )
            // InternalWebDsl.g:1559:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            {
            // InternalWebDsl.g:1559:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            // InternalWebDsl.g:1560:3: ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) )
            {
            // InternalWebDsl.g:1560:3: ( (lv_c1_0_0= ruleComparable ) )
            // InternalWebDsl.g:1561:4: (lv_c1_0_0= ruleComparable )
            {
            // InternalWebDsl.g:1561:4: (lv_c1_0_0= ruleComparable )
            // InternalWebDsl.g:1562:5: lv_c1_0_0= ruleComparable
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_1=(Token)match(input,44,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1());
            		
            // InternalWebDsl.g:1583:3: ( (lv_c2_2_0= ruleComparable ) )
            // InternalWebDsl.g:1584:4: (lv_c2_2_0= ruleComparable )
            {
            // InternalWebDsl.g:1584:4: (lv_c2_2_0= ruleComparable )
            // InternalWebDsl.g:1585:5: lv_c2_2_0= ruleComparable
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
    // InternalWebDsl.g:1606:1: entryRuleComparable returns [EObject current=null] : iv_ruleComparable= ruleComparable EOF ;
    public final EObject entryRuleComparable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparable = null;


        try {
            // InternalWebDsl.g:1606:51: (iv_ruleComparable= ruleComparable EOF )
            // InternalWebDsl.g:1607:2: iv_ruleComparable= ruleComparable EOF
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
    // InternalWebDsl.g:1613:1: ruleComparable returns [EObject current=null] : ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) ;
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
            // InternalWebDsl.g:1619:2: ( ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) )
            // InternalWebDsl.g:1620:2: ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            {
            // InternalWebDsl.g:1620:2: ( (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 13:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalWebDsl.g:1621:3: (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) )
                    {
                    // InternalWebDsl.g:1621:3: (otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) ) )
                    // InternalWebDsl.g:1622:4: otherlv_0= 'VAR:' ( (lv_var_1_0= ruleVar ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparableAccess().getVARKeyword_0_0());
                    			
                    // InternalWebDsl.g:1626:4: ( (lv_var_1_0= ruleVar ) )
                    // InternalWebDsl.g:1627:5: (lv_var_1_0= ruleVar )
                    {
                    // InternalWebDsl.g:1627:5: (lv_var_1_0= ruleVar )
                    // InternalWebDsl.g:1628:6: lv_var_1_0= ruleVar
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
                    // InternalWebDsl.g:1647:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    {
                    // InternalWebDsl.g:1647:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    // InternalWebDsl.g:1648:4: otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalWebDsl.g:1652:4: ( (lv_htmlElement_3_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1653:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1653:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    // InternalWebDsl.g:1654:6: lv_htmlElement_3_0= ruleHtmlElement
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getHtmlElementHtmlElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalWebDsl.g:1671:4: ( (lv_attribute_4_0= ruleAttribute ) )
                    // InternalWebDsl.g:1672:5: (lv_attribute_4_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1672:5: (lv_attribute_4_0= ruleAttribute )
                    // InternalWebDsl.g:1673:6: lv_attribute_4_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getAttributeAttributeEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1696:3: this_STRING_6= RULE_STRING
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
    // InternalWebDsl.g:1704:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1710:2: ( ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) )
            // InternalWebDsl.g:1711:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            {
            // InternalWebDsl.g:1711:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt20=1;
                }
                break;
            case 47:
                {
                alt20=2;
                }
                break;
            case 48:
                {
                alt20=3;
                }
                break;
            case 49:
                {
                alt20=4;
                }
                break;
            case 50:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalWebDsl.g:1712:3: (enumLiteral_0= 'chrome' )
                    {
                    // InternalWebDsl.g:1712:3: (enumLiteral_0= 'chrome' )
                    // InternalWebDsl.g:1713:4: enumLiteral_0= 'chrome'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1720:3: (enumLiteral_1= 'firefox' )
                    {
                    // InternalWebDsl.g:1720:3: (enumLiteral_1= 'firefox' )
                    // InternalWebDsl.g:1721:4: enumLiteral_1= 'firefox'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1728:3: (enumLiteral_2= 'safari' )
                    {
                    // InternalWebDsl.g:1728:3: (enumLiteral_2= 'safari' )
                    // InternalWebDsl.g:1729:4: enumLiteral_2= 'safari'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1736:3: (enumLiteral_3= 'edge' )
                    {
                    // InternalWebDsl.g:1736:3: (enumLiteral_3= 'edge' )
                    // InternalWebDsl.g:1737:4: enumLiteral_3= 'edge'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1744:3: (enumLiteral_4= 'ie' )
                    {
                    // InternalWebDsl.g:1744:3: (enumLiteral_4= 'ie' )
                    // InternalWebDsl.g:1745:4: enumLiteral_4= 'ie'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

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
    // InternalWebDsl.g:1755:1: ruleHtmlElement returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) ;
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
            // InternalWebDsl.g:1761:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) )
            // InternalWebDsl.g:1762:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            {
            // InternalWebDsl.g:1762:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            int alt21=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt21=1;
                }
                break;
            case 20:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            case 29:
                {
                alt21=4;
                }
                break;
            case 24:
                {
                alt21=5;
                }
                break;
            case 51:
                {
                alt21=6;
                }
                break;
            case 25:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalWebDsl.g:1763:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalWebDsl.g:1763:3: (enumLiteral_0= 'LINK' )
                    // InternalWebDsl.g:1764:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1771:3: (enumLiteral_1= 'BUTTON' )
                    {
                    // InternalWebDsl.g:1771:3: (enumLiteral_1= 'BUTTON' )
                    // InternalWebDsl.g:1772:4: enumLiteral_1= 'BUTTON'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1779:3: (enumLiteral_2= 'CHECKBOX' )
                    {
                    // InternalWebDsl.g:1779:3: (enumLiteral_2= 'CHECKBOX' )
                    // InternalWebDsl.g:1780:4: enumLiteral_2= 'CHECKBOX'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1787:3: (enumLiteral_3= 'COMBO_BOX' )
                    {
                    // InternalWebDsl.g:1787:3: (enumLiteral_3= 'COMBO_BOX' )
                    // InternalWebDsl.g:1788:4: enumLiteral_3= 'COMBO_BOX'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1795:3: (enumLiteral_4= 'DIV' )
                    {
                    // InternalWebDsl.g:1795:3: (enumLiteral_4= 'DIV' )
                    // InternalWebDsl.g:1796:4: enumLiteral_4= 'DIV'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1803:3: (enumLiteral_5= 'IMAGE' )
                    {
                    // InternalWebDsl.g:1803:3: (enumLiteral_5= 'IMAGE' )
                    // InternalWebDsl.g:1804:4: enumLiteral_5= 'IMAGE'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1811:3: (enumLiteral_6= 'A' )
                    {
                    // InternalWebDsl.g:1811:3: (enumLiteral_6= 'A' )
                    // InternalWebDsl.g:1812:4: enumLiteral_6= 'A'
                    {
                    enumLiteral_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalWebDsl.g:1822:1: ruleAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) ) ;
    public final Enumerator ruleAttribute() throws RecognitionException {
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
            // InternalWebDsl.g:1828:2: ( ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) ) )
            // InternalWebDsl.g:1829:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) )
            {
            // InternalWebDsl.g:1829:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt22=1;
                }
                break;
            case 53:
                {
                alt22=2;
                }
                break;
            case 54:
                {
                alt22=3;
                }
                break;
            case 55:
                {
                alt22=4;
                }
                break;
            case 56:
                {
                alt22=5;
                }
                break;
            case 57:
                {
                alt22=6;
                }
                break;
            case 58:
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
                    // InternalWebDsl.g:1830:3: (enumLiteral_0= 'LABEL' )
                    {
                    // InternalWebDsl.g:1830:3: (enumLiteral_0= 'LABEL' )
                    // InternalWebDsl.g:1831:4: enumLiteral_0= 'LABEL'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1838:3: (enumLiteral_1= 'ID' )
                    {
                    // InternalWebDsl.g:1838:3: (enumLiteral_1= 'ID' )
                    // InternalWebDsl.g:1839:4: enumLiteral_1= 'ID'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1846:3: (enumLiteral_2= 'CLASS' )
                    {
                    // InternalWebDsl.g:1846:3: (enumLiteral_2= 'CLASS' )
                    // InternalWebDsl.g:1847:4: enumLiteral_2= 'CLASS'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1854:3: (enumLiteral_3= 'ALT' )
                    {
                    // InternalWebDsl.g:1854:3: (enumLiteral_3= 'ALT' )
                    // InternalWebDsl.g:1855:4: enumLiteral_3= 'ALT'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1862:3: (enumLiteral_4= 'VALUE' )
                    {
                    // InternalWebDsl.g:1862:3: (enumLiteral_4= 'VALUE' )
                    // InternalWebDsl.g:1863:4: enumLiteral_4= 'VALUE'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1870:3: (enumLiteral_5= 'HREF' )
                    {
                    // InternalWebDsl.g:1870:3: (enumLiteral_5= 'HREF' )
                    // InternalWebDsl.g:1871:4: enumLiteral_5= 'HREF'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1878:3: (enumLiteral_6= 'TITLE' )
                    {
                    // InternalWebDsl.g:1878:3: (enumLiteral_6= 'TITLE' )
                    // InternalWebDsl.g:1879:4: enumLiteral_6= 'TITLE'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A79D0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000A79D8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x07F001E000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000009A7D88000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000009A7988000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000009BF988000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000009E7988000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020100008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x07F0000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000027180000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x07F0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000240000002020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008080027180000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});

}