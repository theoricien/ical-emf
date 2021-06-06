package xCalendar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xCalendar.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STR", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enregistrer sous: '", "' a '", "'h'", "':'", "' heure '", "'m'", "'mn'", "'min'", "' minutes'", "' et '", "'s'", "'sec'", "' secondes '", "'PUBLIC'", "'PRIVATE'", "'CONFIDENTIAL'", "'Tentative'", "'Confirm\\uFFFD'", "'Annul\\uFFFD'", "'Compl\\uFFFDt\\uFFFD'", "'En cours'", "'Lundi'", "'Mardi'", "'Mercredi'", "'Jeudi'", "'Vendredi'", "'Samedi'", "'Dimanche'", "'Calendar'", "'{'", "'Version:'", "'ProdId:'", "'Methode:'", "'Calscale:'", "'}'", "'EventC'", "'Date:'", "'Identifiant:'", "'Organisateur:'", "'Objet:'", "'URL:'", "'Attachements:'", "','", "'Invites:'", "'Categories:'", "'Commentaire:'", "'Contact:'", "'Status:'", "'Relier a:'", "'Resources:'", "'Description:'", "'Priorite:'", "'Lieu:'", "'Fin:'", "'Classe:'", "'Alarmes:'", "'AlarmC'", "'Action:'", "'Trigger:'", "'Type:'", "'Temps:'", "'tzprop'", "'Tzoffseto:'", "'Tzoffsetfrom:'", "'Rrule:'", "'Opt'", "'tzpropOptional'", "'Rdate:'", "'Tzname:'", "'X_prop:'", "'Iana_prop:'", "'ComponentAlarmTime'", "'Duree:'", "'Repeter:'", "'ComponentAlarmAudioProperty'", "'ComponentAlarmDispProperty'", "'ComponentAlarmEmailProperty'", "'Invites'", "'Attachements'", "'ToDoC'", "'Dtstamp:'", "'Due:'", "'Cree le:'", "'Last_mod:'", "'Seq:'", "'Recurid:'", "'Rrule'", "'Categories'", "'Commentaire'", "'Contact'", "'Exdate'", "'Rstatus'", "'Relier a'", "'Resources'", "'Rdate'", "'X_prop'", "'Iana_prop'", "'Completee:'", "'Geo:'", "'JournalC'", "'VacationC'", "'Freebusy'", "'TimeZoneC'", "'Tzid:'", "'Tzurl:'", "'Standardc'", "'Daylightc'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_STR=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "iCalFormat";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleiCalFormat"
    // InternalMyDsl.g:64:1: entryRuleiCalFormat returns [EObject current=null] : iv_ruleiCalFormat= ruleiCalFormat EOF ;
    public final EObject entryRuleiCalFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiCalFormat = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleiCalFormat= ruleiCalFormat EOF )
            // InternalMyDsl.g:65:2: iv_ruleiCalFormat= ruleiCalFormat EOF
            {
             newCompositeNode(grammarAccess.getICalFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleiCalFormat=ruleiCalFormat();

            state._fsp--;

             current =iv_ruleiCalFormat; 
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
    // $ANTLR end "entryRuleiCalFormat"


    // $ANTLR start "ruleiCalFormat"
    // InternalMyDsl.g:71:1: ruleiCalFormat returns [EObject current=null] : (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) ( (lv_calendar_2_0= ruleCalendar ) ) ) ;
    public final EObject ruleiCalFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        EObject lv_calendar_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) ( (lv_calendar_2_0= ruleCalendar ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) ( (lv_calendar_2_0= ruleCalendar ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) ( (lv_calendar_2_0= ruleCalendar ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) ( (lv_calendar_2_0= ruleCalendar ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getICalFormatAccess().getEnregistrerSousKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_fileName_1_0= RULE_STR ) )
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STR )
            {
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STR )
            // InternalMyDsl.g:85:5: lv_fileName_1_0= RULE_STR
            {
            lv_fileName_1_0=(Token)match(input,RULE_STR,FOLLOW_4); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getICalFormatAccess().getFileNameSTRTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getICalFormatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_calendar_2_0= ruleCalendar ) )
            // InternalMyDsl.g:102:4: (lv_calendar_2_0= ruleCalendar )
            {
            // InternalMyDsl.g:102:4: (lv_calendar_2_0= ruleCalendar )
            // InternalMyDsl.g:103:5: lv_calendar_2_0= ruleCalendar
            {

            					newCompositeNode(grammarAccess.getICalFormatAccess().getCalendarCalendarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_calendar_2_0=ruleCalendar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getICalFormatRule());
            					}
            					set(
            						current,
            						"calendar",
            						lv_calendar_2_0,
            						"xCalendar.MyDsl.Calendar");
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
    // $ANTLR end "ruleiCalFormat"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:124:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMyDsl.g:124:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMyDsl.g:125:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMyDsl.g:131:1: ruleComponent returns [EObject current=null] : (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_EventC_0 = null;

        EObject this_ToDoC_1 = null;

        EObject this_JournalC_2 = null;

        EObject this_VacationC_3 = null;

        EObject this_TimeZoneC_4 = null;

        EObject this_AlarmC_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:137:2: ( (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC ) )
            // InternalMyDsl.g:138:2: (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC )
            {
            // InternalMyDsl.g:138:2: (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt1=1;
                }
                break;
            case 91:
                {
                alt1=2;
                }
                break;
            case 111:
                {
                alt1=3;
                }
                break;
            case 112:
                {
                alt1=4;
                }
                break;
            case 114:
                {
                alt1=5;
                }
                break;
            case 68:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:139:3: this_EventC_0= ruleEventC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getEventCParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventC_0=ruleEventC();

                    state._fsp--;


                    			current = this_EventC_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:148:3: this_ToDoC_1= ruleToDoC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getToDoCParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToDoC_1=ruleToDoC();

                    state._fsp--;


                    			current = this_ToDoC_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:157:3: this_JournalC_2= ruleJournalC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getJournalCParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JournalC_2=ruleJournalC();

                    state._fsp--;


                    			current = this_JournalC_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:166:3: this_VacationC_3= ruleVacationC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getVacationCParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VacationC_3=ruleVacationC();

                    state._fsp--;


                    			current = this_VacationC_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:175:3: this_TimeZoneC_4= ruleTimeZoneC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getTimeZoneCParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeZoneC_4=ruleTimeZoneC();

                    state._fsp--;


                    			current = this_TimeZoneC_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:184:3: this_AlarmC_5= ruleAlarmC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getAlarmCParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlarmC_5=ruleAlarmC();

                    state._fsp--;


                    			current = this_AlarmC_5;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAlarmType"
    // InternalMyDsl.g:196:1: entryRuleAlarmType returns [EObject current=null] : iv_ruleAlarmType= ruleAlarmType EOF ;
    public final EObject entryRuleAlarmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmType = null;


        try {
            // InternalMyDsl.g:196:50: (iv_ruleAlarmType= ruleAlarmType EOF )
            // InternalMyDsl.g:197:2: iv_ruleAlarmType= ruleAlarmType EOF
            {
             newCompositeNode(grammarAccess.getAlarmTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmType=ruleAlarmType();

            state._fsp--;

             current =iv_ruleAlarmType; 
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
    // $ANTLR end "entryRuleAlarmType"


    // $ANTLR start "ruleAlarmType"
    // InternalMyDsl.g:203:1: ruleAlarmType returns [EObject current=null] : (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty ) ;
    public final EObject ruleAlarmType() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentAlarmAudioProperty_0 = null;

        EObject this_ComponentAlarmDispProperty_1 = null;

        EObject this_ComponentAlarmEmailProperty_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:209:2: ( (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty ) )
            // InternalMyDsl.g:210:2: (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty )
            {
            // InternalMyDsl.g:210:2: (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt2=1;
                }
                break;
            case 87:
                {
                alt2=2;
                }
                break;
            case 88:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:211:3: this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmAudioPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmAudioProperty_0=ruleComponentAlarmAudioProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmAudioProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:220:3: this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmDispPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmDispProperty_1=ruleComponentAlarmDispProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmDispProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:229:3: this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmEmailPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmEmailProperty_2=ruleComponentAlarmEmailProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmEmailProperty_2;
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
    // $ANTLR end "ruleAlarmType"


    // $ANTLR start "entryRuleDateT"
    // InternalMyDsl.g:241:1: entryRuleDateT returns [EObject current=null] : iv_ruleDateT= ruleDateT EOF ;
    public final EObject entryRuleDateT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateT = null;


        try {
            // InternalMyDsl.g:241:46: (iv_ruleDateT= ruleDateT EOF )
            // InternalMyDsl.g:242:2: iv_ruleDateT= ruleDateT EOF
            {
             newCompositeNode(grammarAccess.getDateTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateT=ruleDateT();

            state._fsp--;

             current =iv_ruleDateT; 
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
    // $ANTLR end "entryRuleDateT"


    // $ANTLR start "ruleDateT"
    // InternalMyDsl.g:248:1: ruleDateT returns [EObject current=null] : ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) )? ( (lv_month_name_3_0= RULE_STR ) )? ( (lv_year_4_0= RULE_INT ) )? ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )? ) ;
    public final EObject ruleDateT() throws RecognitionException {
        EObject current = null;

        Token lv_day_1_0=null;
        Token lv_month_2_0=null;
        Token lv_month_name_3_0=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token lv_hours_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_minutes_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_seconds_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_day_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) )? ( (lv_month_name_3_0= RULE_STR ) )? ( (lv_year_4_0= RULE_INT ) )? ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )? ) )
            // InternalMyDsl.g:255:2: ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) )? ( (lv_month_name_3_0= RULE_STR ) )? ( (lv_year_4_0= RULE_INT ) )? ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )? )
            {
            // InternalMyDsl.g:255:2: ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) )? ( (lv_month_name_3_0= RULE_STR ) )? ( (lv_year_4_0= RULE_INT ) )? ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )? )
            // InternalMyDsl.g:256:3: ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) )? ( (lv_month_name_3_0= RULE_STR ) )? ( (lv_year_4_0= RULE_INT ) )? ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )?
            {
            // InternalMyDsl.g:256:3: ( (lv_day_name_0_0= ruleDayName ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=33 && LA3_0<=39)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:257:4: (lv_day_name_0_0= ruleDayName )
                    {
                    // InternalMyDsl.g:257:4: (lv_day_name_0_0= ruleDayName )
                    // InternalMyDsl.g:258:5: lv_day_name_0_0= ruleDayName
                    {

                    					newCompositeNode(grammarAccess.getDateTAccess().getDay_nameDayNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_day_name_0_0=ruleDayName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateTRule());
                    					}
                    					set(
                    						current,
                    						"day_name",
                    						lv_day_name_0_0,
                    						"xCalendar.MyDsl.DayName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:275:3: ( (lv_day_1_0= RULE_INT ) )
            // InternalMyDsl.g:276:4: (lv_day_1_0= RULE_INT )
            {
            // InternalMyDsl.g:276:4: (lv_day_1_0= RULE_INT )
            // InternalMyDsl.g:277:5: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_day_1_0, grammarAccess.getDateTAccess().getDayINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"day",
            						lv_day_1_0,
            						"xCalendar.MyDsl.INT");
            				

            }


            }

            // InternalMyDsl.g:293:3: ( (lv_month_2_0= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:294:4: (lv_month_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:294:4: (lv_month_2_0= RULE_INT )
                    // InternalMyDsl.g:295:5: lv_month_2_0= RULE_INT
                    {
                    lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    					newLeafNode(lv_month_2_0, grammarAccess.getDateTAccess().getMonthINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDateTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"month",
                    						lv_month_2_0,
                    						"xCalendar.MyDsl.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:311:3: ( (lv_month_name_3_0= RULE_STR ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:312:4: (lv_month_name_3_0= RULE_STR )
                    {
                    // InternalMyDsl.g:312:4: (lv_month_name_3_0= RULE_STR )
                    // InternalMyDsl.g:313:5: lv_month_name_3_0= RULE_STR
                    {
                    lv_month_name_3_0=(Token)match(input,RULE_STR,FOLLOW_7); 

                    					newLeafNode(lv_month_name_3_0, grammarAccess.getDateTAccess().getMonth_nameSTRTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDateTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"month_name",
                    						lv_month_name_3_0,
                    						"xCalendar.MyDsl.STR");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:329:3: ( (lv_year_4_0= RULE_INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_INT||LA6_1==13||LA6_1==46||(LA6_1>=48 && LA6_1<=53)||(LA6_1>=55 && LA6_1<=67)||(LA6_1>=89 && LA6_1<=90)||(LA6_1>=92 && LA6_1<=110)||LA6_1==113) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:330:4: (lv_year_4_0= RULE_INT )
                    {
                    // InternalMyDsl.g:330:4: (lv_year_4_0= RULE_INT )
                    // InternalMyDsl.g:331:5: lv_year_4_0= RULE_INT
                    {
                    lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    					newLeafNode(lv_year_4_0, grammarAccess.getDateTAccess().getYearINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDateTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"year",
                    						lv_year_4_0,
                    						"xCalendar.MyDsl.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:347:3: ( (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:348:4: (otherlv_5= ' a ' )? ( (lv_hours_6_0= RULE_INT ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' ) ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )?
                    {
                    // InternalMyDsl.g:348:4: (otherlv_5= ' a ' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==13) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:349:5: otherlv_5= ' a '
                            {
                            otherlv_5=(Token)match(input,13,FOLLOW_5); 

                            					newLeafNode(otherlv_5, grammarAccess.getDateTAccess().getAKeyword_5_0());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:354:4: ( (lv_hours_6_0= RULE_INT ) )
                    // InternalMyDsl.g:355:5: (lv_hours_6_0= RULE_INT )
                    {
                    // InternalMyDsl.g:355:5: (lv_hours_6_0= RULE_INT )
                    // InternalMyDsl.g:356:6: lv_hours_6_0= RULE_INT
                    {
                    lv_hours_6_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_hours_6_0, grammarAccess.getDateTAccess().getHoursINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDateTRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hours",
                    							lv_hours_6_0,
                    							"xCalendar.MyDsl.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:372:4: (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= ' heure ' )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt8=1;
                        }
                        break;
                    case 15:
                        {
                        alt8=2;
                        }
                        break;
                    case 16:
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
                            // InternalMyDsl.g:373:5: otherlv_7= 'h'
                            {
                            otherlv_7=(Token)match(input,14,FOLLOW_9); 

                            					newLeafNode(otherlv_7, grammarAccess.getDateTAccess().getHKeyword_5_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:378:5: otherlv_8= ':'
                            {
                            otherlv_8=(Token)match(input,15,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getDateTAccess().getColonKeyword_5_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:383:5: otherlv_9= ' heure '
                            {
                            otherlv_9=(Token)match(input,16,FOLLOW_9); 

                            					newLeafNode(otherlv_9, grammarAccess.getDateTAccess().getHeureKeyword_5_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:388:4: ( ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:389:5: ( (lv_minutes_10_0= RULE_INT ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )?
                            {
                            // InternalMyDsl.g:389:5: ( (lv_minutes_10_0= RULE_INT ) )
                            // InternalMyDsl.g:390:6: (lv_minutes_10_0= RULE_INT )
                            {
                            // InternalMyDsl.g:390:6: (lv_minutes_10_0= RULE_INT )
                            // InternalMyDsl.g:391:7: lv_minutes_10_0= RULE_INT
                            {
                            lv_minutes_10_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                            							newLeafNode(lv_minutes_10_0, grammarAccess.getDateTAccess().getMinutesINTTerminalRuleCall_5_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDateTRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"minutes",
                            								lv_minutes_10_0,
                            								"xCalendar.MyDsl.INT");
                            						

                            }


                            }

                            // InternalMyDsl.g:407:5: (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= ' minutes' | otherlv_15= ':' )?
                            int alt9=6;
                            switch ( input.LA(1) ) {
                                case 17:
                                    {
                                    alt9=1;
                                    }
                                    break;
                                case 18:
                                    {
                                    alt9=2;
                                    }
                                    break;
                                case 19:
                                    {
                                    alt9=3;
                                    }
                                    break;
                                case 20:
                                    {
                                    alt9=4;
                                    }
                                    break;
                                case 15:
                                    {
                                    alt9=5;
                                    }
                                    break;
                            }

                            switch (alt9) {
                                case 1 :
                                    // InternalMyDsl.g:408:6: otherlv_11= 'm'
                                    {
                                    otherlv_11=(Token)match(input,17,FOLLOW_9); 

                                    						newLeafNode(otherlv_11, grammarAccess.getDateTAccess().getMKeyword_5_3_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:413:6: otherlv_12= 'mn'
                                    {
                                    otherlv_12=(Token)match(input,18,FOLLOW_9); 

                                    						newLeafNode(otherlv_12, grammarAccess.getDateTAccess().getMnKeyword_5_3_1_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:418:6: otherlv_13= 'min'
                                    {
                                    otherlv_13=(Token)match(input,19,FOLLOW_9); 

                                    						newLeafNode(otherlv_13, grammarAccess.getDateTAccess().getMinKeyword_5_3_1_2());
                                    					

                                    }
                                    break;
                                case 4 :
                                    // InternalMyDsl.g:423:6: otherlv_14= ' minutes'
                                    {
                                    otherlv_14=(Token)match(input,20,FOLLOW_9); 

                                    						newLeafNode(otherlv_14, grammarAccess.getDateTAccess().getMinutesKeyword_5_3_1_3());
                                    					

                                    }
                                    break;
                                case 5 :
                                    // InternalMyDsl.g:428:6: otherlv_15= ':'
                                    {
                                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                                    						newLeafNode(otherlv_15, grammarAccess.getDateTAccess().getColonKeyword_5_3_1_4());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:434:4: ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT||LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:435:5: (otherlv_16= ' et ' )? ( (lv_seconds_17_0= RULE_INT ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )?
                            {
                            // InternalMyDsl.g:435:5: (otherlv_16= ' et ' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==21) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalMyDsl.g:436:6: otherlv_16= ' et '
                                    {
                                    otherlv_16=(Token)match(input,21,FOLLOW_5); 

                                    						newLeafNode(otherlv_16, grammarAccess.getDateTAccess().getEtKeyword_5_4_0());
                                    					

                                    }
                                    break;

                            }

                            // InternalMyDsl.g:441:5: ( (lv_seconds_17_0= RULE_INT ) )
                            // InternalMyDsl.g:442:6: (lv_seconds_17_0= RULE_INT )
                            {
                            // InternalMyDsl.g:442:6: (lv_seconds_17_0= RULE_INT )
                            // InternalMyDsl.g:443:7: lv_seconds_17_0= RULE_INT
                            {
                            lv_seconds_17_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            							newLeafNode(lv_seconds_17_0, grammarAccess.getDateTAccess().getSecondsINTTerminalRuleCall_5_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDateTRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"seconds",
                            								lv_seconds_17_0,
                            								"xCalendar.MyDsl.INT");
                            						

                            }


                            }

                            // InternalMyDsl.g:459:5: (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= ' secondes ' )?
                            int alt12=4;
                            switch ( input.LA(1) ) {
                                case 22:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case 23:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                case 24:
                                    {
                                    alt12=3;
                                    }
                                    break;
                            }

                            switch (alt12) {
                                case 1 :
                                    // InternalMyDsl.g:460:6: otherlv_18= 's'
                                    {
                                    otherlv_18=(Token)match(input,22,FOLLOW_2); 

                                    						newLeafNode(otherlv_18, grammarAccess.getDateTAccess().getSKeyword_5_4_2_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:465:6: otherlv_19= 'sec'
                                    {
                                    otherlv_19=(Token)match(input,23,FOLLOW_2); 

                                    						newLeafNode(otherlv_19, grammarAccess.getDateTAccess().getSecKeyword_5_4_2_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:470:6: otherlv_20= ' secondes '
                                    {
                                    otherlv_20=(Token)match(input,24,FOLLOW_2); 

                                    						newLeafNode(otherlv_20, grammarAccess.getDateTAccess().getSecondesKeyword_5_4_2_2());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "ruleDateT"


    // $ANTLR start "entryRuleClassification"
    // InternalMyDsl.g:481:1: entryRuleClassification returns [String current=null] : iv_ruleClassification= ruleClassification EOF ;
    public final String entryRuleClassification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassification = null;


        try {
            // InternalMyDsl.g:481:54: (iv_ruleClassification= ruleClassification EOF )
            // InternalMyDsl.g:482:2: iv_ruleClassification= ruleClassification EOF
            {
             newCompositeNode(grammarAccess.getClassificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassification=ruleClassification();

            state._fsp--;

             current =iv_ruleClassification.getText(); 
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
    // $ANTLR end "entryRuleClassification"


    // $ANTLR start "ruleClassification"
    // InternalMyDsl.g:488:1: ruleClassification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' ) ;
    public final AntlrDatatypeRuleToken ruleClassification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:494:2: ( (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' ) )
            // InternalMyDsl.g:495:2: (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' )
            {
            // InternalMyDsl.g:495:2: (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:496:3: kw= 'PUBLIC'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationAccess().getPUBLICKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:502:3: kw= 'PRIVATE'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationAccess().getPRIVATEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:508:3: kw= 'CONFIDENTIAL'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationAccess().getCONFIDENTIALKeyword_2());
                    		

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
    // $ANTLR end "ruleClassification"


    // $ANTLR start "entryRuleStatus"
    // InternalMyDsl.g:517:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // InternalMyDsl.g:517:46: (iv_ruleStatus= ruleStatus EOF )
            // InternalMyDsl.g:518:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus.getText(); 
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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMyDsl.g:524:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' ) ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:530:2: ( (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' ) )
            // InternalMyDsl.g:531:2: (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' )
            {
            // InternalMyDsl.g:531:2: (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:532:3: kw= 'Tentative'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getTentativeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:538:3: kw= 'Confirm\\uFFFD'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getConfirmKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:544:3: kw= 'Annul\\uFFFD'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getAnnulKeyword_2());
                    		

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleEventStatus"
    // InternalMyDsl.g:553:1: entryRuleEventStatus returns [String current=null] : iv_ruleEventStatus= ruleEventStatus EOF ;
    public final String entryRuleEventStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventStatus = null;


        try {
            // InternalMyDsl.g:553:51: (iv_ruleEventStatus= ruleEventStatus EOF )
            // InternalMyDsl.g:554:2: iv_ruleEventStatus= ruleEventStatus EOF
            {
             newCompositeNode(grammarAccess.getEventStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventStatus=ruleEventStatus();

            state._fsp--;

             current =iv_ruleEventStatus.getText(); 
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
    // $ANTLR end "entryRuleEventStatus"


    // $ANTLR start "ruleEventStatus"
    // InternalMyDsl.g:560:1: ruleEventStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' ) ;
    public final AntlrDatatypeRuleToken ruleEventStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Status_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:566:2: ( (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' ) )
            // InternalMyDsl.g:567:2: (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' )
            {
            // InternalMyDsl.g:567:2: (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:568:3: this_Status_0= ruleStatus
                    {

                    			newCompositeNode(grammarAccess.getEventStatusAccess().getStatusParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Status_0=ruleStatus();

                    state._fsp--;


                    			current.merge(this_Status_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:579:3: kw= 'Compl\\uFFFDt\\uFFFD'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEventStatusAccess().getComplTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:585:3: kw= 'En cours'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEventStatusAccess().getEnCoursKeyword_2());
                    		

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
    // $ANTLR end "ruleEventStatus"


    // $ANTLR start "entryRuleDayName"
    // InternalMyDsl.g:594:1: entryRuleDayName returns [String current=null] : iv_ruleDayName= ruleDayName EOF ;
    public final String entryRuleDayName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayName = null;


        try {
            // InternalMyDsl.g:594:47: (iv_ruleDayName= ruleDayName EOF )
            // InternalMyDsl.g:595:2: iv_ruleDayName= ruleDayName EOF
            {
             newCompositeNode(grammarAccess.getDayNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDayName=ruleDayName();

            state._fsp--;

             current =iv_ruleDayName.getText(); 
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
    // $ANTLR end "entryRuleDayName"


    // $ANTLR start "ruleDayName"
    // InternalMyDsl.g:601:1: ruleDayName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' ) ;
    public final AntlrDatatypeRuleToken ruleDayName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:607:2: ( (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' ) )
            // InternalMyDsl.g:608:2: (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' )
            {
            // InternalMyDsl.g:608:2: (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 36:
                {
                alt18=4;
                }
                break;
            case 37:
                {
                alt18=5;
                }
                break;
            case 38:
                {
                alt18=6;
                }
                break;
            case 39:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:609:3: kw= 'Lundi'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getLundiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:615:3: kw= 'Mardi'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getMardiKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:621:3: kw= 'Mercredi'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getMercrediKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:627:3: kw= 'Jeudi'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getJeudiKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:633:3: kw= 'Vendredi'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getVendrediKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:639:3: kw= 'Samedi'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getSamediKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:645:3: kw= 'Dimanche'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getDimancheKeyword_6());
                    		

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
    // $ANTLR end "ruleDayName"


    // $ANTLR start "entryRuleCalendar"
    // InternalMyDsl.g:654:1: entryRuleCalendar returns [EObject current=null] : iv_ruleCalendar= ruleCalendar EOF ;
    public final EObject entryRuleCalendar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendar = null;


        try {
            // InternalMyDsl.g:654:49: (iv_ruleCalendar= ruleCalendar EOF )
            // InternalMyDsl.g:655:2: iv_ruleCalendar= ruleCalendar EOF
            {
             newCompositeNode(grammarAccess.getCalendarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalendar=ruleCalendar();

            state._fsp--;

             current =iv_ruleCalendar; 
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
    // $ANTLR end "entryRuleCalendar"


    // $ANTLR start "ruleCalendar"
    // InternalMyDsl.g:661:1: ruleCalendar returns [EObject current=null] : (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' ) ;
    public final EObject ruleCalendar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;
        Token lv_prodid_5_0=null;
        Token otherlv_6=null;
        Token lv_method_7_0=null;
        Token otherlv_8=null;
        Token lv_calscale_9_0=null;
        Token otherlv_11=null;
        EObject lv_component_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:667:2: ( (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' ) )
            // InternalMyDsl.g:668:2: (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' )
            {
            // InternalMyDsl.g:668:2: (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' )
            // InternalMyDsl.g:669:3: otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCalendarAccess().getCalendarKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCalendarAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:677:3: (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:678:4: otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalendarAccess().getVersionKeyword_2_0());
                    			
                    // InternalMyDsl.g:682:4: ( (lv_version_3_0= RULE_STR ) )
                    // InternalMyDsl.g:683:5: (lv_version_3_0= RULE_STR )
                    {
                    // InternalMyDsl.g:683:5: (lv_version_3_0= RULE_STR )
                    // InternalMyDsl.g:684:6: lv_version_3_0= RULE_STR
                    {
                    lv_version_3_0=(Token)match(input,RULE_STR,FOLLOW_13); 

                    						newLeafNode(lv_version_3_0, grammarAccess.getCalendarAccess().getVersionSTRTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalendarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_3_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:701:3: (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:702:4: otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalendarAccess().getProdIdKeyword_3_0());
                    			
                    // InternalMyDsl.g:706:4: ( (lv_prodid_5_0= RULE_STR ) )
                    // InternalMyDsl.g:707:5: (lv_prodid_5_0= RULE_STR )
                    {
                    // InternalMyDsl.g:707:5: (lv_prodid_5_0= RULE_STR )
                    // InternalMyDsl.g:708:6: lv_prodid_5_0= RULE_STR
                    {
                    lv_prodid_5_0=(Token)match(input,RULE_STR,FOLLOW_13); 

                    						newLeafNode(lv_prodid_5_0, grammarAccess.getCalendarAccess().getProdidSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalendarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prodid",
                    							lv_prodid_5_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:725:3: (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:726:4: otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalendarAccess().getMethodeKeyword_4_0());
                    			
                    // InternalMyDsl.g:730:4: ( (lv_method_7_0= RULE_STR ) )
                    // InternalMyDsl.g:731:5: (lv_method_7_0= RULE_STR )
                    {
                    // InternalMyDsl.g:731:5: (lv_method_7_0= RULE_STR )
                    // InternalMyDsl.g:732:6: lv_method_7_0= RULE_STR
                    {
                    lv_method_7_0=(Token)match(input,RULE_STR,FOLLOW_13); 

                    						newLeafNode(lv_method_7_0, grammarAccess.getCalendarAccess().getMethodSTRTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalendarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_7_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:749:3: (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:750:4: otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCalendarAccess().getCalscaleKeyword_5_0());
                    			
                    // InternalMyDsl.g:754:4: ( (lv_calscale_9_0= RULE_STR ) )
                    // InternalMyDsl.g:755:5: (lv_calscale_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:755:5: (lv_calscale_9_0= RULE_STR )
                    // InternalMyDsl.g:756:6: lv_calscale_9_0= RULE_STR
                    {
                    lv_calscale_9_0=(Token)match(input,RULE_STR,FOLLOW_13); 

                    						newLeafNode(lv_calscale_9_0, grammarAccess.getCalendarAccess().getCalscaleSTRTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalendarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"calscale",
                    							lv_calscale_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:773:3: ( (lv_component_10_0= ruleComponent ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47||LA23_0==68||LA23_0==91||(LA23_0>=111 && LA23_0<=112)||LA23_0==114) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:774:4: (lv_component_10_0= ruleComponent )
            	    {
            	    // InternalMyDsl.g:774:4: (lv_component_10_0= ruleComponent )
            	    // InternalMyDsl.g:775:5: lv_component_10_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getCalendarAccess().getComponentComponentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_component_10_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCalendarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"component",
            	    						lv_component_10_0,
            	    						"xCalendar.MyDsl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_11=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCalendarAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCalendar"


    // $ANTLR start "entryRuleEventC"
    // InternalMyDsl.g:800:1: entryRuleEventC returns [EObject current=null] : iv_ruleEventC= ruleEventC EOF ;
    public final EObject entryRuleEventC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventC = null;


        try {
            // InternalMyDsl.g:800:47: (iv_ruleEventC= ruleEventC EOF )
            // InternalMyDsl.g:801:2: iv_ruleEventC= ruleEventC EOF
            {
             newCompositeNode(grammarAccess.getEventCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventC=ruleEventC();

            state._fsp--;

             current =iv_ruleEventC; 
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
    // $ANTLR end "entryRuleEventC"


    // $ANTLR start "ruleEventC"
    // InternalMyDsl.g:807:1: ruleEventC returns [EObject current=null] : (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' ) ;
    public final EObject ruleEventC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_uid_6_0=null;
        Token otherlv_7=null;
        Token lv_organizer_8_0=null;
        Token otherlv_9=null;
        Token lv_summary_10_0=null;
        Token otherlv_11=null;
        Token lv_url_12_0=null;
        Token otherlv_13=null;
        Token lv_attach_14_0=null;
        Token otherlv_15=null;
        Token lv_attach_16_0=null;
        Token otherlv_17=null;
        Token lv_attendee_18_0=null;
        Token otherlv_19=null;
        Token lv_attendee_20_0=null;
        Token otherlv_21=null;
        Token lv_categories_22_0=null;
        Token otherlv_23=null;
        Token lv_categories_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Token lv_comment_28_0=null;
        Token otherlv_29=null;
        Token lv_contact_30_0=null;
        Token otherlv_31=null;
        Token lv_contact_32_0=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token lv_related_38_0=null;
        Token otherlv_39=null;
        Token lv_related_40_0=null;
        Token otherlv_41=null;
        Token lv_resources_42_0=null;
        Token otherlv_43=null;
        Token lv_resources_44_0=null;
        Token otherlv_45=null;
        Token lv_description_46_0=null;
        Token otherlv_47=null;
        Token lv_priority_48_0=null;
        Token otherlv_49=null;
        Token lv_location_50_0=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        EObject lv_dtstart_4_0 = null;

        AntlrDatatypeRuleToken lv_rstatus_34_0 = null;

        AntlrDatatypeRuleToken lv_rstatus_36_0 = null;

        EObject lv_dtend_52_0 = null;

        AntlrDatatypeRuleToken lv_class_54_0 = null;

        EObject lv_alarmc_56_0 = null;

        EObject lv_alarmc_58_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:813:2: ( (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' ) )
            // InternalMyDsl.g:814:2: (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' )
            {
            // InternalMyDsl.g:814:2: (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' )
            // InternalMyDsl.g:815:3: otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEventCAccess().getEventCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEventCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:823:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:824:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:824:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:825:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:828:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:829:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:829:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=20;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:830:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:830:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:831:5: {...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:831:103: ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:832:6: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:835:9: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:835:10: {...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:835:19: (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:835:20: otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FOLLOW_16); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEventCAccess().getDateKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:839:9: ( (lv_dtstart_4_0= ruleDateT ) )
            	    // InternalMyDsl.g:840:10: (lv_dtstart_4_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:840:10: (lv_dtstart_4_0= ruleDateT )
            	    // InternalMyDsl.g:841:11: lv_dtstart_4_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getEventCAccess().getDtstartDateTParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_dtstart_4_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEventCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtstart",
            	    												lv_dtstart_4_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:864:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:864:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:865:5: {...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:865:103: ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:866:6: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:869:9: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:869:10: {...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:869:19: (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:869:20: otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEventCAccess().getIdentifiantKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:873:9: ( (lv_uid_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:874:10: (lv_uid_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:874:10: (lv_uid_6_0= RULE_STR )
            	    // InternalMyDsl.g:875:11: lv_uid_6_0= RULE_STR
            	    {
            	    lv_uid_6_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_uid_6_0, grammarAccess.getEventCAccess().getUidSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_6_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:897:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:897:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:898:5: {...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:898:103: ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:899:6: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:902:9: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:902:10: {...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:902:19: (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:902:20: otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEventCAccess().getOrganisateurKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:906:9: ( (lv_organizer_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:907:10: (lv_organizer_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:907:10: (lv_organizer_8_0= RULE_STR )
            	    // InternalMyDsl.g:908:11: lv_organizer_8_0= RULE_STR
            	    {
            	    lv_organizer_8_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_organizer_8_0, grammarAccess.getEventCAccess().getOrganizerSTRTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"organizer",
            	    												lv_organizer_8_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:931:5: {...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:931:103: ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:932:6: ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:935:9: ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:935:10: {...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:935:19: (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:935:20: otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEventCAccess().getObjetKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:939:9: ( (lv_summary_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:940:10: (lv_summary_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:940:10: (lv_summary_10_0= RULE_STR )
            	    // InternalMyDsl.g:941:11: lv_summary_10_0= RULE_STR
            	    {
            	    lv_summary_10_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_summary_10_0, grammarAccess.getEventCAccess().getSummarySTRTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:963:4: ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:963:4: ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:964:5: {...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:964:103: ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:965:6: ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:968:9: ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:968:10: {...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:968:19: (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:968:20: otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEventCAccess().getURLKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:972:9: ( (lv_url_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:973:10: (lv_url_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:973:10: (lv_url_12_0= RULE_STR )
            	    // InternalMyDsl.g:974:11: lv_url_12_0= RULE_STR
            	    {
            	    lv_url_12_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_url_12_0, grammarAccess.getEventCAccess().getUrlSTRTerminalRuleCall_2_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_12_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:996:4: ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:996:4: ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:997:5: {...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:997:103: ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:998:6: ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1001:9: ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1001:10: {...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1001:19: (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1001:20: otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )*
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getEventCAccess().getAttachementsKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:1005:9: ( (lv_attach_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:1006:10: (lv_attach_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1006:10: (lv_attach_14_0= RULE_STR )
            	    // InternalMyDsl.g:1007:11: lv_attach_14_0= RULE_STR
            	    {
            	    lv_attach_14_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_attach_14_0, grammarAccess.getEventCAccess().getAttachSTRTerminalRuleCall_2_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attach",
            	    												lv_attach_14_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1023:9: (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==54) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1024:10: otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getEventCAccess().getCommaKeyword_2_5_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1028:10: ( (lv_attach_16_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1029:11: (lv_attach_16_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1029:11: (lv_attach_16_0= RULE_STR )
            	    	    // InternalMyDsl.g:1030:12: lv_attach_16_0= RULE_STR
            	    	    {
            	    	    lv_attach_16_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_attach_16_0, grammarAccess.getEventCAccess().getAttachSTRTerminalRuleCall_2_5_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attach",
            	    	    													lv_attach_16_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:1053:4: ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1053:4: ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1054:5: {...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:1054:103: ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1055:6: ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:1058:9: ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1058:10: {...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1058:19: (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1058:20: otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getEventCAccess().getInvitesKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:1062:9: ( (lv_attendee_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:1063:10: (lv_attendee_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1063:10: (lv_attendee_18_0= RULE_STR )
            	    // InternalMyDsl.g:1064:11: lv_attendee_18_0= RULE_STR
            	    {
            	    lv_attendee_18_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_attendee_18_0, grammarAccess.getEventCAccess().getAttendeeSTRTerminalRuleCall_2_6_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attendee",
            	    												lv_attendee_18_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1080:9: (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==54) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1081:10: otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getEventCAccess().getCommaKeyword_2_6_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1085:10: ( (lv_attendee_20_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1086:11: (lv_attendee_20_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1086:11: (lv_attendee_20_0= RULE_STR )
            	    	    // InternalMyDsl.g:1087:12: lv_attendee_20_0= RULE_STR
            	    	    {
            	    	    lv_attendee_20_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_attendee_20_0, grammarAccess.getEventCAccess().getAttendeeSTRTerminalRuleCall_2_6_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attendee",
            	    	    													lv_attendee_20_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:1110:4: ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1110:4: ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1111:5: {...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:1111:103: ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1112:6: ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:1115:9: ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1115:10: {...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1115:19: (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1115:20: otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getEventCAccess().getCategoriesKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:1119:9: ( (lv_categories_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:1120:10: (lv_categories_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1120:10: (lv_categories_22_0= RULE_STR )
            	    // InternalMyDsl.g:1121:11: lv_categories_22_0= RULE_STR
            	    {
            	    lv_categories_22_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_categories_22_0, grammarAccess.getEventCAccess().getCategoriesSTRTerminalRuleCall_2_7_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"categories",
            	    												lv_categories_22_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1137:9: (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==54) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1138:10: otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getEventCAccess().getCommaKeyword_2_7_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1142:10: ( (lv_categories_24_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1143:11: (lv_categories_24_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1143:11: (lv_categories_24_0= RULE_STR )
            	    	    // InternalMyDsl.g:1144:12: lv_categories_24_0= RULE_STR
            	    	    {
            	    	    lv_categories_24_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_categories_24_0, grammarAccess.getEventCAccess().getCategoriesSTRTerminalRuleCall_2_7_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"categories",
            	    	    													lv_categories_24_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:1167:4: ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1167:4: ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1168:5: {...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:1168:103: ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1169:6: ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:1172:9: ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1172:10: {...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1172:19: (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1172:20: otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getEventCAccess().getCommentaireKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:1176:9: ( (lv_comment_26_0= RULE_STR ) )
            	    // InternalMyDsl.g:1177:10: (lv_comment_26_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1177:10: (lv_comment_26_0= RULE_STR )
            	    // InternalMyDsl.g:1178:11: lv_comment_26_0= RULE_STR
            	    {
            	    lv_comment_26_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_comment_26_0, grammarAccess.getEventCAccess().getCommentSTRTerminalRuleCall_2_8_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"comment",
            	    												lv_comment_26_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1194:9: (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==54) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1195:10: otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_27, grammarAccess.getEventCAccess().getCommaKeyword_2_8_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1199:10: ( (lv_comment_28_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1200:11: (lv_comment_28_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1200:11: (lv_comment_28_0= RULE_STR )
            	    	    // InternalMyDsl.g:1201:12: lv_comment_28_0= RULE_STR
            	    	    {
            	    	    lv_comment_28_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_comment_28_0, grammarAccess.getEventCAccess().getCommentSTRTerminalRuleCall_2_8_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"comment",
            	    	    													lv_comment_28_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:1224:4: ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1224:4: ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1225:5: {...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:1225:103: ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1226:6: ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:1229:9: ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1229:10: {...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1229:19: (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1229:20: otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getEventCAccess().getContactKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:1233:9: ( (lv_contact_30_0= RULE_STR ) )
            	    // InternalMyDsl.g:1234:10: (lv_contact_30_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1234:10: (lv_contact_30_0= RULE_STR )
            	    // InternalMyDsl.g:1235:11: lv_contact_30_0= RULE_STR
            	    {
            	    lv_contact_30_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_contact_30_0, grammarAccess.getEventCAccess().getContactSTRTerminalRuleCall_2_9_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"contact",
            	    												lv_contact_30_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1251:9: (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==54) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1252:10: otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getEventCAccess().getCommaKeyword_2_9_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1256:10: ( (lv_contact_32_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1257:11: (lv_contact_32_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1257:11: (lv_contact_32_0= RULE_STR )
            	    	    // InternalMyDsl.g:1258:12: lv_contact_32_0= RULE_STR
            	    	    {
            	    	    lv_contact_32_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_contact_32_0, grammarAccess.getEventCAccess().getContactSTRTerminalRuleCall_2_9_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"contact",
            	    	    													lv_contact_32_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1282:5: {...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:1282:104: ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) )
            	    // InternalMyDsl.g:1283:6: ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:1286:9: ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) )
            	    // InternalMyDsl.g:1286:10: {...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1286:19: (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* )
            	    // InternalMyDsl.g:1286:20: otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,59,FOLLOW_19); 

            	    									newLeafNode(otherlv_33, grammarAccess.getEventCAccess().getStatusKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:1290:9: ( (lv_rstatus_34_0= ruleEventStatus ) )
            	    // InternalMyDsl.g:1291:10: (lv_rstatus_34_0= ruleEventStatus )
            	    {
            	    // InternalMyDsl.g:1291:10: (lv_rstatus_34_0= ruleEventStatus )
            	    // InternalMyDsl.g:1292:11: lv_rstatus_34_0= ruleEventStatus
            	    {

            	    											newCompositeNode(grammarAccess.getEventCAccess().getRstatusEventStatusParserRuleCall_2_10_1_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_rstatus_34_0=ruleEventStatus();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEventCRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rstatus",
            	    												lv_rstatus_34_0,
            	    												"xCalendar.MyDsl.EventStatus");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1309:9: (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==54) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1310:10: otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,54,FOLLOW_19); 

            	    	    										newLeafNode(otherlv_35, grammarAccess.getEventCAccess().getCommaKeyword_2_10_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1314:10: ( (lv_rstatus_36_0= ruleEventStatus ) )
            	    	    // InternalMyDsl.g:1315:11: (lv_rstatus_36_0= ruleEventStatus )
            	    	    {
            	    	    // InternalMyDsl.g:1315:11: (lv_rstatus_36_0= ruleEventStatus )
            	    	    // InternalMyDsl.g:1316:12: lv_rstatus_36_0= ruleEventStatus
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getEventCAccess().getRstatusEventStatusParserRuleCall_2_10_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_rstatus_36_0=ruleEventStatus();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rstatus",
            	    	    													lv_rstatus_36_0,
            	    	    													"xCalendar.MyDsl.EventStatus");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:1340:4: ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1340:4: ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1341:5: {...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:1341:104: ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1342:6: ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:1345:9: ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1345:10: {...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1345:19: (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1345:20: otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getEventCAccess().getRelierAKeyword_2_11_0());
            	    								
            	    // InternalMyDsl.g:1349:9: ( (lv_related_38_0= RULE_STR ) )
            	    // InternalMyDsl.g:1350:10: (lv_related_38_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1350:10: (lv_related_38_0= RULE_STR )
            	    // InternalMyDsl.g:1351:11: lv_related_38_0= RULE_STR
            	    {
            	    lv_related_38_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_related_38_0, grammarAccess.getEventCAccess().getRelatedSTRTerminalRuleCall_2_11_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"related",
            	    												lv_related_38_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1367:9: (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==54) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1368:10: otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getEventCAccess().getCommaKeyword_2_11_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1372:10: ( (lv_related_40_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1373:11: (lv_related_40_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1373:11: (lv_related_40_0= RULE_STR )
            	    	    // InternalMyDsl.g:1374:12: lv_related_40_0= RULE_STR
            	    	    {
            	    	    lv_related_40_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_related_40_0, grammarAccess.getEventCAccess().getRelatedSTRTerminalRuleCall_2_11_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"related",
            	    	    													lv_related_40_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:1397:4: ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1397:4: ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1398:5: {...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:1398:104: ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1399:6: ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:1402:9: ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1402:10: {...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1402:19: (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1402:20: otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_41, grammarAccess.getEventCAccess().getResourcesKeyword_2_12_0());
            	    								
            	    // InternalMyDsl.g:1406:9: ( (lv_resources_42_0= RULE_STR ) )
            	    // InternalMyDsl.g:1407:10: (lv_resources_42_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1407:10: (lv_resources_42_0= RULE_STR )
            	    // InternalMyDsl.g:1408:11: lv_resources_42_0= RULE_STR
            	    {
            	    lv_resources_42_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    											newLeafNode(lv_resources_42_0, grammarAccess.getEventCAccess().getResourcesSTRTerminalRuleCall_2_12_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"resources",
            	    												lv_resources_42_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1424:9: (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==54) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1425:10: otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getEventCAccess().getCommaKeyword_2_12_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1429:10: ( (lv_resources_44_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1430:11: (lv_resources_44_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1430:11: (lv_resources_44_0= RULE_STR )
            	    	    // InternalMyDsl.g:1431:12: lv_resources_44_0= RULE_STR
            	    	    {
            	    	    lv_resources_44_0=(Token)match(input,RULE_STR,FOLLOW_18); 

            	    	    												newLeafNode(lv_resources_44_0, grammarAccess.getEventCAccess().getResourcesSTRTerminalRuleCall_2_12_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"resources",
            	    	    													lv_resources_44_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1455:5: {...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:1455:104: ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1456:6: ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:1459:9: ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1459:10: {...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1459:19: (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1459:20: otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) )
            	    {
            	    otherlv_45=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_45, grammarAccess.getEventCAccess().getDescriptionKeyword_2_13_0());
            	    								
            	    // InternalMyDsl.g:1463:9: ( (lv_description_46_0= RULE_STR ) )
            	    // InternalMyDsl.g:1464:10: (lv_description_46_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1464:10: (lv_description_46_0= RULE_STR )
            	    // InternalMyDsl.g:1465:11: lv_description_46_0= RULE_STR
            	    {
            	    lv_description_46_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_description_46_0, grammarAccess.getEventCAccess().getDescriptionSTRTerminalRuleCall_2_13_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_46_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalMyDsl.g:1487:4: ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1487:4: ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1488:5: {...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:1488:104: ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1489:6: ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:1492:9: ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1492:10: {...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1492:19: (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1492:20: otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) )
            	    {
            	    otherlv_47=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_47, grammarAccess.getEventCAccess().getPrioriteKeyword_2_14_0());
            	    								
            	    // InternalMyDsl.g:1496:9: ( (lv_priority_48_0= RULE_STR ) )
            	    // InternalMyDsl.g:1497:10: (lv_priority_48_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1497:10: (lv_priority_48_0= RULE_STR )
            	    // InternalMyDsl.g:1498:11: lv_priority_48_0= RULE_STR
            	    {
            	    lv_priority_48_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_priority_48_0, grammarAccess.getEventCAccess().getPrioritySTRTerminalRuleCall_2_14_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"priority",
            	    												lv_priority_48_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalMyDsl.g:1520:4: ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1520:4: ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1521:5: {...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:1521:104: ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1522:6: ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:1525:9: ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1525:10: {...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1525:19: (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1525:20: otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) )
            	    {
            	    otherlv_49=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_49, grammarAccess.getEventCAccess().getLieuKeyword_2_15_0());
            	    								
            	    // InternalMyDsl.g:1529:9: ( (lv_location_50_0= RULE_STR ) )
            	    // InternalMyDsl.g:1530:10: (lv_location_50_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1530:10: (lv_location_50_0= RULE_STR )
            	    // InternalMyDsl.g:1531:11: lv_location_50_0= RULE_STR
            	    {
            	    lv_location_50_0=(Token)match(input,RULE_STR,FOLLOW_17); 

            	    											newLeafNode(lv_location_50_0, grammarAccess.getEventCAccess().getLocationSTRTerminalRuleCall_2_15_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"location",
            	    												lv_location_50_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalMyDsl.g:1553:4: ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1553:4: ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:1554:5: {...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:1554:104: ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:1555:6: ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:1558:9: ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:1558:10: {...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1558:19: (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:1558:20: otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) )
            	    {
            	    otherlv_51=(Token)match(input,65,FOLLOW_16); 

            	    									newLeafNode(otherlv_51, grammarAccess.getEventCAccess().getFinKeyword_2_16_0());
            	    								
            	    // InternalMyDsl.g:1562:9: ( (lv_dtend_52_0= ruleDateT ) )
            	    // InternalMyDsl.g:1563:10: (lv_dtend_52_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:1563:10: (lv_dtend_52_0= ruleDateT )
            	    // InternalMyDsl.g:1564:11: lv_dtend_52_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getEventCAccess().getDtendDateTParserRuleCall_2_16_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_dtend_52_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEventCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtend",
            	    												lv_dtend_52_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalMyDsl.g:1587:4: ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1587:4: ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:1588:5: {...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:1588:104: ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:1589:6: ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:1592:9: ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:1592:10: {...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1592:19: (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:1592:20: otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) )
            	    {
            	    otherlv_53=(Token)match(input,66,FOLLOW_20); 

            	    									newLeafNode(otherlv_53, grammarAccess.getEventCAccess().getClasseKeyword_2_17_0());
            	    								
            	    // InternalMyDsl.g:1596:9: ( (lv_class_54_0= ruleClassification ) )
            	    // InternalMyDsl.g:1597:10: (lv_class_54_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:1597:10: (lv_class_54_0= ruleClassification )
            	    // InternalMyDsl.g:1598:11: lv_class_54_0= ruleClassification
            	    {

            	    											newCompositeNode(grammarAccess.getEventCAccess().getClassClassificationParserRuleCall_2_17_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_class_54_0=ruleClassification();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEventCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"class",
            	    												lv_class_54_0,
            	    												"xCalendar.MyDsl.Classification");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalMyDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1622:5: {...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:1622:104: ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) )
            	    // InternalMyDsl.g:1623:6: ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:1626:9: ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) )
            	    // InternalMyDsl.g:1626:10: {...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1626:19: (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* )
            	    // InternalMyDsl.g:1626:20: otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )*
            	    {
            	    otherlv_55=(Token)match(input,67,FOLLOW_13); 

            	    									newLeafNode(otherlv_55, grammarAccess.getEventCAccess().getAlarmesKeyword_2_18_0());
            	    								
            	    // InternalMyDsl.g:1630:9: ( (lv_alarmc_56_0= ruleAlarmC ) )
            	    // InternalMyDsl.g:1631:10: (lv_alarmc_56_0= ruleAlarmC )
            	    {
            	    // InternalMyDsl.g:1631:10: (lv_alarmc_56_0= ruleAlarmC )
            	    // InternalMyDsl.g:1632:11: lv_alarmc_56_0= ruleAlarmC
            	    {

            	    											newCompositeNode(grammarAccess.getEventCAccess().getAlarmcAlarmCParserRuleCall_2_18_1_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_alarmc_56_0=ruleAlarmC();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEventCRule());
            	    											}
            	    											add(
            	    												current,
            	    												"alarmc",
            	    												lv_alarmc_56_0,
            	    												"xCalendar.MyDsl.AlarmC");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:1649:9: (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==54) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1650:10: otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) )
            	    	    {
            	    	    otherlv_57=(Token)match(input,54,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_57, grammarAccess.getEventCAccess().getCommaKeyword_2_18_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1654:10: ( (lv_alarmc_58_0= ruleAlarmC ) )
            	    	    // InternalMyDsl.g:1655:11: (lv_alarmc_58_0= ruleAlarmC )
            	    	    {
            	    	    // InternalMyDsl.g:1655:11: (lv_alarmc_58_0= ruleAlarmC )
            	    	    // InternalMyDsl.g:1656:12: lv_alarmc_58_0= ruleAlarmC
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getEventCAccess().getAlarmcAlarmCParserRuleCall_2_18_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_alarmc_58_0=ruleAlarmC();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getEventCRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"alarmc",
            	    	    													lv_alarmc_58_0,
            	    	    													"xCalendar.MyDsl.AlarmC");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_59=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_59, grammarAccess.getEventCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEventC"


    // $ANTLR start "entryRuleAlarmC"
    // InternalMyDsl.g:1696:1: entryRuleAlarmC returns [EObject current=null] : iv_ruleAlarmC= ruleAlarmC EOF ;
    public final EObject entryRuleAlarmC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmC = null;


        try {
            // InternalMyDsl.g:1696:47: (iv_ruleAlarmC= ruleAlarmC EOF )
            // InternalMyDsl.g:1697:2: iv_ruleAlarmC= ruleAlarmC EOF
            {
             newCompositeNode(grammarAccess.getAlarmCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmC=ruleAlarmC();

            state._fsp--;

             current =iv_ruleAlarmC; 
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
    // $ANTLR end "entryRuleAlarmC"


    // $ANTLR start "ruleAlarmC"
    // InternalMyDsl.g:1703:1: ruleAlarmC returns [EObject current=null] : (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
    public final EObject ruleAlarmC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_action_4_0=null;
        Token otherlv_5=null;
        Token lv_trigger_6_0=null;
        Token otherlv_7=null;
        Token lv_attach_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_type_12_0 = null;

        EObject lv_time_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1709:2: ( (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // InternalMyDsl.g:1710:2: (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // InternalMyDsl.g:1710:2: (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // InternalMyDsl.g:1711:3: otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlarmCAccess().getAlarmCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAlarmCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1719:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1720:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1720:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1721:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1724:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1725:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1725:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=7;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2) ) {
                    alt34=3;
                }
                else if ( LA34_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3) ) {
                    alt34=4;
                }
                else if ( LA34_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4) ) {
                    alt34=5;
                }
                else if ( LA34_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5) ) {
                    alt34=6;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1726:4: ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1726:4: ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1727:5: {...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1727:103: ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1728:6: ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1731:9: ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1731:10: {...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1731:19: (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1731:20: otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,69,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAlarmCAccess().getActionKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:1735:9: ( (lv_action_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:1736:10: (lv_action_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1736:10: (lv_action_4_0= RULE_STR )
            	    // InternalMyDsl.g:1737:11: lv_action_4_0= RULE_STR
            	    {
            	    lv_action_4_0=(Token)match(input,RULE_STR,FOLLOW_22); 

            	    											newLeafNode(lv_action_4_0, grammarAccess.getAlarmCAccess().getActionSTRTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlarmCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"action",
            	    												lv_action_4_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1759:4: ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1759:4: ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1760:5: {...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1760:103: ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1761:6: ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1764:9: ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1764:10: {...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1764:19: (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1764:20: otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,70,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAlarmCAccess().getTriggerKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:1768:9: ( (lv_trigger_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:1769:10: (lv_trigger_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1769:10: (lv_trigger_6_0= RULE_STR )
            	    // InternalMyDsl.g:1770:11: lv_trigger_6_0= RULE_STR
            	    {
            	    lv_trigger_6_0=(Token)match(input,RULE_STR,FOLLOW_22); 

            	    											newLeafNode(lv_trigger_6_0, grammarAccess.getAlarmCAccess().getTriggerSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlarmCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"trigger",
            	    												lv_trigger_6_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1792:4: ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1792:4: ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1793:5: {...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1793:103: ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1794:6: ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1797:9: ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1797:10: {...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1797:19: (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1797:20: otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAlarmCAccess().getAttachementsKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:1801:9: ( (lv_attach_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:1802:10: (lv_attach_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1802:10: (lv_attach_8_0= RULE_STR )
            	    // InternalMyDsl.g:1803:11: lv_attach_8_0= RULE_STR
            	    {
            	    lv_attach_8_0=(Token)match(input,RULE_STR,FOLLOW_22); 

            	    											newLeafNode(lv_attach_8_0, grammarAccess.getAlarmCAccess().getAttachSTRTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlarmCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"attach",
            	    												lv_attach_8_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1825:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1825:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1826:5: {...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1826:103: ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1827:6: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1830:9: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1830:10: {...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1830:19: (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1830:20: otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAlarmCAccess().getDescriptionKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:1834:9: ( (lv_description_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:1835:10: (lv_description_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1835:10: (lv_description_10_0= RULE_STR )
            	    // InternalMyDsl.g:1836:11: lv_description_10_0= RULE_STR
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STR,FOLLOW_22); 

            	    											newLeafNode(lv_description_10_0, grammarAccess.getAlarmCAccess().getDescriptionSTRTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlarmCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1858:4: ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1858:4: ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) )
            	    // InternalMyDsl.g:1859:5: {...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1859:103: ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) )
            	    // InternalMyDsl.g:1860:6: ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1863:9: ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) )
            	    // InternalMyDsl.g:1863:10: {...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1863:19: (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) )
            	    // InternalMyDsl.g:1863:20: otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) )
            	    {
            	    otherlv_11=(Token)match(input,71,FOLLOW_23); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAlarmCAccess().getTypeKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:1867:9: ( (lv_type_12_0= ruleAlarmType ) )
            	    // InternalMyDsl.g:1868:10: (lv_type_12_0= ruleAlarmType )
            	    {
            	    // InternalMyDsl.g:1868:10: (lv_type_12_0= ruleAlarmType )
            	    // InternalMyDsl.g:1869:11: lv_type_12_0= ruleAlarmType
            	    {

            	    											newCompositeNode(grammarAccess.getAlarmCAccess().getTypeAlarmTypeParserRuleCall_2_4_1_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_type_12_0=ruleAlarmType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAlarmCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_12_0,
            	    												"xCalendar.MyDsl.AlarmType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:1892:4: ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1892:4: ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) )
            	    // InternalMyDsl.g:1893:5: {...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1893:103: ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) )
            	    // InternalMyDsl.g:1894:6: ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1897:9: ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) )
            	    // InternalMyDsl.g:1897:10: {...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1897:19: (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) )
            	    // InternalMyDsl.g:1897:20: otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) )
            	    {
            	    otherlv_13=(Token)match(input,72,FOLLOW_24); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAlarmCAccess().getTempsKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:1901:9: ( (lv_time_14_0= ruleComponentAlarmTime ) )
            	    // InternalMyDsl.g:1902:10: (lv_time_14_0= ruleComponentAlarmTime )
            	    {
            	    // InternalMyDsl.g:1902:10: (lv_time_14_0= ruleComponentAlarmTime )
            	    // InternalMyDsl.g:1903:11: lv_time_14_0= ruleComponentAlarmTime
            	    {

            	    											newCompositeNode(grammarAccess.getAlarmCAccess().getTimeComponentAlarmTimeParserRuleCall_2_5_1_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_time_14_0=ruleComponentAlarmTime();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAlarmCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"time",
            	    												lv_time_14_0,
            	    												"xCalendar.MyDsl.ComponentAlarmTime");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAlarmCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canLeave(grammarAccess.getAlarmCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAlarmCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAlarmC"


    // $ANTLR start "entryRuletzprop"
    // InternalMyDsl.g:1942:1: entryRuletzprop returns [EObject current=null] : iv_ruletzprop= ruletzprop EOF ;
    public final EObject entryRuletzprop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzprop = null;


        try {
            // InternalMyDsl.g:1942:47: (iv_ruletzprop= ruletzprop EOF )
            // InternalMyDsl.g:1943:2: iv_ruletzprop= ruletzprop EOF
            {
             newCompositeNode(grammarAccess.getTzpropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletzprop=ruletzprop();

            state._fsp--;

             current =iv_ruletzprop; 
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
    // $ANTLR end "entryRuletzprop"


    // $ANTLR start "ruletzprop"
    // InternalMyDsl.g:1949:1: ruletzprop returns [EObject current=null] : (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruletzprop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_dtstart_4_0=null;
        Token otherlv_5=null;
        Token lv_tzoffseto_6_0=null;
        Token otherlv_7=null;
        Token lv_tzoffsetfrom_8_0=null;
        Token otherlv_9=null;
        Token lv_rrule_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_opt_13_0 = null;

        EObject lv_opt_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1955:2: ( (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalMyDsl.g:1956:2: (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalMyDsl.g:1956:2: (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalMyDsl.g:1957:3: otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTzpropAccess().getTzpropKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1965:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1966:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1966:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1967:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1970:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1971:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1971:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=6;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4) ) {
                    alt36=5;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1972:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1972:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1973:5: {...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1973:103: ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1974:6: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1977:9: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1977:10: {...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:1977:19: (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1977:20: otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTzpropAccess().getDateKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:1981:9: ( (lv_dtstart_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:1982:10: (lv_dtstart_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1982:10: (lv_dtstart_4_0= RULE_STR )
            	    // InternalMyDsl.g:1983:11: lv_dtstart_4_0= RULE_STR
            	    {
            	    lv_dtstart_4_0=(Token)match(input,RULE_STR,FOLLOW_26); 

            	    											newLeafNode(lv_dtstart_4_0, grammarAccess.getTzpropAccess().getDtstartSTRTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"dtstart",
            	    												lv_dtstart_4_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2005:4: ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2005:4: ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2006:5: {...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2006:103: ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2007:6: ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2010:9: ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2010:10: {...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2010:19: (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2010:20: otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTzpropAccess().getTzoffsetoKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:2014:9: ( (lv_tzoffseto_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:2015:10: (lv_tzoffseto_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2015:10: (lv_tzoffseto_6_0= RULE_STR )
            	    // InternalMyDsl.g:2016:11: lv_tzoffseto_6_0= RULE_STR
            	    {
            	    lv_tzoffseto_6_0=(Token)match(input,RULE_STR,FOLLOW_26); 

            	    											newLeafNode(lv_tzoffseto_6_0, grammarAccess.getTzpropAccess().getTzoffsetoSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"tzoffseto",
            	    												lv_tzoffseto_6_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2038:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2038:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2039:5: {...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2039:103: ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2040:6: ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2043:9: ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2043:10: {...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2043:19: (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2043:20: otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,75,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTzpropAccess().getTzoffsetfromKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:2047:9: ( (lv_tzoffsetfrom_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:2048:10: (lv_tzoffsetfrom_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2048:10: (lv_tzoffsetfrom_8_0= RULE_STR )
            	    // InternalMyDsl.g:2049:11: lv_tzoffsetfrom_8_0= RULE_STR
            	    {
            	    lv_tzoffsetfrom_8_0=(Token)match(input,RULE_STR,FOLLOW_26); 

            	    											newLeafNode(lv_tzoffsetfrom_8_0, grammarAccess.getTzpropAccess().getTzoffsetfromSTRTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"tzoffsetfrom",
            	    												lv_tzoffsetfrom_8_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:2071:4: ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2071:4: ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2072:5: {...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2072:103: ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2073:6: ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2076:9: ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2076:10: {...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2076:19: (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2076:20: otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,76,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTzpropAccess().getRruleKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:2080:9: ( (lv_rrule_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:2081:10: (lv_rrule_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2081:10: (lv_rrule_10_0= RULE_STR )
            	    // InternalMyDsl.g:2082:11: lv_rrule_10_0= RULE_STR
            	    {
            	    lv_rrule_10_0=(Token)match(input,RULE_STR,FOLLOW_26); 

            	    											newLeafNode(lv_rrule_10_0, grammarAccess.getTzpropAccess().getRruleSTRTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"rrule",
            	    												lv_rrule_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:2104:4: ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2104:4: ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalMyDsl.g:2105:5: {...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2105:103: ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) )
            	    // InternalMyDsl.g:2106:6: ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2109:9: ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) )
            	    // InternalMyDsl.g:2109:10: {...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2109:19: (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' )
            	    // InternalMyDsl.g:2109:20: otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,77,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTzpropAccess().getOptKeyword_2_4_0());
            	    								
            	    otherlv_12=(Token)match(input,41,FOLLOW_27); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2117:9: ( (lv_opt_13_0= ruletzpropOptional ) )
            	    // InternalMyDsl.g:2118:10: (lv_opt_13_0= ruletzpropOptional )
            	    {
            	    // InternalMyDsl.g:2118:10: (lv_opt_13_0= ruletzpropOptional )
            	    // InternalMyDsl.g:2119:11: lv_opt_13_0= ruletzpropOptional
            	    {

            	    											newCompositeNode(grammarAccess.getTzpropAccess().getOptTzpropOptionalParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_opt_13_0=ruletzpropOptional();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTzpropRule());
            	    											}
            	    											add(
            	    												current,
            	    												"opt",
            	    												lv_opt_13_0,
            	    												"xCalendar.MyDsl.tzpropOptional");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:2136:9: (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==54) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2137:10: otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,54,FOLLOW_27); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getTzpropAccess().getCommaKeyword_2_4_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:2141:10: ( (lv_opt_15_0= ruletzpropOptional ) )
            	    	    // InternalMyDsl.g:2142:11: (lv_opt_15_0= ruletzpropOptional )
            	    	    {
            	    	    // InternalMyDsl.g:2142:11: (lv_opt_15_0= ruletzpropOptional )
            	    	    // InternalMyDsl.g:2143:12: lv_opt_15_0= ruletzpropOptional
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getTzpropAccess().getOptTzpropOptionalParserRuleCall_2_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_28);
            	    	    lv_opt_15_0=ruletzpropOptional();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getTzpropRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"opt",
            	    	    													lv_opt_15_0,
            	    	    													"xCalendar.MyDsl.tzpropOptional");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,46,FOLLOW_26); 

            	    									newLeafNode(otherlv_16, grammarAccess.getTzpropAccess().getRightCurlyBracketKeyword_2_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTzpropAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canLeave(grammarAccess.getTzpropAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            				

            }

            otherlv_17=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTzpropAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruletzprop"


    // $ANTLR start "entryRuletzpropOptional"
    // InternalMyDsl.g:2187:1: entryRuletzpropOptional returns [EObject current=null] : iv_ruletzpropOptional= ruletzpropOptional EOF ;
    public final EObject entryRuletzpropOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzpropOptional = null;


        try {
            // InternalMyDsl.g:2187:55: (iv_ruletzpropOptional= ruletzpropOptional EOF )
            // InternalMyDsl.g:2188:2: iv_ruletzpropOptional= ruletzpropOptional EOF
            {
             newCompositeNode(grammarAccess.getTzpropOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletzpropOptional=ruletzpropOptional();

            state._fsp--;

             current =iv_ruletzpropOptional; 
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
    // $ANTLR end "entryRuletzpropOptional"


    // $ANTLR start "ruletzpropOptional"
    // InternalMyDsl.g:2194:1: ruletzpropOptional returns [EObject current=null] : ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruletzpropOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_comment_5_0=null;
        Token otherlv_6=null;
        Token lv_rdate_7_0=null;
        Token otherlv_8=null;
        Token lv_tzname_9_0=null;
        Token otherlv_10=null;
        Token lv_x_prop_11_0=null;
        Token otherlv_12=null;
        Token lv_iana_prop_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2200:2: ( ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:2201:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:2201:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMyDsl.g:2202:3: () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            // InternalMyDsl.g:2202:3: ()
            // InternalMyDsl.g:2203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTzpropOptionalAccess().getTzpropOptionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropOptionalAccess().getTzpropOptionalKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTzpropOptionalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2217:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2218:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2218:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2219:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2222:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2223:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2223:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )*
            loop37:
            do {
                int alt37=6;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4) ) {
                    alt37=5;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2224:4: ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2224:4: ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2225:5: {...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2225:111: ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2226:6: ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2229:9: ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2229:10: {...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2229:19: (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2229:20: otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTzpropOptionalAccess().getCommentaireKeyword_3_0_0());
            	    								
            	    // InternalMyDsl.g:2233:9: ( (lv_comment_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2234:10: (lv_comment_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2234:10: (lv_comment_5_0= RULE_STR )
            	    // InternalMyDsl.g:2235:11: lv_comment_5_0= RULE_STR
            	    {
            	    lv_comment_5_0=(Token)match(input,RULE_STR,FOLLOW_29); 

            	    											newLeafNode(lv_comment_5_0, grammarAccess.getTzpropOptionalAccess().getCommentSTRTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropOptionalRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"comment",
            	    												lv_comment_5_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2257:4: ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2257:4: ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2258:5: {...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2258:111: ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2259:6: ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2262:9: ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2262:10: {...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2262:19: (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2262:20: otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) )
            	    {
            	    otherlv_6=(Token)match(input,79,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTzpropOptionalAccess().getRdateKeyword_3_1_0());
            	    								
            	    // InternalMyDsl.g:2266:9: ( (lv_rdate_7_0= RULE_STR ) )
            	    // InternalMyDsl.g:2267:10: (lv_rdate_7_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2267:10: (lv_rdate_7_0= RULE_STR )
            	    // InternalMyDsl.g:2268:11: lv_rdate_7_0= RULE_STR
            	    {
            	    lv_rdate_7_0=(Token)match(input,RULE_STR,FOLLOW_29); 

            	    											newLeafNode(lv_rdate_7_0, grammarAccess.getTzpropOptionalAccess().getRdateSTRTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropOptionalRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"rdate",
            	    												lv_rdate_7_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2290:4: ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2290:4: ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2291:5: {...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2291:111: ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2292:6: ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2295:9: ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2295:10: {...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2295:19: (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2295:20: otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) )
            	    {
            	    otherlv_8=(Token)match(input,80,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTzpropOptionalAccess().getTznameKeyword_3_2_0());
            	    								
            	    // InternalMyDsl.g:2299:9: ( (lv_tzname_9_0= RULE_STR ) )
            	    // InternalMyDsl.g:2300:10: (lv_tzname_9_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2300:10: (lv_tzname_9_0= RULE_STR )
            	    // InternalMyDsl.g:2301:11: lv_tzname_9_0= RULE_STR
            	    {
            	    lv_tzname_9_0=(Token)match(input,RULE_STR,FOLLOW_29); 

            	    											newLeafNode(lv_tzname_9_0, grammarAccess.getTzpropOptionalAccess().getTznameSTRTerminalRuleCall_3_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropOptionalRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"tzname",
            	    												lv_tzname_9_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:2323:4: ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2323:4: ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2324:5: {...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2324:111: ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2325:6: ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2328:9: ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2328:10: {...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2328:19: (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2328:20: otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) )
            	    {
            	    otherlv_10=(Token)match(input,81,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTzpropOptionalAccess().getX_propKeyword_3_3_0());
            	    								
            	    // InternalMyDsl.g:2332:9: ( (lv_x_prop_11_0= RULE_STR ) )
            	    // InternalMyDsl.g:2333:10: (lv_x_prop_11_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2333:10: (lv_x_prop_11_0= RULE_STR )
            	    // InternalMyDsl.g:2334:11: lv_x_prop_11_0= RULE_STR
            	    {
            	    lv_x_prop_11_0=(Token)match(input,RULE_STR,FOLLOW_29); 

            	    											newLeafNode(lv_x_prop_11_0, grammarAccess.getTzpropOptionalAccess().getX_propSTRTerminalRuleCall_3_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropOptionalRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"x_prop",
            	    												lv_x_prop_11_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:2356:4: ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2356:4: ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2357:5: {...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2357:111: ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2358:6: ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2361:9: ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2361:10: {...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2361:19: (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2361:20: otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) )
            	    {
            	    otherlv_12=(Token)match(input,82,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTzpropOptionalAccess().getIana_propKeyword_3_4_0());
            	    								
            	    // InternalMyDsl.g:2365:9: ( (lv_iana_prop_13_0= RULE_STR ) )
            	    // InternalMyDsl.g:2366:10: (lv_iana_prop_13_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2366:10: (lv_iana_prop_13_0= RULE_STR )
            	    // InternalMyDsl.g:2367:11: lv_iana_prop_13_0= RULE_STR
            	    {
            	    lv_iana_prop_13_0=(Token)match(input,RULE_STR,FOLLOW_29); 

            	    											newLeafNode(lv_iana_prop_13_0, grammarAccess.getTzpropOptionalAccess().getIana_propSTRTerminalRuleCall_3_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTzpropOptionalRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"iana_prop",
            	    												lv_iana_prop_13_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            				

            }

            otherlv_14=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTzpropOptionalAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruletzpropOptional"


    // $ANTLR start "entryRuleComponentAlarmTime"
    // InternalMyDsl.g:2404:1: entryRuleComponentAlarmTime returns [EObject current=null] : iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF ;
    public final EObject entryRuleComponentAlarmTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmTime = null;


        try {
            // InternalMyDsl.g:2404:59: (iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF )
            // InternalMyDsl.g:2405:2: iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmTime=ruleComponentAlarmTime();

            state._fsp--;

             current =iv_ruleComponentAlarmTime; 
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
    // $ANTLR end "entryRuleComponentAlarmTime"


    // $ANTLR start "ruleComponentAlarmTime"
    // InternalMyDsl.g:2411:1: ruleComponentAlarmTime returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleComponentAlarmTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_duration_5_0=null;
        Token otherlv_6=null;
        Token lv_repeat_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2417:2: ( ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:2418:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:2418:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalMyDsl.g:2419:3: () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalMyDsl.g:2419:3: ()
            // InternalMyDsl.g:2420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2434:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2435:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2435:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2436:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2439:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2440:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2440:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2441:4: ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2441:4: ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2442:5: {...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2442:115: ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2443:6: ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2446:9: ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2446:10: {...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "true");
            	    }
            	    // InternalMyDsl.g:2446:19: (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2446:20: otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) )
            	    {
            	    otherlv_4=(Token)match(input,84,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentAlarmTimeAccess().getDureeKeyword_3_0_0());
            	    								
            	    // InternalMyDsl.g:2450:9: ( (lv_duration_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2451:10: (lv_duration_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2451:10: (lv_duration_5_0= RULE_STR )
            	    // InternalMyDsl.g:2452:11: lv_duration_5_0= RULE_STR
            	    {
            	    lv_duration_5_0=(Token)match(input,RULE_STR,FOLLOW_30); 

            	    											newLeafNode(lv_duration_5_0, grammarAccess.getComponentAlarmTimeAccess().getDurationSTRTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentAlarmTimeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"duration",
            	    												lv_duration_5_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2474:4: ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2474:4: ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2475:5: {...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2475:115: ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2476:6: ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2479:9: ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2479:10: {...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "true");
            	    }
            	    // InternalMyDsl.g:2479:19: (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2479:20: otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) )
            	    {
            	    otherlv_6=(Token)match(input,85,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getComponentAlarmTimeAccess().getRepeterKeyword_3_1_0());
            	    								
            	    // InternalMyDsl.g:2483:9: ( (lv_repeat_7_0= RULE_STR ) )
            	    // InternalMyDsl.g:2484:10: (lv_repeat_7_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2484:10: (lv_repeat_7_0= RULE_STR )
            	    // InternalMyDsl.g:2485:11: lv_repeat_7_0= RULE_STR
            	    {
            	    lv_repeat_7_0=(Token)match(input,RULE_STR,FOLLOW_30); 

            	    											newLeafNode(lv_repeat_7_0, grammarAccess.getComponentAlarmTimeAccess().getRepeatSTRTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentAlarmTimeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"repeat",
            	    												lv_repeat_7_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3());
            				

            }

            otherlv_8=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAlarmTimeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentAlarmTime"


    // $ANTLR start "entryRuleComponentAlarmAudioProperty"
    // InternalMyDsl.g:2522:1: entryRuleComponentAlarmAudioProperty returns [EObject current=null] : iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF ;
    public final EObject entryRuleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmAudioProperty = null;


        try {
            // InternalMyDsl.g:2522:68: (iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF )
            // InternalMyDsl.g:2523:2: iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmAudioPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmAudioProperty=ruleComponentAlarmAudioProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmAudioProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmAudioProperty"


    // $ANTLR start "ruleComponentAlarmAudioProperty"
    // InternalMyDsl.g:2529:1: ruleComponentAlarmAudioProperty returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_attach_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2535:2: ( ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2536:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2536:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2537:3: () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2537:3: ()
            // InternalMyDsl.g:2538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmAudioPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2552:3: (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2553:4: otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAlarmAudioPropertyAccess().getAttachementsKeyword_3_0());
                    			
                    // InternalMyDsl.g:2557:4: ( (lv_attach_4_0= RULE_STR ) )
                    // InternalMyDsl.g:2558:5: (lv_attach_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2558:5: (lv_attach_4_0= RULE_STR )
                    // InternalMyDsl.g:2559:6: lv_attach_4_0= RULE_STR
                    {
                    lv_attach_4_0=(Token)match(input,RULE_STR,FOLLOW_32); 

                    						newLeafNode(lv_attach_4_0, grammarAccess.getComponentAlarmAudioPropertyAccess().getAttachSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentAlarmAudioPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_4_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAlarmAudioPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentAlarmAudioProperty"


    // $ANTLR start "entryRuleComponentAlarmDispProperty"
    // InternalMyDsl.g:2584:1: entryRuleComponentAlarmDispProperty returns [EObject current=null] : iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF ;
    public final EObject entryRuleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmDispProperty = null;


        try {
            // InternalMyDsl.g:2584:67: (iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF )
            // InternalMyDsl.g:2585:2: iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmDispPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmDispProperty=ruleComponentAlarmDispProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmDispProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmDispProperty"


    // $ANTLR start "ruleComponentAlarmDispProperty"
    // InternalMyDsl.g:2591:1: ruleComponentAlarmDispProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) ;
    public final EObject ruleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2597:2: ( (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:2598:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:2598:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            // InternalMyDsl.g:2599:3: otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmDispPropertyAccess().getComponentAlarmDispPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmDispPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmDispPropertyAccess().getDescriptionKeyword_2());
            		
            // InternalMyDsl.g:2611:3: ( (lv_description_3_0= RULE_STR ) )
            // InternalMyDsl.g:2612:4: (lv_description_3_0= RULE_STR )
            {
            // InternalMyDsl.g:2612:4: (lv_description_3_0= RULE_STR )
            // InternalMyDsl.g:2613:5: lv_description_3_0= RULE_STR
            {
            lv_description_3_0=(Token)match(input,RULE_STR,FOLLOW_32); 

            					newLeafNode(lv_description_3_0, grammarAccess.getComponentAlarmDispPropertyAccess().getDescriptionSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAlarmDispPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAlarmDispPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentAlarmDispProperty"


    // $ANTLR start "entryRuleComponentAlarmEmailProperty"
    // InternalMyDsl.g:2637:1: entryRuleComponentAlarmEmailProperty returns [EObject current=null] : iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF ;
    public final EObject entryRuleComponentAlarmEmailProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmEmailProperty = null;


        try {
            // InternalMyDsl.g:2637:68: (iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF )
            // InternalMyDsl.g:2638:2: iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmEmailPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmEmailProperty=ruleComponentAlarmEmailProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmEmailProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmEmailProperty"


    // $ANTLR start "ruleComponentAlarmEmailProperty"
    // InternalMyDsl.g:2644:1: ruleComponentAlarmEmailProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruleComponentAlarmEmailProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_attendee_5_0=null;
        Token otherlv_6=null;
        Token lv_attendee_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_attach_13_0=null;
        Token otherlv_14=null;
        Token lv_attach_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2650:2: ( (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalMyDsl.g:2651:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalMyDsl.g:2651:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalMyDsl.g:2652:3: otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getComponentAlarmEmailPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2660:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:2661:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:2661:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:2662:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2665:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:2666:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:2666:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2) ) {
                    alt42=3;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:2667:4: ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2667:4: ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) )
            	    // InternalMyDsl.g:2668:5: {...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2668:124: ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) )
            	    // InternalMyDsl.g:2669:6: ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2672:9: ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) )
            	    // InternalMyDsl.g:2672:10: {...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2672:19: (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' )
            	    // InternalMyDsl.g:2672:20: otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}'
            	    {
            	    otherlv_3=(Token)match(input,89,FOLLOW_12); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentAlarmEmailPropertyAccess().getInvitesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2680:9: ( (lv_attendee_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2681:10: (lv_attendee_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2681:10: (lv_attendee_5_0= RULE_STR )
            	    // InternalMyDsl.g:2682:11: lv_attendee_5_0= RULE_STR
            	    {
            	    lv_attendee_5_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attendee_5_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttendeeSTRTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attendee",
            	    												lv_attendee_5_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:2698:9: (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==54) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2699:10: otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_6, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_2_0_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:2703:10: ( (lv_attendee_7_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:2704:11: (lv_attendee_7_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:2704:11: (lv_attendee_7_0= RULE_STR )
            	    	    // InternalMyDsl.g:2705:12: lv_attendee_7_0= RULE_STR
            	    	    {
            	    	    lv_attendee_7_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attendee_7_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttendeeSTRTerminalRuleCall_2_0_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attendee",
            	    	    													lv_attendee_7_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,46,FOLLOW_35); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_2_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2732:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2732:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2733:5: {...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2733:124: ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2734:6: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2737:9: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2737:10: {...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2737:19: (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2737:20: otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentAlarmEmailPropertyAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:2741:9: ( (lv_description_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:2742:10: (lv_description_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2742:10: (lv_description_10_0= RULE_STR )
            	    // InternalMyDsl.g:2743:11: lv_description_10_0= RULE_STR
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STR,FOLLOW_35); 

            	    											newLeafNode(lv_description_10_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getDescriptionSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2765:4: ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2765:4: ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalMyDsl.g:2766:5: {...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2766:124: ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) )
            	    // InternalMyDsl.g:2767:6: ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2770:9: ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) )
            	    // InternalMyDsl.g:2770:10: {...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2770:19: (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' )
            	    // InternalMyDsl.g:2770:20: otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,90,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachementsKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2778:9: ( (lv_attach_13_0= RULE_STR ) )
            	    // InternalMyDsl.g:2779:10: (lv_attach_13_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2779:10: (lv_attach_13_0= RULE_STR )
            	    // InternalMyDsl.g:2780:11: lv_attach_13_0= RULE_STR
            	    {
            	    lv_attach_13_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attach_13_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachSTRTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attach",
            	    												lv_attach_13_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:2796:9: (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==54) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2797:10: otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_2_2_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:2801:10: ( (lv_attach_15_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:2802:11: (lv_attach_15_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:2802:11: (lv_attach_15_0= RULE_STR )
            	    	    // InternalMyDsl.g:2803:12: lv_attach_15_0= RULE_STR
            	    	    {
            	    	    lv_attach_15_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attach_15_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachSTRTerminalRuleCall_2_2_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attach",
            	    	    													lv_attach_15_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,46,FOLLOW_35); 

            	    									newLeafNode(otherlv_16, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_2_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            				

            }

            otherlv_17=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleComponentAlarmEmailProperty"


    // $ANTLR start "entryRuleToDoC"
    // InternalMyDsl.g:2846:1: entryRuleToDoC returns [EObject current=null] : iv_ruleToDoC= ruleToDoC EOF ;
    public final EObject entryRuleToDoC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToDoC = null;


        try {
            // InternalMyDsl.g:2846:46: (iv_ruleToDoC= ruleToDoC EOF )
            // InternalMyDsl.g:2847:2: iv_ruleToDoC= ruleToDoC EOF
            {
             newCompositeNode(grammarAccess.getToDoCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToDoC=ruleToDoC();

            state._fsp--;

             current =iv_ruleToDoC; 
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
    // $ANTLR end "entryRuleToDoC"


    // $ANTLR start "ruleToDoC"
    // InternalMyDsl.g:2853:1: ruleToDoC returns [EObject current=null] : (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' ) ;
    public final EObject ruleToDoC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_uid_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_created_14_0=null;
        Token otherlv_15=null;
        Token lv_last_mod_16_0=null;
        Token otherlv_17=null;
        Token lv_organizer_18_0=null;
        Token otherlv_19=null;
        Token lv_seq_20_0=null;
        Token otherlv_21=null;
        Token lv_status_22_0=null;
        Token otherlv_23=null;
        Token lv_summary_24_0=null;
        Token otherlv_25=null;
        Token lv_url_26_0=null;
        Token otherlv_27=null;
        Token lv_recurid_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_rrule_31_0=null;
        Token otherlv_32=null;
        Token lv_rrule_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_attach_37_0=null;
        Token otherlv_38=null;
        Token lv_attach_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_attendee_43_0=null;
        Token otherlv_44=null;
        Token lv_attendee_45_0=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_categories_49_0=null;
        Token otherlv_50=null;
        Token lv_categories_51_0=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_comment_55_0=null;
        Token otherlv_56=null;
        Token lv_comment_57_0=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token lv_contact_61_0=null;
        Token otherlv_62=null;
        Token lv_contact_63_0=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token lv_exdate_67_0=null;
        Token otherlv_68=null;
        Token lv_exdate_69_0=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token lv_rstatus_73_0=null;
        Token otherlv_74=null;
        Token lv_rstatus_75_0=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token lv_related_79_0=null;
        Token otherlv_80=null;
        Token lv_related_81_0=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token otherlv_84=null;
        Token lv_resources_85_0=null;
        Token otherlv_86=null;
        Token lv_resources_87_0=null;
        Token otherlv_88=null;
        Token otherlv_89=null;
        Token otherlv_90=null;
        Token lv_rdate_91_0=null;
        Token otherlv_92=null;
        Token lv_rdate_93_0=null;
        Token otherlv_94=null;
        Token otherlv_95=null;
        Token otherlv_96=null;
        Token lv_x_prop_97_0=null;
        Token otherlv_98=null;
        Token lv_x_prop_99_0=null;
        Token otherlv_100=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token lv_iana_prop_103_0=null;
        Token otherlv_104=null;
        Token lv_iana_prop_105_0=null;
        Token otherlv_106=null;
        Token otherlv_107=null;
        Token lv_description_108_0=null;
        Token otherlv_109=null;
        Token lv_completed_110_0=null;
        Token otherlv_111=null;
        Token lv_priority_112_0=null;
        Token otherlv_113=null;
        Token lv_geo_114_0=null;
        Token otherlv_115=null;
        Token lv_location_116_0=null;
        Token otherlv_117=null;
        Token otherlv_119=null;
        Token otherlv_121=null;
        EObject lv_dtstamp_4_0 = null;

        EObject lv_due_8_0 = null;

        EObject lv_dtstart_10_0 = null;

        AntlrDatatypeRuleToken lv_class_12_0 = null;

        EObject lv_alarmc_118_0 = null;

        EObject lv_alarmc_120_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2859:2: ( (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' ) )
            // InternalMyDsl.g:2860:2: (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' )
            {
            // InternalMyDsl.g:2860:2: (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' )
            // InternalMyDsl.g:2861:3: otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getToDoCAccess().getToDoCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2869:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:2870:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:2870:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:2871:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2874:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:2875:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:2875:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=33;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:2876:4: ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2876:4: ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:2877:5: {...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2877:102: ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:2878:6: ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2881:9: ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:2881:10: {...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:2881:19: (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:2881:20: otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_16); 

            	    									newLeafNode(otherlv_3, grammarAccess.getToDoCAccess().getDtstampKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:2885:9: ( (lv_dtstamp_4_0= ruleDateT ) )
            	    // InternalMyDsl.g:2886:10: (lv_dtstamp_4_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:2886:10: (lv_dtstamp_4_0= ruleDateT )
            	    // InternalMyDsl.g:2887:11: lv_dtstamp_4_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getToDoCAccess().getDtstampDateTParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_dtstamp_4_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtstamp",
            	    												lv_dtstamp_4_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2911:5: {...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2911:102: ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2912:6: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2915:9: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2915:10: {...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:2915:19: (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2915:20: otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getToDoCAccess().getIdentifiantKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:2919:9: ( (lv_uid_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:2920:10: (lv_uid_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2920:10: (lv_uid_6_0= RULE_STR )
            	    // InternalMyDsl.g:2921:11: lv_uid_6_0= RULE_STR
            	    {
            	    lv_uid_6_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_uid_6_0, grammarAccess.getToDoCAccess().getUidSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_6_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2943:4: ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2943:4: ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:2944:5: {...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2944:102: ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:2945:6: ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2948:9: ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:2948:10: {...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:2948:19: (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:2948:20: otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) )
            	    {
            	    otherlv_7=(Token)match(input,93,FOLLOW_16); 

            	    									newLeafNode(otherlv_7, grammarAccess.getToDoCAccess().getDueKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:2952:9: ( (lv_due_8_0= ruleDateT ) )
            	    // InternalMyDsl.g:2953:10: (lv_due_8_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:2953:10: (lv_due_8_0= ruleDateT )
            	    // InternalMyDsl.g:2954:11: lv_due_8_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getToDoCAccess().getDueDateTParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_due_8_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"due",
            	    												lv_due_8_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:2977:4: ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2977:4: ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:2978:5: {...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2978:102: ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:2979:6: ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2982:9: ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:2982:10: {...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:2982:19: (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:2982:20: otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) )
            	    {
            	    otherlv_9=(Token)match(input,48,FOLLOW_16); 

            	    									newLeafNode(otherlv_9, grammarAccess.getToDoCAccess().getDateKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:2986:9: ( (lv_dtstart_10_0= ruleDateT ) )
            	    // InternalMyDsl.g:2987:10: (lv_dtstart_10_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:2987:10: (lv_dtstart_10_0= ruleDateT )
            	    // InternalMyDsl.g:2988:11: lv_dtstart_10_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getToDoCAccess().getDtstartDateTParserRuleCall_2_3_1_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_dtstart_10_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtstart",
            	    												lv_dtstart_10_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:3011:4: ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3011:4: ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:3012:5: {...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:3012:102: ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:3013:6: ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:3016:9: ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:3016:10: {...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3016:19: (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:3016:20: otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) )
            	    {
            	    otherlv_11=(Token)match(input,66,FOLLOW_20); 

            	    									newLeafNode(otherlv_11, grammarAccess.getToDoCAccess().getClasseKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:3020:9: ( (lv_class_12_0= ruleClassification ) )
            	    // InternalMyDsl.g:3021:10: (lv_class_12_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:3021:10: (lv_class_12_0= ruleClassification )
            	    // InternalMyDsl.g:3022:11: lv_class_12_0= ruleClassification
            	    {

            	    											newCompositeNode(grammarAccess.getToDoCAccess().getClassClassificationParserRuleCall_2_4_1_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_class_12_0=ruleClassification();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"class",
            	    												lv_class_12_0,
            	    												"xCalendar.MyDsl.Classification");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:3045:4: ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3045:4: ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3046:5: {...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:3046:102: ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3047:6: ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:3050:9: ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3050:10: {...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3050:19: (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3050:20: otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) )
            	    {
            	    otherlv_13=(Token)match(input,94,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getToDoCAccess().getCreeLeKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:3054:9: ( (lv_created_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:3055:10: (lv_created_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3055:10: (lv_created_14_0= RULE_STR )
            	    // InternalMyDsl.g:3056:11: lv_created_14_0= RULE_STR
            	    {
            	    lv_created_14_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_created_14_0, grammarAccess.getToDoCAccess().getCreatedSTRTerminalRuleCall_2_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"created",
            	    												lv_created_14_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:3078:4: ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3078:4: ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3079:5: {...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:3079:102: ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3080:6: ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:3083:9: ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3083:10: {...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3083:19: (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3083:20: otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) )
            	    {
            	    otherlv_15=(Token)match(input,95,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getToDoCAccess().getLast_modKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:3087:9: ( (lv_last_mod_16_0= RULE_STR ) )
            	    // InternalMyDsl.g:3088:10: (lv_last_mod_16_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3088:10: (lv_last_mod_16_0= RULE_STR )
            	    // InternalMyDsl.g:3089:11: lv_last_mod_16_0= RULE_STR
            	    {
            	    lv_last_mod_16_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_last_mod_16_0, grammarAccess.getToDoCAccess().getLast_modSTRTerminalRuleCall_2_6_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"last_mod",
            	    												lv_last_mod_16_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:3111:4: ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3111:4: ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3112:5: {...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:3112:102: ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3113:6: ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:3116:9: ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3116:10: {...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3116:19: (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3116:20: otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) )
            	    {
            	    otherlv_17=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getToDoCAccess().getOrganisateurKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:3120:9: ( (lv_organizer_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:3121:10: (lv_organizer_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3121:10: (lv_organizer_18_0= RULE_STR )
            	    // InternalMyDsl.g:3122:11: lv_organizer_18_0= RULE_STR
            	    {
            	    lv_organizer_18_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_organizer_18_0, grammarAccess.getToDoCAccess().getOrganizerSTRTerminalRuleCall_2_7_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"organizer",
            	    												lv_organizer_18_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:3144:4: ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3144:4: ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3145:5: {...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:3145:102: ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3146:6: ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:3149:9: ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3149:10: {...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3149:19: (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3149:20: otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) )
            	    {
            	    otherlv_19=(Token)match(input,96,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getToDoCAccess().getSeqKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:3153:9: ( (lv_seq_20_0= RULE_STR ) )
            	    // InternalMyDsl.g:3154:10: (lv_seq_20_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3154:10: (lv_seq_20_0= RULE_STR )
            	    // InternalMyDsl.g:3155:11: lv_seq_20_0= RULE_STR
            	    {
            	    lv_seq_20_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_seq_20_0, grammarAccess.getToDoCAccess().getSeqSTRTerminalRuleCall_2_8_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"seq",
            	    												lv_seq_20_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:3177:4: ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3177:4: ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3178:5: {...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:3178:102: ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3179:6: ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:3182:9: ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3182:10: {...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3182:19: (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3182:20: otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) )
            	    {
            	    otherlv_21=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getToDoCAccess().getStatusKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:3186:9: ( (lv_status_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:3187:10: (lv_status_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3187:10: (lv_status_22_0= RULE_STR )
            	    // InternalMyDsl.g:3188:11: lv_status_22_0= RULE_STR
            	    {
            	    lv_status_22_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_status_22_0, grammarAccess.getToDoCAccess().getStatusSTRTerminalRuleCall_2_9_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"status",
            	    												lv_status_22_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:3210:4: ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3210:4: ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3211:5: {...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:3211:103: ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3212:6: ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:3215:9: ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3215:10: {...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3215:19: (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3215:20: otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) )
            	    {
            	    otherlv_23=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getToDoCAccess().getObjetKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:3219:9: ( (lv_summary_24_0= RULE_STR ) )
            	    // InternalMyDsl.g:3220:10: (lv_summary_24_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3220:10: (lv_summary_24_0= RULE_STR )
            	    // InternalMyDsl.g:3221:11: lv_summary_24_0= RULE_STR
            	    {
            	    lv_summary_24_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_summary_24_0, grammarAccess.getToDoCAccess().getSummarySTRTerminalRuleCall_2_10_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_24_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:3243:4: ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3243:4: ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3244:5: {...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:3244:103: ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3245:6: ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:3248:9: ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3248:10: {...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3248:19: (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3248:20: otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) )
            	    {
            	    otherlv_25=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getToDoCAccess().getURLKeyword_2_11_0());
            	    								
            	    // InternalMyDsl.g:3252:9: ( (lv_url_26_0= RULE_STR ) )
            	    // InternalMyDsl.g:3253:10: (lv_url_26_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3253:10: (lv_url_26_0= RULE_STR )
            	    // InternalMyDsl.g:3254:11: lv_url_26_0= RULE_STR
            	    {
            	    lv_url_26_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_url_26_0, grammarAccess.getToDoCAccess().getUrlSTRTerminalRuleCall_2_11_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_26_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:3276:4: ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3276:4: ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3277:5: {...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:3277:103: ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3278:6: ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:3281:9: ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3281:10: {...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3281:19: (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3281:20: otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) )
            	    {
            	    otherlv_27=(Token)match(input,97,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getToDoCAccess().getRecuridKeyword_2_12_0());
            	    								
            	    // InternalMyDsl.g:3285:9: ( (lv_recurid_28_0= RULE_STR ) )
            	    // InternalMyDsl.g:3286:10: (lv_recurid_28_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3286:10: (lv_recurid_28_0= RULE_STR )
            	    // InternalMyDsl.g:3287:11: lv_recurid_28_0= RULE_STR
            	    {
            	    lv_recurid_28_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_recurid_28_0, grammarAccess.getToDoCAccess().getRecuridSTRTerminalRuleCall_2_12_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"recurid",
            	    												lv_recurid_28_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:3309:4: ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3309:4: ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) )
            	    // InternalMyDsl.g:3310:5: {...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:3310:103: ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) )
            	    // InternalMyDsl.g:3311:6: ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:3314:9: ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) )
            	    // InternalMyDsl.g:3314:10: {...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3314:19: (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' )
            	    // InternalMyDsl.g:3314:20: otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}'
            	    {
            	    otherlv_29=(Token)match(input,98,FOLLOW_12); 

            	    									newLeafNode(otherlv_29, grammarAccess.getToDoCAccess().getRruleKeyword_2_13_0());
            	    								
            	    otherlv_30=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_13_1());
            	    								
            	    // InternalMyDsl.g:3322:9: ( (lv_rrule_31_0= RULE_STR ) )
            	    // InternalMyDsl.g:3323:10: (lv_rrule_31_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3323:10: (lv_rrule_31_0= RULE_STR )
            	    // InternalMyDsl.g:3324:11: lv_rrule_31_0= RULE_STR
            	    {
            	    lv_rrule_31_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rrule_31_0, grammarAccess.getToDoCAccess().getRruleSTRTerminalRuleCall_2_13_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rrule",
            	    												lv_rrule_31_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3340:9: (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==54) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3341:10: otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_32, grammarAccess.getToDoCAccess().getCommaKeyword_2_13_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3345:10: ( (lv_rrule_33_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3346:11: (lv_rrule_33_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3346:11: (lv_rrule_33_0= RULE_STR )
            	    	    // InternalMyDsl.g:3347:12: lv_rrule_33_0= RULE_STR
            	    	    {
            	    	    lv_rrule_33_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rrule_33_0, grammarAccess.getToDoCAccess().getRruleSTRTerminalRuleCall_2_13_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rrule",
            	    	    													lv_rrule_33_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    otherlv_34=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_34, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_13_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalMyDsl.g:3374:4: ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3374:4: ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) )
            	    // InternalMyDsl.g:3375:5: {...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:3375:103: ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) )
            	    // InternalMyDsl.g:3376:6: ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:3379:9: ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) )
            	    // InternalMyDsl.g:3379:10: {...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3379:19: (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' )
            	    // InternalMyDsl.g:3379:20: otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}'
            	    {
            	    otherlv_35=(Token)match(input,90,FOLLOW_12); 

            	    									newLeafNode(otherlv_35, grammarAccess.getToDoCAccess().getAttachementsKeyword_2_14_0());
            	    								
            	    otherlv_36=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_36, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_14_1());
            	    								
            	    // InternalMyDsl.g:3387:9: ( (lv_attach_37_0= RULE_STR ) )
            	    // InternalMyDsl.g:3388:10: (lv_attach_37_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3388:10: (lv_attach_37_0= RULE_STR )
            	    // InternalMyDsl.g:3389:11: lv_attach_37_0= RULE_STR
            	    {
            	    lv_attach_37_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attach_37_0, grammarAccess.getToDoCAccess().getAttachSTRTerminalRuleCall_2_14_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attach",
            	    												lv_attach_37_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3405:9: (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==54) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3406:10: otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_38=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_38, grammarAccess.getToDoCAccess().getCommaKeyword_2_14_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3410:10: ( (lv_attach_39_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3411:11: (lv_attach_39_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3411:11: (lv_attach_39_0= RULE_STR )
            	    	    // InternalMyDsl.g:3412:12: lv_attach_39_0= RULE_STR
            	    	    {
            	    	    lv_attach_39_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attach_39_0, grammarAccess.getToDoCAccess().getAttachSTRTerminalRuleCall_2_14_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attach",
            	    	    													lv_attach_39_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    otherlv_40=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_40, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_14_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalMyDsl.g:3439:4: ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3439:4: ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) )
            	    // InternalMyDsl.g:3440:5: {...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:3440:103: ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) )
            	    // InternalMyDsl.g:3441:6: ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:3444:9: ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) )
            	    // InternalMyDsl.g:3444:10: {...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3444:19: (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' )
            	    // InternalMyDsl.g:3444:20: otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}'
            	    {
            	    otherlv_41=(Token)match(input,89,FOLLOW_12); 

            	    									newLeafNode(otherlv_41, grammarAccess.getToDoCAccess().getInvitesKeyword_2_15_0());
            	    								
            	    otherlv_42=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_15_1());
            	    								
            	    // InternalMyDsl.g:3452:9: ( (lv_attendee_43_0= RULE_STR ) )
            	    // InternalMyDsl.g:3453:10: (lv_attendee_43_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3453:10: (lv_attendee_43_0= RULE_STR )
            	    // InternalMyDsl.g:3454:11: lv_attendee_43_0= RULE_STR
            	    {
            	    lv_attendee_43_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attendee_43_0, grammarAccess.getToDoCAccess().getAttendeeSTRTerminalRuleCall_2_15_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attendee",
            	    												lv_attendee_43_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3470:9: (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==54) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3471:10: otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_44=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_44, grammarAccess.getToDoCAccess().getCommaKeyword_2_15_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3475:10: ( (lv_attendee_45_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3476:11: (lv_attendee_45_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3476:11: (lv_attendee_45_0= RULE_STR )
            	    	    // InternalMyDsl.g:3477:12: lv_attendee_45_0= RULE_STR
            	    	    {
            	    	    lv_attendee_45_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attendee_45_0, grammarAccess.getToDoCAccess().getAttendeeSTRTerminalRuleCall_2_15_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attendee",
            	    	    													lv_attendee_45_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	    otherlv_46=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_46, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_15_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalMyDsl.g:3504:4: ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3504:4: ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) )
            	    // InternalMyDsl.g:3505:5: {...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:3505:103: ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) )
            	    // InternalMyDsl.g:3506:6: ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:3509:9: ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) )
            	    // InternalMyDsl.g:3509:10: {...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3509:19: (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' )
            	    // InternalMyDsl.g:3509:20: otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}'
            	    {
            	    otherlv_47=(Token)match(input,99,FOLLOW_12); 

            	    									newLeafNode(otherlv_47, grammarAccess.getToDoCAccess().getCategoriesKeyword_2_16_0());
            	    								
            	    otherlv_48=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_48, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_16_1());
            	    								
            	    // InternalMyDsl.g:3517:9: ( (lv_categories_49_0= RULE_STR ) )
            	    // InternalMyDsl.g:3518:10: (lv_categories_49_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3518:10: (lv_categories_49_0= RULE_STR )
            	    // InternalMyDsl.g:3519:11: lv_categories_49_0= RULE_STR
            	    {
            	    lv_categories_49_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_categories_49_0, grammarAccess.getToDoCAccess().getCategoriesSTRTerminalRuleCall_2_16_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"categories",
            	    												lv_categories_49_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3535:9: (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==54) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3536:10: otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_50=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_50, grammarAccess.getToDoCAccess().getCommaKeyword_2_16_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3540:10: ( (lv_categories_51_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3541:11: (lv_categories_51_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3541:11: (lv_categories_51_0= RULE_STR )
            	    	    // InternalMyDsl.g:3542:12: lv_categories_51_0= RULE_STR
            	    	    {
            	    	    lv_categories_51_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_categories_51_0, grammarAccess.getToDoCAccess().getCategoriesSTRTerminalRuleCall_2_16_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"categories",
            	    	    													lv_categories_51_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    otherlv_52=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_52, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_16_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalMyDsl.g:3569:4: ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3569:4: ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) )
            	    // InternalMyDsl.g:3570:5: {...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:3570:103: ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) )
            	    // InternalMyDsl.g:3571:6: ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:3574:9: ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) )
            	    // InternalMyDsl.g:3574:10: {...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3574:19: (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' )
            	    // InternalMyDsl.g:3574:20: otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}'
            	    {
            	    otherlv_53=(Token)match(input,100,FOLLOW_12); 

            	    									newLeafNode(otherlv_53, grammarAccess.getToDoCAccess().getCommentaireKeyword_2_17_0());
            	    								
            	    otherlv_54=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_54, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_17_1());
            	    								
            	    // InternalMyDsl.g:3582:9: ( (lv_comment_55_0= RULE_STR ) )
            	    // InternalMyDsl.g:3583:10: (lv_comment_55_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3583:10: (lv_comment_55_0= RULE_STR )
            	    // InternalMyDsl.g:3584:11: lv_comment_55_0= RULE_STR
            	    {
            	    lv_comment_55_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_comment_55_0, grammarAccess.getToDoCAccess().getCommentSTRTerminalRuleCall_2_17_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"comment",
            	    												lv_comment_55_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3600:9: (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==54) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3601:10: otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_56=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_56, grammarAccess.getToDoCAccess().getCommaKeyword_2_17_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3605:10: ( (lv_comment_57_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3606:11: (lv_comment_57_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3606:11: (lv_comment_57_0= RULE_STR )
            	    	    // InternalMyDsl.g:3607:12: lv_comment_57_0= RULE_STR
            	    	    {
            	    	    lv_comment_57_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_comment_57_0, grammarAccess.getToDoCAccess().getCommentSTRTerminalRuleCall_2_17_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"comment",
            	    	    													lv_comment_57_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    otherlv_58=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_58, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_17_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalMyDsl.g:3634:4: ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3634:4: ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) )
            	    // InternalMyDsl.g:3635:5: {...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:3635:103: ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) )
            	    // InternalMyDsl.g:3636:6: ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:3639:9: ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) )
            	    // InternalMyDsl.g:3639:10: {...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3639:19: (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' )
            	    // InternalMyDsl.g:3639:20: otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}'
            	    {
            	    otherlv_59=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_59, grammarAccess.getToDoCAccess().getContactKeyword_2_18_0());
            	    								
            	    otherlv_60=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_60, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_18_1());
            	    								
            	    // InternalMyDsl.g:3647:9: ( (lv_contact_61_0= RULE_STR ) )
            	    // InternalMyDsl.g:3648:10: (lv_contact_61_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3648:10: (lv_contact_61_0= RULE_STR )
            	    // InternalMyDsl.g:3649:11: lv_contact_61_0= RULE_STR
            	    {
            	    lv_contact_61_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_contact_61_0, grammarAccess.getToDoCAccess().getContactSTRTerminalRuleCall_2_18_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"contact",
            	    												lv_contact_61_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3665:9: (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==54) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3666:10: otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_62=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_62, grammarAccess.getToDoCAccess().getCommaKeyword_2_18_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3670:10: ( (lv_contact_63_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3671:11: (lv_contact_63_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3671:11: (lv_contact_63_0= RULE_STR )
            	    	    // InternalMyDsl.g:3672:12: lv_contact_63_0= RULE_STR
            	    	    {
            	    	    lv_contact_63_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_contact_63_0, grammarAccess.getToDoCAccess().getContactSTRTerminalRuleCall_2_18_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"contact",
            	    	    													lv_contact_63_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);

            	    otherlv_64=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_64, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_18_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalMyDsl.g:3699:4: ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3699:4: ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) )
            	    // InternalMyDsl.g:3700:5: {...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19)");
            	    }
            	    // InternalMyDsl.g:3700:103: ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) )
            	    // InternalMyDsl.g:3701:6: ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19);
            	    					
            	    // InternalMyDsl.g:3704:9: ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) )
            	    // InternalMyDsl.g:3704:10: {...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3704:19: (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' )
            	    // InternalMyDsl.g:3704:20: otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}'
            	    {
            	    otherlv_65=(Token)match(input,102,FOLLOW_12); 

            	    									newLeafNode(otherlv_65, grammarAccess.getToDoCAccess().getExdateKeyword_2_19_0());
            	    								
            	    otherlv_66=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_66, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_19_1());
            	    								
            	    // InternalMyDsl.g:3712:9: ( (lv_exdate_67_0= RULE_STR ) )
            	    // InternalMyDsl.g:3713:10: (lv_exdate_67_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3713:10: (lv_exdate_67_0= RULE_STR )
            	    // InternalMyDsl.g:3714:11: lv_exdate_67_0= RULE_STR
            	    {
            	    lv_exdate_67_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_exdate_67_0, grammarAccess.getToDoCAccess().getExdateSTRTerminalRuleCall_2_19_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"exdate",
            	    												lv_exdate_67_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3730:9: (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==54) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3731:10: otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_68=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_68, grammarAccess.getToDoCAccess().getCommaKeyword_2_19_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3735:10: ( (lv_exdate_69_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3736:11: (lv_exdate_69_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3736:11: (lv_exdate_69_0= RULE_STR )
            	    	    // InternalMyDsl.g:3737:12: lv_exdate_69_0= RULE_STR
            	    	    {
            	    	    lv_exdate_69_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_exdate_69_0, grammarAccess.getToDoCAccess().getExdateSTRTerminalRuleCall_2_19_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"exdate",
            	    	    													lv_exdate_69_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    otherlv_70=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_70, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_19_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalMyDsl.g:3764:4: ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3764:4: ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) )
            	    // InternalMyDsl.g:3765:5: {...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20)");
            	    }
            	    // InternalMyDsl.g:3765:103: ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) )
            	    // InternalMyDsl.g:3766:6: ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20);
            	    					
            	    // InternalMyDsl.g:3769:9: ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) )
            	    // InternalMyDsl.g:3769:10: {...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3769:19: (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' )
            	    // InternalMyDsl.g:3769:20: otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}'
            	    {
            	    otherlv_71=(Token)match(input,103,FOLLOW_12); 

            	    									newLeafNode(otherlv_71, grammarAccess.getToDoCAccess().getRstatusKeyword_2_20_0());
            	    								
            	    otherlv_72=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_72, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_20_1());
            	    								
            	    // InternalMyDsl.g:3777:9: ( (lv_rstatus_73_0= RULE_STR ) )
            	    // InternalMyDsl.g:3778:10: (lv_rstatus_73_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3778:10: (lv_rstatus_73_0= RULE_STR )
            	    // InternalMyDsl.g:3779:11: lv_rstatus_73_0= RULE_STR
            	    {
            	    lv_rstatus_73_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rstatus_73_0, grammarAccess.getToDoCAccess().getRstatusSTRTerminalRuleCall_2_20_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rstatus",
            	    												lv_rstatus_73_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3795:9: (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==54) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3796:10: otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_74=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_74, grammarAccess.getToDoCAccess().getCommaKeyword_2_20_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3800:10: ( (lv_rstatus_75_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3801:11: (lv_rstatus_75_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3801:11: (lv_rstatus_75_0= RULE_STR )
            	    	    // InternalMyDsl.g:3802:12: lv_rstatus_75_0= RULE_STR
            	    	    {
            	    	    lv_rstatus_75_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rstatus_75_0, grammarAccess.getToDoCAccess().getRstatusSTRTerminalRuleCall_2_20_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rstatus",
            	    	    													lv_rstatus_75_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);

            	    otherlv_76=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_76, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_20_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalMyDsl.g:3829:4: ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3829:4: ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) )
            	    // InternalMyDsl.g:3830:5: {...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21)");
            	    }
            	    // InternalMyDsl.g:3830:103: ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) )
            	    // InternalMyDsl.g:3831:6: ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21);
            	    					
            	    // InternalMyDsl.g:3834:9: ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) )
            	    // InternalMyDsl.g:3834:10: {...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3834:19: (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' )
            	    // InternalMyDsl.g:3834:20: otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}'
            	    {
            	    otherlv_77=(Token)match(input,104,FOLLOW_12); 

            	    									newLeafNode(otherlv_77, grammarAccess.getToDoCAccess().getRelierAKeyword_2_21_0());
            	    								
            	    otherlv_78=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_78, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_21_1());
            	    								
            	    // InternalMyDsl.g:3842:9: ( (lv_related_79_0= RULE_STR ) )
            	    // InternalMyDsl.g:3843:10: (lv_related_79_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3843:10: (lv_related_79_0= RULE_STR )
            	    // InternalMyDsl.g:3844:11: lv_related_79_0= RULE_STR
            	    {
            	    lv_related_79_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_related_79_0, grammarAccess.getToDoCAccess().getRelatedSTRTerminalRuleCall_2_21_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"related",
            	    												lv_related_79_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3860:9: (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==54) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3861:10: otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_80=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_80, grammarAccess.getToDoCAccess().getCommaKeyword_2_21_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3865:10: ( (lv_related_81_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3866:11: (lv_related_81_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3866:11: (lv_related_81_0= RULE_STR )
            	    	    // InternalMyDsl.g:3867:12: lv_related_81_0= RULE_STR
            	    	    {
            	    	    lv_related_81_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_related_81_0, grammarAccess.getToDoCAccess().getRelatedSTRTerminalRuleCall_2_21_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"related",
            	    	    													lv_related_81_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    otherlv_82=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_82, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_21_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalMyDsl.g:3894:4: ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3894:4: ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) )
            	    // InternalMyDsl.g:3895:5: {...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22)");
            	    }
            	    // InternalMyDsl.g:3895:103: ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) )
            	    // InternalMyDsl.g:3896:6: ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22);
            	    					
            	    // InternalMyDsl.g:3899:9: ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) )
            	    // InternalMyDsl.g:3899:10: {...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3899:19: (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' )
            	    // InternalMyDsl.g:3899:20: otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}'
            	    {
            	    otherlv_83=(Token)match(input,105,FOLLOW_12); 

            	    									newLeafNode(otherlv_83, grammarAccess.getToDoCAccess().getResourcesKeyword_2_22_0());
            	    								
            	    otherlv_84=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_84, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_22_1());
            	    								
            	    // InternalMyDsl.g:3907:9: ( (lv_resources_85_0= RULE_STR ) )
            	    // InternalMyDsl.g:3908:10: (lv_resources_85_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3908:10: (lv_resources_85_0= RULE_STR )
            	    // InternalMyDsl.g:3909:11: lv_resources_85_0= RULE_STR
            	    {
            	    lv_resources_85_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_resources_85_0, grammarAccess.getToDoCAccess().getResourcesSTRTerminalRuleCall_2_22_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"resources",
            	    												lv_resources_85_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3925:9: (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==54) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3926:10: otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_86=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_86, grammarAccess.getToDoCAccess().getCommaKeyword_2_22_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3930:10: ( (lv_resources_87_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3931:11: (lv_resources_87_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3931:11: (lv_resources_87_0= RULE_STR )
            	    	    // InternalMyDsl.g:3932:12: lv_resources_87_0= RULE_STR
            	    	    {
            	    	    lv_resources_87_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_resources_87_0, grammarAccess.getToDoCAccess().getResourcesSTRTerminalRuleCall_2_22_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"resources",
            	    	    													lv_resources_87_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);

            	    otherlv_88=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_88, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_22_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalMyDsl.g:3959:4: ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3959:4: ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) )
            	    // InternalMyDsl.g:3960:5: {...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23)");
            	    }
            	    // InternalMyDsl.g:3960:103: ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) )
            	    // InternalMyDsl.g:3961:6: ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23);
            	    					
            	    // InternalMyDsl.g:3964:9: ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) )
            	    // InternalMyDsl.g:3964:10: {...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3964:19: (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' )
            	    // InternalMyDsl.g:3964:20: otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}'
            	    {
            	    otherlv_89=(Token)match(input,106,FOLLOW_12); 

            	    									newLeafNode(otherlv_89, grammarAccess.getToDoCAccess().getRdateKeyword_2_23_0());
            	    								
            	    otherlv_90=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_90, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_23_1());
            	    								
            	    // InternalMyDsl.g:3972:9: ( (lv_rdate_91_0= RULE_STR ) )
            	    // InternalMyDsl.g:3973:10: (lv_rdate_91_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3973:10: (lv_rdate_91_0= RULE_STR )
            	    // InternalMyDsl.g:3974:11: lv_rdate_91_0= RULE_STR
            	    {
            	    lv_rdate_91_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rdate_91_0, grammarAccess.getToDoCAccess().getRdateSTRTerminalRuleCall_2_23_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rdate",
            	    												lv_rdate_91_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:3990:9: (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==54) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3991:10: otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_92=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_92, grammarAccess.getToDoCAccess().getCommaKeyword_2_23_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3995:10: ( (lv_rdate_93_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3996:11: (lv_rdate_93_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3996:11: (lv_rdate_93_0= RULE_STR )
            	    	    // InternalMyDsl.g:3997:12: lv_rdate_93_0= RULE_STR
            	    	    {
            	    	    lv_rdate_93_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rdate_93_0, grammarAccess.getToDoCAccess().getRdateSTRTerminalRuleCall_2_23_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rdate",
            	    	    													lv_rdate_93_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    otherlv_94=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_94, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_23_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalMyDsl.g:4024:4: ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4024:4: ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) )
            	    // InternalMyDsl.g:4025:5: {...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24)");
            	    }
            	    // InternalMyDsl.g:4025:103: ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) )
            	    // InternalMyDsl.g:4026:6: ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24);
            	    					
            	    // InternalMyDsl.g:4029:9: ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) )
            	    // InternalMyDsl.g:4029:10: {...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4029:19: (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' )
            	    // InternalMyDsl.g:4029:20: otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}'
            	    {
            	    otherlv_95=(Token)match(input,107,FOLLOW_12); 

            	    									newLeafNode(otherlv_95, grammarAccess.getToDoCAccess().getX_propKeyword_2_24_0());
            	    								
            	    otherlv_96=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_96, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_24_1());
            	    								
            	    // InternalMyDsl.g:4037:9: ( (lv_x_prop_97_0= RULE_STR ) )
            	    // InternalMyDsl.g:4038:10: (lv_x_prop_97_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4038:10: (lv_x_prop_97_0= RULE_STR )
            	    // InternalMyDsl.g:4039:11: lv_x_prop_97_0= RULE_STR
            	    {
            	    lv_x_prop_97_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_x_prop_97_0, grammarAccess.getToDoCAccess().getX_propSTRTerminalRuleCall_2_24_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"x_prop",
            	    												lv_x_prop_97_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4055:9: (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==54) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4056:10: otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_98=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_98, grammarAccess.getToDoCAccess().getCommaKeyword_2_24_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4060:10: ( (lv_x_prop_99_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4061:11: (lv_x_prop_99_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4061:11: (lv_x_prop_99_0= RULE_STR )
            	    	    // InternalMyDsl.g:4062:12: lv_x_prop_99_0= RULE_STR
            	    	    {
            	    	    lv_x_prop_99_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_x_prop_99_0, grammarAccess.getToDoCAccess().getX_propSTRTerminalRuleCall_2_24_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"x_prop",
            	    	    													lv_x_prop_99_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    otherlv_100=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_100, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_24_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // InternalMyDsl.g:4089:4: ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4089:4: ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) )
            	    // InternalMyDsl.g:4090:5: {...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25)");
            	    }
            	    // InternalMyDsl.g:4090:103: ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) )
            	    // InternalMyDsl.g:4091:6: ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25);
            	    					
            	    // InternalMyDsl.g:4094:9: ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) )
            	    // InternalMyDsl.g:4094:10: {...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4094:19: (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' )
            	    // InternalMyDsl.g:4094:20: otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}'
            	    {
            	    otherlv_101=(Token)match(input,108,FOLLOW_12); 

            	    									newLeafNode(otherlv_101, grammarAccess.getToDoCAccess().getIana_propKeyword_2_25_0());
            	    								
            	    otherlv_102=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_102, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_25_1());
            	    								
            	    // InternalMyDsl.g:4102:9: ( (lv_iana_prop_103_0= RULE_STR ) )
            	    // InternalMyDsl.g:4103:10: (lv_iana_prop_103_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4103:10: (lv_iana_prop_103_0= RULE_STR )
            	    // InternalMyDsl.g:4104:11: lv_iana_prop_103_0= RULE_STR
            	    {
            	    lv_iana_prop_103_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_iana_prop_103_0, grammarAccess.getToDoCAccess().getIana_propSTRTerminalRuleCall_2_25_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"iana_prop",
            	    												lv_iana_prop_103_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4120:9: (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==54) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4121:10: otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_104=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_104, grammarAccess.getToDoCAccess().getCommaKeyword_2_25_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4125:10: ( (lv_iana_prop_105_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4126:11: (lv_iana_prop_105_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4126:11: (lv_iana_prop_105_0= RULE_STR )
            	    	    // InternalMyDsl.g:4127:12: lv_iana_prop_105_0= RULE_STR
            	    	    {
            	    	    lv_iana_prop_105_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_iana_prop_105_0, grammarAccess.getToDoCAccess().getIana_propSTRTerminalRuleCall_2_25_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"iana_prop",
            	    	    													lv_iana_prop_105_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);

            	    otherlv_106=(Token)match(input,46,FOLLOW_37); 

            	    									newLeafNode(otherlv_106, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_25_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // InternalMyDsl.g:4154:4: ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4154:4: ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4155:5: {...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26)");
            	    }
            	    // InternalMyDsl.g:4155:103: ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4156:6: ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26);
            	    					
            	    // InternalMyDsl.g:4159:9: ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4159:10: {...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4159:19: (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4159:20: otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) )
            	    {
            	    otherlv_107=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_107, grammarAccess.getToDoCAccess().getDescriptionKeyword_2_26_0());
            	    								
            	    // InternalMyDsl.g:4163:9: ( (lv_description_108_0= RULE_STR ) )
            	    // InternalMyDsl.g:4164:10: (lv_description_108_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4164:10: (lv_description_108_0= RULE_STR )
            	    // InternalMyDsl.g:4165:11: lv_description_108_0= RULE_STR
            	    {
            	    lv_description_108_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_description_108_0, grammarAccess.getToDoCAccess().getDescriptionSTRTerminalRuleCall_2_26_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_108_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 28 :
            	    // InternalMyDsl.g:4187:4: ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4187:4: ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4188:5: {...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27)");
            	    }
            	    // InternalMyDsl.g:4188:103: ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4189:6: ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27);
            	    					
            	    // InternalMyDsl.g:4192:9: ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4192:10: {...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4192:19: (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4192:20: otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) )
            	    {
            	    otherlv_109=(Token)match(input,109,FOLLOW_3); 

            	    									newLeafNode(otherlv_109, grammarAccess.getToDoCAccess().getCompleteeKeyword_2_27_0());
            	    								
            	    // InternalMyDsl.g:4196:9: ( (lv_completed_110_0= RULE_STR ) )
            	    // InternalMyDsl.g:4197:10: (lv_completed_110_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4197:10: (lv_completed_110_0= RULE_STR )
            	    // InternalMyDsl.g:4198:11: lv_completed_110_0= RULE_STR
            	    {
            	    lv_completed_110_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_completed_110_0, grammarAccess.getToDoCAccess().getCompletedSTRTerminalRuleCall_2_27_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"completed",
            	    												lv_completed_110_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 29 :
            	    // InternalMyDsl.g:4220:4: ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4220:4: ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4221:5: {...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28)");
            	    }
            	    // InternalMyDsl.g:4221:103: ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4222:6: ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28);
            	    					
            	    // InternalMyDsl.g:4225:9: ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4225:10: {...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4225:19: (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4225:20: otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) )
            	    {
            	    otherlv_111=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_111, grammarAccess.getToDoCAccess().getPrioriteKeyword_2_28_0());
            	    								
            	    // InternalMyDsl.g:4229:9: ( (lv_priority_112_0= RULE_STR ) )
            	    // InternalMyDsl.g:4230:10: (lv_priority_112_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4230:10: (lv_priority_112_0= RULE_STR )
            	    // InternalMyDsl.g:4231:11: lv_priority_112_0= RULE_STR
            	    {
            	    lv_priority_112_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_priority_112_0, grammarAccess.getToDoCAccess().getPrioritySTRTerminalRuleCall_2_28_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"priority",
            	    												lv_priority_112_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 30 :
            	    // InternalMyDsl.g:4253:4: ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4253:4: ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4254:5: {...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29)");
            	    }
            	    // InternalMyDsl.g:4254:103: ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4255:6: ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29);
            	    					
            	    // InternalMyDsl.g:4258:9: ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4258:10: {...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4258:19: (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4258:20: otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) )
            	    {
            	    otherlv_113=(Token)match(input,110,FOLLOW_3); 

            	    									newLeafNode(otherlv_113, grammarAccess.getToDoCAccess().getGeoKeyword_2_29_0());
            	    								
            	    // InternalMyDsl.g:4262:9: ( (lv_geo_114_0= RULE_STR ) )
            	    // InternalMyDsl.g:4263:10: (lv_geo_114_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4263:10: (lv_geo_114_0= RULE_STR )
            	    // InternalMyDsl.g:4264:11: lv_geo_114_0= RULE_STR
            	    {
            	    lv_geo_114_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_geo_114_0, grammarAccess.getToDoCAccess().getGeoSTRTerminalRuleCall_2_29_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"geo",
            	    												lv_geo_114_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 31 :
            	    // InternalMyDsl.g:4286:4: ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4286:4: ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4287:5: {...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30)");
            	    }
            	    // InternalMyDsl.g:4287:103: ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4288:6: ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30);
            	    					
            	    // InternalMyDsl.g:4291:9: ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4291:10: {...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4291:19: (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4291:20: otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) )
            	    {
            	    otherlv_115=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_115, grammarAccess.getToDoCAccess().getLieuKeyword_2_30_0());
            	    								
            	    // InternalMyDsl.g:4295:9: ( (lv_location_116_0= RULE_STR ) )
            	    // InternalMyDsl.g:4296:10: (lv_location_116_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4296:10: (lv_location_116_0= RULE_STR )
            	    // InternalMyDsl.g:4297:11: lv_location_116_0= RULE_STR
            	    {
            	    lv_location_116_0=(Token)match(input,RULE_STR,FOLLOW_37); 

            	    											newLeafNode(lv_location_116_0, grammarAccess.getToDoCAccess().getLocationSTRTerminalRuleCall_2_30_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getToDoCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"location",
            	    												lv_location_116_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 32 :
            	    // InternalMyDsl.g:4319:4: ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:4319:4: ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) )
            	    // InternalMyDsl.g:4320:5: {...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31)");
            	    }
            	    // InternalMyDsl.g:4320:103: ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) )
            	    // InternalMyDsl.g:4321:6: ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31);
            	    					
            	    // InternalMyDsl.g:4324:9: ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) )
            	    // InternalMyDsl.g:4324:10: {...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4324:19: (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* )
            	    // InternalMyDsl.g:4324:20: otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )*
            	    {
            	    otherlv_117=(Token)match(input,67,FOLLOW_13); 

            	    									newLeafNode(otherlv_117, grammarAccess.getToDoCAccess().getAlarmesKeyword_2_31_0());
            	    								
            	    // InternalMyDsl.g:4328:9: ( (lv_alarmc_118_0= ruleAlarmC ) )
            	    // InternalMyDsl.g:4329:10: (lv_alarmc_118_0= ruleAlarmC )
            	    {
            	    // InternalMyDsl.g:4329:10: (lv_alarmc_118_0= ruleAlarmC )
            	    // InternalMyDsl.g:4330:11: lv_alarmc_118_0= ruleAlarmC
            	    {

            	    											newCompositeNode(grammarAccess.getToDoCAccess().getAlarmcAlarmCParserRuleCall_2_31_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
            	    lv_alarmc_118_0=ruleAlarmC();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    											}
            	    											add(
            	    												current,
            	    												"alarmc",
            	    												lv_alarmc_118_0,
            	    												"xCalendar.MyDsl.AlarmC");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4347:9: (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==54) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4348:10: otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) )
            	    	    {
            	    	    otherlv_119=(Token)match(input,54,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_119, grammarAccess.getToDoCAccess().getCommaKeyword_2_31_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:4352:10: ( (lv_alarmc_120_0= ruleAlarmC ) )
            	    	    // InternalMyDsl.g:4353:11: (lv_alarmc_120_0= ruleAlarmC )
            	    	    {
            	    	    // InternalMyDsl.g:4353:11: (lv_alarmc_120_0= ruleAlarmC )
            	    	    // InternalMyDsl.g:4354:12: lv_alarmc_120_0= ruleAlarmC
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getToDoCAccess().getAlarmcAlarmCParserRuleCall_2_31_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_38);
            	    	    lv_alarmc_120_0=ruleAlarmC();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getToDoCRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"alarmc",
            	    	    													lv_alarmc_120_0,
            	    	    													"xCalendar.MyDsl.AlarmC");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop56;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getToDoCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canLeave(grammarAccess.getToDoCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_121=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_121, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleToDoC"


    // $ANTLR start "entryRuleJournalC"
    // InternalMyDsl.g:4394:1: entryRuleJournalC returns [EObject current=null] : iv_ruleJournalC= ruleJournalC EOF ;
    public final EObject entryRuleJournalC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalC = null;


        try {
            // InternalMyDsl.g:4394:49: (iv_ruleJournalC= ruleJournalC EOF )
            // InternalMyDsl.g:4395:2: iv_ruleJournalC= ruleJournalC EOF
            {
             newCompositeNode(grammarAccess.getJournalCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJournalC=ruleJournalC();

            state._fsp--;

             current =iv_ruleJournalC; 
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
    // $ANTLR end "entryRuleJournalC"


    // $ANTLR start "ruleJournalC"
    // InternalMyDsl.g:4401:1: ruleJournalC returns [EObject current=null] : (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' ) ;
    public final EObject ruleJournalC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_uid_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_created_10_0=null;
        Token otherlv_11=null;
        Token lv_last_mod_12_0=null;
        Token otherlv_13=null;
        Token lv_organizer_14_0=null;
        Token otherlv_15=null;
        Token lv_seq_16_0=null;
        Token otherlv_17=null;
        Token lv_status_18_0=null;
        Token otherlv_19=null;
        Token lv_summary_20_0=null;
        Token otherlv_21=null;
        Token lv_url_22_0=null;
        Token otherlv_23=null;
        Token lv_recurid_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_rrule_27_0=null;
        Token otherlv_28=null;
        Token lv_rrule_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_attach_33_0=null;
        Token otherlv_34=null;
        Token lv_attach_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_attendee_39_0=null;
        Token otherlv_40=null;
        Token lv_attendee_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token lv_categories_45_0=null;
        Token otherlv_46=null;
        Token lv_categories_47_0=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token lv_comment_51_0=null;
        Token otherlv_52=null;
        Token lv_comment_53_0=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token lv_contact_57_0=null;
        Token otherlv_58=null;
        Token lv_contact_59_0=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token lv_exdate_63_0=null;
        Token otherlv_64=null;
        Token lv_exdate_65_0=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token lv_rstatus_69_0=null;
        Token otherlv_70=null;
        Token lv_rstatus_71_0=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token lv_related_75_0=null;
        Token otherlv_76=null;
        Token lv_related_77_0=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token lv_resources_81_0=null;
        Token otherlv_82=null;
        Token lv_resources_83_0=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token lv_rdate_87_0=null;
        Token otherlv_88=null;
        Token lv_rdate_89_0=null;
        Token otherlv_90=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token lv_x_prop_93_0=null;
        Token otherlv_94=null;
        Token lv_x_prop_95_0=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_98=null;
        Token lv_iana_prop_99_0=null;
        Token otherlv_100=null;
        Token lv_iana_prop_101_0=null;
        Token otherlv_102=null;
        Token otherlv_103=null;
        Token lv_description_104_0=null;
        Token otherlv_105=null;
        EObject lv_dtstart_6_0 = null;

        AntlrDatatypeRuleToken lv_class_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4407:2: ( (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' ) )
            // InternalMyDsl.g:4408:2: (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' )
            {
            // InternalMyDsl.g:4408:2: (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' )
            // InternalMyDsl.g:4409:3: otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getJournalCAccess().getJournalCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:4417:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:4418:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:4418:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:4419:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4422:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:4423:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:4423:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=26;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // InternalMyDsl.g:4424:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4424:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4425:5: {...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4425:105: ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4426:6: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4429:9: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4429:10: {...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4429:19: (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4429:20: otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getJournalCAccess().getIdentifiantKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:4433:9: ( (lv_uid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:4434:10: (lv_uid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4434:10: (lv_uid_4_0= RULE_STR )
            	    // InternalMyDsl.g:4435:11: lv_uid_4_0= RULE_STR
            	    {
            	    lv_uid_4_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_uid_4_0, grammarAccess.getJournalCAccess().getUidSTRTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_4_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:4457:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4457:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:4458:5: {...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4458:105: ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:4459:6: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4462:9: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:4462:10: {...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4462:19: (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:4462:20: otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) )
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_16); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJournalCAccess().getDateKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:4466:9: ( (lv_dtstart_6_0= ruleDateT ) )
            	    // InternalMyDsl.g:4467:10: (lv_dtstart_6_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:4467:10: (lv_dtstart_6_0= ruleDateT )
            	    // InternalMyDsl.g:4468:11: lv_dtstart_6_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getJournalCAccess().getDtstartDateTParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_dtstart_6_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJournalCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtstart",
            	    												lv_dtstart_6_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:4491:4: ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4491:4: ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:4492:5: {...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4492:105: ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:4493:6: ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4496:9: ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:4496:10: {...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4496:19: (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:4496:20: otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) )
            	    {
            	    otherlv_7=(Token)match(input,66,FOLLOW_20); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJournalCAccess().getClasseKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:4500:9: ( (lv_class_8_0= ruleClassification ) )
            	    // InternalMyDsl.g:4501:10: (lv_class_8_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:4501:10: (lv_class_8_0= ruleClassification )
            	    // InternalMyDsl.g:4502:11: lv_class_8_0= ruleClassification
            	    {

            	    											newCompositeNode(grammarAccess.getJournalCAccess().getClassClassificationParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_class_8_0=ruleClassification();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJournalCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"class",
            	    												lv_class_8_0,
            	    												"xCalendar.MyDsl.Classification");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:4525:4: ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4525:4: ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4526:5: {...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:4526:105: ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4527:6: ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:4530:9: ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4530:10: {...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4530:19: (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4530:20: otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,94,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getJournalCAccess().getCreeLeKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:4534:9: ( (lv_created_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:4535:10: (lv_created_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4535:10: (lv_created_10_0= RULE_STR )
            	    // InternalMyDsl.g:4536:11: lv_created_10_0= RULE_STR
            	    {
            	    lv_created_10_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_created_10_0, grammarAccess.getJournalCAccess().getCreatedSTRTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"created",
            	    												lv_created_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:4558:4: ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4558:4: ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4559:5: {...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:4559:105: ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4560:6: ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:4563:9: ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4563:10: {...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4563:19: (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4563:20: otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,95,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJournalCAccess().getLast_modKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:4567:9: ( (lv_last_mod_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:4568:10: (lv_last_mod_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4568:10: (lv_last_mod_12_0= RULE_STR )
            	    // InternalMyDsl.g:4569:11: lv_last_mod_12_0= RULE_STR
            	    {
            	    lv_last_mod_12_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_last_mod_12_0, grammarAccess.getJournalCAccess().getLast_modSTRTerminalRuleCall_2_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"last_mod",
            	    												lv_last_mod_12_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:4591:4: ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4591:4: ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4592:5: {...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:4592:105: ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4593:6: ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:4596:9: ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4596:10: {...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4596:19: (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4596:20: otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) )
            	    {
            	    otherlv_13=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getJournalCAccess().getOrganisateurKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:4600:9: ( (lv_organizer_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:4601:10: (lv_organizer_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4601:10: (lv_organizer_14_0= RULE_STR )
            	    // InternalMyDsl.g:4602:11: lv_organizer_14_0= RULE_STR
            	    {
            	    lv_organizer_14_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_organizer_14_0, grammarAccess.getJournalCAccess().getOrganizerSTRTerminalRuleCall_2_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"organizer",
            	    												lv_organizer_14_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:4624:4: ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4624:4: ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4625:5: {...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:4625:105: ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4626:6: ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:4629:9: ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4629:10: {...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4629:19: (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4629:20: otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) )
            	    {
            	    otherlv_15=(Token)match(input,96,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getJournalCAccess().getSeqKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:4633:9: ( (lv_seq_16_0= RULE_STR ) )
            	    // InternalMyDsl.g:4634:10: (lv_seq_16_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4634:10: (lv_seq_16_0= RULE_STR )
            	    // InternalMyDsl.g:4635:11: lv_seq_16_0= RULE_STR
            	    {
            	    lv_seq_16_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_seq_16_0, grammarAccess.getJournalCAccess().getSeqSTRTerminalRuleCall_2_6_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"seq",
            	    												lv_seq_16_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:4657:4: ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4657:4: ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4658:5: {...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:4658:105: ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4659:6: ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:4662:9: ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4662:10: {...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4662:19: (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4662:20: otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) )
            	    {
            	    otherlv_17=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getJournalCAccess().getStatusKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:4666:9: ( (lv_status_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:4667:10: (lv_status_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4667:10: (lv_status_18_0= RULE_STR )
            	    // InternalMyDsl.g:4668:11: lv_status_18_0= RULE_STR
            	    {
            	    lv_status_18_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_status_18_0, grammarAccess.getJournalCAccess().getStatusSTRTerminalRuleCall_2_7_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"status",
            	    												lv_status_18_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:4690:4: ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4690:4: ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4691:5: {...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:4691:105: ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4692:6: ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:4695:9: ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4695:10: {...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4695:19: (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4695:20: otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) )
            	    {
            	    otherlv_19=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getJournalCAccess().getObjetKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:4699:9: ( (lv_summary_20_0= RULE_STR ) )
            	    // InternalMyDsl.g:4700:10: (lv_summary_20_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4700:10: (lv_summary_20_0= RULE_STR )
            	    // InternalMyDsl.g:4701:11: lv_summary_20_0= RULE_STR
            	    {
            	    lv_summary_20_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_summary_20_0, grammarAccess.getJournalCAccess().getSummarySTRTerminalRuleCall_2_8_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_20_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:4723:4: ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4723:4: ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4724:5: {...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:4724:105: ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4725:6: ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:4728:9: ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4728:10: {...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4728:19: (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4728:20: otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) )
            	    {
            	    otherlv_21=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getJournalCAccess().getURLKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:4732:9: ( (lv_url_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:4733:10: (lv_url_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4733:10: (lv_url_22_0= RULE_STR )
            	    // InternalMyDsl.g:4734:11: lv_url_22_0= RULE_STR
            	    {
            	    lv_url_22_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_url_22_0, grammarAccess.getJournalCAccess().getUrlSTRTerminalRuleCall_2_9_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_22_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:4756:4: ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4756:4: ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4757:5: {...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:4757:106: ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4758:6: ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:4761:9: ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4761:10: {...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4761:19: (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4761:20: otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) )
            	    {
            	    otherlv_23=(Token)match(input,97,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getJournalCAccess().getRecuridKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:4765:9: ( (lv_recurid_24_0= RULE_STR ) )
            	    // InternalMyDsl.g:4766:10: (lv_recurid_24_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4766:10: (lv_recurid_24_0= RULE_STR )
            	    // InternalMyDsl.g:4767:11: lv_recurid_24_0= RULE_STR
            	    {
            	    lv_recurid_24_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_recurid_24_0, grammarAccess.getJournalCAccess().getRecuridSTRTerminalRuleCall_2_10_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"recurid",
            	    												lv_recurid_24_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:4789:4: ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4789:4: ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) )
            	    // InternalMyDsl.g:4790:5: {...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:4790:106: ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) )
            	    // InternalMyDsl.g:4791:6: ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:4794:9: ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) )
            	    // InternalMyDsl.g:4794:10: {...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4794:19: (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' )
            	    // InternalMyDsl.g:4794:20: otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}'
            	    {
            	    otherlv_25=(Token)match(input,98,FOLLOW_12); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJournalCAccess().getRruleKeyword_2_11_0());
            	    								
            	    otherlv_26=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_26, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_11_1());
            	    								
            	    // InternalMyDsl.g:4802:9: ( (lv_rrule_27_0= RULE_STR ) )
            	    // InternalMyDsl.g:4803:10: (lv_rrule_27_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4803:10: (lv_rrule_27_0= RULE_STR )
            	    // InternalMyDsl.g:4804:11: lv_rrule_27_0= RULE_STR
            	    {
            	    lv_rrule_27_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rrule_27_0, grammarAccess.getJournalCAccess().getRruleSTRTerminalRuleCall_2_11_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rrule",
            	    												lv_rrule_27_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4820:9: (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==54) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4821:10: otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_28, grammarAccess.getJournalCAccess().getCommaKeyword_2_11_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4825:10: ( (lv_rrule_29_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4826:11: (lv_rrule_29_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4826:11: (lv_rrule_29_0= RULE_STR )
            	    	    // InternalMyDsl.g:4827:12: lv_rrule_29_0= RULE_STR
            	    	    {
            	    	    lv_rrule_29_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rrule_29_0, grammarAccess.getJournalCAccess().getRruleSTRTerminalRuleCall_2_11_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rrule",
            	    	    													lv_rrule_29_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);

            	    otherlv_30=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_11_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:4854:4: ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4854:4: ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) )
            	    // InternalMyDsl.g:4855:5: {...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:4855:106: ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) )
            	    // InternalMyDsl.g:4856:6: ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:4859:9: ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) )
            	    // InternalMyDsl.g:4859:10: {...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4859:19: (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' )
            	    // InternalMyDsl.g:4859:20: otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}'
            	    {
            	    otherlv_31=(Token)match(input,90,FOLLOW_12); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJournalCAccess().getAttachementsKeyword_2_12_0());
            	    								
            	    otherlv_32=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_32, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_12_1());
            	    								
            	    // InternalMyDsl.g:4867:9: ( (lv_attach_33_0= RULE_STR ) )
            	    // InternalMyDsl.g:4868:10: (lv_attach_33_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4868:10: (lv_attach_33_0= RULE_STR )
            	    // InternalMyDsl.g:4869:11: lv_attach_33_0= RULE_STR
            	    {
            	    lv_attach_33_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attach_33_0, grammarAccess.getJournalCAccess().getAttachSTRTerminalRuleCall_2_12_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attach",
            	    												lv_attach_33_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4885:9: (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==54) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4886:10: otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_34, grammarAccess.getJournalCAccess().getCommaKeyword_2_12_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4890:10: ( (lv_attach_35_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4891:11: (lv_attach_35_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4891:11: (lv_attach_35_0= RULE_STR )
            	    	    // InternalMyDsl.g:4892:12: lv_attach_35_0= RULE_STR
            	    	    {
            	    	    lv_attach_35_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attach_35_0, grammarAccess.getJournalCAccess().getAttachSTRTerminalRuleCall_2_12_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attach",
            	    	    													lv_attach_35_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);

            	    otherlv_36=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_36, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_12_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:4919:4: ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4919:4: ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) )
            	    // InternalMyDsl.g:4920:5: {...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:4920:106: ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) )
            	    // InternalMyDsl.g:4921:6: ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:4924:9: ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) )
            	    // InternalMyDsl.g:4924:10: {...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4924:19: (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' )
            	    // InternalMyDsl.g:4924:20: otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}'
            	    {
            	    otherlv_37=(Token)match(input,89,FOLLOW_12); 

            	    									newLeafNode(otherlv_37, grammarAccess.getJournalCAccess().getInvitesKeyword_2_13_0());
            	    								
            	    otherlv_38=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_38, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_13_1());
            	    								
            	    // InternalMyDsl.g:4932:9: ( (lv_attendee_39_0= RULE_STR ) )
            	    // InternalMyDsl.g:4933:10: (lv_attendee_39_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4933:10: (lv_attendee_39_0= RULE_STR )
            	    // InternalMyDsl.g:4934:11: lv_attendee_39_0= RULE_STR
            	    {
            	    lv_attendee_39_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attendee_39_0, grammarAccess.getJournalCAccess().getAttendeeSTRTerminalRuleCall_2_13_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attendee",
            	    												lv_attendee_39_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:4950:9: (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==54) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4951:10: otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_40=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_40, grammarAccess.getJournalCAccess().getCommaKeyword_2_13_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4955:10: ( (lv_attendee_41_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4956:11: (lv_attendee_41_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4956:11: (lv_attendee_41_0= RULE_STR )
            	    	    // InternalMyDsl.g:4957:12: lv_attendee_41_0= RULE_STR
            	    	    {
            	    	    lv_attendee_41_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attendee_41_0, grammarAccess.getJournalCAccess().getAttendeeSTRTerminalRuleCall_2_13_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attendee",
            	    	    													lv_attendee_41_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop60;
            	        }
            	    } while (true);

            	    otherlv_42=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_42, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_13_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalMyDsl.g:4984:4: ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4984:4: ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) )
            	    // InternalMyDsl.g:4985:5: {...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:4985:106: ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) )
            	    // InternalMyDsl.g:4986:6: ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:4989:9: ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) )
            	    // InternalMyDsl.g:4989:10: {...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4989:19: (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' )
            	    // InternalMyDsl.g:4989:20: otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}'
            	    {
            	    otherlv_43=(Token)match(input,99,FOLLOW_12); 

            	    									newLeafNode(otherlv_43, grammarAccess.getJournalCAccess().getCategoriesKeyword_2_14_0());
            	    								
            	    otherlv_44=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_44, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_14_1());
            	    								
            	    // InternalMyDsl.g:4997:9: ( (lv_categories_45_0= RULE_STR ) )
            	    // InternalMyDsl.g:4998:10: (lv_categories_45_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4998:10: (lv_categories_45_0= RULE_STR )
            	    // InternalMyDsl.g:4999:11: lv_categories_45_0= RULE_STR
            	    {
            	    lv_categories_45_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_categories_45_0, grammarAccess.getJournalCAccess().getCategoriesSTRTerminalRuleCall_2_14_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"categories",
            	    												lv_categories_45_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5015:9: (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==54) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5016:10: otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_46=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_46, grammarAccess.getJournalCAccess().getCommaKeyword_2_14_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5020:10: ( (lv_categories_47_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5021:11: (lv_categories_47_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5021:11: (lv_categories_47_0= RULE_STR )
            	    	    // InternalMyDsl.g:5022:12: lv_categories_47_0= RULE_STR
            	    	    {
            	    	    lv_categories_47_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_categories_47_0, grammarAccess.getJournalCAccess().getCategoriesSTRTerminalRuleCall_2_14_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"categories",
            	    	    													lv_categories_47_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);

            	    otherlv_48=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_48, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_14_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalMyDsl.g:5049:4: ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5049:4: ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) )
            	    // InternalMyDsl.g:5050:5: {...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:5050:106: ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) )
            	    // InternalMyDsl.g:5051:6: ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:5054:9: ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) )
            	    // InternalMyDsl.g:5054:10: {...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5054:19: (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' )
            	    // InternalMyDsl.g:5054:20: otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}'
            	    {
            	    otherlv_49=(Token)match(input,100,FOLLOW_12); 

            	    									newLeafNode(otherlv_49, grammarAccess.getJournalCAccess().getCommentaireKeyword_2_15_0());
            	    								
            	    otherlv_50=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_50, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_15_1());
            	    								
            	    // InternalMyDsl.g:5062:9: ( (lv_comment_51_0= RULE_STR ) )
            	    // InternalMyDsl.g:5063:10: (lv_comment_51_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5063:10: (lv_comment_51_0= RULE_STR )
            	    // InternalMyDsl.g:5064:11: lv_comment_51_0= RULE_STR
            	    {
            	    lv_comment_51_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_comment_51_0, grammarAccess.getJournalCAccess().getCommentSTRTerminalRuleCall_2_15_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"comment",
            	    												lv_comment_51_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5080:9: (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==54) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5081:10: otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_52=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_52, grammarAccess.getJournalCAccess().getCommaKeyword_2_15_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5085:10: ( (lv_comment_53_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5086:11: (lv_comment_53_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5086:11: (lv_comment_53_0= RULE_STR )
            	    	    // InternalMyDsl.g:5087:12: lv_comment_53_0= RULE_STR
            	    	    {
            	    	    lv_comment_53_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_comment_53_0, grammarAccess.getJournalCAccess().getCommentSTRTerminalRuleCall_2_15_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"comment",
            	    	    													lv_comment_53_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);

            	    otherlv_54=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_54, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_15_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalMyDsl.g:5114:4: ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5114:4: ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) )
            	    // InternalMyDsl.g:5115:5: {...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:5115:106: ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) )
            	    // InternalMyDsl.g:5116:6: ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:5119:9: ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) )
            	    // InternalMyDsl.g:5119:10: {...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5119:19: (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' )
            	    // InternalMyDsl.g:5119:20: otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}'
            	    {
            	    otherlv_55=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_55, grammarAccess.getJournalCAccess().getContactKeyword_2_16_0());
            	    								
            	    otherlv_56=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_56, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_16_1());
            	    								
            	    // InternalMyDsl.g:5127:9: ( (lv_contact_57_0= RULE_STR ) )
            	    // InternalMyDsl.g:5128:10: (lv_contact_57_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5128:10: (lv_contact_57_0= RULE_STR )
            	    // InternalMyDsl.g:5129:11: lv_contact_57_0= RULE_STR
            	    {
            	    lv_contact_57_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_contact_57_0, grammarAccess.getJournalCAccess().getContactSTRTerminalRuleCall_2_16_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"contact",
            	    												lv_contact_57_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5145:9: (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==54) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5146:10: otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_58=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_58, grammarAccess.getJournalCAccess().getCommaKeyword_2_16_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5150:10: ( (lv_contact_59_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5151:11: (lv_contact_59_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5151:11: (lv_contact_59_0= RULE_STR )
            	    	    // InternalMyDsl.g:5152:12: lv_contact_59_0= RULE_STR
            	    	    {
            	    	    lv_contact_59_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_contact_59_0, grammarAccess.getJournalCAccess().getContactSTRTerminalRuleCall_2_16_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"contact",
            	    	    													lv_contact_59_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop63;
            	        }
            	    } while (true);

            	    otherlv_60=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_60, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_16_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalMyDsl.g:5179:4: ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5179:4: ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) )
            	    // InternalMyDsl.g:5180:5: {...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:5180:106: ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) )
            	    // InternalMyDsl.g:5181:6: ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:5184:9: ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) )
            	    // InternalMyDsl.g:5184:10: {...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5184:19: (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' )
            	    // InternalMyDsl.g:5184:20: otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}'
            	    {
            	    otherlv_61=(Token)match(input,102,FOLLOW_12); 

            	    									newLeafNode(otherlv_61, grammarAccess.getJournalCAccess().getExdateKeyword_2_17_0());
            	    								
            	    otherlv_62=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_62, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_17_1());
            	    								
            	    // InternalMyDsl.g:5192:9: ( (lv_exdate_63_0= RULE_STR ) )
            	    // InternalMyDsl.g:5193:10: (lv_exdate_63_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5193:10: (lv_exdate_63_0= RULE_STR )
            	    // InternalMyDsl.g:5194:11: lv_exdate_63_0= RULE_STR
            	    {
            	    lv_exdate_63_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_exdate_63_0, grammarAccess.getJournalCAccess().getExdateSTRTerminalRuleCall_2_17_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"exdate",
            	    												lv_exdate_63_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5210:9: (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )*
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==54) ) {
            	            alt64=1;
            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5211:10: otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_64=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_64, grammarAccess.getJournalCAccess().getCommaKeyword_2_17_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5215:10: ( (lv_exdate_65_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5216:11: (lv_exdate_65_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5216:11: (lv_exdate_65_0= RULE_STR )
            	    	    // InternalMyDsl.g:5217:12: lv_exdate_65_0= RULE_STR
            	    	    {
            	    	    lv_exdate_65_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_exdate_65_0, grammarAccess.getJournalCAccess().getExdateSTRTerminalRuleCall_2_17_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"exdate",
            	    	    													lv_exdate_65_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop64;
            	        }
            	    } while (true);

            	    otherlv_66=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_66, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_17_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalMyDsl.g:5244:4: ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5244:4: ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) )
            	    // InternalMyDsl.g:5245:5: {...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:5245:106: ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) )
            	    // InternalMyDsl.g:5246:6: ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:5249:9: ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) )
            	    // InternalMyDsl.g:5249:10: {...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5249:19: (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' )
            	    // InternalMyDsl.g:5249:20: otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}'
            	    {
            	    otherlv_67=(Token)match(input,103,FOLLOW_12); 

            	    									newLeafNode(otherlv_67, grammarAccess.getJournalCAccess().getRstatusKeyword_2_18_0());
            	    								
            	    otherlv_68=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_68, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_18_1());
            	    								
            	    // InternalMyDsl.g:5257:9: ( (lv_rstatus_69_0= RULE_STR ) )
            	    // InternalMyDsl.g:5258:10: (lv_rstatus_69_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5258:10: (lv_rstatus_69_0= RULE_STR )
            	    // InternalMyDsl.g:5259:11: lv_rstatus_69_0= RULE_STR
            	    {
            	    lv_rstatus_69_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rstatus_69_0, grammarAccess.getJournalCAccess().getRstatusSTRTerminalRuleCall_2_18_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rstatus",
            	    												lv_rstatus_69_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5275:9: (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==54) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5276:10: otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_70=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_70, grammarAccess.getJournalCAccess().getCommaKeyword_2_18_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5280:10: ( (lv_rstatus_71_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5281:11: (lv_rstatus_71_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5281:11: (lv_rstatus_71_0= RULE_STR )
            	    	    // InternalMyDsl.g:5282:12: lv_rstatus_71_0= RULE_STR
            	    	    {
            	    	    lv_rstatus_71_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rstatus_71_0, grammarAccess.getJournalCAccess().getRstatusSTRTerminalRuleCall_2_18_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rstatus",
            	    	    													lv_rstatus_71_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);

            	    otherlv_72=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_72, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_18_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalMyDsl.g:5309:4: ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5309:4: ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) )
            	    // InternalMyDsl.g:5310:5: {...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19)");
            	    }
            	    // InternalMyDsl.g:5310:106: ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) )
            	    // InternalMyDsl.g:5311:6: ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19);
            	    					
            	    // InternalMyDsl.g:5314:9: ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) )
            	    // InternalMyDsl.g:5314:10: {...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5314:19: (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' )
            	    // InternalMyDsl.g:5314:20: otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}'
            	    {
            	    otherlv_73=(Token)match(input,104,FOLLOW_12); 

            	    									newLeafNode(otherlv_73, grammarAccess.getJournalCAccess().getRelierAKeyword_2_19_0());
            	    								
            	    otherlv_74=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_74, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_19_1());
            	    								
            	    // InternalMyDsl.g:5322:9: ( (lv_related_75_0= RULE_STR ) )
            	    // InternalMyDsl.g:5323:10: (lv_related_75_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5323:10: (lv_related_75_0= RULE_STR )
            	    // InternalMyDsl.g:5324:11: lv_related_75_0= RULE_STR
            	    {
            	    lv_related_75_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_related_75_0, grammarAccess.getJournalCAccess().getRelatedSTRTerminalRuleCall_2_19_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"related",
            	    												lv_related_75_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5340:9: (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==54) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5341:10: otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_76=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_76, grammarAccess.getJournalCAccess().getCommaKeyword_2_19_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5345:10: ( (lv_related_77_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5346:11: (lv_related_77_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5346:11: (lv_related_77_0= RULE_STR )
            	    	    // InternalMyDsl.g:5347:12: lv_related_77_0= RULE_STR
            	    	    {
            	    	    lv_related_77_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_related_77_0, grammarAccess.getJournalCAccess().getRelatedSTRTerminalRuleCall_2_19_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"related",
            	    	    													lv_related_77_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);

            	    otherlv_78=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_78, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_19_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalMyDsl.g:5374:4: ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5374:4: ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) )
            	    // InternalMyDsl.g:5375:5: {...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20)");
            	    }
            	    // InternalMyDsl.g:5375:106: ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) )
            	    // InternalMyDsl.g:5376:6: ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20);
            	    					
            	    // InternalMyDsl.g:5379:9: ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) )
            	    // InternalMyDsl.g:5379:10: {...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5379:19: (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' )
            	    // InternalMyDsl.g:5379:20: otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}'
            	    {
            	    otherlv_79=(Token)match(input,105,FOLLOW_12); 

            	    									newLeafNode(otherlv_79, grammarAccess.getJournalCAccess().getResourcesKeyword_2_20_0());
            	    								
            	    otherlv_80=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_80, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_20_1());
            	    								
            	    // InternalMyDsl.g:5387:9: ( (lv_resources_81_0= RULE_STR ) )
            	    // InternalMyDsl.g:5388:10: (lv_resources_81_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5388:10: (lv_resources_81_0= RULE_STR )
            	    // InternalMyDsl.g:5389:11: lv_resources_81_0= RULE_STR
            	    {
            	    lv_resources_81_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_resources_81_0, grammarAccess.getJournalCAccess().getResourcesSTRTerminalRuleCall_2_20_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"resources",
            	    												lv_resources_81_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5405:9: (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )*
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( (LA67_0==54) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5406:10: otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_82=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_82, grammarAccess.getJournalCAccess().getCommaKeyword_2_20_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5410:10: ( (lv_resources_83_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5411:11: (lv_resources_83_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5411:11: (lv_resources_83_0= RULE_STR )
            	    	    // InternalMyDsl.g:5412:12: lv_resources_83_0= RULE_STR
            	    	    {
            	    	    lv_resources_83_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_resources_83_0, grammarAccess.getJournalCAccess().getResourcesSTRTerminalRuleCall_2_20_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"resources",
            	    	    													lv_resources_83_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop67;
            	        }
            	    } while (true);

            	    otherlv_84=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_84, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_20_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalMyDsl.g:5439:4: ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5439:4: ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) )
            	    // InternalMyDsl.g:5440:5: {...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21)");
            	    }
            	    // InternalMyDsl.g:5440:106: ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) )
            	    // InternalMyDsl.g:5441:6: ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21);
            	    					
            	    // InternalMyDsl.g:5444:9: ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) )
            	    // InternalMyDsl.g:5444:10: {...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5444:19: (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' )
            	    // InternalMyDsl.g:5444:20: otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}'
            	    {
            	    otherlv_85=(Token)match(input,106,FOLLOW_12); 

            	    									newLeafNode(otherlv_85, grammarAccess.getJournalCAccess().getRdateKeyword_2_21_0());
            	    								
            	    otherlv_86=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_86, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_21_1());
            	    								
            	    // InternalMyDsl.g:5452:9: ( (lv_rdate_87_0= RULE_STR ) )
            	    // InternalMyDsl.g:5453:10: (lv_rdate_87_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5453:10: (lv_rdate_87_0= RULE_STR )
            	    // InternalMyDsl.g:5454:11: lv_rdate_87_0= RULE_STR
            	    {
            	    lv_rdate_87_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rdate_87_0, grammarAccess.getJournalCAccess().getRdateSTRTerminalRuleCall_2_21_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rdate",
            	    												lv_rdate_87_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5470:9: (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==54) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5471:10: otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_88=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_88, grammarAccess.getJournalCAccess().getCommaKeyword_2_21_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5475:10: ( (lv_rdate_89_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5476:11: (lv_rdate_89_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5476:11: (lv_rdate_89_0= RULE_STR )
            	    	    // InternalMyDsl.g:5477:12: lv_rdate_89_0= RULE_STR
            	    	    {
            	    	    lv_rdate_89_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rdate_89_0, grammarAccess.getJournalCAccess().getRdateSTRTerminalRuleCall_2_21_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rdate",
            	    	    													lv_rdate_89_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop68;
            	        }
            	    } while (true);

            	    otherlv_90=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_90, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_21_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalMyDsl.g:5504:4: ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5504:4: ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) )
            	    // InternalMyDsl.g:5505:5: {...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22)");
            	    }
            	    // InternalMyDsl.g:5505:106: ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) )
            	    // InternalMyDsl.g:5506:6: ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22);
            	    					
            	    // InternalMyDsl.g:5509:9: ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) )
            	    // InternalMyDsl.g:5509:10: {...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5509:19: (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' )
            	    // InternalMyDsl.g:5509:20: otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}'
            	    {
            	    otherlv_91=(Token)match(input,107,FOLLOW_12); 

            	    									newLeafNode(otherlv_91, grammarAccess.getJournalCAccess().getX_propKeyword_2_22_0());
            	    								
            	    otherlv_92=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_92, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_22_1());
            	    								
            	    // InternalMyDsl.g:5517:9: ( (lv_x_prop_93_0= RULE_STR ) )
            	    // InternalMyDsl.g:5518:10: (lv_x_prop_93_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5518:10: (lv_x_prop_93_0= RULE_STR )
            	    // InternalMyDsl.g:5519:11: lv_x_prop_93_0= RULE_STR
            	    {
            	    lv_x_prop_93_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_x_prop_93_0, grammarAccess.getJournalCAccess().getX_propSTRTerminalRuleCall_2_22_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"x_prop",
            	    												lv_x_prop_93_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5535:9: (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )*
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==54) ) {
            	            alt69=1;
            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5536:10: otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_94=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_94, grammarAccess.getJournalCAccess().getCommaKeyword_2_22_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5540:10: ( (lv_x_prop_95_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5541:11: (lv_x_prop_95_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5541:11: (lv_x_prop_95_0= RULE_STR )
            	    	    // InternalMyDsl.g:5542:12: lv_x_prop_95_0= RULE_STR
            	    	    {
            	    	    lv_x_prop_95_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_x_prop_95_0, grammarAccess.getJournalCAccess().getX_propSTRTerminalRuleCall_2_22_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"x_prop",
            	    	    													lv_x_prop_95_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop69;
            	        }
            	    } while (true);

            	    otherlv_96=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_96, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_22_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalMyDsl.g:5569:4: ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5569:4: ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) )
            	    // InternalMyDsl.g:5570:5: {...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23)");
            	    }
            	    // InternalMyDsl.g:5570:106: ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) )
            	    // InternalMyDsl.g:5571:6: ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23);
            	    					
            	    // InternalMyDsl.g:5574:9: ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) )
            	    // InternalMyDsl.g:5574:10: {...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5574:19: (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' )
            	    // InternalMyDsl.g:5574:20: otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}'
            	    {
            	    otherlv_97=(Token)match(input,108,FOLLOW_12); 

            	    									newLeafNode(otherlv_97, grammarAccess.getJournalCAccess().getIana_propKeyword_2_23_0());
            	    								
            	    otherlv_98=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_98, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_23_1());
            	    								
            	    // InternalMyDsl.g:5582:9: ( (lv_iana_prop_99_0= RULE_STR ) )
            	    // InternalMyDsl.g:5583:10: (lv_iana_prop_99_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5583:10: (lv_iana_prop_99_0= RULE_STR )
            	    // InternalMyDsl.g:5584:11: lv_iana_prop_99_0= RULE_STR
            	    {
            	    lv_iana_prop_99_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_iana_prop_99_0, grammarAccess.getJournalCAccess().getIana_propSTRTerminalRuleCall_2_23_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"iana_prop",
            	    												lv_iana_prop_99_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5600:9: (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==54) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5601:10: otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_100=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_100, grammarAccess.getJournalCAccess().getCommaKeyword_2_23_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5605:10: ( (lv_iana_prop_101_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5606:11: (lv_iana_prop_101_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5606:11: (lv_iana_prop_101_0= RULE_STR )
            	    	    // InternalMyDsl.g:5607:12: lv_iana_prop_101_0= RULE_STR
            	    	    {
            	    	    lv_iana_prop_101_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_iana_prop_101_0, grammarAccess.getJournalCAccess().getIana_propSTRTerminalRuleCall_2_23_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getJournalCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"iana_prop",
            	    	    													lv_iana_prop_101_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    otherlv_102=(Token)match(input,46,FOLLOW_40); 

            	    									newLeafNode(otherlv_102, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_23_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalMyDsl.g:5634:4: ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5634:4: ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5635:5: {...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24)");
            	    }
            	    // InternalMyDsl.g:5635:106: ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5636:6: ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24);
            	    					
            	    // InternalMyDsl.g:5639:9: ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5639:10: {...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5639:19: (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5639:20: otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) )
            	    {
            	    otherlv_103=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_103, grammarAccess.getJournalCAccess().getDescriptionKeyword_2_24_0());
            	    								
            	    // InternalMyDsl.g:5643:9: ( (lv_description_104_0= RULE_STR ) )
            	    // InternalMyDsl.g:5644:10: (lv_description_104_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5644:10: (lv_description_104_0= RULE_STR )
            	    // InternalMyDsl.g:5645:11: lv_description_104_0= RULE_STR
            	    {
            	    lv_description_104_0=(Token)match(input,RULE_STR,FOLLOW_40); 

            	    											newLeafNode(lv_description_104_0, grammarAccess.getJournalCAccess().getDescriptionSTRTerminalRuleCall_2_24_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getJournalCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_104_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJournalCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canLeave(grammarAccess.getJournalCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_105=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_105, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJournalC"


    // $ANTLR start "entryRuleVacationC"
    // InternalMyDsl.g:5683:1: entryRuleVacationC returns [EObject current=null] : iv_ruleVacationC= ruleVacationC EOF ;
    public final EObject entryRuleVacationC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVacationC = null;


        try {
            // InternalMyDsl.g:5683:50: (iv_ruleVacationC= ruleVacationC EOF )
            // InternalMyDsl.g:5684:2: iv_ruleVacationC= ruleVacationC EOF
            {
             newCompositeNode(grammarAccess.getVacationCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVacationC=ruleVacationC();

            state._fsp--;

             current =iv_ruleVacationC; 
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
    // $ANTLR end "entryRuleVacationC"


    // $ANTLR start "ruleVacationC"
    // InternalMyDsl.g:5690:1: ruleVacationC returns [EObject current=null] : (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' ) ;
    public final EObject ruleVacationC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_uid_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_organizer_8_0=null;
        Token otherlv_9=null;
        Token lv_url_10_0=null;
        Token otherlv_11=null;
        Token lv_contact_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_attendee_17_0=null;
        Token otherlv_18=null;
        Token lv_attendee_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_comment_23_0=null;
        Token otherlv_24=null;
        Token lv_comment_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_freebusy_29_0=null;
        Token otherlv_30=null;
        Token lv_freebusy_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_rstatus_35_0=null;
        Token otherlv_36=null;
        Token lv_rstatus_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_x_prop_41_0=null;
        Token otherlv_42=null;
        Token lv_x_prop_43_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_iana_prop_47_0=null;
        Token otherlv_48=null;
        Token lv_iana_prop_49_0=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        EObject lv_dtstart_6_0 = null;

        EObject lv_dtend_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5696:2: ( (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' ) )
            // InternalMyDsl.g:5697:2: (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' )
            {
            // InternalMyDsl.g:5697:2: (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' )
            // InternalMyDsl.g:5698:3: otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVacationCAccess().getVacationCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:5706:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:5707:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:5707:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:5708:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5711:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:5712:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:5712:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=13;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // InternalMyDsl.g:5713:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5713:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5714:5: {...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5714:106: ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5715:6: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5718:9: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5718:10: {...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5718:19: (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5718:20: otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getVacationCAccess().getIdentifiantKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:5722:9: ( (lv_uid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:5723:10: (lv_uid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5723:10: (lv_uid_4_0= RULE_STR )
            	    // InternalMyDsl.g:5724:11: lv_uid_4_0= RULE_STR
            	    {
            	    lv_uid_4_0=(Token)match(input,RULE_STR,FOLLOW_42); 

            	    											newLeafNode(lv_uid_4_0, grammarAccess.getVacationCAccess().getUidSTRTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_4_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:5746:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5746:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:5747:5: {...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5747:106: ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:5748:6: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5751:9: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:5751:10: {...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5751:19: (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:5751:20: otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) )
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_16); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVacationCAccess().getDateKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:5755:9: ( (lv_dtstart_6_0= ruleDateT ) )
            	    // InternalMyDsl.g:5756:10: (lv_dtstart_6_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:5756:10: (lv_dtstart_6_0= ruleDateT )
            	    // InternalMyDsl.g:5757:11: lv_dtstart_6_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getVacationCAccess().getDtstartDateTParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_dtstart_6_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVacationCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtstart",
            	    												lv_dtstart_6_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:5780:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5780:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5781:5: {...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:5781:106: ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5782:6: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:5785:9: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5785:10: {...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5785:19: (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5785:20: otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getVacationCAccess().getOrganisateurKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:5789:9: ( (lv_organizer_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:5790:10: (lv_organizer_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5790:10: (lv_organizer_8_0= RULE_STR )
            	    // InternalMyDsl.g:5791:11: lv_organizer_8_0= RULE_STR
            	    {
            	    lv_organizer_8_0=(Token)match(input,RULE_STR,FOLLOW_42); 

            	    											newLeafNode(lv_organizer_8_0, grammarAccess.getVacationCAccess().getOrganizerSTRTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"organizer",
            	    												lv_organizer_8_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:5813:4: ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5813:4: ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5814:5: {...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:5814:106: ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5815:6: ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:5818:9: ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5818:10: {...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5818:19: (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5818:20: otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVacationCAccess().getURLKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:5822:9: ( (lv_url_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:5823:10: (lv_url_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5823:10: (lv_url_10_0= RULE_STR )
            	    // InternalMyDsl.g:5824:11: lv_url_10_0= RULE_STR
            	    {
            	    lv_url_10_0=(Token)match(input,RULE_STR,FOLLOW_42); 

            	    											newLeafNode(lv_url_10_0, grammarAccess.getVacationCAccess().getUrlSTRTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_10_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:5846:4: ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5846:4: ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5847:5: {...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:5847:106: ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5848:6: ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:5851:9: ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5851:10: {...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5851:19: (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5851:20: otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getVacationCAccess().getContactKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:5855:9: ( (lv_contact_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:5856:10: (lv_contact_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5856:10: (lv_contact_12_0= RULE_STR )
            	    // InternalMyDsl.g:5857:11: lv_contact_12_0= RULE_STR
            	    {
            	    lv_contact_12_0=(Token)match(input,RULE_STR,FOLLOW_42); 

            	    											newLeafNode(lv_contact_12_0, grammarAccess.getVacationCAccess().getContactSTRTerminalRuleCall_2_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"contact",
            	    												lv_contact_12_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:5879:4: ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5879:4: ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:5880:5: {...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:5880:106: ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:5881:6: ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:5884:9: ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:5884:10: {...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5884:19: (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:5884:20: otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) )
            	    {
            	    otherlv_13=(Token)match(input,65,FOLLOW_16); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVacationCAccess().getFinKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:5888:9: ( (lv_dtend_14_0= ruleDateT ) )
            	    // InternalMyDsl.g:5889:10: (lv_dtend_14_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:5889:10: (lv_dtend_14_0= ruleDateT )
            	    // InternalMyDsl.g:5890:11: lv_dtend_14_0= ruleDateT
            	    {

            	    											newCompositeNode(grammarAccess.getVacationCAccess().getDtendDateTParserRuleCall_2_5_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_dtend_14_0=ruleDateT();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVacationCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dtend",
            	    												lv_dtend_14_0,
            	    												"xCalendar.MyDsl.DateT");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:5913:4: ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5913:4: ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    // InternalMyDsl.g:5914:5: {...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:5914:106: ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    // InternalMyDsl.g:5915:6: ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:5918:9: ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    // InternalMyDsl.g:5918:10: {...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5918:19: (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    // InternalMyDsl.g:5918:20: otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,89,FOLLOW_12); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVacationCAccess().getInvitesKeyword_2_6_0());
            	    								
            	    otherlv_16=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:5926:9: ( (lv_attendee_17_0= RULE_STR ) )
            	    // InternalMyDsl.g:5927:10: (lv_attendee_17_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5927:10: (lv_attendee_17_0= RULE_STR )
            	    // InternalMyDsl.g:5928:11: lv_attendee_17_0= RULE_STR
            	    {
            	    lv_attendee_17_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_attendee_17_0, grammarAccess.getVacationCAccess().getAttendeeSTRTerminalRuleCall_2_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"attendee",
            	    												lv_attendee_17_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:5944:9: (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==54) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5945:10: otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getVacationCAccess().getCommaKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5949:10: ( (lv_attendee_19_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5950:11: (lv_attendee_19_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5950:11: (lv_attendee_19_0= RULE_STR )
            	    	    // InternalMyDsl.g:5951:12: lv_attendee_19_0= RULE_STR
            	    	    {
            	    	    lv_attendee_19_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_attendee_19_0, grammarAccess.getVacationCAccess().getAttendeeSTRTerminalRuleCall_2_6_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"attendee",
            	    	    													lv_attendee_19_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_20, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:5978:4: ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5978:4: ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) )
            	    // InternalMyDsl.g:5979:5: {...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:5979:106: ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) )
            	    // InternalMyDsl.g:5980:6: ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:5983:9: ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) )
            	    // InternalMyDsl.g:5983:10: {...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5983:19: (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' )
            	    // InternalMyDsl.g:5983:20: otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}'
            	    {
            	    otherlv_21=(Token)match(input,100,FOLLOW_12); 

            	    									newLeafNode(otherlv_21, grammarAccess.getVacationCAccess().getCommentaireKeyword_2_7_0());
            	    								
            	    otherlv_22=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:5991:9: ( (lv_comment_23_0= RULE_STR ) )
            	    // InternalMyDsl.g:5992:10: (lv_comment_23_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5992:10: (lv_comment_23_0= RULE_STR )
            	    // InternalMyDsl.g:5993:11: lv_comment_23_0= RULE_STR
            	    {
            	    lv_comment_23_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_comment_23_0, grammarAccess.getVacationCAccess().getCommentSTRTerminalRuleCall_2_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"comment",
            	    												lv_comment_23_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6009:9: (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==54) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6010:10: otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getVacationCAccess().getCommaKeyword_2_7_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6014:10: ( (lv_comment_25_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6015:11: (lv_comment_25_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6015:11: (lv_comment_25_0= RULE_STR )
            	    	    // InternalMyDsl.g:6016:12: lv_comment_25_0= RULE_STR
            	    	    {
            	    	    lv_comment_25_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_comment_25_0, grammarAccess.getVacationCAccess().getCommentSTRTerminalRuleCall_2_7_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"comment",
            	    	    													lv_comment_25_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop73;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_26, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_7_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:6043:4: ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6043:4: ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) )
            	    // InternalMyDsl.g:6044:5: {...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:6044:106: ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) )
            	    // InternalMyDsl.g:6045:6: ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:6048:9: ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) )
            	    // InternalMyDsl.g:6048:10: {...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6048:19: (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' )
            	    // InternalMyDsl.g:6048:20: otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}'
            	    {
            	    otherlv_27=(Token)match(input,113,FOLLOW_12); 

            	    									newLeafNode(otherlv_27, grammarAccess.getVacationCAccess().getFreebusyKeyword_2_8_0());
            	    								
            	    otherlv_28=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_8_1());
            	    								
            	    // InternalMyDsl.g:6056:9: ( (lv_freebusy_29_0= RULE_STR ) )
            	    // InternalMyDsl.g:6057:10: (lv_freebusy_29_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6057:10: (lv_freebusy_29_0= RULE_STR )
            	    // InternalMyDsl.g:6058:11: lv_freebusy_29_0= RULE_STR
            	    {
            	    lv_freebusy_29_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_freebusy_29_0, grammarAccess.getVacationCAccess().getFreebusySTRTerminalRuleCall_2_8_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"freebusy",
            	    												lv_freebusy_29_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6074:9: (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==54) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6075:10: otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_30=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_30, grammarAccess.getVacationCAccess().getCommaKeyword_2_8_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6079:10: ( (lv_freebusy_31_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6080:11: (lv_freebusy_31_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6080:11: (lv_freebusy_31_0= RULE_STR )
            	    	    // InternalMyDsl.g:6081:12: lv_freebusy_31_0= RULE_STR
            	    	    {
            	    	    lv_freebusy_31_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_freebusy_31_0, grammarAccess.getVacationCAccess().getFreebusySTRTerminalRuleCall_2_8_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"freebusy",
            	    	    													lv_freebusy_31_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);

            	    otherlv_32=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_32, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_8_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:6108:4: ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6108:4: ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) )
            	    // InternalMyDsl.g:6109:5: {...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:6109:106: ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) )
            	    // InternalMyDsl.g:6110:6: ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:6113:9: ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) )
            	    // InternalMyDsl.g:6113:10: {...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6113:19: (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' )
            	    // InternalMyDsl.g:6113:20: otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}'
            	    {
            	    otherlv_33=(Token)match(input,103,FOLLOW_12); 

            	    									newLeafNode(otherlv_33, grammarAccess.getVacationCAccess().getRstatusKeyword_2_9_0());
            	    								
            	    otherlv_34=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_34, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_9_1());
            	    								
            	    // InternalMyDsl.g:6121:9: ( (lv_rstatus_35_0= RULE_STR ) )
            	    // InternalMyDsl.g:6122:10: (lv_rstatus_35_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6122:10: (lv_rstatus_35_0= RULE_STR )
            	    // InternalMyDsl.g:6123:11: lv_rstatus_35_0= RULE_STR
            	    {
            	    lv_rstatus_35_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_rstatus_35_0, grammarAccess.getVacationCAccess().getRstatusSTRTerminalRuleCall_2_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"rstatus",
            	    												lv_rstatus_35_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6139:9: (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==54) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6140:10: otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_36=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_36, grammarAccess.getVacationCAccess().getCommaKeyword_2_9_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6144:10: ( (lv_rstatus_37_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6145:11: (lv_rstatus_37_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6145:11: (lv_rstatus_37_0= RULE_STR )
            	    	    // InternalMyDsl.g:6146:12: lv_rstatus_37_0= RULE_STR
            	    	    {
            	    	    lv_rstatus_37_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_rstatus_37_0, grammarAccess.getVacationCAccess().getRstatusSTRTerminalRuleCall_2_9_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"rstatus",
            	    	    													lv_rstatus_37_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    otherlv_38=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_38, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_9_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:6173:4: ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6173:4: ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) )
            	    // InternalMyDsl.g:6174:5: {...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:6174:107: ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) )
            	    // InternalMyDsl.g:6175:6: ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:6178:9: ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) )
            	    // InternalMyDsl.g:6178:10: {...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6178:19: (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' )
            	    // InternalMyDsl.g:6178:20: otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}'
            	    {
            	    otherlv_39=(Token)match(input,107,FOLLOW_12); 

            	    									newLeafNode(otherlv_39, grammarAccess.getVacationCAccess().getX_propKeyword_2_10_0());
            	    								
            	    otherlv_40=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_40, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_10_1());
            	    								
            	    // InternalMyDsl.g:6186:9: ( (lv_x_prop_41_0= RULE_STR ) )
            	    // InternalMyDsl.g:6187:10: (lv_x_prop_41_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6187:10: (lv_x_prop_41_0= RULE_STR )
            	    // InternalMyDsl.g:6188:11: lv_x_prop_41_0= RULE_STR
            	    {
            	    lv_x_prop_41_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_x_prop_41_0, grammarAccess.getVacationCAccess().getX_propSTRTerminalRuleCall_2_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"x_prop",
            	    												lv_x_prop_41_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6204:9: (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==54) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6205:10: otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_42=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_42, grammarAccess.getVacationCAccess().getCommaKeyword_2_10_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6209:10: ( (lv_x_prop_43_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6210:11: (lv_x_prop_43_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6210:11: (lv_x_prop_43_0= RULE_STR )
            	    	    // InternalMyDsl.g:6211:12: lv_x_prop_43_0= RULE_STR
            	    	    {
            	    	    lv_x_prop_43_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_x_prop_43_0, grammarAccess.getVacationCAccess().getX_propSTRTerminalRuleCall_2_10_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"x_prop",
            	    	    													lv_x_prop_43_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    otherlv_44=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_44, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_10_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:6238:4: ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6238:4: ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) )
            	    // InternalMyDsl.g:6239:5: {...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:6239:107: ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) )
            	    // InternalMyDsl.g:6240:6: ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:6243:9: ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) )
            	    // InternalMyDsl.g:6243:10: {...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6243:19: (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' )
            	    // InternalMyDsl.g:6243:20: otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}'
            	    {
            	    otherlv_45=(Token)match(input,108,FOLLOW_12); 

            	    									newLeafNode(otherlv_45, grammarAccess.getVacationCAccess().getIana_propKeyword_2_11_0());
            	    								
            	    otherlv_46=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_46, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_11_1());
            	    								
            	    // InternalMyDsl.g:6251:9: ( (lv_iana_prop_47_0= RULE_STR ) )
            	    // InternalMyDsl.g:6252:10: (lv_iana_prop_47_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6252:10: (lv_iana_prop_47_0= RULE_STR )
            	    // InternalMyDsl.g:6253:11: lv_iana_prop_47_0= RULE_STR
            	    {
            	    lv_iana_prop_47_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_iana_prop_47_0, grammarAccess.getVacationCAccess().getIana_propSTRTerminalRuleCall_2_11_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVacationCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"iana_prop",
            	    												lv_iana_prop_47_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6269:9: (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==54) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6270:10: otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_48=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_48, grammarAccess.getVacationCAccess().getCommaKeyword_2_11_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6274:10: ( (lv_iana_prop_49_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6275:11: (lv_iana_prop_49_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6275:11: (lv_iana_prop_49_0= RULE_STR )
            	    	    // InternalMyDsl.g:6276:12: lv_iana_prop_49_0= RULE_STR
            	    	    {
            	    	    lv_iana_prop_49_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_iana_prop_49_0, grammarAccess.getVacationCAccess().getIana_propSTRTerminalRuleCall_2_11_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVacationCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"iana_prop",
            	    	    													lv_iana_prop_49_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    otherlv_50=(Token)match(input,46,FOLLOW_42); 

            	    									newLeafNode(otherlv_50, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_11_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVacationCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canLeave(grammarAccess.getVacationCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_51=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_51, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleVacationC"


    // $ANTLR start "entryRuleTimeZoneC"
    // InternalMyDsl.g:6319:1: entryRuleTimeZoneC returns [EObject current=null] : iv_ruleTimeZoneC= ruleTimeZoneC EOF ;
    public final EObject entryRuleTimeZoneC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeZoneC = null;


        try {
            // InternalMyDsl.g:6319:50: (iv_ruleTimeZoneC= ruleTimeZoneC EOF )
            // InternalMyDsl.g:6320:2: iv_ruleTimeZoneC= ruleTimeZoneC EOF
            {
             newCompositeNode(grammarAccess.getTimeZoneCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeZoneC=ruleTimeZoneC();

            state._fsp--;

             current =iv_ruleTimeZoneC; 
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
    // $ANTLR end "entryRuleTimeZoneC"


    // $ANTLR start "ruleTimeZoneC"
    // InternalMyDsl.g:6326:1: ruleTimeZoneC returns [EObject current=null] : (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) ;
    public final EObject ruleTimeZoneC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_tzid_4_0=null;
        Token otherlv_5=null;
        Token lv_last_mod_6_0=null;
        Token otherlv_7=null;
        Token lv_tzurl_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_x_prop_11_0=null;
        Token otherlv_12=null;
        Token lv_x_prop_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_iana_prop_17_0=null;
        Token otherlv_18=null;
        Token lv_iana_prop_19_0=null;
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
        EObject lv_standardc_23_0 = null;

        EObject lv_standardc_25_0 = null;

        EObject lv_daylightc_29_0 = null;

        EObject lv_daylightc_31_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6332:2: ( (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) )
            // InternalMyDsl.g:6333:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            {
            // InternalMyDsl.g:6333:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            // InternalMyDsl.g:6334:3: otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeZoneCAccess().getTimeZoneCKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:6342:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:6343:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:6343:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:6344:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:6347:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:6348:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:6348:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+
            int cnt83=0;
            loop83:
            do {
                int alt83=8;
                int LA83_0 = input.LA(1);

                if ( LA83_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0) ) {
                    alt83=1;
                }
                else if ( LA83_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1) ) {
                    alt83=2;
                }
                else if ( LA83_0 == 116 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2) ) {
                    alt83=3;
                }
                else if ( LA83_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3) ) {
                    alt83=4;
                }
                else if ( LA83_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4) ) {
                    alt83=5;
                }
                else if ( LA83_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5) ) {
                    alt83=6;
                }
                else if ( LA83_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6) ) {
                    alt83=7;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalMyDsl.g:6349:4: ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6349:4: ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6350:5: {...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:6350:106: ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6351:6: ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:6354:9: ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6354:10: {...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6354:19: (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6354:20: otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,115,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTimeZoneCAccess().getTzidKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:6358:9: ( (lv_tzid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:6359:10: (lv_tzid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6359:10: (lv_tzid_4_0= RULE_STR )
            	    // InternalMyDsl.g:6360:11: lv_tzid_4_0= RULE_STR
            	    {
            	    lv_tzid_4_0=(Token)match(input,RULE_STR,FOLLOW_44); 

            	    											newLeafNode(lv_tzid_4_0, grammarAccess.getTimeZoneCAccess().getTzidSTRTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"tzid",
            	    												lv_tzid_4_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:6382:4: ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6382:4: ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6383:5: {...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:6383:106: ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6384:6: ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:6387:9: ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6387:10: {...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6387:19: (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6387:20: otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,95,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTimeZoneCAccess().getLast_modKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:6391:9: ( (lv_last_mod_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:6392:10: (lv_last_mod_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6392:10: (lv_last_mod_6_0= RULE_STR )
            	    // InternalMyDsl.g:6393:11: lv_last_mod_6_0= RULE_STR
            	    {
            	    lv_last_mod_6_0=(Token)match(input,RULE_STR,FOLLOW_44); 

            	    											newLeafNode(lv_last_mod_6_0, grammarAccess.getTimeZoneCAccess().getLast_modSTRTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"last_mod",
            	    												lv_last_mod_6_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:6415:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6415:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6416:5: {...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:6416:106: ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6417:6: ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:6420:9: ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6420:10: {...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6420:19: (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6420:20: otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,116,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTimeZoneCAccess().getTzurlKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:6424:9: ( (lv_tzurl_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:6425:10: (lv_tzurl_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6425:10: (lv_tzurl_8_0= RULE_STR )
            	    // InternalMyDsl.g:6426:11: lv_tzurl_8_0= RULE_STR
            	    {
            	    lv_tzurl_8_0=(Token)match(input,RULE_STR,FOLLOW_44); 

            	    											newLeafNode(lv_tzurl_8_0, grammarAccess.getTimeZoneCAccess().getTzurlSTRTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"tzurl",
            	    												lv_tzurl_8_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:6448:4: ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6448:4: ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) )
            	    // InternalMyDsl.g:6449:5: {...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:6449:106: ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) )
            	    // InternalMyDsl.g:6450:6: ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:6453:9: ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) )
            	    // InternalMyDsl.g:6453:10: {...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6453:19: (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' )
            	    // InternalMyDsl.g:6453:20: otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}'
            	    {
            	    otherlv_9=(Token)match(input,107,FOLLOW_12); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTimeZoneCAccess().getX_propKeyword_2_3_0());
            	    								
            	    otherlv_10=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:6461:9: ( (lv_x_prop_11_0= RULE_STR ) )
            	    // InternalMyDsl.g:6462:10: (lv_x_prop_11_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6462:10: (lv_x_prop_11_0= RULE_STR )
            	    // InternalMyDsl.g:6463:11: lv_x_prop_11_0= RULE_STR
            	    {
            	    lv_x_prop_11_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_x_prop_11_0, grammarAccess.getTimeZoneCAccess().getX_propSTRTerminalRuleCall_2_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"x_prop",
            	    												lv_x_prop_11_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6479:9: (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==54) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6480:10: otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_3_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6484:10: ( (lv_x_prop_13_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6485:11: (lv_x_prop_13_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6485:11: (lv_x_prop_13_0= RULE_STR )
            	    	    // InternalMyDsl.g:6486:12: lv_x_prop_13_0= RULE_STR
            	    	    {
            	    	    lv_x_prop_13_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_x_prop_13_0, grammarAccess.getTimeZoneCAccess().getX_propSTRTerminalRuleCall_2_3_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"x_prop",
            	    	    													lv_x_prop_13_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,46,FOLLOW_44); 

            	    									newLeafNode(otherlv_14, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:6513:4: ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6513:4: ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    // InternalMyDsl.g:6514:5: {...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:6514:106: ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    // InternalMyDsl.g:6515:6: ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:6518:9: ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    // InternalMyDsl.g:6518:10: {...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6518:19: (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    // InternalMyDsl.g:6518:20: otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,108,FOLLOW_12); 

            	    									newLeafNode(otherlv_15, grammarAccess.getTimeZoneCAccess().getIana_propKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:6526:9: ( (lv_iana_prop_17_0= RULE_STR ) )
            	    // InternalMyDsl.g:6527:10: (lv_iana_prop_17_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6527:10: (lv_iana_prop_17_0= RULE_STR )
            	    // InternalMyDsl.g:6528:11: lv_iana_prop_17_0= RULE_STR
            	    {
            	    lv_iana_prop_17_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    											newLeafNode(lv_iana_prop_17_0, grammarAccess.getTimeZoneCAccess().getIana_propSTRTerminalRuleCall_2_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"iana_prop",
            	    												lv_iana_prop_17_0,
            	    												"xCalendar.MyDsl.STR");
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6544:9: (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==54) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6545:10: otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,54,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_4_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6549:10: ( (lv_iana_prop_19_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6550:11: (lv_iana_prop_19_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6550:11: (lv_iana_prop_19_0= RULE_STR )
            	    	    // InternalMyDsl.g:6551:12: lv_iana_prop_19_0= RULE_STR
            	    	    {
            	    	    lv_iana_prop_19_0=(Token)match(input,RULE_STR,FOLLOW_28); 

            	    	    												newLeafNode(lv_iana_prop_19_0, grammarAccess.getTimeZoneCAccess().getIana_propSTRTerminalRuleCall_2_4_3_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getTimeZoneCRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"iana_prop",
            	    	    													lv_iana_prop_19_0,
            	    	    													"xCalendar.MyDsl.STR");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,46,FOLLOW_44); 

            	    									newLeafNode(otherlv_20, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:6578:4: ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6578:4: ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) )
            	    // InternalMyDsl.g:6579:5: {...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:6579:106: ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) )
            	    // InternalMyDsl.g:6580:6: ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:6583:9: ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) )
            	    // InternalMyDsl.g:6583:10: {...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6583:19: (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' )
            	    // InternalMyDsl.g:6583:20: otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}'
            	    {
            	    otherlv_21=(Token)match(input,117,FOLLOW_12); 

            	    									newLeafNode(otherlv_21, grammarAccess.getTimeZoneCAccess().getStandardcKeyword_2_5_0());
            	    								
            	    otherlv_22=(Token)match(input,41,FOLLOW_45); 

            	    									newLeafNode(otherlv_22, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:6591:9: ( (lv_standardc_23_0= ruletzprop ) )
            	    // InternalMyDsl.g:6592:10: (lv_standardc_23_0= ruletzprop )
            	    {
            	    // InternalMyDsl.g:6592:10: (lv_standardc_23_0= ruletzprop )
            	    // InternalMyDsl.g:6593:11: lv_standardc_23_0= ruletzprop
            	    {

            	    											newCompositeNode(grammarAccess.getTimeZoneCAccess().getStandardcTzpropParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_standardc_23_0=ruletzprop();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											add(
            	    												current,
            	    												"standardc",
            	    												lv_standardc_23_0,
            	    												"xCalendar.MyDsl.tzprop");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6610:9: (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==54) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6611:10: otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,54,FOLLOW_45); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_5_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6615:10: ( (lv_standardc_25_0= ruletzprop ) )
            	    	    // InternalMyDsl.g:6616:11: (lv_standardc_25_0= ruletzprop )
            	    	    {
            	    	    // InternalMyDsl.g:6616:11: (lv_standardc_25_0= ruletzprop )
            	    	    // InternalMyDsl.g:6617:12: lv_standardc_25_0= ruletzprop
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getTimeZoneCAccess().getStandardcTzpropParserRuleCall_2_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_28);
            	    	    lv_standardc_25_0=ruletzprop();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"standardc",
            	    	    													lv_standardc_25_0,
            	    	    													"xCalendar.MyDsl.tzprop");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,46,FOLLOW_44); 

            	    									newLeafNode(otherlv_26, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:6645:4: ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6645:4: ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) )
            	    // InternalMyDsl.g:6646:5: {...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:6646:106: ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) )
            	    // InternalMyDsl.g:6647:6: ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:6650:9: ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) )
            	    // InternalMyDsl.g:6650:10: {...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6650:19: (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' )
            	    // InternalMyDsl.g:6650:20: otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}'
            	    {
            	    otherlv_27=(Token)match(input,118,FOLLOW_12); 

            	    									newLeafNode(otherlv_27, grammarAccess.getTimeZoneCAccess().getDaylightcKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,41,FOLLOW_45); 

            	    									newLeafNode(otherlv_28, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:6658:9: ( (lv_daylightc_29_0= ruletzprop ) )
            	    // InternalMyDsl.g:6659:10: (lv_daylightc_29_0= ruletzprop )
            	    {
            	    // InternalMyDsl.g:6659:10: (lv_daylightc_29_0= ruletzprop )
            	    // InternalMyDsl.g:6660:11: lv_daylightc_29_0= ruletzprop
            	    {

            	    											newCompositeNode(grammarAccess.getTimeZoneCAccess().getDaylightcTzpropParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_daylightc_29_0=ruletzprop();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
            	    											}
            	    											add(
            	    												current,
            	    												"daylightc",
            	    												lv_daylightc_29_0,
            	    												"xCalendar.MyDsl.tzprop");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMyDsl.g:6677:9: (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==54) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6678:10: otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) )
            	    	    {
            	    	    otherlv_30=(Token)match(input,54,FOLLOW_45); 

            	    	    										newLeafNode(otherlv_30, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6682:10: ( (lv_daylightc_31_0= ruletzprop ) )
            	    	    // InternalMyDsl.g:6683:11: (lv_daylightc_31_0= ruletzprop )
            	    	    {
            	    	    // InternalMyDsl.g:6683:11: (lv_daylightc_31_0= ruletzprop )
            	    	    // InternalMyDsl.g:6684:12: lv_daylightc_31_0= ruletzprop
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getTimeZoneCAccess().getDaylightcTzpropParserRuleCall_2_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_28);
            	    	    lv_daylightc_31_0=ruletzprop();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"daylightc",
            	    	    													lv_daylightc_31_0,
            	    	    													"xCalendar.MyDsl.tzprop");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop82;
            	        }
            	    } while (true);

            	    otherlv_32=(Token)match(input,46,FOLLOW_44); 

            	    									newLeafNode(otherlv_32, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canLeave(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            				

            }

            otherlv_33=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTimeZoneC"

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\56\24\uffff";
    static final String dfa_3s = "\1\103\24\uffff";
    static final String dfa_4s = "\1\uffff\1\24\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23";
    static final String dfa_5s = "\1\0\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 829:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==46) ) {s = 1;}

                        else if ( LA33_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA33_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA33_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA33_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA33_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA33_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA33_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA33_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA33_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA33_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA33_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA33_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA33_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA33_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA33_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA33_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA33_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\42\uffff";
    static final String dfa_8s = "\1\56\41\uffff";
    static final String dfa_9s = "\1\156\41\uffff";
    static final String dfa_10s = "\1\uffff\1\41\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40";
    static final String dfa_11s = "\1\0\41\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\5\1\3\1\11\1\14\1\15\6\uffff\1\13\2\uffff\1\34\1\36\1\40\1\uffff\1\6\1\41\25\uffff\1\21\1\20\1\uffff\1\2\1\4\1\7\1\10\1\12\1\16\1\17\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\35\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 2875:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==46) ) {s = 1;}

                        else if ( LA57_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA57_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA57_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA57_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA57_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA57_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA57_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA57_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA57_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA57_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA57_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA57_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA57_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA57_0 == 98 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA57_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA57_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA57_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA57_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA57_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                        else if ( LA57_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19) ) {s = 21;}

                        else if ( LA57_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20) ) {s = 22;}

                        else if ( LA57_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21) ) {s = 23;}

                        else if ( LA57_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22) ) {s = 24;}

                        else if ( LA57_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23) ) {s = 25;}

                        else if ( LA57_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24) ) {s = 26;}

                        else if ( LA57_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25) ) {s = 27;}

                        else if ( LA57_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26) ) {s = 28;}

                        else if ( LA57_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27) ) {s = 29;}

                        else if ( LA57_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28) ) {s = 30;}

                        else if ( LA57_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29) ) {s = 31;}

                        else if ( LA57_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30) ) {s = 32;}

                        else if ( LA57_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31) ) {s = 33;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\33\uffff";
    static final String dfa_14s = "\1\56\32\uffff";
    static final String dfa_15s = "\1\154\32\uffff";
    static final String dfa_16s = "\1\uffff\1\32\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31";
    static final String dfa_17s = "\1\0\32\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\uffff\1\3\1\2\1\7\1\12\1\13\6\uffff\1\11\2\uffff\1\32\3\uffff\1\4\26\uffff\1\17\1\16\3\uffff\1\5\1\6\1\10\1\14\1\15\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()+ loopback of 4423:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_0 = input.LA(1);

                         
                        int index71_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA71_0==46) ) {s = 1;}

                        else if ( LA71_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA71_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA71_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA71_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA71_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA71_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA71_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA71_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA71_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA71_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA71_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA71_0 == 98 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA71_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA71_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA71_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA71_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA71_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA71_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA71_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                        else if ( LA71_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19) ) {s = 21;}

                        else if ( LA71_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20) ) {s = 22;}

                        else if ( LA71_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21) ) {s = 23;}

                        else if ( LA71_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22) ) {s = 24;}

                        else if ( LA71_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23) ) {s = 25;}

                        else if ( LA71_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24) ) {s = 26;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\16\uffff";
    static final String dfa_20s = "\1\56\15\uffff";
    static final String dfa_21s = "\1\161\15\uffff";
    static final String dfa_22s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_23s = "\1\0\15\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\uffff\1\3\1\2\1\4\1\uffff\1\5\5\uffff\1\6\6\uffff\1\7\27\uffff\1\10\12\uffff\1\11\2\uffff\1\13\3\uffff\1\14\1\15\4\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 5712:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_0 = input.LA(1);

                         
                        int index78_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA78_0==46) ) {s = 1;}

                        else if ( LA78_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA78_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA78_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA78_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA78_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA78_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA78_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA78_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA78_0 == 113 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA78_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA78_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA78_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                         
                        input.seek(index78_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E8022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000BC0000000000L,0x0005800008000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000FC0000000000L,0x0005800008000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFFBF000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000FE00000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFFBF400000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFFF400000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x4020000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x4020400000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001400000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200400000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000400000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC81F000000000000L,0x00007FFFF600000DL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC81F400000000000L,0x00007FFFF600000DL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xC85F400000000000L,0x00007FFFF600000DL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x481F000000000000L,0x00001FFFC6000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x481F400000000000L,0x00001FFFC6000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0417000000000000L,0x0002189002000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0417400000000000L,0x0002189002000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0078180080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L,0x0078180080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}
