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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STR", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enregistrer sous: '", "'Janvier'", "'Fevrier'", "'Mars'", "'Avril'", "'Mai'", "'Juin'", "'Juillet'", "'Aout'", "'Septembre'", "'Octobre'", "'Novembre'", "'Decembre'", "' a '", "'h'", "':'", "' heure '", "'m'", "'mn'", "'min'", "' minutes'", "' et '", "'s'", "'sec'", "' secondes '", "'PUBLIC'", "'PRIVATE'", "'CONFIDENTIAL'", "'Tentative'", "'Confirm\\uFFFD'", "'Annul\\uFFFD'", "'Compl\\uFFFDt\\uFFFD'", "'En cours'", "'Lundi'", "'Mardi'", "'Mercredi'", "'Jeudi'", "'Vendredi'", "'Samedi'", "'Dimanche'", "'Calendar'", "'{'", "'Version:'", "'ProdId:'", "'Methode:'", "'Calscale:'", "'}'", "'EventC'", "'Date:'", "'Identifiant:'", "'Organisateur:'", "'Objet:'", "'URL:'", "'Attachements:'", "','", "'Invites:'", "'Categories:'", "'Commentaire:'", "'Contact:'", "'Status:'", "'Relier a:'", "'Resources:'", "'Description:'", "'Priorite:'", "'Lieu:'", "'Fin:'", "'Classe:'", "'Alarmes:'", "'AlarmC'", "'Action:'", "'Trigger:'", "'Type:'", "'Temps:'", "'tzprop'", "'Tzoffseto:'", "'Tzoffsetfrom:'", "'Rrule:'", "'Opt'", "'tzpropOptional'", "'Rdate:'", "'Tzname:'", "'X_prop:'", "'Iana_prop:'", "'ComponentAlarmTime'", "'Duree:'", "'Repeter:'", "'ComponentAlarmAudioProperty'", "'ComponentAlarmDispProperty'", "'ComponentAlarmEmailProperty'", "'Invites'", "'Attachements'", "'ToDoC'", "'Dtstamp:'", "'Due:'", "'Cree le:'", "'Last_mod:'", "'Seq:'", "'Recurid:'", "'Rrule'", "'Categories'", "'Commentaire'", "'Contact'", "'Exdate'", "'Rstatus'", "'Relier a'", "'Resources'", "'Rdate'", "'X_prop'", "'Iana_prop'", "'Completee:'", "'Geo:'", "'JournalC'", "'VacationC'", "'Freebusy'", "'TimeZoneC'", "'Tzid:'", "'Tzurl:'", "'Standardc'", "'Daylightc'"
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
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
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
            case 59:
                {
                alt1=1;
                }
                break;
            case 103:
                {
                alt1=2;
                }
                break;
            case 123:
                {
                alt1=3;
                }
                break;
            case 124:
                {
                alt1=4;
                }
                break;
            case 126:
                {
                alt1=5;
                }
                break;
            case 80:
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
            case 98:
                {
                alt2=1;
                }
                break;
            case 99:
                {
                alt2=2;
                }
                break;
            case 100:
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


    // $ANTLR start "entryRuleMonth"
    // InternalMyDsl.g:241:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // InternalMyDsl.g:241:46: (iv_ruleMonth= ruleMonth EOF )
            // InternalMyDsl.g:242:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
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
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // InternalMyDsl.g:248:1: ruleMonth returns [EObject current=null] : (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT ) ;
    public final EObject ruleMonth() throws RecognitionException {
        EObject current = null;

        EObject this_MonthT_0 = null;

        EObject this_MonthNameT_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT ) )
            // InternalMyDsl.g:255:2: (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT )
            {
            // InternalMyDsl.g:255:2: (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=13 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:256:3: this_MonthT_0= ruleMonthT
                    {

                    			newCompositeNode(grammarAccess.getMonthAccess().getMonthTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonthT_0=ruleMonthT();

                    state._fsp--;


                    			current = this_MonthT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:265:3: this_MonthNameT_1= ruleMonthNameT
                    {

                    			newCompositeNode(grammarAccess.getMonthAccess().getMonthNameTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonthNameT_1=ruleMonthNameT();

                    state._fsp--;


                    			current = this_MonthNameT_1;
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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleMonthNameT"
    // InternalMyDsl.g:277:1: entryRuleMonthNameT returns [EObject current=null] : iv_ruleMonthNameT= ruleMonthNameT EOF ;
    public final EObject entryRuleMonthNameT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthNameT = null;


        try {
            // InternalMyDsl.g:277:51: (iv_ruleMonthNameT= ruleMonthNameT EOF )
            // InternalMyDsl.g:278:2: iv_ruleMonthNameT= ruleMonthNameT EOF
            {
             newCompositeNode(grammarAccess.getMonthNameTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonthNameT=ruleMonthNameT();

            state._fsp--;

             current =iv_ruleMonthNameT; 
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
    // $ANTLR end "entryRuleMonthNameT"


    // $ANTLR start "ruleMonthNameT"
    // InternalMyDsl.g:284:1: ruleMonthNameT returns [EObject current=null] : ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) ) ) ;
    public final EObject ruleMonthNameT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;
        Token lv_value_0_11=null;
        Token lv_value_0_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:290:2: ( ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) ) ) )
            // InternalMyDsl.g:291:2: ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) ) )
            {
            // InternalMyDsl.g:291:2: ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) ) )
            // InternalMyDsl.g:292:3: ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) )
            {
            // InternalMyDsl.g:292:3: ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' ) )
            // InternalMyDsl.g:293:4: (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' )
            {
            // InternalMyDsl.g:293:4: (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' )
            int alt4=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            case 22:
                {
                alt4=10;
                }
                break;
            case 23:
                {
                alt4=11;
                }
                break;
            case 24:
                {
                alt4=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:294:5: lv_value_0_1= 'Janvier'
                    {
                    lv_value_0_1=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getMonthNameTAccess().getValueJanvierKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:305:5: lv_value_0_2= 'Fevrier'
                    {
                    lv_value_0_2=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getMonthNameTAccess().getValueFevrierKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:316:5: lv_value_0_3= 'Mars'
                    {
                    lv_value_0_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getMonthNameTAccess().getValueMarsKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:327:5: lv_value_0_4= 'Avril'
                    {
                    lv_value_0_4=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getMonthNameTAccess().getValueAvrilKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:338:5: lv_value_0_5= 'Mai'
                    {
                    lv_value_0_5=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getMonthNameTAccess().getValueMaiKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:349:5: lv_value_0_6= 'Juin'
                    {
                    lv_value_0_6=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getMonthNameTAccess().getValueJuinKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:360:5: lv_value_0_7= 'Juillet'
                    {
                    lv_value_0_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getMonthNameTAccess().getValueJuilletKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:371:5: lv_value_0_8= 'Aout'
                    {
                    lv_value_0_8=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getMonthNameTAccess().getValueAoutKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:382:5: lv_value_0_9= 'Septembre'
                    {
                    lv_value_0_9=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getMonthNameTAccess().getValueSeptembreKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:393:5: lv_value_0_10= 'Octobre'
                    {
                    lv_value_0_10=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getMonthNameTAccess().getValueOctobreKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:404:5: lv_value_0_11= 'Novembre'
                    {
                    lv_value_0_11=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_11, grammarAccess.getMonthNameTAccess().getValueNovembreKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_11, null);
                    				

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:415:5: lv_value_0_12= 'Decembre'
                    {
                    lv_value_0_12=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_12, grammarAccess.getMonthNameTAccess().getValueDecembreKeyword_0_11());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_12, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleMonthNameT"


    // $ANTLR start "entryRuleMonthT"
    // InternalMyDsl.g:431:1: entryRuleMonthT returns [EObject current=null] : iv_ruleMonthT= ruleMonthT EOF ;
    public final EObject entryRuleMonthT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthT = null;


        try {
            // InternalMyDsl.g:431:47: (iv_ruleMonthT= ruleMonthT EOF )
            // InternalMyDsl.g:432:2: iv_ruleMonthT= ruleMonthT EOF
            {
             newCompositeNode(grammarAccess.getMonthTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonthT=ruleMonthT();

            state._fsp--;

             current =iv_ruleMonthT; 
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
    // $ANTLR end "entryRuleMonthT"


    // $ANTLR start "ruleMonthT"
    // InternalMyDsl.g:438:1: ruleMonthT returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleMonthT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:444:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:445:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:445:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:446:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:446:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:447:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMonthTAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonthTRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"xCalendar.MyDsl.INT");
            			

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
    // $ANTLR end "ruleMonthT"


    // $ANTLR start "entryRuleDateT"
    // InternalMyDsl.g:466:1: entryRuleDateT returns [EObject current=null] : iv_ruleDateT= ruleDateT EOF ;
    public final EObject entryRuleDateT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateT = null;


        try {
            // InternalMyDsl.g:466:46: (iv_ruleDateT= ruleDateT EOF )
            // InternalMyDsl.g:467:2: iv_ruleDateT= ruleDateT EOF
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
    // InternalMyDsl.g:473:1: ruleDateT returns [EObject current=null] : ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= RULE_INT ) )? ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )? ) ;
    public final EObject ruleDateT() throws RecognitionException {
        EObject current = null;

        Token lv_day_1_0=null;
        Token lv_year_3_0=null;
        Token otherlv_4=null;
        Token lv_hours_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_minutes_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_seconds_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_day_name_0_0 = null;

        EObject lv_month_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:479:2: ( ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= RULE_INT ) )? ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )? ) )
            // InternalMyDsl.g:480:2: ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= RULE_INT ) )? ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )? )
            {
            // InternalMyDsl.g:480:2: ( ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= RULE_INT ) )? ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )? )
            // InternalMyDsl.g:481:3: ( (lv_day_name_0_0= ruleDayName ) )? ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= RULE_INT ) )? ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )?
            {
            // InternalMyDsl.g:481:3: ( (lv_day_name_0_0= ruleDayName ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=45 && LA5_0<=51)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:482:4: (lv_day_name_0_0= ruleDayName )
                    {
                    // InternalMyDsl.g:482:4: (lv_day_name_0_0= ruleDayName )
                    // InternalMyDsl.g:483:5: lv_day_name_0_0= ruleDayName
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

            // InternalMyDsl.g:500:3: ( (lv_day_1_0= RULE_INT ) )
            // InternalMyDsl.g:501:4: (lv_day_1_0= RULE_INT )
            {
            // InternalMyDsl.g:501:4: (lv_day_1_0= RULE_INT )
            // InternalMyDsl.g:502:5: lv_day_1_0= RULE_INT
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

            // InternalMyDsl.g:518:3: ( (lv_month_2_0= ruleMonth ) )
            // InternalMyDsl.g:519:4: (lv_month_2_0= ruleMonth )
            {
            // InternalMyDsl.g:519:4: (lv_month_2_0= ruleMonth )
            // InternalMyDsl.g:520:5: lv_month_2_0= ruleMonth
            {

            					newCompositeNode(grammarAccess.getDateTAccess().getMonthMonthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_month_2_0=ruleMonth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTRule());
            					}
            					set(
            						current,
            						"month",
            						lv_month_2_0,
            						"xCalendar.MyDsl.Month");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:537:3: ( (lv_year_3_0= RULE_INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_INT||LA6_1==25||LA6_1==58||(LA6_1>=60 && LA6_1<=65)||(LA6_1>=67 && LA6_1<=79)||(LA6_1>=101 && LA6_1<=102)||(LA6_1>=104 && LA6_1<=122)||LA6_1==125) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:538:4: (lv_year_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:538:4: (lv_year_3_0= RULE_INT )
                    // InternalMyDsl.g:539:5: lv_year_3_0= RULE_INT
                    {
                    lv_year_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    					newLeafNode(lv_year_3_0, grammarAccess.getDateTAccess().getYearINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDateTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"year",
                    						lv_year_3_0,
                    						"xCalendar.MyDsl.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:555:3: ( (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:556:4: (otherlv_4= ' a ' )? ( (lv_hours_5_0= RULE_INT ) ) (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' ) ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )? ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )?
                    {
                    // InternalMyDsl.g:556:4: (otherlv_4= ' a ' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:557:5: otherlv_4= ' a '
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateTAccess().getAKeyword_4_0());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:562:4: ( (lv_hours_5_0= RULE_INT ) )
                    // InternalMyDsl.g:563:5: (lv_hours_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:563:5: (lv_hours_5_0= RULE_INT )
                    // InternalMyDsl.g:564:6: lv_hours_5_0= RULE_INT
                    {
                    lv_hours_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_hours_5_0, grammarAccess.getDateTAccess().getHoursINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDateTRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hours",
                    							lv_hours_5_0,
                    							"xCalendar.MyDsl.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:580:4: (otherlv_6= 'h' | otherlv_7= ':' | otherlv_8= ' heure ' )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt8=1;
                        }
                        break;
                    case 27:
                        {
                        alt8=2;
                        }
                        break;
                    case 28:
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
                            // InternalMyDsl.g:581:5: otherlv_6= 'h'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_9); 

                            					newLeafNode(otherlv_6, grammarAccess.getDateTAccess().getHKeyword_4_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:586:5: otherlv_7= ':'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_9); 

                            					newLeafNode(otherlv_7, grammarAccess.getDateTAccess().getColonKeyword_4_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:591:5: otherlv_8= ' heure '
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getDateTAccess().getHeureKeyword_4_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:596:4: ( ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:597:5: ( (lv_minutes_9_0= RULE_INT ) ) (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )?
                            {
                            // InternalMyDsl.g:597:5: ( (lv_minutes_9_0= RULE_INT ) )
                            // InternalMyDsl.g:598:6: (lv_minutes_9_0= RULE_INT )
                            {
                            // InternalMyDsl.g:598:6: (lv_minutes_9_0= RULE_INT )
                            // InternalMyDsl.g:599:7: lv_minutes_9_0= RULE_INT
                            {
                            lv_minutes_9_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                            							newLeafNode(lv_minutes_9_0, grammarAccess.getDateTAccess().getMinutesINTTerminalRuleCall_4_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDateTRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"minutes",
                            								lv_minutes_9_0,
                            								"xCalendar.MyDsl.INT");
                            						

                            }


                            }

                            // InternalMyDsl.g:615:5: (otherlv_10= 'm' | otherlv_11= 'mn' | otherlv_12= 'min' | otherlv_13= ' minutes' | otherlv_14= ':' )?
                            int alt9=6;
                            switch ( input.LA(1) ) {
                                case 29:
                                    {
                                    alt9=1;
                                    }
                                    break;
                                case 30:
                                    {
                                    alt9=2;
                                    }
                                    break;
                                case 31:
                                    {
                                    alt9=3;
                                    }
                                    break;
                                case 32:
                                    {
                                    alt9=4;
                                    }
                                    break;
                                case 27:
                                    {
                                    alt9=5;
                                    }
                                    break;
                            }

                            switch (alt9) {
                                case 1 :
                                    // InternalMyDsl.g:616:6: otherlv_10= 'm'
                                    {
                                    otherlv_10=(Token)match(input,29,FOLLOW_9); 

                                    						newLeafNode(otherlv_10, grammarAccess.getDateTAccess().getMKeyword_4_3_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:621:6: otherlv_11= 'mn'
                                    {
                                    otherlv_11=(Token)match(input,30,FOLLOW_9); 

                                    						newLeafNode(otherlv_11, grammarAccess.getDateTAccess().getMnKeyword_4_3_1_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:626:6: otherlv_12= 'min'
                                    {
                                    otherlv_12=(Token)match(input,31,FOLLOW_9); 

                                    						newLeafNode(otherlv_12, grammarAccess.getDateTAccess().getMinKeyword_4_3_1_2());
                                    					

                                    }
                                    break;
                                case 4 :
                                    // InternalMyDsl.g:631:6: otherlv_13= ' minutes'
                                    {
                                    otherlv_13=(Token)match(input,32,FOLLOW_9); 

                                    						newLeafNode(otherlv_13, grammarAccess.getDateTAccess().getMinutesKeyword_4_3_1_3());
                                    					

                                    }
                                    break;
                                case 5 :
                                    // InternalMyDsl.g:636:6: otherlv_14= ':'
                                    {
                                    otherlv_14=(Token)match(input,27,FOLLOW_9); 

                                    						newLeafNode(otherlv_14, grammarAccess.getDateTAccess().getColonKeyword_4_3_1_4());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:642:4: ( (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT||LA13_0==33) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:643:5: (otherlv_15= ' et ' )? ( (lv_seconds_16_0= RULE_INT ) ) (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )?
                            {
                            // InternalMyDsl.g:643:5: (otherlv_15= ' et ' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==33) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalMyDsl.g:644:6: otherlv_15= ' et '
                                    {
                                    otherlv_15=(Token)match(input,33,FOLLOW_5); 

                                    						newLeafNode(otherlv_15, grammarAccess.getDateTAccess().getEtKeyword_4_4_0());
                                    					

                                    }
                                    break;

                            }

                            // InternalMyDsl.g:649:5: ( (lv_seconds_16_0= RULE_INT ) )
                            // InternalMyDsl.g:650:6: (lv_seconds_16_0= RULE_INT )
                            {
                            // InternalMyDsl.g:650:6: (lv_seconds_16_0= RULE_INT )
                            // InternalMyDsl.g:651:7: lv_seconds_16_0= RULE_INT
                            {
                            lv_seconds_16_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                            							newLeafNode(lv_seconds_16_0, grammarAccess.getDateTAccess().getSecondsINTTerminalRuleCall_4_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDateTRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"seconds",
                            								lv_seconds_16_0,
                            								"xCalendar.MyDsl.INT");
                            						

                            }


                            }

                            // InternalMyDsl.g:667:5: (otherlv_17= 's' | otherlv_18= 'sec' | otherlv_19= ' secondes ' )?
                            int alt12=4;
                            switch ( input.LA(1) ) {
                                case 34:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case 35:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                case 36:
                                    {
                                    alt12=3;
                                    }
                                    break;
                            }

                            switch (alt12) {
                                case 1 :
                                    // InternalMyDsl.g:668:6: otherlv_17= 's'
                                    {
                                    otherlv_17=(Token)match(input,34,FOLLOW_2); 

                                    						newLeafNode(otherlv_17, grammarAccess.getDateTAccess().getSKeyword_4_4_2_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:673:6: otherlv_18= 'sec'
                                    {
                                    otherlv_18=(Token)match(input,35,FOLLOW_2); 

                                    						newLeafNode(otherlv_18, grammarAccess.getDateTAccess().getSecKeyword_4_4_2_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:678:6: otherlv_19= ' secondes '
                                    {
                                    otherlv_19=(Token)match(input,36,FOLLOW_2); 

                                    						newLeafNode(otherlv_19, grammarAccess.getDateTAccess().getSecondesKeyword_4_4_2_2());
                                    					

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
    // InternalMyDsl.g:689:1: entryRuleClassification returns [String current=null] : iv_ruleClassification= ruleClassification EOF ;
    public final String entryRuleClassification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassification = null;


        try {
            // InternalMyDsl.g:689:54: (iv_ruleClassification= ruleClassification EOF )
            // InternalMyDsl.g:690:2: iv_ruleClassification= ruleClassification EOF
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
    // InternalMyDsl.g:696:1: ruleClassification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' ) ;
    public final AntlrDatatypeRuleToken ruleClassification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:702:2: ( (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' ) )
            // InternalMyDsl.g:703:2: (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' )
            {
            // InternalMyDsl.g:703:2: (kw= 'PUBLIC' | kw= 'PRIVATE' | kw= 'CONFIDENTIAL' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
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
                    // InternalMyDsl.g:704:3: kw= 'PUBLIC'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationAccess().getPUBLICKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:710:3: kw= 'PRIVATE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassificationAccess().getPRIVATEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:716:3: kw= 'CONFIDENTIAL'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMyDsl.g:725:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // InternalMyDsl.g:725:46: (iv_ruleStatus= ruleStatus EOF )
            // InternalMyDsl.g:726:2: iv_ruleStatus= ruleStatus EOF
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
    // InternalMyDsl.g:732:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' ) ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:738:2: ( (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' ) )
            // InternalMyDsl.g:739:2: (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' )
            {
            // InternalMyDsl.g:739:2: (kw= 'Tentative' | kw= 'Confirm\\uFFFD' | kw= 'Annul\\uFFFD' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt16=1;
                }
                break;
            case 41:
                {
                alt16=2;
                }
                break;
            case 42:
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
                    // InternalMyDsl.g:740:3: kw= 'Tentative'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getTentativeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:746:3: kw= 'Confirm\\uFFFD'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getConfirmKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:752:3: kw= 'Annul\\uFFFD'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalMyDsl.g:761:1: entryRuleEventStatus returns [String current=null] : iv_ruleEventStatus= ruleEventStatus EOF ;
    public final String entryRuleEventStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventStatus = null;


        try {
            // InternalMyDsl.g:761:51: (iv_ruleEventStatus= ruleEventStatus EOF )
            // InternalMyDsl.g:762:2: iv_ruleEventStatus= ruleEventStatus EOF
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
    // InternalMyDsl.g:768:1: ruleEventStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' ) ;
    public final AntlrDatatypeRuleToken ruleEventStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Status_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:774:2: ( (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' ) )
            // InternalMyDsl.g:775:2: (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' )
            {
            // InternalMyDsl.g:775:2: (this_Status_0= ruleStatus | kw= 'Compl\\uFFFDt\\uFFFD' | kw= 'En cours' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
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
                    // InternalMyDsl.g:776:3: this_Status_0= ruleStatus
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
                    // InternalMyDsl.g:787:3: kw= 'Compl\\uFFFDt\\uFFFD'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEventStatusAccess().getComplTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:793:3: kw= 'En cours'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMyDsl.g:802:1: entryRuleDayName returns [String current=null] : iv_ruleDayName= ruleDayName EOF ;
    public final String entryRuleDayName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayName = null;


        try {
            // InternalMyDsl.g:802:47: (iv_ruleDayName= ruleDayName EOF )
            // InternalMyDsl.g:803:2: iv_ruleDayName= ruleDayName EOF
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
    // InternalMyDsl.g:809:1: ruleDayName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' ) ;
    public final AntlrDatatypeRuleToken ruleDayName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:815:2: ( (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' ) )
            // InternalMyDsl.g:816:2: (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' )
            {
            // InternalMyDsl.g:816:2: (kw= 'Lundi' | kw= 'Mardi' | kw= 'Mercredi' | kw= 'Jeudi' | kw= 'Vendredi' | kw= 'Samedi' | kw= 'Dimanche' )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            case 48:
                {
                alt18=4;
                }
                break;
            case 49:
                {
                alt18=5;
                }
                break;
            case 50:
                {
                alt18=6;
                }
                break;
            case 51:
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
                    // InternalMyDsl.g:817:3: kw= 'Lundi'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getLundiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:823:3: kw= 'Mardi'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getMardiKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:829:3: kw= 'Mercredi'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getMercrediKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:835:3: kw= 'Jeudi'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getJeudiKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:841:3: kw= 'Vendredi'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getVendrediKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:847:3: kw= 'Samedi'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDayNameAccess().getSamediKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:853:3: kw= 'Dimanche'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalMyDsl.g:862:1: entryRuleCalendar returns [EObject current=null] : iv_ruleCalendar= ruleCalendar EOF ;
    public final EObject entryRuleCalendar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendar = null;


        try {
            // InternalMyDsl.g:862:49: (iv_ruleCalendar= ruleCalendar EOF )
            // InternalMyDsl.g:863:2: iv_ruleCalendar= ruleCalendar EOF
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
    // InternalMyDsl.g:869:1: ruleCalendar returns [EObject current=null] : (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:875:2: ( (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' ) )
            // InternalMyDsl.g:876:2: (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' )
            {
            // InternalMyDsl.g:876:2: (otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}' )
            // InternalMyDsl.g:877:3: otherlv_0= 'Calendar' otherlv_1= '{' (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )? (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )? (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )? (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )? ( (lv_component_10_0= ruleComponent ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCalendarAccess().getCalendarKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCalendarAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:885:3: (otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:886:4: otherlv_2= 'Version:' ( (lv_version_3_0= RULE_STR ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalendarAccess().getVersionKeyword_2_0());
                    			
                    // InternalMyDsl.g:890:4: ( (lv_version_3_0= RULE_STR ) )
                    // InternalMyDsl.g:891:5: (lv_version_3_0= RULE_STR )
                    {
                    // InternalMyDsl.g:891:5: (lv_version_3_0= RULE_STR )
                    // InternalMyDsl.g:892:6: lv_version_3_0= RULE_STR
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

            // InternalMyDsl.g:909:3: (otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:910:4: otherlv_4= 'ProdId:' ( (lv_prodid_5_0= RULE_STR ) )
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalendarAccess().getProdIdKeyword_3_0());
                    			
                    // InternalMyDsl.g:914:4: ( (lv_prodid_5_0= RULE_STR ) )
                    // InternalMyDsl.g:915:5: (lv_prodid_5_0= RULE_STR )
                    {
                    // InternalMyDsl.g:915:5: (lv_prodid_5_0= RULE_STR )
                    // InternalMyDsl.g:916:6: lv_prodid_5_0= RULE_STR
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

            // InternalMyDsl.g:933:3: (otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:934:4: otherlv_6= 'Methode:' ( (lv_method_7_0= RULE_STR ) )
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCalendarAccess().getMethodeKeyword_4_0());
                    			
                    // InternalMyDsl.g:938:4: ( (lv_method_7_0= RULE_STR ) )
                    // InternalMyDsl.g:939:5: (lv_method_7_0= RULE_STR )
                    {
                    // InternalMyDsl.g:939:5: (lv_method_7_0= RULE_STR )
                    // InternalMyDsl.g:940:6: lv_method_7_0= RULE_STR
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

            // InternalMyDsl.g:957:3: (otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:958:4: otherlv_8= 'Calscale:' ( (lv_calscale_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCalendarAccess().getCalscaleKeyword_5_0());
                    			
                    // InternalMyDsl.g:962:4: ( (lv_calscale_9_0= RULE_STR ) )
                    // InternalMyDsl.g:963:5: (lv_calscale_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:963:5: (lv_calscale_9_0= RULE_STR )
                    // InternalMyDsl.g:964:6: lv_calscale_9_0= RULE_STR
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

            // InternalMyDsl.g:981:3: ( (lv_component_10_0= ruleComponent ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59||LA23_0==80||LA23_0==103||(LA23_0>=123 && LA23_0<=124)||LA23_0==126) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:982:4: (lv_component_10_0= ruleComponent )
            	    {
            	    // InternalMyDsl.g:982:4: (lv_component_10_0= ruleComponent )
            	    // InternalMyDsl.g:983:5: lv_component_10_0= ruleComponent
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

            otherlv_11=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:1008:1: entryRuleEventC returns [EObject current=null] : iv_ruleEventC= ruleEventC EOF ;
    public final EObject entryRuleEventC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventC = null;


        try {
            // InternalMyDsl.g:1008:47: (iv_ruleEventC= ruleEventC EOF )
            // InternalMyDsl.g:1009:2: iv_ruleEventC= ruleEventC EOF
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
    // InternalMyDsl.g:1015:1: ruleEventC returns [EObject current=null] : (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' ) ;
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
            // InternalMyDsl.g:1021:2: ( (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' ) )
            // InternalMyDsl.g:1022:2: (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' )
            {
            // InternalMyDsl.g:1022:2: (otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}' )
            // InternalMyDsl.g:1023:3: otherlv_0= 'EventC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_59= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEventCAccess().getEventCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEventCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1031:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1032:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1032:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1033:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEventCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1036:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1037:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1037:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=20;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1038:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1038:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:1039:5: {...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1039:103: ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:1040:6: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1043:9: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:1043:10: {...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1043:19: (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:1043:20: otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) )
            	    {
            	    otherlv_3=(Token)match(input,60,FOLLOW_16); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEventCAccess().getDateKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:1047:9: ( (lv_dtstart_4_0= ruleDateT ) )
            	    // InternalMyDsl.g:1048:10: (lv_dtstart_4_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:1048:10: (lv_dtstart_4_0= ruleDateT )
            	    // InternalMyDsl.g:1049:11: lv_dtstart_4_0= ruleDateT
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
            	    // InternalMyDsl.g:1072:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1072:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1073:5: {...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1073:103: ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1074:6: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1077:9: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1077:10: {...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1077:19: (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1077:20: otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEventCAccess().getIdentifiantKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:1081:9: ( (lv_uid_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:1082:10: (lv_uid_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1082:10: (lv_uid_6_0= RULE_STR )
            	    // InternalMyDsl.g:1083:11: lv_uid_6_0= RULE_STR
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
            	    // InternalMyDsl.g:1105:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1105:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1106:5: {...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1106:103: ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1107:6: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1110:9: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1110:10: {...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1110:19: (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1110:20: otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEventCAccess().getOrganisateurKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:1114:9: ( (lv_organizer_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:1115:10: (lv_organizer_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1115:10: (lv_organizer_8_0= RULE_STR )
            	    // InternalMyDsl.g:1116:11: lv_organizer_8_0= RULE_STR
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
            	    // InternalMyDsl.g:1138:4: ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1138:4: ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1139:5: {...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1139:103: ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1140:6: ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1143:9: ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1143:10: {...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1143:19: (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1143:20: otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEventCAccess().getObjetKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:1147:9: ( (lv_summary_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:1148:10: (lv_summary_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1148:10: (lv_summary_10_0= RULE_STR )
            	    // InternalMyDsl.g:1149:11: lv_summary_10_0= RULE_STR
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
            	    // InternalMyDsl.g:1171:4: ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1171:4: ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1172:5: {...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1172:103: ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1173:6: ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1176:9: ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1176:10: {...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1176:19: (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1176:20: otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEventCAccess().getURLKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:1180:9: ( (lv_url_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:1181:10: (lv_url_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1181:10: (lv_url_12_0= RULE_STR )
            	    // InternalMyDsl.g:1182:11: lv_url_12_0= RULE_STR
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
            	    // InternalMyDsl.g:1204:4: ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1204:4: ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1205:5: {...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1205:103: ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1206:6: ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1209:9: ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1209:10: {...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1209:19: (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1209:20: otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )*
            	    {
            	    otherlv_13=(Token)match(input,65,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getEventCAccess().getAttachementsKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:1213:9: ( (lv_attach_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:1214:10: (lv_attach_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1214:10: (lv_attach_14_0= RULE_STR )
            	    // InternalMyDsl.g:1215:11: lv_attach_14_0= RULE_STR
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

            	    // InternalMyDsl.g:1231:9: (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==66) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1232:10: otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getEventCAccess().getCommaKeyword_2_5_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1236:10: ( (lv_attach_16_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1237:11: (lv_attach_16_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1237:11: (lv_attach_16_0= RULE_STR )
            	    	    // InternalMyDsl.g:1238:12: lv_attach_16_0= RULE_STR
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
            	    // InternalMyDsl.g:1261:4: ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1261:4: ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1262:5: {...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:1262:103: ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1263:6: ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:1266:9: ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1266:10: {...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1266:19: (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1266:20: otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,67,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getEventCAccess().getInvitesKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:1270:9: ( (lv_attendee_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:1271:10: (lv_attendee_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1271:10: (lv_attendee_18_0= RULE_STR )
            	    // InternalMyDsl.g:1272:11: lv_attendee_18_0= RULE_STR
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

            	    // InternalMyDsl.g:1288:9: (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==66) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1289:10: otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getEventCAccess().getCommaKeyword_2_6_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1293:10: ( (lv_attendee_20_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1294:11: (lv_attendee_20_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1294:11: (lv_attendee_20_0= RULE_STR )
            	    	    // InternalMyDsl.g:1295:12: lv_attendee_20_0= RULE_STR
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
            	    // InternalMyDsl.g:1318:4: ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1318:4: ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1319:5: {...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:1319:103: ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1320:6: ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:1323:9: ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1323:10: {...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1323:19: (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1323:20: otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,68,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getEventCAccess().getCategoriesKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:1327:9: ( (lv_categories_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:1328:10: (lv_categories_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1328:10: (lv_categories_22_0= RULE_STR )
            	    // InternalMyDsl.g:1329:11: lv_categories_22_0= RULE_STR
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

            	    // InternalMyDsl.g:1345:9: (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==66) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1346:10: otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getEventCAccess().getCommaKeyword_2_7_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1350:10: ( (lv_categories_24_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1351:11: (lv_categories_24_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1351:11: (lv_categories_24_0= RULE_STR )
            	    	    // InternalMyDsl.g:1352:12: lv_categories_24_0= RULE_STR
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
            	    // InternalMyDsl.g:1375:4: ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1375:4: ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1376:5: {...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:1376:103: ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1377:6: ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:1380:9: ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1380:10: {...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1380:19: (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1380:20: otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,69,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getEventCAccess().getCommentaireKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:1384:9: ( (lv_comment_26_0= RULE_STR ) )
            	    // InternalMyDsl.g:1385:10: (lv_comment_26_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1385:10: (lv_comment_26_0= RULE_STR )
            	    // InternalMyDsl.g:1386:11: lv_comment_26_0= RULE_STR
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

            	    // InternalMyDsl.g:1402:9: (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==66) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1403:10: otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_27, grammarAccess.getEventCAccess().getCommaKeyword_2_8_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1407:10: ( (lv_comment_28_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1408:11: (lv_comment_28_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1408:11: (lv_comment_28_0= RULE_STR )
            	    	    // InternalMyDsl.g:1409:12: lv_comment_28_0= RULE_STR
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
            	    // InternalMyDsl.g:1432:4: ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1432:4: ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1433:5: {...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:1433:103: ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1434:6: ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:1437:9: ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1437:10: {...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1437:19: (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1437:20: otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,70,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getEventCAccess().getContactKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:1441:9: ( (lv_contact_30_0= RULE_STR ) )
            	    // InternalMyDsl.g:1442:10: (lv_contact_30_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1442:10: (lv_contact_30_0= RULE_STR )
            	    // InternalMyDsl.g:1443:11: lv_contact_30_0= RULE_STR
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

            	    // InternalMyDsl.g:1459:9: (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==66) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1460:10: otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getEventCAccess().getCommaKeyword_2_9_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1464:10: ( (lv_contact_32_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1465:11: (lv_contact_32_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1465:11: (lv_contact_32_0= RULE_STR )
            	    	    // InternalMyDsl.g:1466:12: lv_contact_32_0= RULE_STR
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
            	    // InternalMyDsl.g:1489:4: ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1489:4: ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1490:5: {...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:1490:104: ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) )
            	    // InternalMyDsl.g:1491:6: ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:1494:9: ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) )
            	    // InternalMyDsl.g:1494:10: {...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1494:19: (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* )
            	    // InternalMyDsl.g:1494:20: otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,71,FOLLOW_19); 

            	    									newLeafNode(otherlv_33, grammarAccess.getEventCAccess().getStatusKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:1498:9: ( (lv_rstatus_34_0= ruleEventStatus ) )
            	    // InternalMyDsl.g:1499:10: (lv_rstatus_34_0= ruleEventStatus )
            	    {
            	    // InternalMyDsl.g:1499:10: (lv_rstatus_34_0= ruleEventStatus )
            	    // InternalMyDsl.g:1500:11: lv_rstatus_34_0= ruleEventStatus
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

            	    // InternalMyDsl.g:1517:9: (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==66) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1518:10: otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,66,FOLLOW_19); 

            	    	    										newLeafNode(otherlv_35, grammarAccess.getEventCAccess().getCommaKeyword_2_10_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1522:10: ( (lv_rstatus_36_0= ruleEventStatus ) )
            	    	    // InternalMyDsl.g:1523:11: (lv_rstatus_36_0= ruleEventStatus )
            	    	    {
            	    	    // InternalMyDsl.g:1523:11: (lv_rstatus_36_0= ruleEventStatus )
            	    	    // InternalMyDsl.g:1524:12: lv_rstatus_36_0= ruleEventStatus
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
            	    // InternalMyDsl.g:1548:4: ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1548:4: ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1549:5: {...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:1549:104: ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1550:6: ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:1553:9: ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1553:10: {...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1553:19: (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1553:20: otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,72,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getEventCAccess().getRelierAKeyword_2_11_0());
            	    								
            	    // InternalMyDsl.g:1557:9: ( (lv_related_38_0= RULE_STR ) )
            	    // InternalMyDsl.g:1558:10: (lv_related_38_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1558:10: (lv_related_38_0= RULE_STR )
            	    // InternalMyDsl.g:1559:11: lv_related_38_0= RULE_STR
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

            	    // InternalMyDsl.g:1575:9: (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==66) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1576:10: otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getEventCAccess().getCommaKeyword_2_11_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1580:10: ( (lv_related_40_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1581:11: (lv_related_40_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1581:11: (lv_related_40_0= RULE_STR )
            	    	    // InternalMyDsl.g:1582:12: lv_related_40_0= RULE_STR
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
            	    // InternalMyDsl.g:1605:4: ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1605:4: ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1606:5: {...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:1606:104: ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) )
            	    // InternalMyDsl.g:1607:6: ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:1610:9: ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) )
            	    // InternalMyDsl.g:1610:10: {...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1610:19: (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* )
            	    // InternalMyDsl.g:1610:20: otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,73,FOLLOW_3); 

            	    									newLeafNode(otherlv_41, grammarAccess.getEventCAccess().getResourcesKeyword_2_12_0());
            	    								
            	    // InternalMyDsl.g:1614:9: ( (lv_resources_42_0= RULE_STR ) )
            	    // InternalMyDsl.g:1615:10: (lv_resources_42_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1615:10: (lv_resources_42_0= RULE_STR )
            	    // InternalMyDsl.g:1616:11: lv_resources_42_0= RULE_STR
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

            	    // InternalMyDsl.g:1632:9: (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==66) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1633:10: otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getEventCAccess().getCommaKeyword_2_12_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1637:10: ( (lv_resources_44_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:1638:11: (lv_resources_44_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:1638:11: (lv_resources_44_0= RULE_STR )
            	    	    // InternalMyDsl.g:1639:12: lv_resources_44_0= RULE_STR
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
            	    // InternalMyDsl.g:1662:4: ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1662:4: ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1663:5: {...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:1663:104: ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1664:6: ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:1667:9: ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1667:10: {...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1667:19: (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1667:20: otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) )
            	    {
            	    otherlv_45=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_45, grammarAccess.getEventCAccess().getDescriptionKeyword_2_13_0());
            	    								
            	    // InternalMyDsl.g:1671:9: ( (lv_description_46_0= RULE_STR ) )
            	    // InternalMyDsl.g:1672:10: (lv_description_46_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1672:10: (lv_description_46_0= RULE_STR )
            	    // InternalMyDsl.g:1673:11: lv_description_46_0= RULE_STR
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
            	    // InternalMyDsl.g:1695:4: ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1695:4: ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1696:5: {...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:1696:104: ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1697:6: ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:1700:9: ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1700:10: {...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1700:19: (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1700:20: otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) )
            	    {
            	    otherlv_47=(Token)match(input,75,FOLLOW_3); 

            	    									newLeafNode(otherlv_47, grammarAccess.getEventCAccess().getPrioriteKeyword_2_14_0());
            	    								
            	    // InternalMyDsl.g:1704:9: ( (lv_priority_48_0= RULE_STR ) )
            	    // InternalMyDsl.g:1705:10: (lv_priority_48_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1705:10: (lv_priority_48_0= RULE_STR )
            	    // InternalMyDsl.g:1706:11: lv_priority_48_0= RULE_STR
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
            	    // InternalMyDsl.g:1728:4: ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1728:4: ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1729:5: {...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:1729:104: ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1730:6: ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:1733:9: ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1733:10: {...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1733:19: (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1733:20: otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) )
            	    {
            	    otherlv_49=(Token)match(input,76,FOLLOW_3); 

            	    									newLeafNode(otherlv_49, grammarAccess.getEventCAccess().getLieuKeyword_2_15_0());
            	    								
            	    // InternalMyDsl.g:1737:9: ( (lv_location_50_0= RULE_STR ) )
            	    // InternalMyDsl.g:1738:10: (lv_location_50_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1738:10: (lv_location_50_0= RULE_STR )
            	    // InternalMyDsl.g:1739:11: lv_location_50_0= RULE_STR
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
            	    // InternalMyDsl.g:1761:4: ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1761:4: ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:1762:5: {...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:1762:104: ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:1763:6: ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:1766:9: ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:1766:10: {...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1766:19: (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:1766:20: otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) )
            	    {
            	    otherlv_51=(Token)match(input,77,FOLLOW_16); 

            	    									newLeafNode(otherlv_51, grammarAccess.getEventCAccess().getFinKeyword_2_16_0());
            	    								
            	    // InternalMyDsl.g:1770:9: ( (lv_dtend_52_0= ruleDateT ) )
            	    // InternalMyDsl.g:1771:10: (lv_dtend_52_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:1771:10: (lv_dtend_52_0= ruleDateT )
            	    // InternalMyDsl.g:1772:11: lv_dtend_52_0= ruleDateT
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
            	    // InternalMyDsl.g:1795:4: ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1795:4: ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:1796:5: {...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:1796:104: ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:1797:6: ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:1800:9: ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:1800:10: {...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1800:19: (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:1800:20: otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) )
            	    {
            	    otherlv_53=(Token)match(input,78,FOLLOW_20); 

            	    									newLeafNode(otherlv_53, grammarAccess.getEventCAccess().getClasseKeyword_2_17_0());
            	    								
            	    // InternalMyDsl.g:1804:9: ( (lv_class_54_0= ruleClassification ) )
            	    // InternalMyDsl.g:1805:10: (lv_class_54_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:1805:10: (lv_class_54_0= ruleClassification )
            	    // InternalMyDsl.g:1806:11: lv_class_54_0= ruleClassification
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
            	    // InternalMyDsl.g:1829:4: ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:1829:4: ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) )
            	    // InternalMyDsl.g:1830:5: {...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:1830:104: ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) )
            	    // InternalMyDsl.g:1831:6: ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:1834:9: ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) )
            	    // InternalMyDsl.g:1834:10: {...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventC", "true");
            	    }
            	    // InternalMyDsl.g:1834:19: (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* )
            	    // InternalMyDsl.g:1834:20: otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )*
            	    {
            	    otherlv_55=(Token)match(input,79,FOLLOW_13); 

            	    									newLeafNode(otherlv_55, grammarAccess.getEventCAccess().getAlarmesKeyword_2_18_0());
            	    								
            	    // InternalMyDsl.g:1838:9: ( (lv_alarmc_56_0= ruleAlarmC ) )
            	    // InternalMyDsl.g:1839:10: (lv_alarmc_56_0= ruleAlarmC )
            	    {
            	    // InternalMyDsl.g:1839:10: (lv_alarmc_56_0= ruleAlarmC )
            	    // InternalMyDsl.g:1840:11: lv_alarmc_56_0= ruleAlarmC
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

            	    // InternalMyDsl.g:1857:9: (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==66) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1858:10: otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) )
            	    	    {
            	    	    otherlv_57=(Token)match(input,66,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_57, grammarAccess.getEventCAccess().getCommaKeyword_2_18_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:1862:10: ( (lv_alarmc_58_0= ruleAlarmC ) )
            	    	    // InternalMyDsl.g:1863:11: (lv_alarmc_58_0= ruleAlarmC )
            	    	    {
            	    	    // InternalMyDsl.g:1863:11: (lv_alarmc_58_0= ruleAlarmC )
            	    	    // InternalMyDsl.g:1864:12: lv_alarmc_58_0= ruleAlarmC
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

            otherlv_59=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:1904:1: entryRuleAlarmC returns [EObject current=null] : iv_ruleAlarmC= ruleAlarmC EOF ;
    public final EObject entryRuleAlarmC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmC = null;


        try {
            // InternalMyDsl.g:1904:47: (iv_ruleAlarmC= ruleAlarmC EOF )
            // InternalMyDsl.g:1905:2: iv_ruleAlarmC= ruleAlarmC EOF
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
    // InternalMyDsl.g:1911:1: ruleAlarmC returns [EObject current=null] : (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
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
            // InternalMyDsl.g:1917:2: ( (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // InternalMyDsl.g:1918:2: (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // InternalMyDsl.g:1918:2: (otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // InternalMyDsl.g:1919:3: otherlv_0= 'AlarmC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlarmCAccess().getAlarmCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAlarmCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1927:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1928:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1928:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1929:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlarmCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1932:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1933:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1933:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=7;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2) ) {
                    alt34=3;
                }
                else if ( LA34_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3) ) {
                    alt34=4;
                }
                else if ( LA34_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4) ) {
                    alt34=5;
                }
                else if ( LA34_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5) ) {
                    alt34=6;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1934:4: ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1934:4: ({...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1935:5: {...}? => ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1935:103: ( ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1936:6: ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1939:9: ({...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1939:10: {...}? => (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1939:19: (otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1939:20: otherlv_3= 'Action:' ( (lv_action_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAlarmCAccess().getActionKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:1943:9: ( (lv_action_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:1944:10: (lv_action_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1944:10: (lv_action_4_0= RULE_STR )
            	    // InternalMyDsl.g:1945:11: lv_action_4_0= RULE_STR
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
            	    // InternalMyDsl.g:1967:4: ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1967:4: ({...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:1968:5: {...}? => ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1968:103: ( ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:1969:6: ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1972:9: ({...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:1972:10: {...}? => (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:1972:19: (otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:1972:20: otherlv_5= 'Trigger:' ( (lv_trigger_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,82,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAlarmCAccess().getTriggerKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:1976:9: ( (lv_trigger_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:1977:10: (lv_trigger_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:1977:10: (lv_trigger_6_0= RULE_STR )
            	    // InternalMyDsl.g:1978:11: lv_trigger_6_0= RULE_STR
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
            	    // InternalMyDsl.g:2000:4: ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2000:4: ({...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2001:5: {...}? => ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2001:103: ( ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2002:6: ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2005:9: ({...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2005:10: {...}? => (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:2005:19: (otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2005:20: otherlv_7= 'Attachements:' ( (lv_attach_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,65,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAlarmCAccess().getAttachementsKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:2009:9: ( (lv_attach_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:2010:10: (lv_attach_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2010:10: (lv_attach_8_0= RULE_STR )
            	    // InternalMyDsl.g:2011:11: lv_attach_8_0= RULE_STR
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
            	    // InternalMyDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2034:5: {...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2034:103: ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2035:6: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2038:9: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2038:10: {...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:2038:19: (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2038:20: otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAlarmCAccess().getDescriptionKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:2042:9: ( (lv_description_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:2043:10: (lv_description_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2043:10: (lv_description_10_0= RULE_STR )
            	    // InternalMyDsl.g:2044:11: lv_description_10_0= RULE_STR
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
            	    // InternalMyDsl.g:2066:4: ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2066:4: ({...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) ) )
            	    // InternalMyDsl.g:2067:5: {...}? => ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2067:103: ( ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) ) )
            	    // InternalMyDsl.g:2068:6: ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2071:9: ({...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) ) )
            	    // InternalMyDsl.g:2071:10: {...}? => (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:2071:19: (otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) ) )
            	    // InternalMyDsl.g:2071:20: otherlv_11= 'Type:' ( (lv_type_12_0= ruleAlarmType ) )
            	    {
            	    otherlv_11=(Token)match(input,83,FOLLOW_23); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAlarmCAccess().getTypeKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:2075:9: ( (lv_type_12_0= ruleAlarmType ) )
            	    // InternalMyDsl.g:2076:10: (lv_type_12_0= ruleAlarmType )
            	    {
            	    // InternalMyDsl.g:2076:10: (lv_type_12_0= ruleAlarmType )
            	    // InternalMyDsl.g:2077:11: lv_type_12_0= ruleAlarmType
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
            	    // InternalMyDsl.g:2100:4: ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2100:4: ({...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) ) )
            	    // InternalMyDsl.g:2101:5: {...}? => ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:2101:103: ( ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) ) )
            	    // InternalMyDsl.g:2102:6: ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlarmCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:2105:9: ({...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) ) )
            	    // InternalMyDsl.g:2105:10: {...}? => (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlarmC", "true");
            	    }
            	    // InternalMyDsl.g:2105:19: (otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) ) )
            	    // InternalMyDsl.g:2105:20: otherlv_13= 'Temps:' ( (lv_time_14_0= ruleComponentAlarmTime ) )
            	    {
            	    otherlv_13=(Token)match(input,84,FOLLOW_24); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAlarmCAccess().getTempsKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:2109:9: ( (lv_time_14_0= ruleComponentAlarmTime ) )
            	    // InternalMyDsl.g:2110:10: (lv_time_14_0= ruleComponentAlarmTime )
            	    {
            	    // InternalMyDsl.g:2110:10: (lv_time_14_0= ruleComponentAlarmTime )
            	    // InternalMyDsl.g:2111:11: lv_time_14_0= ruleComponentAlarmTime
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

            otherlv_15=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2150:1: entryRuletzprop returns [EObject current=null] : iv_ruletzprop= ruletzprop EOF ;
    public final EObject entryRuletzprop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzprop = null;


        try {
            // InternalMyDsl.g:2150:47: (iv_ruletzprop= ruletzprop EOF )
            // InternalMyDsl.g:2151:2: iv_ruletzprop= ruletzprop EOF
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
    // InternalMyDsl.g:2157:1: ruletzprop returns [EObject current=null] : (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
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
            // InternalMyDsl.g:2163:2: ( (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalMyDsl.g:2164:2: (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalMyDsl.g:2164:2: (otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalMyDsl.g:2165:3: otherlv_0= 'tzprop' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTzpropAccess().getTzpropKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2173:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:2174:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:2174:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:2175:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTzpropAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2178:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:2179:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:2179:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=6;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4) ) {
                    alt36=5;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:2180:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2180:4: ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2181:5: {...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2181:103: ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2182:6: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2185:9: ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2185:10: {...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2185:19: (otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2185:20: otherlv_3= 'Date:' ( (lv_dtstart_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTzpropAccess().getDateKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:2189:9: ( (lv_dtstart_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:2190:10: (lv_dtstart_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2190:10: (lv_dtstart_4_0= RULE_STR )
            	    // InternalMyDsl.g:2191:11: lv_dtstart_4_0= RULE_STR
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
            	    // InternalMyDsl.g:2213:4: ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2213:4: ({...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2214:5: {...}? => ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2214:103: ( ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2215:6: ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2218:9: ({...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2218:10: {...}? => (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2218:19: (otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2218:20: otherlv_5= 'Tzoffseto:' ( (lv_tzoffseto_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,86,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTzpropAccess().getTzoffsetoKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:2222:9: ( (lv_tzoffseto_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:2223:10: (lv_tzoffseto_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2223:10: (lv_tzoffseto_6_0= RULE_STR )
            	    // InternalMyDsl.g:2224:11: lv_tzoffseto_6_0= RULE_STR
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
            	    // InternalMyDsl.g:2246:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2246:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2247:5: {...}? => ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2247:103: ( ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2248:6: ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2251:9: ({...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2251:10: {...}? => (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2251:19: (otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2251:20: otherlv_7= 'Tzoffsetfrom:' ( (lv_tzoffsetfrom_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,87,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTzpropAccess().getTzoffsetfromKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:2255:9: ( (lv_tzoffsetfrom_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:2256:10: (lv_tzoffsetfrom_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2256:10: (lv_tzoffsetfrom_8_0= RULE_STR )
            	    // InternalMyDsl.g:2257:11: lv_tzoffsetfrom_8_0= RULE_STR
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
            	    // InternalMyDsl.g:2279:4: ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2279:4: ({...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2280:5: {...}? => ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2280:103: ( ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2281:6: ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2284:9: ({...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2284:10: {...}? => (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2284:19: (otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2284:20: otherlv_9= 'Rrule:' ( (lv_rrule_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,88,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTzpropAccess().getRruleKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:2288:9: ( (lv_rrule_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:2289:10: (lv_rrule_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2289:10: (lv_rrule_10_0= RULE_STR )
            	    // InternalMyDsl.g:2290:11: lv_rrule_10_0= RULE_STR
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
            	    // InternalMyDsl.g:2312:4: ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2312:4: ({...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalMyDsl.g:2313:5: {...}? => ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2313:103: ( ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) ) )
            	    // InternalMyDsl.g:2314:6: ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2317:9: ({...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' ) )
            	    // InternalMyDsl.g:2317:10: {...}? => (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzprop", "true");
            	    }
            	    // InternalMyDsl.g:2317:19: (otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}' )
            	    // InternalMyDsl.g:2317:20: otherlv_11= 'Opt' otherlv_12= '{' ( (lv_opt_13_0= ruletzpropOptional ) ) (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,89,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTzpropAccess().getOptKeyword_2_4_0());
            	    								
            	    otherlv_12=(Token)match(input,53,FOLLOW_27); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2325:9: ( (lv_opt_13_0= ruletzpropOptional ) )
            	    // InternalMyDsl.g:2326:10: (lv_opt_13_0= ruletzpropOptional )
            	    {
            	    // InternalMyDsl.g:2326:10: (lv_opt_13_0= ruletzpropOptional )
            	    // InternalMyDsl.g:2327:11: lv_opt_13_0= ruletzpropOptional
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

            	    // InternalMyDsl.g:2344:9: (otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==66) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2345:10: otherlv_14= ',' ( (lv_opt_15_0= ruletzpropOptional ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,66,FOLLOW_27); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getTzpropAccess().getCommaKeyword_2_4_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:2349:10: ( (lv_opt_15_0= ruletzpropOptional ) )
            	    	    // InternalMyDsl.g:2350:11: (lv_opt_15_0= ruletzpropOptional )
            	    	    {
            	    	    // InternalMyDsl.g:2350:11: (lv_opt_15_0= ruletzpropOptional )
            	    	    // InternalMyDsl.g:2351:12: lv_opt_15_0= ruletzpropOptional
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

            	    otherlv_16=(Token)match(input,58,FOLLOW_26); 

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

            otherlv_17=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2395:1: entryRuletzpropOptional returns [EObject current=null] : iv_ruletzpropOptional= ruletzpropOptional EOF ;
    public final EObject entryRuletzpropOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzpropOptional = null;


        try {
            // InternalMyDsl.g:2395:55: (iv_ruletzpropOptional= ruletzpropOptional EOF )
            // InternalMyDsl.g:2396:2: iv_ruletzpropOptional= ruletzpropOptional EOF
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
    // InternalMyDsl.g:2402:1: ruletzpropOptional returns [EObject current=null] : ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
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
            // InternalMyDsl.g:2408:2: ( ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:2409:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:2409:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMyDsl.g:2410:3: () otherlv_1= 'tzpropOptional' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            // InternalMyDsl.g:2410:3: ()
            // InternalMyDsl.g:2411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTzpropOptionalAccess().getTzpropOptionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropOptionalAccess().getTzpropOptionalKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTzpropOptionalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2425:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2426:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2426:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2427:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2430:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2431:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2431:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) ) )*
            loop37:
            do {
                int alt37=6;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4) ) {
                    alt37=5;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2432:4: ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2432:4: ({...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2433:5: {...}? => ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2433:111: ( ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2434:6: ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2437:9: ({...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2437:10: {...}? => (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2437:19: (otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2437:20: otherlv_4= 'Commentaire:' ( (lv_comment_5_0= RULE_STR ) )
            	    {
            	    otherlv_4=(Token)match(input,69,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTzpropOptionalAccess().getCommentaireKeyword_3_0_0());
            	    								
            	    // InternalMyDsl.g:2441:9: ( (lv_comment_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2442:10: (lv_comment_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2442:10: (lv_comment_5_0= RULE_STR )
            	    // InternalMyDsl.g:2443:11: lv_comment_5_0= RULE_STR
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
            	    // InternalMyDsl.g:2465:4: ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2465:4: ({...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2466:5: {...}? => ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2466:111: ( ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2467:6: ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2470:9: ({...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2470:10: {...}? => (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2470:19: (otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2470:20: otherlv_6= 'Rdate:' ( (lv_rdate_7_0= RULE_STR ) )
            	    {
            	    otherlv_6=(Token)match(input,91,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTzpropOptionalAccess().getRdateKeyword_3_1_0());
            	    								
            	    // InternalMyDsl.g:2474:9: ( (lv_rdate_7_0= RULE_STR ) )
            	    // InternalMyDsl.g:2475:10: (lv_rdate_7_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2475:10: (lv_rdate_7_0= RULE_STR )
            	    // InternalMyDsl.g:2476:11: lv_rdate_7_0= RULE_STR
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
            	    // InternalMyDsl.g:2498:4: ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2498:4: ({...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2499:5: {...}? => ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2499:111: ( ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2500:6: ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2503:9: ({...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2503:10: {...}? => (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2503:19: (otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2503:20: otherlv_8= 'Tzname:' ( (lv_tzname_9_0= RULE_STR ) )
            	    {
            	    otherlv_8=(Token)match(input,92,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTzpropOptionalAccess().getTznameKeyword_3_2_0());
            	    								
            	    // InternalMyDsl.g:2507:9: ( (lv_tzname_9_0= RULE_STR ) )
            	    // InternalMyDsl.g:2508:10: (lv_tzname_9_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2508:10: (lv_tzname_9_0= RULE_STR )
            	    // InternalMyDsl.g:2509:11: lv_tzname_9_0= RULE_STR
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
            	    // InternalMyDsl.g:2531:4: ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2531:4: ({...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2532:5: {...}? => ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2532:111: ( ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2533:6: ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2536:9: ({...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2536:10: {...}? => (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2536:19: (otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2536:20: otherlv_10= 'X_prop:' ( (lv_x_prop_11_0= RULE_STR ) )
            	    {
            	    otherlv_10=(Token)match(input,93,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTzpropOptionalAccess().getX_propKeyword_3_3_0());
            	    								
            	    // InternalMyDsl.g:2540:9: ( (lv_x_prop_11_0= RULE_STR ) )
            	    // InternalMyDsl.g:2541:10: (lv_x_prop_11_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2541:10: (lv_x_prop_11_0= RULE_STR )
            	    // InternalMyDsl.g:2542:11: lv_x_prop_11_0= RULE_STR
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
            	    // InternalMyDsl.g:2564:4: ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2564:4: ({...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2565:5: {...}? => ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2565:111: ( ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2566:6: ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTzpropOptionalAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2569:9: ({...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2569:10: {...}? => (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruletzpropOptional", "true");
            	    }
            	    // InternalMyDsl.g:2569:19: (otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2569:20: otherlv_12= 'Iana_prop:' ( (lv_iana_prop_13_0= RULE_STR ) )
            	    {
            	    otherlv_12=(Token)match(input,94,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTzpropOptionalAccess().getIana_propKeyword_3_4_0());
            	    								
            	    // InternalMyDsl.g:2573:9: ( (lv_iana_prop_13_0= RULE_STR ) )
            	    // InternalMyDsl.g:2574:10: (lv_iana_prop_13_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2574:10: (lv_iana_prop_13_0= RULE_STR )
            	    // InternalMyDsl.g:2575:11: lv_iana_prop_13_0= RULE_STR
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

            otherlv_14=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2612:1: entryRuleComponentAlarmTime returns [EObject current=null] : iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF ;
    public final EObject entryRuleComponentAlarmTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmTime = null;


        try {
            // InternalMyDsl.g:2612:59: (iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF )
            // InternalMyDsl.g:2613:2: iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF
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
    // InternalMyDsl.g:2619:1: ruleComponentAlarmTime returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
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
            // InternalMyDsl.g:2625:2: ( ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:2626:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:2626:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalMyDsl.g:2627:3: () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalMyDsl.g:2627:3: ()
            // InternalMyDsl.g:2628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2642:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2643:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2643:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2644:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2647:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2648:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2648:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2649:4: ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2649:4: ({...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2650:5: {...}? => ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2650:115: ( ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2651:6: ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2654:9: ({...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2654:10: {...}? => (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "true");
            	    }
            	    // InternalMyDsl.g:2654:19: (otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2654:20: otherlv_4= 'Duree:' ( (lv_duration_5_0= RULE_STR ) )
            	    {
            	    otherlv_4=(Token)match(input,96,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentAlarmTimeAccess().getDureeKeyword_3_0_0());
            	    								
            	    // InternalMyDsl.g:2658:9: ( (lv_duration_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2659:10: (lv_duration_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2659:10: (lv_duration_5_0= RULE_STR )
            	    // InternalMyDsl.g:2660:11: lv_duration_5_0= RULE_STR
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
            	    // InternalMyDsl.g:2682:4: ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2682:4: ({...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2683:5: {...}? => ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2683:115: ( ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2684:6: ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmTimeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2687:9: ({...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2687:10: {...}? => (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmTime", "true");
            	    }
            	    // InternalMyDsl.g:2687:19: (otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2687:20: otherlv_6= 'Repeter:' ( (lv_repeat_7_0= RULE_STR ) )
            	    {
            	    otherlv_6=(Token)match(input,97,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getComponentAlarmTimeAccess().getRepeterKeyword_3_1_0());
            	    								
            	    // InternalMyDsl.g:2691:9: ( (lv_repeat_7_0= RULE_STR ) )
            	    // InternalMyDsl.g:2692:10: (lv_repeat_7_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2692:10: (lv_repeat_7_0= RULE_STR )
            	    // InternalMyDsl.g:2693:11: lv_repeat_7_0= RULE_STR
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

            otherlv_8=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2730:1: entryRuleComponentAlarmAudioProperty returns [EObject current=null] : iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF ;
    public final EObject entryRuleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmAudioProperty = null;


        try {
            // InternalMyDsl.g:2730:68: (iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF )
            // InternalMyDsl.g:2731:2: iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF
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
    // InternalMyDsl.g:2737:1: ruleComponentAlarmAudioProperty returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_attach_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2743:2: ( ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2744:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2744:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2745:3: () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2745:3: ()
            // InternalMyDsl.g:2746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmAudioPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2760:3: (otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2761:4: otherlv_3= 'Attachements:' ( (lv_attach_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAlarmAudioPropertyAccess().getAttachementsKeyword_3_0());
                    			
                    // InternalMyDsl.g:2765:4: ( (lv_attach_4_0= RULE_STR ) )
                    // InternalMyDsl.g:2766:5: (lv_attach_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2766:5: (lv_attach_4_0= RULE_STR )
                    // InternalMyDsl.g:2767:6: lv_attach_4_0= RULE_STR
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

            otherlv_5=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2792:1: entryRuleComponentAlarmDispProperty returns [EObject current=null] : iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF ;
    public final EObject entryRuleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmDispProperty = null;


        try {
            // InternalMyDsl.g:2792:67: (iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF )
            // InternalMyDsl.g:2793:2: iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF
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
    // InternalMyDsl.g:2799:1: ruleComponentAlarmDispProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) ;
    public final EObject ruleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2805:2: ( (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:2806:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:2806:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            // InternalMyDsl.g:2807:3: otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'Description:' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmDispPropertyAccess().getComponentAlarmDispPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmDispPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmDispPropertyAccess().getDescriptionKeyword_2());
            		
            // InternalMyDsl.g:2819:3: ( (lv_description_3_0= RULE_STR ) )
            // InternalMyDsl.g:2820:4: (lv_description_3_0= RULE_STR )
            {
            // InternalMyDsl.g:2820:4: (lv_description_3_0= RULE_STR )
            // InternalMyDsl.g:2821:5: lv_description_3_0= RULE_STR
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

            otherlv_4=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2845:1: entryRuleComponentAlarmEmailProperty returns [EObject current=null] : iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF ;
    public final EObject entryRuleComponentAlarmEmailProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmEmailProperty = null;


        try {
            // InternalMyDsl.g:2845:68: (iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF )
            // InternalMyDsl.g:2846:2: iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF
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
    // InternalMyDsl.g:2852:1: ruleComponentAlarmEmailProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
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
            // InternalMyDsl.g:2858:2: ( (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalMyDsl.g:2859:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalMyDsl.g:2859:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalMyDsl.g:2860:3: otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getComponentAlarmEmailPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2868:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:2869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:2869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:2870:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2873:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:2874:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:2874:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2) ) {
                    alt42=3;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:2875:4: ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2875:4: ({...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) ) )
            	    // InternalMyDsl.g:2876:5: {...}? => ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2876:124: ( ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) ) )
            	    // InternalMyDsl.g:2877:6: ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2880:9: ({...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' ) )
            	    // InternalMyDsl.g:2880:10: {...}? => (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2880:19: (otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}' )
            	    // InternalMyDsl.g:2880:20: otherlv_3= 'Invites' otherlv_4= '{' ( (lv_attendee_5_0= RULE_STR ) ) (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )* otherlv_8= '}'
            	    {
            	    otherlv_3=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentAlarmEmailPropertyAccess().getInvitesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2888:9: ( (lv_attendee_5_0= RULE_STR ) )
            	    // InternalMyDsl.g:2889:10: (lv_attendee_5_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2889:10: (lv_attendee_5_0= RULE_STR )
            	    // InternalMyDsl.g:2890:11: lv_attendee_5_0= RULE_STR
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

            	    // InternalMyDsl.g:2906:9: (otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==66) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2907:10: otherlv_6= ',' ( (lv_attendee_7_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_6, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_2_0_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:2911:10: ( (lv_attendee_7_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:2912:11: (lv_attendee_7_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:2912:11: (lv_attendee_7_0= RULE_STR )
            	    	    // InternalMyDsl.g:2913:12: lv_attendee_7_0= RULE_STR
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

            	    otherlv_8=(Token)match(input,58,FOLLOW_35); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_2_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2940:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2940:4: ({...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:2941:5: {...}? => ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2941:124: ( ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:2942:6: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2945:9: ({...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:2945:10: {...}? => (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2945:19: (otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:2945:20: otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentAlarmEmailPropertyAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:2949:9: ( (lv_description_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:2950:10: (lv_description_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2950:10: (lv_description_10_0= RULE_STR )
            	    // InternalMyDsl.g:2951:11: lv_description_10_0= RULE_STR
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
            	    // InternalMyDsl.g:2973:4: ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:2973:4: ({...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalMyDsl.g:2974:5: {...}? => ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2974:124: ( ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) ) )
            	    // InternalMyDsl.g:2975:6: ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAlarmEmailPropertyAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2978:9: ({...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' ) )
            	    // InternalMyDsl.g:2978:10: {...}? => (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentAlarmEmailProperty", "true");
            	    }
            	    // InternalMyDsl.g:2978:19: (otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}' )
            	    // InternalMyDsl.g:2978:20: otherlv_11= 'Attachements' otherlv_12= '{' ( (lv_attach_13_0= RULE_STR ) ) (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,102,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachementsKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2986:9: ( (lv_attach_13_0= RULE_STR ) )
            	    // InternalMyDsl.g:2987:10: (lv_attach_13_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2987:10: (lv_attach_13_0= RULE_STR )
            	    // InternalMyDsl.g:2988:11: lv_attach_13_0= RULE_STR
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

            	    // InternalMyDsl.g:3004:9: (otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==66) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3005:10: otherlv_14= ',' ( (lv_attach_15_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_2_2_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3009:10: ( (lv_attach_15_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3010:11: (lv_attach_15_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3010:11: (lv_attach_15_0= RULE_STR )
            	    	    // InternalMyDsl.g:3011:12: lv_attach_15_0= RULE_STR
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

            	    otherlv_16=(Token)match(input,58,FOLLOW_35); 

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

            otherlv_17=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:3054:1: entryRuleToDoC returns [EObject current=null] : iv_ruleToDoC= ruleToDoC EOF ;
    public final EObject entryRuleToDoC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToDoC = null;


        try {
            // InternalMyDsl.g:3054:46: (iv_ruleToDoC= ruleToDoC EOF )
            // InternalMyDsl.g:3055:2: iv_ruleToDoC= ruleToDoC EOF
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
    // InternalMyDsl.g:3061:1: ruleToDoC returns [EObject current=null] : (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' ) ;
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
            // InternalMyDsl.g:3067:2: ( (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' ) )
            // InternalMyDsl.g:3068:2: (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' )
            {
            // InternalMyDsl.g:3068:2: (otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}' )
            // InternalMyDsl.g:3069:3: otherlv_0= 'ToDoC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_121= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getToDoCAccess().getToDoCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:3077:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:3078:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:3078:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:3079:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:3082:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:3083:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:3083:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=33;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:3084:4: ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3084:4: ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:3085:5: {...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:3085:102: ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:3086:6: ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:3089:9: ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:3089:10: {...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3089:19: (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:3089:20: otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) )
            	    {
            	    otherlv_3=(Token)match(input,104,FOLLOW_16); 

            	    									newLeafNode(otherlv_3, grammarAccess.getToDoCAccess().getDtstampKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:3093:9: ( (lv_dtstamp_4_0= ruleDateT ) )
            	    // InternalMyDsl.g:3094:10: (lv_dtstamp_4_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:3094:10: (lv_dtstamp_4_0= ruleDateT )
            	    // InternalMyDsl.g:3095:11: lv_dtstamp_4_0= ruleDateT
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
            	    // InternalMyDsl.g:3118:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3118:4: ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3119:5: {...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:3119:102: ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3120:6: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:3123:9: ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3123:10: {...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3123:19: (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3123:20: otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getToDoCAccess().getIdentifiantKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:3127:9: ( (lv_uid_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:3128:10: (lv_uid_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3128:10: (lv_uid_6_0= RULE_STR )
            	    // InternalMyDsl.g:3129:11: lv_uid_6_0= RULE_STR
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
            	    // InternalMyDsl.g:3151:4: ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3151:4: ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:3152:5: {...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:3152:102: ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:3153:6: ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:3156:9: ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:3156:10: {...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3156:19: (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:3156:20: otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) )
            	    {
            	    otherlv_7=(Token)match(input,105,FOLLOW_16); 

            	    									newLeafNode(otherlv_7, grammarAccess.getToDoCAccess().getDueKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:3160:9: ( (lv_due_8_0= ruleDateT ) )
            	    // InternalMyDsl.g:3161:10: (lv_due_8_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:3161:10: (lv_due_8_0= ruleDateT )
            	    // InternalMyDsl.g:3162:11: lv_due_8_0= ruleDateT
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
            	    // InternalMyDsl.g:3185:4: ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3185:4: ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:3186:5: {...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:3186:102: ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:3187:6: ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:3190:9: ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:3190:10: {...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3190:19: (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:3190:20: otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) )
            	    {
            	    otherlv_9=(Token)match(input,60,FOLLOW_16); 

            	    									newLeafNode(otherlv_9, grammarAccess.getToDoCAccess().getDateKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:3194:9: ( (lv_dtstart_10_0= ruleDateT ) )
            	    // InternalMyDsl.g:3195:10: (lv_dtstart_10_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:3195:10: (lv_dtstart_10_0= ruleDateT )
            	    // InternalMyDsl.g:3196:11: lv_dtstart_10_0= ruleDateT
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
            	    // InternalMyDsl.g:3219:4: ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3219:4: ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:3220:5: {...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:3220:102: ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:3221:6: ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:3224:9: ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:3224:10: {...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3224:19: (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:3224:20: otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) )
            	    {
            	    otherlv_11=(Token)match(input,78,FOLLOW_20); 

            	    									newLeafNode(otherlv_11, grammarAccess.getToDoCAccess().getClasseKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:3228:9: ( (lv_class_12_0= ruleClassification ) )
            	    // InternalMyDsl.g:3229:10: (lv_class_12_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:3229:10: (lv_class_12_0= ruleClassification )
            	    // InternalMyDsl.g:3230:11: lv_class_12_0= ruleClassification
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
            	    // InternalMyDsl.g:3253:4: ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3253:4: ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3254:5: {...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:3254:102: ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3255:6: ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:3258:9: ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3258:10: {...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3258:19: (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3258:20: otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) )
            	    {
            	    otherlv_13=(Token)match(input,106,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getToDoCAccess().getCreeLeKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:3262:9: ( (lv_created_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:3263:10: (lv_created_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3263:10: (lv_created_14_0= RULE_STR )
            	    // InternalMyDsl.g:3264:11: lv_created_14_0= RULE_STR
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
            	    // InternalMyDsl.g:3286:4: ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3286:4: ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3287:5: {...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:3287:102: ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3288:6: ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:3291:9: ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3291:10: {...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3291:19: (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3291:20: otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) )
            	    {
            	    otherlv_15=(Token)match(input,107,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getToDoCAccess().getLast_modKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:3295:9: ( (lv_last_mod_16_0= RULE_STR ) )
            	    // InternalMyDsl.g:3296:10: (lv_last_mod_16_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3296:10: (lv_last_mod_16_0= RULE_STR )
            	    // InternalMyDsl.g:3297:11: lv_last_mod_16_0= RULE_STR
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
            	    // InternalMyDsl.g:3319:4: ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3319:4: ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3320:5: {...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:3320:102: ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3321:6: ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:3324:9: ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3324:10: {...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3324:19: (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3324:20: otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) )
            	    {
            	    otherlv_17=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getToDoCAccess().getOrganisateurKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:3328:9: ( (lv_organizer_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:3329:10: (lv_organizer_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3329:10: (lv_organizer_18_0= RULE_STR )
            	    // InternalMyDsl.g:3330:11: lv_organizer_18_0= RULE_STR
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
            	    // InternalMyDsl.g:3352:4: ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3352:4: ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3353:5: {...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:3353:102: ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3354:6: ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:3357:9: ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3357:10: {...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3357:19: (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3357:20: otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) )
            	    {
            	    otherlv_19=(Token)match(input,108,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getToDoCAccess().getSeqKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:3361:9: ( (lv_seq_20_0= RULE_STR ) )
            	    // InternalMyDsl.g:3362:10: (lv_seq_20_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3362:10: (lv_seq_20_0= RULE_STR )
            	    // InternalMyDsl.g:3363:11: lv_seq_20_0= RULE_STR
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
            	    // InternalMyDsl.g:3385:4: ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3385:4: ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3386:5: {...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:3386:102: ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3387:6: ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:3390:9: ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3390:10: {...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3390:19: (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3390:20: otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) )
            	    {
            	    otherlv_21=(Token)match(input,71,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getToDoCAccess().getStatusKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:3394:9: ( (lv_status_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:3395:10: (lv_status_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3395:10: (lv_status_22_0= RULE_STR )
            	    // InternalMyDsl.g:3396:11: lv_status_22_0= RULE_STR
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
            	    // InternalMyDsl.g:3418:4: ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3418:4: ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3419:5: {...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:3419:103: ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3420:6: ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:3423:9: ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3423:10: {...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3423:19: (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3423:20: otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) )
            	    {
            	    otherlv_23=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getToDoCAccess().getObjetKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:3427:9: ( (lv_summary_24_0= RULE_STR ) )
            	    // InternalMyDsl.g:3428:10: (lv_summary_24_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3428:10: (lv_summary_24_0= RULE_STR )
            	    // InternalMyDsl.g:3429:11: lv_summary_24_0= RULE_STR
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
            	    // InternalMyDsl.g:3451:4: ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3451:4: ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3452:5: {...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:3452:103: ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3453:6: ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:3456:9: ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3456:10: {...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3456:19: (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3456:20: otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) )
            	    {
            	    otherlv_25=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getToDoCAccess().getURLKeyword_2_11_0());
            	    								
            	    // InternalMyDsl.g:3460:9: ( (lv_url_26_0= RULE_STR ) )
            	    // InternalMyDsl.g:3461:10: (lv_url_26_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3461:10: (lv_url_26_0= RULE_STR )
            	    // InternalMyDsl.g:3462:11: lv_url_26_0= RULE_STR
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
            	    // InternalMyDsl.g:3484:4: ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3484:4: ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:3485:5: {...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:3485:103: ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:3486:6: ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:3489:9: ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:3489:10: {...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3489:19: (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:3489:20: otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) )
            	    {
            	    otherlv_27=(Token)match(input,109,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getToDoCAccess().getRecuridKeyword_2_12_0());
            	    								
            	    // InternalMyDsl.g:3493:9: ( (lv_recurid_28_0= RULE_STR ) )
            	    // InternalMyDsl.g:3494:10: (lv_recurid_28_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3494:10: (lv_recurid_28_0= RULE_STR )
            	    // InternalMyDsl.g:3495:11: lv_recurid_28_0= RULE_STR
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
            	    // InternalMyDsl.g:3517:4: ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3517:4: ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) )
            	    // InternalMyDsl.g:3518:5: {...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:3518:103: ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) )
            	    // InternalMyDsl.g:3519:6: ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:3522:9: ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) )
            	    // InternalMyDsl.g:3522:10: {...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3522:19: (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' )
            	    // InternalMyDsl.g:3522:20: otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}'
            	    {
            	    otherlv_29=(Token)match(input,110,FOLLOW_12); 

            	    									newLeafNode(otherlv_29, grammarAccess.getToDoCAccess().getRruleKeyword_2_13_0());
            	    								
            	    otherlv_30=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_13_1());
            	    								
            	    // InternalMyDsl.g:3530:9: ( (lv_rrule_31_0= RULE_STR ) )
            	    // InternalMyDsl.g:3531:10: (lv_rrule_31_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3531:10: (lv_rrule_31_0= RULE_STR )
            	    // InternalMyDsl.g:3532:11: lv_rrule_31_0= RULE_STR
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

            	    // InternalMyDsl.g:3548:9: (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==66) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3549:10: otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_32, grammarAccess.getToDoCAccess().getCommaKeyword_2_13_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3553:10: ( (lv_rrule_33_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3554:11: (lv_rrule_33_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3554:11: (lv_rrule_33_0= RULE_STR )
            	    	    // InternalMyDsl.g:3555:12: lv_rrule_33_0= RULE_STR
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

            	    otherlv_34=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_34, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_13_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalMyDsl.g:3582:4: ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3582:4: ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) )
            	    // InternalMyDsl.g:3583:5: {...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:3583:103: ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) )
            	    // InternalMyDsl.g:3584:6: ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:3587:9: ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) )
            	    // InternalMyDsl.g:3587:10: {...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3587:19: (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' )
            	    // InternalMyDsl.g:3587:20: otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}'
            	    {
            	    otherlv_35=(Token)match(input,102,FOLLOW_12); 

            	    									newLeafNode(otherlv_35, grammarAccess.getToDoCAccess().getAttachementsKeyword_2_14_0());
            	    								
            	    otherlv_36=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_36, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_14_1());
            	    								
            	    // InternalMyDsl.g:3595:9: ( (lv_attach_37_0= RULE_STR ) )
            	    // InternalMyDsl.g:3596:10: (lv_attach_37_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3596:10: (lv_attach_37_0= RULE_STR )
            	    // InternalMyDsl.g:3597:11: lv_attach_37_0= RULE_STR
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

            	    // InternalMyDsl.g:3613:9: (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==66) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3614:10: otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_38=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_38, grammarAccess.getToDoCAccess().getCommaKeyword_2_14_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3618:10: ( (lv_attach_39_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3619:11: (lv_attach_39_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3619:11: (lv_attach_39_0= RULE_STR )
            	    	    // InternalMyDsl.g:3620:12: lv_attach_39_0= RULE_STR
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

            	    otherlv_40=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_40, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_14_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalMyDsl.g:3647:4: ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3647:4: ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) )
            	    // InternalMyDsl.g:3648:5: {...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:3648:103: ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) )
            	    // InternalMyDsl.g:3649:6: ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:3652:9: ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) )
            	    // InternalMyDsl.g:3652:10: {...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3652:19: (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' )
            	    // InternalMyDsl.g:3652:20: otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}'
            	    {
            	    otherlv_41=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_41, grammarAccess.getToDoCAccess().getInvitesKeyword_2_15_0());
            	    								
            	    otherlv_42=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_15_1());
            	    								
            	    // InternalMyDsl.g:3660:9: ( (lv_attendee_43_0= RULE_STR ) )
            	    // InternalMyDsl.g:3661:10: (lv_attendee_43_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3661:10: (lv_attendee_43_0= RULE_STR )
            	    // InternalMyDsl.g:3662:11: lv_attendee_43_0= RULE_STR
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

            	    // InternalMyDsl.g:3678:9: (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==66) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3679:10: otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_44=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_44, grammarAccess.getToDoCAccess().getCommaKeyword_2_15_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3683:10: ( (lv_attendee_45_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3684:11: (lv_attendee_45_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3684:11: (lv_attendee_45_0= RULE_STR )
            	    	    // InternalMyDsl.g:3685:12: lv_attendee_45_0= RULE_STR
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

            	    otherlv_46=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_46, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_15_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalMyDsl.g:3712:4: ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3712:4: ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) )
            	    // InternalMyDsl.g:3713:5: {...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:3713:103: ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) )
            	    // InternalMyDsl.g:3714:6: ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:3717:9: ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) )
            	    // InternalMyDsl.g:3717:10: {...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3717:19: (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' )
            	    // InternalMyDsl.g:3717:20: otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}'
            	    {
            	    otherlv_47=(Token)match(input,111,FOLLOW_12); 

            	    									newLeafNode(otherlv_47, grammarAccess.getToDoCAccess().getCategoriesKeyword_2_16_0());
            	    								
            	    otherlv_48=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_48, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_16_1());
            	    								
            	    // InternalMyDsl.g:3725:9: ( (lv_categories_49_0= RULE_STR ) )
            	    // InternalMyDsl.g:3726:10: (lv_categories_49_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3726:10: (lv_categories_49_0= RULE_STR )
            	    // InternalMyDsl.g:3727:11: lv_categories_49_0= RULE_STR
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

            	    // InternalMyDsl.g:3743:9: (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==66) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3744:10: otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_50=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_50, grammarAccess.getToDoCAccess().getCommaKeyword_2_16_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3748:10: ( (lv_categories_51_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3749:11: (lv_categories_51_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3749:11: (lv_categories_51_0= RULE_STR )
            	    	    // InternalMyDsl.g:3750:12: lv_categories_51_0= RULE_STR
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

            	    otherlv_52=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_52, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_16_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalMyDsl.g:3777:4: ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3777:4: ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) )
            	    // InternalMyDsl.g:3778:5: {...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:3778:103: ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) )
            	    // InternalMyDsl.g:3779:6: ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:3782:9: ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) )
            	    // InternalMyDsl.g:3782:10: {...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3782:19: (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' )
            	    // InternalMyDsl.g:3782:20: otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}'
            	    {
            	    otherlv_53=(Token)match(input,112,FOLLOW_12); 

            	    									newLeafNode(otherlv_53, grammarAccess.getToDoCAccess().getCommentaireKeyword_2_17_0());
            	    								
            	    otherlv_54=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_54, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_17_1());
            	    								
            	    // InternalMyDsl.g:3790:9: ( (lv_comment_55_0= RULE_STR ) )
            	    // InternalMyDsl.g:3791:10: (lv_comment_55_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3791:10: (lv_comment_55_0= RULE_STR )
            	    // InternalMyDsl.g:3792:11: lv_comment_55_0= RULE_STR
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

            	    // InternalMyDsl.g:3808:9: (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==66) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3809:10: otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_56=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_56, grammarAccess.getToDoCAccess().getCommaKeyword_2_17_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3813:10: ( (lv_comment_57_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3814:11: (lv_comment_57_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3814:11: (lv_comment_57_0= RULE_STR )
            	    	    // InternalMyDsl.g:3815:12: lv_comment_57_0= RULE_STR
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

            	    otherlv_58=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_58, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_17_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalMyDsl.g:3842:4: ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3842:4: ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) )
            	    // InternalMyDsl.g:3843:5: {...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:3843:103: ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) )
            	    // InternalMyDsl.g:3844:6: ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:3847:9: ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) )
            	    // InternalMyDsl.g:3847:10: {...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3847:19: (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' )
            	    // InternalMyDsl.g:3847:20: otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}'
            	    {
            	    otherlv_59=(Token)match(input,113,FOLLOW_12); 

            	    									newLeafNode(otherlv_59, grammarAccess.getToDoCAccess().getContactKeyword_2_18_0());
            	    								
            	    otherlv_60=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_60, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_18_1());
            	    								
            	    // InternalMyDsl.g:3855:9: ( (lv_contact_61_0= RULE_STR ) )
            	    // InternalMyDsl.g:3856:10: (lv_contact_61_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3856:10: (lv_contact_61_0= RULE_STR )
            	    // InternalMyDsl.g:3857:11: lv_contact_61_0= RULE_STR
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

            	    // InternalMyDsl.g:3873:9: (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==66) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3874:10: otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_62=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_62, grammarAccess.getToDoCAccess().getCommaKeyword_2_18_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3878:10: ( (lv_contact_63_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3879:11: (lv_contact_63_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3879:11: (lv_contact_63_0= RULE_STR )
            	    	    // InternalMyDsl.g:3880:12: lv_contact_63_0= RULE_STR
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

            	    otherlv_64=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_64, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_18_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalMyDsl.g:3907:4: ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3907:4: ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) )
            	    // InternalMyDsl.g:3908:5: {...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19)");
            	    }
            	    // InternalMyDsl.g:3908:103: ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) )
            	    // InternalMyDsl.g:3909:6: ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19);
            	    					
            	    // InternalMyDsl.g:3912:9: ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) )
            	    // InternalMyDsl.g:3912:10: {...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3912:19: (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' )
            	    // InternalMyDsl.g:3912:20: otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}'
            	    {
            	    otherlv_65=(Token)match(input,114,FOLLOW_12); 

            	    									newLeafNode(otherlv_65, grammarAccess.getToDoCAccess().getExdateKeyword_2_19_0());
            	    								
            	    otherlv_66=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_66, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_19_1());
            	    								
            	    // InternalMyDsl.g:3920:9: ( (lv_exdate_67_0= RULE_STR ) )
            	    // InternalMyDsl.g:3921:10: (lv_exdate_67_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3921:10: (lv_exdate_67_0= RULE_STR )
            	    // InternalMyDsl.g:3922:11: lv_exdate_67_0= RULE_STR
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

            	    // InternalMyDsl.g:3938:9: (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==66) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3939:10: otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_68=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_68, grammarAccess.getToDoCAccess().getCommaKeyword_2_19_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:3943:10: ( (lv_exdate_69_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:3944:11: (lv_exdate_69_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:3944:11: (lv_exdate_69_0= RULE_STR )
            	    	    // InternalMyDsl.g:3945:12: lv_exdate_69_0= RULE_STR
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

            	    otherlv_70=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_70, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_19_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalMyDsl.g:3972:4: ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:3972:4: ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) )
            	    // InternalMyDsl.g:3973:5: {...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20)");
            	    }
            	    // InternalMyDsl.g:3973:103: ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) )
            	    // InternalMyDsl.g:3974:6: ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20);
            	    					
            	    // InternalMyDsl.g:3977:9: ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) )
            	    // InternalMyDsl.g:3977:10: {...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:3977:19: (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' )
            	    // InternalMyDsl.g:3977:20: otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}'
            	    {
            	    otherlv_71=(Token)match(input,115,FOLLOW_12); 

            	    									newLeafNode(otherlv_71, grammarAccess.getToDoCAccess().getRstatusKeyword_2_20_0());
            	    								
            	    otherlv_72=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_72, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_20_1());
            	    								
            	    // InternalMyDsl.g:3985:9: ( (lv_rstatus_73_0= RULE_STR ) )
            	    // InternalMyDsl.g:3986:10: (lv_rstatus_73_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:3986:10: (lv_rstatus_73_0= RULE_STR )
            	    // InternalMyDsl.g:3987:11: lv_rstatus_73_0= RULE_STR
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

            	    // InternalMyDsl.g:4003:9: (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==66) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4004:10: otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_74=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_74, grammarAccess.getToDoCAccess().getCommaKeyword_2_20_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4008:10: ( (lv_rstatus_75_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4009:11: (lv_rstatus_75_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4009:11: (lv_rstatus_75_0= RULE_STR )
            	    	    // InternalMyDsl.g:4010:12: lv_rstatus_75_0= RULE_STR
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

            	    otherlv_76=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_76, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_20_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalMyDsl.g:4037:4: ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4037:4: ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) )
            	    // InternalMyDsl.g:4038:5: {...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21)");
            	    }
            	    // InternalMyDsl.g:4038:103: ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) )
            	    // InternalMyDsl.g:4039:6: ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21);
            	    					
            	    // InternalMyDsl.g:4042:9: ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) )
            	    // InternalMyDsl.g:4042:10: {...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4042:19: (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' )
            	    // InternalMyDsl.g:4042:20: otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}'
            	    {
            	    otherlv_77=(Token)match(input,116,FOLLOW_12); 

            	    									newLeafNode(otherlv_77, grammarAccess.getToDoCAccess().getRelierAKeyword_2_21_0());
            	    								
            	    otherlv_78=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_78, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_21_1());
            	    								
            	    // InternalMyDsl.g:4050:9: ( (lv_related_79_0= RULE_STR ) )
            	    // InternalMyDsl.g:4051:10: (lv_related_79_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4051:10: (lv_related_79_0= RULE_STR )
            	    // InternalMyDsl.g:4052:11: lv_related_79_0= RULE_STR
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

            	    // InternalMyDsl.g:4068:9: (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==66) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4069:10: otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_80=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_80, grammarAccess.getToDoCAccess().getCommaKeyword_2_21_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4073:10: ( (lv_related_81_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4074:11: (lv_related_81_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4074:11: (lv_related_81_0= RULE_STR )
            	    	    // InternalMyDsl.g:4075:12: lv_related_81_0= RULE_STR
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

            	    otherlv_82=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_82, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_21_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalMyDsl.g:4102:4: ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4102:4: ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) )
            	    // InternalMyDsl.g:4103:5: {...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22)");
            	    }
            	    // InternalMyDsl.g:4103:103: ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) )
            	    // InternalMyDsl.g:4104:6: ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22);
            	    					
            	    // InternalMyDsl.g:4107:9: ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) )
            	    // InternalMyDsl.g:4107:10: {...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4107:19: (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' )
            	    // InternalMyDsl.g:4107:20: otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}'
            	    {
            	    otherlv_83=(Token)match(input,117,FOLLOW_12); 

            	    									newLeafNode(otherlv_83, grammarAccess.getToDoCAccess().getResourcesKeyword_2_22_0());
            	    								
            	    otherlv_84=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_84, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_22_1());
            	    								
            	    // InternalMyDsl.g:4115:9: ( (lv_resources_85_0= RULE_STR ) )
            	    // InternalMyDsl.g:4116:10: (lv_resources_85_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4116:10: (lv_resources_85_0= RULE_STR )
            	    // InternalMyDsl.g:4117:11: lv_resources_85_0= RULE_STR
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

            	    // InternalMyDsl.g:4133:9: (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==66) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4134:10: otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_86=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_86, grammarAccess.getToDoCAccess().getCommaKeyword_2_22_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4138:10: ( (lv_resources_87_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4139:11: (lv_resources_87_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4139:11: (lv_resources_87_0= RULE_STR )
            	    	    // InternalMyDsl.g:4140:12: lv_resources_87_0= RULE_STR
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

            	    otherlv_88=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_88, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_22_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalMyDsl.g:4167:4: ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4167:4: ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) )
            	    // InternalMyDsl.g:4168:5: {...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23)");
            	    }
            	    // InternalMyDsl.g:4168:103: ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) )
            	    // InternalMyDsl.g:4169:6: ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23);
            	    					
            	    // InternalMyDsl.g:4172:9: ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) )
            	    // InternalMyDsl.g:4172:10: {...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4172:19: (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' )
            	    // InternalMyDsl.g:4172:20: otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}'
            	    {
            	    otherlv_89=(Token)match(input,118,FOLLOW_12); 

            	    									newLeafNode(otherlv_89, grammarAccess.getToDoCAccess().getRdateKeyword_2_23_0());
            	    								
            	    otherlv_90=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_90, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_23_1());
            	    								
            	    // InternalMyDsl.g:4180:9: ( (lv_rdate_91_0= RULE_STR ) )
            	    // InternalMyDsl.g:4181:10: (lv_rdate_91_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4181:10: (lv_rdate_91_0= RULE_STR )
            	    // InternalMyDsl.g:4182:11: lv_rdate_91_0= RULE_STR
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

            	    // InternalMyDsl.g:4198:9: (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==66) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4199:10: otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_92=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_92, grammarAccess.getToDoCAccess().getCommaKeyword_2_23_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4203:10: ( (lv_rdate_93_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4204:11: (lv_rdate_93_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4204:11: (lv_rdate_93_0= RULE_STR )
            	    	    // InternalMyDsl.g:4205:12: lv_rdate_93_0= RULE_STR
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

            	    otherlv_94=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_94, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_23_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalMyDsl.g:4232:4: ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4232:4: ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) )
            	    // InternalMyDsl.g:4233:5: {...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24)");
            	    }
            	    // InternalMyDsl.g:4233:103: ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) )
            	    // InternalMyDsl.g:4234:6: ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24);
            	    					
            	    // InternalMyDsl.g:4237:9: ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) )
            	    // InternalMyDsl.g:4237:10: {...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4237:19: (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' )
            	    // InternalMyDsl.g:4237:20: otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}'
            	    {
            	    otherlv_95=(Token)match(input,119,FOLLOW_12); 

            	    									newLeafNode(otherlv_95, grammarAccess.getToDoCAccess().getX_propKeyword_2_24_0());
            	    								
            	    otherlv_96=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_96, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_24_1());
            	    								
            	    // InternalMyDsl.g:4245:9: ( (lv_x_prop_97_0= RULE_STR ) )
            	    // InternalMyDsl.g:4246:10: (lv_x_prop_97_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4246:10: (lv_x_prop_97_0= RULE_STR )
            	    // InternalMyDsl.g:4247:11: lv_x_prop_97_0= RULE_STR
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

            	    // InternalMyDsl.g:4263:9: (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==66) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4264:10: otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_98=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_98, grammarAccess.getToDoCAccess().getCommaKeyword_2_24_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4268:10: ( (lv_x_prop_99_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4269:11: (lv_x_prop_99_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4269:11: (lv_x_prop_99_0= RULE_STR )
            	    	    // InternalMyDsl.g:4270:12: lv_x_prop_99_0= RULE_STR
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

            	    otherlv_100=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_100, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_24_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // InternalMyDsl.g:4297:4: ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4297:4: ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) )
            	    // InternalMyDsl.g:4298:5: {...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25)");
            	    }
            	    // InternalMyDsl.g:4298:103: ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) )
            	    // InternalMyDsl.g:4299:6: ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25);
            	    					
            	    // InternalMyDsl.g:4302:9: ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) )
            	    // InternalMyDsl.g:4302:10: {...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4302:19: (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' )
            	    // InternalMyDsl.g:4302:20: otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}'
            	    {
            	    otherlv_101=(Token)match(input,120,FOLLOW_12); 

            	    									newLeafNode(otherlv_101, grammarAccess.getToDoCAccess().getIana_propKeyword_2_25_0());
            	    								
            	    otherlv_102=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_102, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_2_25_1());
            	    								
            	    // InternalMyDsl.g:4310:9: ( (lv_iana_prop_103_0= RULE_STR ) )
            	    // InternalMyDsl.g:4311:10: (lv_iana_prop_103_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4311:10: (lv_iana_prop_103_0= RULE_STR )
            	    // InternalMyDsl.g:4312:11: lv_iana_prop_103_0= RULE_STR
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

            	    // InternalMyDsl.g:4328:9: (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==66) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4329:10: otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_104=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_104, grammarAccess.getToDoCAccess().getCommaKeyword_2_25_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4333:10: ( (lv_iana_prop_105_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:4334:11: (lv_iana_prop_105_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:4334:11: (lv_iana_prop_105_0= RULE_STR )
            	    	    // InternalMyDsl.g:4335:12: lv_iana_prop_105_0= RULE_STR
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

            	    otherlv_106=(Token)match(input,58,FOLLOW_37); 

            	    									newLeafNode(otherlv_106, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_2_25_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getToDoCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // InternalMyDsl.g:4362:4: ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4362:4: ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4363:5: {...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26)");
            	    }
            	    // InternalMyDsl.g:4363:103: ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4364:6: ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26);
            	    					
            	    // InternalMyDsl.g:4367:9: ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4367:10: {...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4367:19: (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4367:20: otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) )
            	    {
            	    otherlv_107=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_107, grammarAccess.getToDoCAccess().getDescriptionKeyword_2_26_0());
            	    								
            	    // InternalMyDsl.g:4371:9: ( (lv_description_108_0= RULE_STR ) )
            	    // InternalMyDsl.g:4372:10: (lv_description_108_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4372:10: (lv_description_108_0= RULE_STR )
            	    // InternalMyDsl.g:4373:11: lv_description_108_0= RULE_STR
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
            	    // InternalMyDsl.g:4395:4: ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4395:4: ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4396:5: {...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27)");
            	    }
            	    // InternalMyDsl.g:4396:103: ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4397:6: ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27);
            	    					
            	    // InternalMyDsl.g:4400:9: ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4400:10: {...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4400:19: (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4400:20: otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) )
            	    {
            	    otherlv_109=(Token)match(input,121,FOLLOW_3); 

            	    									newLeafNode(otherlv_109, grammarAccess.getToDoCAccess().getCompleteeKeyword_2_27_0());
            	    								
            	    // InternalMyDsl.g:4404:9: ( (lv_completed_110_0= RULE_STR ) )
            	    // InternalMyDsl.g:4405:10: (lv_completed_110_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4405:10: (lv_completed_110_0= RULE_STR )
            	    // InternalMyDsl.g:4406:11: lv_completed_110_0= RULE_STR
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
            	    // InternalMyDsl.g:4428:4: ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4428:4: ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4429:5: {...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28)");
            	    }
            	    // InternalMyDsl.g:4429:103: ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4430:6: ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28);
            	    					
            	    // InternalMyDsl.g:4433:9: ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4433:10: {...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4433:19: (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4433:20: otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) )
            	    {
            	    otherlv_111=(Token)match(input,75,FOLLOW_3); 

            	    									newLeafNode(otherlv_111, grammarAccess.getToDoCAccess().getPrioriteKeyword_2_28_0());
            	    								
            	    // InternalMyDsl.g:4437:9: ( (lv_priority_112_0= RULE_STR ) )
            	    // InternalMyDsl.g:4438:10: (lv_priority_112_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4438:10: (lv_priority_112_0= RULE_STR )
            	    // InternalMyDsl.g:4439:11: lv_priority_112_0= RULE_STR
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
            	    // InternalMyDsl.g:4461:4: ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4461:4: ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4462:5: {...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29)");
            	    }
            	    // InternalMyDsl.g:4462:103: ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4463:6: ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29);
            	    					
            	    // InternalMyDsl.g:4466:9: ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4466:10: {...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4466:19: (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4466:20: otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) )
            	    {
            	    otherlv_113=(Token)match(input,122,FOLLOW_3); 

            	    									newLeafNode(otherlv_113, grammarAccess.getToDoCAccess().getGeoKeyword_2_29_0());
            	    								
            	    // InternalMyDsl.g:4470:9: ( (lv_geo_114_0= RULE_STR ) )
            	    // InternalMyDsl.g:4471:10: (lv_geo_114_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4471:10: (lv_geo_114_0= RULE_STR )
            	    // InternalMyDsl.g:4472:11: lv_geo_114_0= RULE_STR
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
            	    // InternalMyDsl.g:4494:4: ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4494:4: ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4495:5: {...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30)");
            	    }
            	    // InternalMyDsl.g:4495:103: ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4496:6: ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30);
            	    					
            	    // InternalMyDsl.g:4499:9: ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4499:10: {...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4499:19: (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4499:20: otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) )
            	    {
            	    otherlv_115=(Token)match(input,76,FOLLOW_3); 

            	    									newLeafNode(otherlv_115, grammarAccess.getToDoCAccess().getLieuKeyword_2_30_0());
            	    								
            	    // InternalMyDsl.g:4503:9: ( (lv_location_116_0= RULE_STR ) )
            	    // InternalMyDsl.g:4504:10: (lv_location_116_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4504:10: (lv_location_116_0= RULE_STR )
            	    // InternalMyDsl.g:4505:11: lv_location_116_0= RULE_STR
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
            	    // InternalMyDsl.g:4527:4: ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:4527:4: ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) )
            	    // InternalMyDsl.g:4528:5: {...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31)");
            	    }
            	    // InternalMyDsl.g:4528:103: ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) )
            	    // InternalMyDsl.g:4529:6: ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31);
            	    					
            	    // InternalMyDsl.g:4532:9: ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) )
            	    // InternalMyDsl.g:4532:10: {...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleToDoC", "true");
            	    }
            	    // InternalMyDsl.g:4532:19: (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* )
            	    // InternalMyDsl.g:4532:20: otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )*
            	    {
            	    otherlv_117=(Token)match(input,79,FOLLOW_13); 

            	    									newLeafNode(otherlv_117, grammarAccess.getToDoCAccess().getAlarmesKeyword_2_31_0());
            	    								
            	    // InternalMyDsl.g:4536:9: ( (lv_alarmc_118_0= ruleAlarmC ) )
            	    // InternalMyDsl.g:4537:10: (lv_alarmc_118_0= ruleAlarmC )
            	    {
            	    // InternalMyDsl.g:4537:10: (lv_alarmc_118_0= ruleAlarmC )
            	    // InternalMyDsl.g:4538:11: lv_alarmc_118_0= ruleAlarmC
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

            	    // InternalMyDsl.g:4555:9: (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==66) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4556:10: otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) )
            	    	    {
            	    	    otherlv_119=(Token)match(input,66,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_119, grammarAccess.getToDoCAccess().getCommaKeyword_2_31_2_0());
            	    	    									
            	    	    // InternalMyDsl.g:4560:10: ( (lv_alarmc_120_0= ruleAlarmC ) )
            	    	    // InternalMyDsl.g:4561:11: (lv_alarmc_120_0= ruleAlarmC )
            	    	    {
            	    	    // InternalMyDsl.g:4561:11: (lv_alarmc_120_0= ruleAlarmC )
            	    	    // InternalMyDsl.g:4562:12: lv_alarmc_120_0= ruleAlarmC
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

            otherlv_121=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:4602:1: entryRuleJournalC returns [EObject current=null] : iv_ruleJournalC= ruleJournalC EOF ;
    public final EObject entryRuleJournalC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalC = null;


        try {
            // InternalMyDsl.g:4602:49: (iv_ruleJournalC= ruleJournalC EOF )
            // InternalMyDsl.g:4603:2: iv_ruleJournalC= ruleJournalC EOF
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
    // InternalMyDsl.g:4609:1: ruleJournalC returns [EObject current=null] : (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' ) ;
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
            // InternalMyDsl.g:4615:2: ( (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' ) )
            // InternalMyDsl.g:4616:2: (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' )
            {
            // InternalMyDsl.g:4616:2: (otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}' )
            // InternalMyDsl.g:4617:3: otherlv_0= 'JournalC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) ) otherlv_105= '}'
            {
            otherlv_0=(Token)match(input,123,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getJournalCAccess().getJournalCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:4625:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:4626:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:4626:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:4627:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4630:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:4631:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:4631:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=26;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // InternalMyDsl.g:4632:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4632:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4633:5: {...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4633:105: ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4634:6: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4637:9: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4637:10: {...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4637:19: (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4637:20: otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getJournalCAccess().getIdentifiantKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:4641:9: ( (lv_uid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:4642:10: (lv_uid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4642:10: (lv_uid_4_0= RULE_STR )
            	    // InternalMyDsl.g:4643:11: lv_uid_4_0= RULE_STR
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
            	    // InternalMyDsl.g:4665:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4665:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:4666:5: {...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4666:105: ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:4667:6: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4670:9: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:4670:10: {...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4670:19: (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:4670:20: otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_16); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJournalCAccess().getDateKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:4674:9: ( (lv_dtstart_6_0= ruleDateT ) )
            	    // InternalMyDsl.g:4675:10: (lv_dtstart_6_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:4675:10: (lv_dtstart_6_0= ruleDateT )
            	    // InternalMyDsl.g:4676:11: lv_dtstart_6_0= ruleDateT
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
            	    // InternalMyDsl.g:4699:4: ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4699:4: ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) )
            	    // InternalMyDsl.g:4700:5: {...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4700:105: ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) )
            	    // InternalMyDsl.g:4701:6: ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4704:9: ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) )
            	    // InternalMyDsl.g:4704:10: {...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4704:19: (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) )
            	    // InternalMyDsl.g:4704:20: otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) )
            	    {
            	    otherlv_7=(Token)match(input,78,FOLLOW_20); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJournalCAccess().getClasseKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:4708:9: ( (lv_class_8_0= ruleClassification ) )
            	    // InternalMyDsl.g:4709:10: (lv_class_8_0= ruleClassification )
            	    {
            	    // InternalMyDsl.g:4709:10: (lv_class_8_0= ruleClassification )
            	    // InternalMyDsl.g:4710:11: lv_class_8_0= ruleClassification
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
            	    // InternalMyDsl.g:4733:4: ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4733:4: ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4734:5: {...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:4734:105: ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4735:6: ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:4738:9: ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4738:10: {...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4738:19: (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4738:20: otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,106,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getJournalCAccess().getCreeLeKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:4742:9: ( (lv_created_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:4743:10: (lv_created_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4743:10: (lv_created_10_0= RULE_STR )
            	    // InternalMyDsl.g:4744:11: lv_created_10_0= RULE_STR
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
            	    // InternalMyDsl.g:4766:4: ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4766:4: ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4767:5: {...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:4767:105: ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4768:6: ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:4771:9: ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4771:10: {...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4771:19: (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4771:20: otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,107,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJournalCAccess().getLast_modKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:4775:9: ( (lv_last_mod_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:4776:10: (lv_last_mod_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4776:10: (lv_last_mod_12_0= RULE_STR )
            	    // InternalMyDsl.g:4777:11: lv_last_mod_12_0= RULE_STR
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
            	    // InternalMyDsl.g:4799:4: ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4799:4: ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4800:5: {...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:4800:105: ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4801:6: ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:4804:9: ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4804:10: {...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4804:19: (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4804:20: otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) )
            	    {
            	    otherlv_13=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getJournalCAccess().getOrganisateurKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:4808:9: ( (lv_organizer_14_0= RULE_STR ) )
            	    // InternalMyDsl.g:4809:10: (lv_organizer_14_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4809:10: (lv_organizer_14_0= RULE_STR )
            	    // InternalMyDsl.g:4810:11: lv_organizer_14_0= RULE_STR
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
            	    // InternalMyDsl.g:4832:4: ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4832:4: ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4833:5: {...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:4833:105: ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4834:6: ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:4837:9: ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4837:10: {...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4837:19: (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4837:20: otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) )
            	    {
            	    otherlv_15=(Token)match(input,108,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getJournalCAccess().getSeqKeyword_2_6_0());
            	    								
            	    // InternalMyDsl.g:4841:9: ( (lv_seq_16_0= RULE_STR ) )
            	    // InternalMyDsl.g:4842:10: (lv_seq_16_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4842:10: (lv_seq_16_0= RULE_STR )
            	    // InternalMyDsl.g:4843:11: lv_seq_16_0= RULE_STR
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
            	    // InternalMyDsl.g:4865:4: ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4865:4: ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4866:5: {...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:4866:105: ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4867:6: ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:4870:9: ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4870:10: {...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4870:19: (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4870:20: otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) )
            	    {
            	    otherlv_17=(Token)match(input,71,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getJournalCAccess().getStatusKeyword_2_7_0());
            	    								
            	    // InternalMyDsl.g:4874:9: ( (lv_status_18_0= RULE_STR ) )
            	    // InternalMyDsl.g:4875:10: (lv_status_18_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4875:10: (lv_status_18_0= RULE_STR )
            	    // InternalMyDsl.g:4876:11: lv_status_18_0= RULE_STR
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
            	    // InternalMyDsl.g:4898:4: ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4898:4: ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4899:5: {...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:4899:105: ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4900:6: ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:4903:9: ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4903:10: {...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4903:19: (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4903:20: otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) )
            	    {
            	    otherlv_19=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getJournalCAccess().getObjetKeyword_2_8_0());
            	    								
            	    // InternalMyDsl.g:4907:9: ( (lv_summary_20_0= RULE_STR ) )
            	    // InternalMyDsl.g:4908:10: (lv_summary_20_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4908:10: (lv_summary_20_0= RULE_STR )
            	    // InternalMyDsl.g:4909:11: lv_summary_20_0= RULE_STR
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
            	    // InternalMyDsl.g:4931:4: ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4931:4: ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4932:5: {...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:4932:105: ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4933:6: ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:4936:9: ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4936:10: {...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4936:19: (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4936:20: otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) )
            	    {
            	    otherlv_21=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getJournalCAccess().getURLKeyword_2_9_0());
            	    								
            	    // InternalMyDsl.g:4940:9: ( (lv_url_22_0= RULE_STR ) )
            	    // InternalMyDsl.g:4941:10: (lv_url_22_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4941:10: (lv_url_22_0= RULE_STR )
            	    // InternalMyDsl.g:4942:11: lv_url_22_0= RULE_STR
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
            	    // InternalMyDsl.g:4964:4: ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4964:4: ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:4965:5: {...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:4965:106: ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:4966:6: ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:4969:9: ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:4969:10: {...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:4969:19: (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:4969:20: otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) )
            	    {
            	    otherlv_23=(Token)match(input,109,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getJournalCAccess().getRecuridKeyword_2_10_0());
            	    								
            	    // InternalMyDsl.g:4973:9: ( (lv_recurid_24_0= RULE_STR ) )
            	    // InternalMyDsl.g:4974:10: (lv_recurid_24_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:4974:10: (lv_recurid_24_0= RULE_STR )
            	    // InternalMyDsl.g:4975:11: lv_recurid_24_0= RULE_STR
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
            	    // InternalMyDsl.g:4997:4: ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:4997:4: ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) )
            	    // InternalMyDsl.g:4998:5: {...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:4998:106: ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) )
            	    // InternalMyDsl.g:4999:6: ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:5002:9: ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) )
            	    // InternalMyDsl.g:5002:10: {...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5002:19: (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' )
            	    // InternalMyDsl.g:5002:20: otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}'
            	    {
            	    otherlv_25=(Token)match(input,110,FOLLOW_12); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJournalCAccess().getRruleKeyword_2_11_0());
            	    								
            	    otherlv_26=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_26, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_11_1());
            	    								
            	    // InternalMyDsl.g:5010:9: ( (lv_rrule_27_0= RULE_STR ) )
            	    // InternalMyDsl.g:5011:10: (lv_rrule_27_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5011:10: (lv_rrule_27_0= RULE_STR )
            	    // InternalMyDsl.g:5012:11: lv_rrule_27_0= RULE_STR
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

            	    // InternalMyDsl.g:5028:9: (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==66) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5029:10: otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_28, grammarAccess.getJournalCAccess().getCommaKeyword_2_11_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5033:10: ( (lv_rrule_29_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5034:11: (lv_rrule_29_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5034:11: (lv_rrule_29_0= RULE_STR )
            	    	    // InternalMyDsl.g:5035:12: lv_rrule_29_0= RULE_STR
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

            	    otherlv_30=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_11_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:5062:4: ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5062:4: ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) )
            	    // InternalMyDsl.g:5063:5: {...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalMyDsl.g:5063:106: ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) )
            	    // InternalMyDsl.g:5064:6: ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalMyDsl.g:5067:9: ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) )
            	    // InternalMyDsl.g:5067:10: {...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5067:19: (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' )
            	    // InternalMyDsl.g:5067:20: otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}'
            	    {
            	    otherlv_31=(Token)match(input,102,FOLLOW_12); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJournalCAccess().getAttachementsKeyword_2_12_0());
            	    								
            	    otherlv_32=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_32, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_12_1());
            	    								
            	    // InternalMyDsl.g:5075:9: ( (lv_attach_33_0= RULE_STR ) )
            	    // InternalMyDsl.g:5076:10: (lv_attach_33_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5076:10: (lv_attach_33_0= RULE_STR )
            	    // InternalMyDsl.g:5077:11: lv_attach_33_0= RULE_STR
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

            	    // InternalMyDsl.g:5093:9: (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==66) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5094:10: otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_34, grammarAccess.getJournalCAccess().getCommaKeyword_2_12_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5098:10: ( (lv_attach_35_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5099:11: (lv_attach_35_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5099:11: (lv_attach_35_0= RULE_STR )
            	    	    // InternalMyDsl.g:5100:12: lv_attach_35_0= RULE_STR
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

            	    otherlv_36=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_36, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_12_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:5127:4: ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5127:4: ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) )
            	    // InternalMyDsl.g:5128:5: {...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // InternalMyDsl.g:5128:106: ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) )
            	    // InternalMyDsl.g:5129:6: ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13);
            	    					
            	    // InternalMyDsl.g:5132:9: ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) )
            	    // InternalMyDsl.g:5132:10: {...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5132:19: (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' )
            	    // InternalMyDsl.g:5132:20: otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}'
            	    {
            	    otherlv_37=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_37, grammarAccess.getJournalCAccess().getInvitesKeyword_2_13_0());
            	    								
            	    otherlv_38=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_38, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_13_1());
            	    								
            	    // InternalMyDsl.g:5140:9: ( (lv_attendee_39_0= RULE_STR ) )
            	    // InternalMyDsl.g:5141:10: (lv_attendee_39_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5141:10: (lv_attendee_39_0= RULE_STR )
            	    // InternalMyDsl.g:5142:11: lv_attendee_39_0= RULE_STR
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

            	    // InternalMyDsl.g:5158:9: (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==66) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5159:10: otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_40=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_40, grammarAccess.getJournalCAccess().getCommaKeyword_2_13_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5163:10: ( (lv_attendee_41_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5164:11: (lv_attendee_41_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5164:11: (lv_attendee_41_0= RULE_STR )
            	    	    // InternalMyDsl.g:5165:12: lv_attendee_41_0= RULE_STR
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

            	    otherlv_42=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_42, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_13_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalMyDsl.g:5192:4: ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5192:4: ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) )
            	    // InternalMyDsl.g:5193:5: {...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // InternalMyDsl.g:5193:106: ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) )
            	    // InternalMyDsl.g:5194:6: ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14);
            	    					
            	    // InternalMyDsl.g:5197:9: ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) )
            	    // InternalMyDsl.g:5197:10: {...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5197:19: (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' )
            	    // InternalMyDsl.g:5197:20: otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}'
            	    {
            	    otherlv_43=(Token)match(input,111,FOLLOW_12); 

            	    									newLeafNode(otherlv_43, grammarAccess.getJournalCAccess().getCategoriesKeyword_2_14_0());
            	    								
            	    otherlv_44=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_44, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_14_1());
            	    								
            	    // InternalMyDsl.g:5205:9: ( (lv_categories_45_0= RULE_STR ) )
            	    // InternalMyDsl.g:5206:10: (lv_categories_45_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5206:10: (lv_categories_45_0= RULE_STR )
            	    // InternalMyDsl.g:5207:11: lv_categories_45_0= RULE_STR
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

            	    // InternalMyDsl.g:5223:9: (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==66) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5224:10: otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_46=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_46, grammarAccess.getJournalCAccess().getCommaKeyword_2_14_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5228:10: ( (lv_categories_47_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5229:11: (lv_categories_47_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5229:11: (lv_categories_47_0= RULE_STR )
            	    	    // InternalMyDsl.g:5230:12: lv_categories_47_0= RULE_STR
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

            	    otherlv_48=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_48, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_14_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalMyDsl.g:5257:4: ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5257:4: ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) )
            	    // InternalMyDsl.g:5258:5: {...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // InternalMyDsl.g:5258:106: ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) )
            	    // InternalMyDsl.g:5259:6: ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15);
            	    					
            	    // InternalMyDsl.g:5262:9: ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) )
            	    // InternalMyDsl.g:5262:10: {...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5262:19: (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' )
            	    // InternalMyDsl.g:5262:20: otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}'
            	    {
            	    otherlv_49=(Token)match(input,112,FOLLOW_12); 

            	    									newLeafNode(otherlv_49, grammarAccess.getJournalCAccess().getCommentaireKeyword_2_15_0());
            	    								
            	    otherlv_50=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_50, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_15_1());
            	    								
            	    // InternalMyDsl.g:5270:9: ( (lv_comment_51_0= RULE_STR ) )
            	    // InternalMyDsl.g:5271:10: (lv_comment_51_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5271:10: (lv_comment_51_0= RULE_STR )
            	    // InternalMyDsl.g:5272:11: lv_comment_51_0= RULE_STR
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

            	    // InternalMyDsl.g:5288:9: (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==66) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5289:10: otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_52=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_52, grammarAccess.getJournalCAccess().getCommaKeyword_2_15_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5293:10: ( (lv_comment_53_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5294:11: (lv_comment_53_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5294:11: (lv_comment_53_0= RULE_STR )
            	    	    // InternalMyDsl.g:5295:12: lv_comment_53_0= RULE_STR
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

            	    otherlv_54=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_54, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_15_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalMyDsl.g:5322:4: ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5322:4: ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) )
            	    // InternalMyDsl.g:5323:5: {...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // InternalMyDsl.g:5323:106: ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) )
            	    // InternalMyDsl.g:5324:6: ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16);
            	    					
            	    // InternalMyDsl.g:5327:9: ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) )
            	    // InternalMyDsl.g:5327:10: {...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5327:19: (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' )
            	    // InternalMyDsl.g:5327:20: otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}'
            	    {
            	    otherlv_55=(Token)match(input,113,FOLLOW_12); 

            	    									newLeafNode(otherlv_55, grammarAccess.getJournalCAccess().getContactKeyword_2_16_0());
            	    								
            	    otherlv_56=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_56, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_16_1());
            	    								
            	    // InternalMyDsl.g:5335:9: ( (lv_contact_57_0= RULE_STR ) )
            	    // InternalMyDsl.g:5336:10: (lv_contact_57_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5336:10: (lv_contact_57_0= RULE_STR )
            	    // InternalMyDsl.g:5337:11: lv_contact_57_0= RULE_STR
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

            	    // InternalMyDsl.g:5353:9: (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==66) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5354:10: otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_58=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_58, grammarAccess.getJournalCAccess().getCommaKeyword_2_16_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5358:10: ( (lv_contact_59_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5359:11: (lv_contact_59_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5359:11: (lv_contact_59_0= RULE_STR )
            	    	    // InternalMyDsl.g:5360:12: lv_contact_59_0= RULE_STR
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

            	    otherlv_60=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_60, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_16_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalMyDsl.g:5387:4: ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5387:4: ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) )
            	    // InternalMyDsl.g:5388:5: {...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // InternalMyDsl.g:5388:106: ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) )
            	    // InternalMyDsl.g:5389:6: ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17);
            	    					
            	    // InternalMyDsl.g:5392:9: ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) )
            	    // InternalMyDsl.g:5392:10: {...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5392:19: (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' )
            	    // InternalMyDsl.g:5392:20: otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}'
            	    {
            	    otherlv_61=(Token)match(input,114,FOLLOW_12); 

            	    									newLeafNode(otherlv_61, grammarAccess.getJournalCAccess().getExdateKeyword_2_17_0());
            	    								
            	    otherlv_62=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_62, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_17_1());
            	    								
            	    // InternalMyDsl.g:5400:9: ( (lv_exdate_63_0= RULE_STR ) )
            	    // InternalMyDsl.g:5401:10: (lv_exdate_63_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5401:10: (lv_exdate_63_0= RULE_STR )
            	    // InternalMyDsl.g:5402:11: lv_exdate_63_0= RULE_STR
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

            	    // InternalMyDsl.g:5418:9: (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )*
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==66) ) {
            	            alt64=1;
            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5419:10: otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_64=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_64, grammarAccess.getJournalCAccess().getCommaKeyword_2_17_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5423:10: ( (lv_exdate_65_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5424:11: (lv_exdate_65_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5424:11: (lv_exdate_65_0= RULE_STR )
            	    	    // InternalMyDsl.g:5425:12: lv_exdate_65_0= RULE_STR
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

            	    otherlv_66=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_66, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_17_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalMyDsl.g:5452:4: ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5452:4: ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) )
            	    // InternalMyDsl.g:5453:5: {...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18)");
            	    }
            	    // InternalMyDsl.g:5453:106: ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) )
            	    // InternalMyDsl.g:5454:6: ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18);
            	    					
            	    // InternalMyDsl.g:5457:9: ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) )
            	    // InternalMyDsl.g:5457:10: {...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5457:19: (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' )
            	    // InternalMyDsl.g:5457:20: otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}'
            	    {
            	    otherlv_67=(Token)match(input,115,FOLLOW_12); 

            	    									newLeafNode(otherlv_67, grammarAccess.getJournalCAccess().getRstatusKeyword_2_18_0());
            	    								
            	    otherlv_68=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_68, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_18_1());
            	    								
            	    // InternalMyDsl.g:5465:9: ( (lv_rstatus_69_0= RULE_STR ) )
            	    // InternalMyDsl.g:5466:10: (lv_rstatus_69_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5466:10: (lv_rstatus_69_0= RULE_STR )
            	    // InternalMyDsl.g:5467:11: lv_rstatus_69_0= RULE_STR
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

            	    // InternalMyDsl.g:5483:9: (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==66) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5484:10: otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_70=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_70, grammarAccess.getJournalCAccess().getCommaKeyword_2_18_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5488:10: ( (lv_rstatus_71_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5489:11: (lv_rstatus_71_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5489:11: (lv_rstatus_71_0= RULE_STR )
            	    	    // InternalMyDsl.g:5490:12: lv_rstatus_71_0= RULE_STR
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

            	    otherlv_72=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_72, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_18_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalMyDsl.g:5517:4: ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5517:4: ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) )
            	    // InternalMyDsl.g:5518:5: {...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19)");
            	    }
            	    // InternalMyDsl.g:5518:106: ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) )
            	    // InternalMyDsl.g:5519:6: ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19);
            	    					
            	    // InternalMyDsl.g:5522:9: ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) )
            	    // InternalMyDsl.g:5522:10: {...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5522:19: (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' )
            	    // InternalMyDsl.g:5522:20: otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}'
            	    {
            	    otherlv_73=(Token)match(input,116,FOLLOW_12); 

            	    									newLeafNode(otherlv_73, grammarAccess.getJournalCAccess().getRelierAKeyword_2_19_0());
            	    								
            	    otherlv_74=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_74, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_19_1());
            	    								
            	    // InternalMyDsl.g:5530:9: ( (lv_related_75_0= RULE_STR ) )
            	    // InternalMyDsl.g:5531:10: (lv_related_75_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5531:10: (lv_related_75_0= RULE_STR )
            	    // InternalMyDsl.g:5532:11: lv_related_75_0= RULE_STR
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

            	    // InternalMyDsl.g:5548:9: (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==66) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5549:10: otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_76=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_76, grammarAccess.getJournalCAccess().getCommaKeyword_2_19_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5553:10: ( (lv_related_77_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5554:11: (lv_related_77_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5554:11: (lv_related_77_0= RULE_STR )
            	    	    // InternalMyDsl.g:5555:12: lv_related_77_0= RULE_STR
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

            	    otherlv_78=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_78, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_19_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalMyDsl.g:5582:4: ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5582:4: ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) )
            	    // InternalMyDsl.g:5583:5: {...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20)");
            	    }
            	    // InternalMyDsl.g:5583:106: ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) )
            	    // InternalMyDsl.g:5584:6: ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20);
            	    					
            	    // InternalMyDsl.g:5587:9: ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) )
            	    // InternalMyDsl.g:5587:10: {...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5587:19: (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' )
            	    // InternalMyDsl.g:5587:20: otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}'
            	    {
            	    otherlv_79=(Token)match(input,117,FOLLOW_12); 

            	    									newLeafNode(otherlv_79, grammarAccess.getJournalCAccess().getResourcesKeyword_2_20_0());
            	    								
            	    otherlv_80=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_80, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_20_1());
            	    								
            	    // InternalMyDsl.g:5595:9: ( (lv_resources_81_0= RULE_STR ) )
            	    // InternalMyDsl.g:5596:10: (lv_resources_81_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5596:10: (lv_resources_81_0= RULE_STR )
            	    // InternalMyDsl.g:5597:11: lv_resources_81_0= RULE_STR
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

            	    // InternalMyDsl.g:5613:9: (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )*
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( (LA67_0==66) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5614:10: otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_82=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_82, grammarAccess.getJournalCAccess().getCommaKeyword_2_20_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5618:10: ( (lv_resources_83_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5619:11: (lv_resources_83_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5619:11: (lv_resources_83_0= RULE_STR )
            	    	    // InternalMyDsl.g:5620:12: lv_resources_83_0= RULE_STR
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

            	    otherlv_84=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_84, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_20_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalMyDsl.g:5647:4: ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5647:4: ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) )
            	    // InternalMyDsl.g:5648:5: {...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21)");
            	    }
            	    // InternalMyDsl.g:5648:106: ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) )
            	    // InternalMyDsl.g:5649:6: ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21);
            	    					
            	    // InternalMyDsl.g:5652:9: ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) )
            	    // InternalMyDsl.g:5652:10: {...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5652:19: (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' )
            	    // InternalMyDsl.g:5652:20: otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}'
            	    {
            	    otherlv_85=(Token)match(input,118,FOLLOW_12); 

            	    									newLeafNode(otherlv_85, grammarAccess.getJournalCAccess().getRdateKeyword_2_21_0());
            	    								
            	    otherlv_86=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_86, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_21_1());
            	    								
            	    // InternalMyDsl.g:5660:9: ( (lv_rdate_87_0= RULE_STR ) )
            	    // InternalMyDsl.g:5661:10: (lv_rdate_87_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5661:10: (lv_rdate_87_0= RULE_STR )
            	    // InternalMyDsl.g:5662:11: lv_rdate_87_0= RULE_STR
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

            	    // InternalMyDsl.g:5678:9: (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==66) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5679:10: otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_88=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_88, grammarAccess.getJournalCAccess().getCommaKeyword_2_21_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5683:10: ( (lv_rdate_89_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5684:11: (lv_rdate_89_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5684:11: (lv_rdate_89_0= RULE_STR )
            	    	    // InternalMyDsl.g:5685:12: lv_rdate_89_0= RULE_STR
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

            	    otherlv_90=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_90, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_21_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalMyDsl.g:5712:4: ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5712:4: ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) )
            	    // InternalMyDsl.g:5713:5: {...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22)");
            	    }
            	    // InternalMyDsl.g:5713:106: ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) )
            	    // InternalMyDsl.g:5714:6: ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22);
            	    					
            	    // InternalMyDsl.g:5717:9: ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) )
            	    // InternalMyDsl.g:5717:10: {...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5717:19: (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' )
            	    // InternalMyDsl.g:5717:20: otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}'
            	    {
            	    otherlv_91=(Token)match(input,119,FOLLOW_12); 

            	    									newLeafNode(otherlv_91, grammarAccess.getJournalCAccess().getX_propKeyword_2_22_0());
            	    								
            	    otherlv_92=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_92, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_22_1());
            	    								
            	    // InternalMyDsl.g:5725:9: ( (lv_x_prop_93_0= RULE_STR ) )
            	    // InternalMyDsl.g:5726:10: (lv_x_prop_93_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5726:10: (lv_x_prop_93_0= RULE_STR )
            	    // InternalMyDsl.g:5727:11: lv_x_prop_93_0= RULE_STR
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

            	    // InternalMyDsl.g:5743:9: (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )*
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==66) ) {
            	            alt69=1;
            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5744:10: otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_94=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_94, grammarAccess.getJournalCAccess().getCommaKeyword_2_22_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5748:10: ( (lv_x_prop_95_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5749:11: (lv_x_prop_95_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5749:11: (lv_x_prop_95_0= RULE_STR )
            	    	    // InternalMyDsl.g:5750:12: lv_x_prop_95_0= RULE_STR
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

            	    otherlv_96=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_96, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_22_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalMyDsl.g:5777:4: ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:5777:4: ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) )
            	    // InternalMyDsl.g:5778:5: {...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23)");
            	    }
            	    // InternalMyDsl.g:5778:106: ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) )
            	    // InternalMyDsl.g:5779:6: ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23);
            	    					
            	    // InternalMyDsl.g:5782:9: ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) )
            	    // InternalMyDsl.g:5782:10: {...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5782:19: (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' )
            	    // InternalMyDsl.g:5782:20: otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}'
            	    {
            	    otherlv_97=(Token)match(input,120,FOLLOW_12); 

            	    									newLeafNode(otherlv_97, grammarAccess.getJournalCAccess().getIana_propKeyword_2_23_0());
            	    								
            	    otherlv_98=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_98, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_2_23_1());
            	    								
            	    // InternalMyDsl.g:5790:9: ( (lv_iana_prop_99_0= RULE_STR ) )
            	    // InternalMyDsl.g:5791:10: (lv_iana_prop_99_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5791:10: (lv_iana_prop_99_0= RULE_STR )
            	    // InternalMyDsl.g:5792:11: lv_iana_prop_99_0= RULE_STR
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

            	    // InternalMyDsl.g:5808:9: (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==66) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:5809:10: otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_100=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_100, grammarAccess.getJournalCAccess().getCommaKeyword_2_23_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5813:10: ( (lv_iana_prop_101_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:5814:11: (lv_iana_prop_101_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:5814:11: (lv_iana_prop_101_0= RULE_STR )
            	    	    // InternalMyDsl.g:5815:12: lv_iana_prop_101_0= RULE_STR
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

            	    otherlv_102=(Token)match(input,58,FOLLOW_40); 

            	    									newLeafNode(otherlv_102, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_2_23_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJournalCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalMyDsl.g:5842:4: ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5842:4: ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5843:5: {...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24)");
            	    }
            	    // InternalMyDsl.g:5843:106: ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5844:6: ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24);
            	    					
            	    // InternalMyDsl.g:5847:9: ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5847:10: {...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJournalC", "true");
            	    }
            	    // InternalMyDsl.g:5847:19: (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5847:20: otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) )
            	    {
            	    otherlv_103=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_103, grammarAccess.getJournalCAccess().getDescriptionKeyword_2_24_0());
            	    								
            	    // InternalMyDsl.g:5851:9: ( (lv_description_104_0= RULE_STR ) )
            	    // InternalMyDsl.g:5852:10: (lv_description_104_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5852:10: (lv_description_104_0= RULE_STR )
            	    // InternalMyDsl.g:5853:11: lv_description_104_0= RULE_STR
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

            otherlv_105=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:5891:1: entryRuleVacationC returns [EObject current=null] : iv_ruleVacationC= ruleVacationC EOF ;
    public final EObject entryRuleVacationC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVacationC = null;


        try {
            // InternalMyDsl.g:5891:50: (iv_ruleVacationC= ruleVacationC EOF )
            // InternalMyDsl.g:5892:2: iv_ruleVacationC= ruleVacationC EOF
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
    // InternalMyDsl.g:5898:1: ruleVacationC returns [EObject current=null] : (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' ) ;
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
            // InternalMyDsl.g:5904:2: ( (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' ) )
            // InternalMyDsl.g:5905:2: (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' )
            {
            // InternalMyDsl.g:5905:2: (otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}' )
            // InternalMyDsl.g:5906:3: otherlv_0= 'VacationC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) ) otherlv_51= '}'
            {
            otherlv_0=(Token)match(input,124,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVacationCAccess().getVacationCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:5914:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:5915:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:5915:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:5916:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5919:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:5920:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:5920:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=13;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // InternalMyDsl.g:5921:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5921:4: ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5922:5: {...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5922:106: ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5923:6: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5926:9: ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5926:10: {...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5926:19: (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5926:20: otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getVacationCAccess().getIdentifiantKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:5930:9: ( (lv_uid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:5931:10: (lv_uid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5931:10: (lv_uid_4_0= RULE_STR )
            	    // InternalMyDsl.g:5932:11: lv_uid_4_0= RULE_STR
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
            	    // InternalMyDsl.g:5954:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5954:4: ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:5955:5: {...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5955:106: ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:5956:6: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5959:9: ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:5959:10: {...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5959:19: (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:5959:20: otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_16); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVacationCAccess().getDateKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:5963:9: ( (lv_dtstart_6_0= ruleDateT ) )
            	    // InternalMyDsl.g:5964:10: (lv_dtstart_6_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:5964:10: (lv_dtstart_6_0= ruleDateT )
            	    // InternalMyDsl.g:5965:11: lv_dtstart_6_0= ruleDateT
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
            	    // InternalMyDsl.g:5988:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5988:4: ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:5989:5: {...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:5989:106: ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:5990:6: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:5993:9: ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:5993:10: {...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:5993:19: (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:5993:20: otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getVacationCAccess().getOrganisateurKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:5997:9: ( (lv_organizer_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:5998:10: (lv_organizer_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:5998:10: (lv_organizer_8_0= RULE_STR )
            	    // InternalMyDsl.g:5999:11: lv_organizer_8_0= RULE_STR
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
            	    // InternalMyDsl.g:6021:4: ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6021:4: ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6022:5: {...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:6022:106: ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6023:6: ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:6026:9: ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6026:10: {...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6026:19: (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6026:20: otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) )
            	    {
            	    otherlv_9=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVacationCAccess().getURLKeyword_2_3_0());
            	    								
            	    // InternalMyDsl.g:6030:9: ( (lv_url_10_0= RULE_STR ) )
            	    // InternalMyDsl.g:6031:10: (lv_url_10_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6031:10: (lv_url_10_0= RULE_STR )
            	    // InternalMyDsl.g:6032:11: lv_url_10_0= RULE_STR
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
            	    // InternalMyDsl.g:6054:4: ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6054:4: ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6055:5: {...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:6055:106: ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6056:6: ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:6059:9: ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6059:10: {...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6059:19: (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6059:20: otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) )
            	    {
            	    otherlv_11=(Token)match(input,70,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getVacationCAccess().getContactKeyword_2_4_0());
            	    								
            	    // InternalMyDsl.g:6063:9: ( (lv_contact_12_0= RULE_STR ) )
            	    // InternalMyDsl.g:6064:10: (lv_contact_12_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6064:10: (lv_contact_12_0= RULE_STR )
            	    // InternalMyDsl.g:6065:11: lv_contact_12_0= RULE_STR
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
            	    // InternalMyDsl.g:6087:4: ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6087:4: ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) )
            	    // InternalMyDsl.g:6088:5: {...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:6088:106: ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) )
            	    // InternalMyDsl.g:6089:6: ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:6092:9: ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) )
            	    // InternalMyDsl.g:6092:10: {...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6092:19: (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) )
            	    // InternalMyDsl.g:6092:20: otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) )
            	    {
            	    otherlv_13=(Token)match(input,77,FOLLOW_16); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVacationCAccess().getFinKeyword_2_5_0());
            	    								
            	    // InternalMyDsl.g:6096:9: ( (lv_dtend_14_0= ruleDateT ) )
            	    // InternalMyDsl.g:6097:10: (lv_dtend_14_0= ruleDateT )
            	    {
            	    // InternalMyDsl.g:6097:10: (lv_dtend_14_0= ruleDateT )
            	    // InternalMyDsl.g:6098:11: lv_dtend_14_0= ruleDateT
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
            	    // InternalMyDsl.g:6121:4: ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6121:4: ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    // InternalMyDsl.g:6122:5: {...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:6122:106: ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    // InternalMyDsl.g:6123:6: ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:6126:9: ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    // InternalMyDsl.g:6126:10: {...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6126:19: (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    // InternalMyDsl.g:6126:20: otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,101,FOLLOW_12); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVacationCAccess().getInvitesKeyword_2_6_0());
            	    								
            	    otherlv_16=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:6134:9: ( (lv_attendee_17_0= RULE_STR ) )
            	    // InternalMyDsl.g:6135:10: (lv_attendee_17_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6135:10: (lv_attendee_17_0= RULE_STR )
            	    // InternalMyDsl.g:6136:11: lv_attendee_17_0= RULE_STR
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

            	    // InternalMyDsl.g:6152:9: (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==66) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6153:10: otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getVacationCAccess().getCommaKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6157:10: ( (lv_attendee_19_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6158:11: (lv_attendee_19_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6158:11: (lv_attendee_19_0= RULE_STR )
            	    	    // InternalMyDsl.g:6159:12: lv_attendee_19_0= RULE_STR
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

            	    otherlv_20=(Token)match(input,58,FOLLOW_42); 

            	    									newLeafNode(otherlv_20, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:6186:4: ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6186:4: ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) )
            	    // InternalMyDsl.g:6187:5: {...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:6187:106: ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) )
            	    // InternalMyDsl.g:6188:6: ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:6191:9: ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) )
            	    // InternalMyDsl.g:6191:10: {...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6191:19: (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' )
            	    // InternalMyDsl.g:6191:20: otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}'
            	    {
            	    otherlv_21=(Token)match(input,112,FOLLOW_12); 

            	    									newLeafNode(otherlv_21, grammarAccess.getVacationCAccess().getCommentaireKeyword_2_7_0());
            	    								
            	    otherlv_22=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:6199:9: ( (lv_comment_23_0= RULE_STR ) )
            	    // InternalMyDsl.g:6200:10: (lv_comment_23_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6200:10: (lv_comment_23_0= RULE_STR )
            	    // InternalMyDsl.g:6201:11: lv_comment_23_0= RULE_STR
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

            	    // InternalMyDsl.g:6217:9: (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==66) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6218:10: otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getVacationCAccess().getCommaKeyword_2_7_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6222:10: ( (lv_comment_25_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6223:11: (lv_comment_25_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6223:11: (lv_comment_25_0= RULE_STR )
            	    	    // InternalMyDsl.g:6224:12: lv_comment_25_0= RULE_STR
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

            	    otherlv_26=(Token)match(input,58,FOLLOW_42); 

            	    									newLeafNode(otherlv_26, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_7_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:6251:4: ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6251:4: ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) )
            	    // InternalMyDsl.g:6252:5: {...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalMyDsl.g:6252:106: ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) )
            	    // InternalMyDsl.g:6253:6: ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalMyDsl.g:6256:9: ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) )
            	    // InternalMyDsl.g:6256:10: {...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6256:19: (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' )
            	    // InternalMyDsl.g:6256:20: otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}'
            	    {
            	    otherlv_27=(Token)match(input,125,FOLLOW_12); 

            	    									newLeafNode(otherlv_27, grammarAccess.getVacationCAccess().getFreebusyKeyword_2_8_0());
            	    								
            	    otherlv_28=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_8_1());
            	    								
            	    // InternalMyDsl.g:6264:9: ( (lv_freebusy_29_0= RULE_STR ) )
            	    // InternalMyDsl.g:6265:10: (lv_freebusy_29_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6265:10: (lv_freebusy_29_0= RULE_STR )
            	    // InternalMyDsl.g:6266:11: lv_freebusy_29_0= RULE_STR
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

            	    // InternalMyDsl.g:6282:9: (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==66) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6283:10: otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_30=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_30, grammarAccess.getVacationCAccess().getCommaKeyword_2_8_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6287:10: ( (lv_freebusy_31_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6288:11: (lv_freebusy_31_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6288:11: (lv_freebusy_31_0= RULE_STR )
            	    	    // InternalMyDsl.g:6289:12: lv_freebusy_31_0= RULE_STR
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

            	    otherlv_32=(Token)match(input,58,FOLLOW_42); 

            	    									newLeafNode(otherlv_32, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_8_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:6316:4: ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6316:4: ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) )
            	    // InternalMyDsl.g:6317:5: {...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalMyDsl.g:6317:106: ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) )
            	    // InternalMyDsl.g:6318:6: ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalMyDsl.g:6321:9: ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) )
            	    // InternalMyDsl.g:6321:10: {...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6321:19: (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' )
            	    // InternalMyDsl.g:6321:20: otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}'
            	    {
            	    otherlv_33=(Token)match(input,115,FOLLOW_12); 

            	    									newLeafNode(otherlv_33, grammarAccess.getVacationCAccess().getRstatusKeyword_2_9_0());
            	    								
            	    otherlv_34=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_34, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_9_1());
            	    								
            	    // InternalMyDsl.g:6329:9: ( (lv_rstatus_35_0= RULE_STR ) )
            	    // InternalMyDsl.g:6330:10: (lv_rstatus_35_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6330:10: (lv_rstatus_35_0= RULE_STR )
            	    // InternalMyDsl.g:6331:11: lv_rstatus_35_0= RULE_STR
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

            	    // InternalMyDsl.g:6347:9: (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==66) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6348:10: otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_36=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_36, grammarAccess.getVacationCAccess().getCommaKeyword_2_9_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6352:10: ( (lv_rstatus_37_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6353:11: (lv_rstatus_37_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6353:11: (lv_rstatus_37_0= RULE_STR )
            	    	    // InternalMyDsl.g:6354:12: lv_rstatus_37_0= RULE_STR
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

            	    otherlv_38=(Token)match(input,58,FOLLOW_42); 

            	    									newLeafNode(otherlv_38, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_9_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:6381:4: ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6381:4: ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) )
            	    // InternalMyDsl.g:6382:5: {...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalMyDsl.g:6382:107: ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) )
            	    // InternalMyDsl.g:6383:6: ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalMyDsl.g:6386:9: ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) )
            	    // InternalMyDsl.g:6386:10: {...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6386:19: (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' )
            	    // InternalMyDsl.g:6386:20: otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}'
            	    {
            	    otherlv_39=(Token)match(input,119,FOLLOW_12); 

            	    									newLeafNode(otherlv_39, grammarAccess.getVacationCAccess().getX_propKeyword_2_10_0());
            	    								
            	    otherlv_40=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_40, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_10_1());
            	    								
            	    // InternalMyDsl.g:6394:9: ( (lv_x_prop_41_0= RULE_STR ) )
            	    // InternalMyDsl.g:6395:10: (lv_x_prop_41_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6395:10: (lv_x_prop_41_0= RULE_STR )
            	    // InternalMyDsl.g:6396:11: lv_x_prop_41_0= RULE_STR
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

            	    // InternalMyDsl.g:6412:9: (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==66) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6413:10: otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_42=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_42, grammarAccess.getVacationCAccess().getCommaKeyword_2_10_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6417:10: ( (lv_x_prop_43_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6418:11: (lv_x_prop_43_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6418:11: (lv_x_prop_43_0= RULE_STR )
            	    	    // InternalMyDsl.g:6419:12: lv_x_prop_43_0= RULE_STR
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

            	    otherlv_44=(Token)match(input,58,FOLLOW_42); 

            	    									newLeafNode(otherlv_44, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_2_10_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVacationCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:6446:4: ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6446:4: ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) )
            	    // InternalMyDsl.g:6447:5: {...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalMyDsl.g:6447:107: ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) )
            	    // InternalMyDsl.g:6448:6: ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalMyDsl.g:6451:9: ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) )
            	    // InternalMyDsl.g:6451:10: {...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVacationC", "true");
            	    }
            	    // InternalMyDsl.g:6451:19: (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' )
            	    // InternalMyDsl.g:6451:20: otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}'
            	    {
            	    otherlv_45=(Token)match(input,120,FOLLOW_12); 

            	    									newLeafNode(otherlv_45, grammarAccess.getVacationCAccess().getIana_propKeyword_2_11_0());
            	    								
            	    otherlv_46=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_46, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_2_11_1());
            	    								
            	    // InternalMyDsl.g:6459:9: ( (lv_iana_prop_47_0= RULE_STR ) )
            	    // InternalMyDsl.g:6460:10: (lv_iana_prop_47_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6460:10: (lv_iana_prop_47_0= RULE_STR )
            	    // InternalMyDsl.g:6461:11: lv_iana_prop_47_0= RULE_STR
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

            	    // InternalMyDsl.g:6477:9: (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==66) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6478:10: otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_48=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_48, grammarAccess.getVacationCAccess().getCommaKeyword_2_11_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6482:10: ( (lv_iana_prop_49_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6483:11: (lv_iana_prop_49_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6483:11: (lv_iana_prop_49_0= RULE_STR )
            	    	    // InternalMyDsl.g:6484:12: lv_iana_prop_49_0= RULE_STR
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

            	    otherlv_50=(Token)match(input,58,FOLLOW_42); 

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

            otherlv_51=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:6527:1: entryRuleTimeZoneC returns [EObject current=null] : iv_ruleTimeZoneC= ruleTimeZoneC EOF ;
    public final EObject entryRuleTimeZoneC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeZoneC = null;


        try {
            // InternalMyDsl.g:6527:50: (iv_ruleTimeZoneC= ruleTimeZoneC EOF )
            // InternalMyDsl.g:6528:2: iv_ruleTimeZoneC= ruleTimeZoneC EOF
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
    // InternalMyDsl.g:6534:1: ruleTimeZoneC returns [EObject current=null] : (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) ;
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
            // InternalMyDsl.g:6540:2: ( (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) )
            // InternalMyDsl.g:6541:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            {
            // InternalMyDsl.g:6541:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            // InternalMyDsl.g:6542:3: otherlv_0= 'TimeZoneC' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,126,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeZoneCAccess().getTimeZoneCKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:6550:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:6551:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:6551:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:6552:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:6555:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:6556:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:6556:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) ) )+
            int cnt83=0;
            loop83:
            do {
                int alt83=8;
                int LA83_0 = input.LA(1);

                if ( LA83_0 == 127 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0) ) {
                    alt83=1;
                }
                else if ( LA83_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1) ) {
                    alt83=2;
                }
                else if ( LA83_0 == 128 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2) ) {
                    alt83=3;
                }
                else if ( LA83_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3) ) {
                    alt83=4;
                }
                else if ( LA83_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4) ) {
                    alt83=5;
                }
                else if ( LA83_0 == 129 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5) ) {
                    alt83=6;
                }
                else if ( LA83_0 == 130 && getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6) ) {
                    alt83=7;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalMyDsl.g:6557:4: ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6557:4: ({...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6558:5: {...}? => ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:6558:106: ( ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6559:6: ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:6562:9: ({...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6562:10: {...}? => (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6562:19: (otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6562:20: otherlv_3= 'Tzid:' ( (lv_tzid_4_0= RULE_STR ) )
            	    {
            	    otherlv_3=(Token)match(input,127,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTimeZoneCAccess().getTzidKeyword_2_0_0());
            	    								
            	    // InternalMyDsl.g:6566:9: ( (lv_tzid_4_0= RULE_STR ) )
            	    // InternalMyDsl.g:6567:10: (lv_tzid_4_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6567:10: (lv_tzid_4_0= RULE_STR )
            	    // InternalMyDsl.g:6568:11: lv_tzid_4_0= RULE_STR
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
            	    // InternalMyDsl.g:6590:4: ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6590:4: ({...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6591:5: {...}? => ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:6591:106: ( ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6592:6: ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:6595:9: ({...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6595:10: {...}? => (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6595:19: (otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6595:20: otherlv_5= 'Last_mod:' ( (lv_last_mod_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,107,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTimeZoneCAccess().getLast_modKeyword_2_1_0());
            	    								
            	    // InternalMyDsl.g:6599:9: ( (lv_last_mod_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:6600:10: (lv_last_mod_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6600:10: (lv_last_mod_6_0= RULE_STR )
            	    // InternalMyDsl.g:6601:11: lv_last_mod_6_0= RULE_STR
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
            	    // InternalMyDsl.g:6623:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:6623:4: ({...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) ) )
            	    // InternalMyDsl.g:6624:5: {...}? => ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:6624:106: ( ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) ) )
            	    // InternalMyDsl.g:6625:6: ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:6628:9: ({...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) ) )
            	    // InternalMyDsl.g:6628:10: {...}? => (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6628:19: (otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) ) )
            	    // InternalMyDsl.g:6628:20: otherlv_7= 'Tzurl:' ( (lv_tzurl_8_0= RULE_STR ) )
            	    {
            	    otherlv_7=(Token)match(input,128,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTimeZoneCAccess().getTzurlKeyword_2_2_0());
            	    								
            	    // InternalMyDsl.g:6632:9: ( (lv_tzurl_8_0= RULE_STR ) )
            	    // InternalMyDsl.g:6633:10: (lv_tzurl_8_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6633:10: (lv_tzurl_8_0= RULE_STR )
            	    // InternalMyDsl.g:6634:11: lv_tzurl_8_0= RULE_STR
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
            	    // InternalMyDsl.g:6656:4: ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6656:4: ({...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) ) )
            	    // InternalMyDsl.g:6657:5: {...}? => ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:6657:106: ( ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) ) )
            	    // InternalMyDsl.g:6658:6: ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:6661:9: ({...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' ) )
            	    // InternalMyDsl.g:6661:10: {...}? => (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6661:19: (otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}' )
            	    // InternalMyDsl.g:6661:20: otherlv_9= 'X_prop' otherlv_10= '{' ( (lv_x_prop_11_0= RULE_STR ) ) (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )* otherlv_14= '}'
            	    {
            	    otherlv_9=(Token)match(input,119,FOLLOW_12); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTimeZoneCAccess().getX_propKeyword_2_3_0());
            	    								
            	    otherlv_10=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:6669:9: ( (lv_x_prop_11_0= RULE_STR ) )
            	    // InternalMyDsl.g:6670:10: (lv_x_prop_11_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6670:10: (lv_x_prop_11_0= RULE_STR )
            	    // InternalMyDsl.g:6671:11: lv_x_prop_11_0= RULE_STR
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

            	    // InternalMyDsl.g:6687:9: (otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==66) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6688:10: otherlv_12= ',' ( (lv_x_prop_13_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_3_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6692:10: ( (lv_x_prop_13_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6693:11: (lv_x_prop_13_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6693:11: (lv_x_prop_13_0= RULE_STR )
            	    	    // InternalMyDsl.g:6694:12: lv_x_prop_13_0= RULE_STR
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

            	    otherlv_14=(Token)match(input,58,FOLLOW_44); 

            	    									newLeafNode(otherlv_14, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:6721:4: ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6721:4: ({...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) )
            	    // InternalMyDsl.g:6722:5: {...}? => ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:6722:106: ( ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) )
            	    // InternalMyDsl.g:6723:6: ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:6726:9: ({...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' ) )
            	    // InternalMyDsl.g:6726:10: {...}? => (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6726:19: (otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}' )
            	    // InternalMyDsl.g:6726:20: otherlv_15= 'Iana_prop' otherlv_16= '{' ( (lv_iana_prop_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,120,FOLLOW_12); 

            	    									newLeafNode(otherlv_15, grammarAccess.getTimeZoneCAccess().getIana_propKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:6734:9: ( (lv_iana_prop_17_0= RULE_STR ) )
            	    // InternalMyDsl.g:6735:10: (lv_iana_prop_17_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:6735:10: (lv_iana_prop_17_0= RULE_STR )
            	    // InternalMyDsl.g:6736:11: lv_iana_prop_17_0= RULE_STR
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

            	    // InternalMyDsl.g:6752:9: (otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==66) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6753:10: otherlv_18= ',' ( (lv_iana_prop_19_0= RULE_STR ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,66,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_4_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6757:10: ( (lv_iana_prop_19_0= RULE_STR ) )
            	    	    // InternalMyDsl.g:6758:11: (lv_iana_prop_19_0= RULE_STR )
            	    	    {
            	    	    // InternalMyDsl.g:6758:11: (lv_iana_prop_19_0= RULE_STR )
            	    	    // InternalMyDsl.g:6759:12: lv_iana_prop_19_0= RULE_STR
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

            	    otherlv_20=(Token)match(input,58,FOLLOW_44); 

            	    									newLeafNode(otherlv_20, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:6786:4: ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6786:4: ({...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) ) )
            	    // InternalMyDsl.g:6787:5: {...}? => ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:6787:106: ( ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) ) )
            	    // InternalMyDsl.g:6788:6: ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:6791:9: ({...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' ) )
            	    // InternalMyDsl.g:6791:10: {...}? => (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6791:19: (otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}' )
            	    // InternalMyDsl.g:6791:20: otherlv_21= 'Standardc' otherlv_22= '{' ( (lv_standardc_23_0= ruletzprop ) ) (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )* otherlv_26= '}'
            	    {
            	    otherlv_21=(Token)match(input,129,FOLLOW_12); 

            	    									newLeafNode(otherlv_21, grammarAccess.getTimeZoneCAccess().getStandardcKeyword_2_5_0());
            	    								
            	    otherlv_22=(Token)match(input,53,FOLLOW_45); 

            	    									newLeafNode(otherlv_22, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:6799:9: ( (lv_standardc_23_0= ruletzprop ) )
            	    // InternalMyDsl.g:6800:10: (lv_standardc_23_0= ruletzprop )
            	    {
            	    // InternalMyDsl.g:6800:10: (lv_standardc_23_0= ruletzprop )
            	    // InternalMyDsl.g:6801:11: lv_standardc_23_0= ruletzprop
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

            	    // InternalMyDsl.g:6818:9: (otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==66) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6819:10: otherlv_24= ',' ( (lv_standardc_25_0= ruletzprop ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,66,FOLLOW_45); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_5_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6823:10: ( (lv_standardc_25_0= ruletzprop ) )
            	    	    // InternalMyDsl.g:6824:11: (lv_standardc_25_0= ruletzprop )
            	    	    {
            	    	    // InternalMyDsl.g:6824:11: (lv_standardc_25_0= ruletzprop )
            	    	    // InternalMyDsl.g:6825:12: lv_standardc_25_0= ruletzprop
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

            	    otherlv_26=(Token)match(input,58,FOLLOW_44); 

            	    									newLeafNode(otherlv_26, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_2_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:6853:4: ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:6853:4: ({...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) ) )
            	    // InternalMyDsl.g:6854:5: {...}? => ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "getUnorderedGroupHelper().canSelect(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:6854:106: ( ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) ) )
            	    // InternalMyDsl.g:6855:6: ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTimeZoneCAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:6858:9: ({...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' ) )
            	    // InternalMyDsl.g:6858:10: {...}? => (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTimeZoneC", "true");
            	    }
            	    // InternalMyDsl.g:6858:19: (otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}' )
            	    // InternalMyDsl.g:6858:20: otherlv_27= 'Daylightc' otherlv_28= '{' ( (lv_daylightc_29_0= ruletzprop ) ) (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )* otherlv_32= '}'
            	    {
            	    otherlv_27=(Token)match(input,130,FOLLOW_12); 

            	    									newLeafNode(otherlv_27, grammarAccess.getTimeZoneCAccess().getDaylightcKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,53,FOLLOW_45); 

            	    									newLeafNode(otherlv_28, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:6866:9: ( (lv_daylightc_29_0= ruletzprop ) )
            	    // InternalMyDsl.g:6867:10: (lv_daylightc_29_0= ruletzprop )
            	    {
            	    // InternalMyDsl.g:6867:10: (lv_daylightc_29_0= ruletzprop )
            	    // InternalMyDsl.g:6868:11: lv_daylightc_29_0= ruletzprop
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

            	    // InternalMyDsl.g:6885:9: (otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) ) )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==66) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:6886:10: otherlv_30= ',' ( (lv_daylightc_31_0= ruletzprop ) )
            	    	    {
            	    	    otherlv_30=(Token)match(input,66,FOLLOW_45); 

            	    	    										newLeafNode(otherlv_30, grammarAccess.getTimeZoneCAccess().getCommaKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:6890:10: ( (lv_daylightc_31_0= ruletzprop ) )
            	    	    // InternalMyDsl.g:6891:11: (lv_daylightc_31_0= ruletzprop )
            	    	    {
            	    	    // InternalMyDsl.g:6891:11: (lv_daylightc_31_0= ruletzprop )
            	    	    // InternalMyDsl.g:6892:12: lv_daylightc_31_0= ruletzprop
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

            	    otherlv_32=(Token)match(input,58,FOLLOW_44); 

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

            otherlv_33=(Token)match(input,58,FOLLOW_2); 

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
    static final String dfa_2s = "\1\72\24\uffff";
    static final String dfa_3s = "\1\117\24\uffff";
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
            return "()+ loopback of 1037:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Date:' ( (lv_dtstart_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Objet:' ( (lv_summary_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'URL:' ( (lv_url_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Attachements:' ( (lv_attach_14_0= RULE_STR ) ) (otherlv_15= ',' ( (lv_attach_16_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Invites:' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Categories:' ( (lv_categories_22_0= RULE_STR ) ) (otherlv_23= ',' ( (lv_categories_24_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Commentaire:' ( (lv_comment_26_0= RULE_STR ) ) (otherlv_27= ',' ( (lv_comment_28_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Contact:' ( (lv_contact_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_contact_32_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Status:' ( (lv_rstatus_34_0= ruleEventStatus ) ) (otherlv_35= ',' ( (lv_rstatus_36_0= ruleEventStatus ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Relier a:' ( (lv_related_38_0= RULE_STR ) ) (otherlv_39= ',' ( (lv_related_40_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Resources:' ( (lv_resources_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_resources_44_0= RULE_STR ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Description:' ( (lv_description_46_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Priorite:' ( (lv_priority_48_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Lieu:' ( (lv_location_50_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= 'Fin:' ( (lv_dtend_52_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Classe:' ( (lv_class_54_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Alarmes:' ( (lv_alarmc_56_0= ruleAlarmC ) ) (otherlv_57= ',' ( (lv_alarmc_58_0= ruleAlarmC ) ) )* ) ) ) ) )+";
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
                        if ( (LA33_0==58) ) {s = 1;}

                        else if ( LA33_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA33_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA33_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA33_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA33_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA33_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA33_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA33_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA33_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA33_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA33_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA33_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA33_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA33_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA33_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA33_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA33_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA33_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA33_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                         
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
    static final String dfa_8s = "\1\72\41\uffff";
    static final String dfa_9s = "\1\172\41\uffff";
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
            return "()+ loopback of 3083:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Dtstamp:' ( (lv_dtstamp_4_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Identifiant:' ( (lv_uid_6_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Due:' ( (lv_due_8_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Date:' ( (lv_dtstart_10_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Classe:' ( (lv_class_12_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Cree le:' ( (lv_created_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Last_mod:' ( (lv_last_mod_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Organisateur:' ( (lv_organizer_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Seq:' ( (lv_seq_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Status:' ( (lv_status_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Objet:' ( (lv_summary_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'URL:' ( (lv_url_26_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Recurid:' ( (lv_recurid_28_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'Rrule' otherlv_30= '{' ( (lv_rrule_31_0= RULE_STR ) ) (otherlv_32= ',' ( (lv_rrule_33_0= RULE_STR ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Attachements' otherlv_36= '{' ( (lv_attach_37_0= RULE_STR ) ) (otherlv_38= ',' ( (lv_attach_39_0= RULE_STR ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Invites' otherlv_42= '{' ( (lv_attendee_43_0= RULE_STR ) ) (otherlv_44= ',' ( (lv_attendee_45_0= RULE_STR ) ) )* otherlv_46= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'Categories' otherlv_48= '{' ( (lv_categories_49_0= RULE_STR ) ) (otherlv_50= ',' ( (lv_categories_51_0= RULE_STR ) ) )* otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'Commentaire' otherlv_54= '{' ( (lv_comment_55_0= RULE_STR ) ) (otherlv_56= ',' ( (lv_comment_57_0= RULE_STR ) ) )* otherlv_58= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= 'Contact' otherlv_60= '{' ( (lv_contact_61_0= RULE_STR ) ) (otherlv_62= ',' ( (lv_contact_63_0= RULE_STR ) ) )* otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'Exdate' otherlv_66= '{' ( (lv_exdate_67_0= RULE_STR ) ) (otherlv_68= ',' ( (lv_exdate_69_0= RULE_STR ) ) )* otherlv_70= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'Rstatus' otherlv_72= '{' ( (lv_rstatus_73_0= RULE_STR ) ) (otherlv_74= ',' ( (lv_rstatus_75_0= RULE_STR ) ) )* otherlv_76= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'Relier a' otherlv_78= '{' ( (lv_related_79_0= RULE_STR ) ) (otherlv_80= ',' ( (lv_related_81_0= RULE_STR ) ) )* otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'Resources' otherlv_84= '{' ( (lv_resources_85_0= RULE_STR ) ) (otherlv_86= ',' ( (lv_resources_87_0= RULE_STR ) ) )* otherlv_88= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'Rdate' otherlv_90= '{' ( (lv_rdate_91_0= RULE_STR ) ) (otherlv_92= ',' ( (lv_rdate_93_0= RULE_STR ) ) )* otherlv_94= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'X_prop' otherlv_96= '{' ( (lv_x_prop_97_0= RULE_STR ) ) (otherlv_98= ',' ( (lv_x_prop_99_0= RULE_STR ) ) )* otherlv_100= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_101= 'Iana_prop' otherlv_102= '{' ( (lv_iana_prop_103_0= RULE_STR ) ) (otherlv_104= ',' ( (lv_iana_prop_105_0= RULE_STR ) ) )* otherlv_106= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_107= 'Description:' ( (lv_description_108_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'Completee:' ( (lv_completed_110_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_111= 'Priorite:' ( (lv_priority_112_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_113= 'Geo:' ( (lv_geo_114_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_115= 'Lieu:' ( (lv_location_116_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_117= 'Alarmes:' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* ) ) ) ) )+";
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
                        if ( (LA57_0==58) ) {s = 1;}

                        else if ( LA57_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA57_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA57_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA57_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA57_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA57_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA57_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA57_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA57_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA57_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA57_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA57_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA57_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA57_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA57_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA57_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA57_0 == 111 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA57_0 == 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA57_0 == 113 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                        else if ( LA57_0 == 114 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 19) ) {s = 21;}

                        else if ( LA57_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 20) ) {s = 22;}

                        else if ( LA57_0 == 116 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 21) ) {s = 23;}

                        else if ( LA57_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 22) ) {s = 24;}

                        else if ( LA57_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 23) ) {s = 25;}

                        else if ( LA57_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 24) ) {s = 26;}

                        else if ( LA57_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 25) ) {s = 27;}

                        else if ( LA57_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 26) ) {s = 28;}

                        else if ( LA57_0 == 121 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 27) ) {s = 29;}

                        else if ( LA57_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 28) ) {s = 30;}

                        else if ( LA57_0 == 122 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 29) ) {s = 31;}

                        else if ( LA57_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 30) ) {s = 32;}

                        else if ( LA57_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getToDoCAccess().getUnorderedGroup_2(), 31) ) {s = 33;}

                         
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
    static final String dfa_14s = "\1\72\32\uffff";
    static final String dfa_15s = "\1\170\32\uffff";
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
            return "()+ loopback of 4631:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Classe:' ( (lv_class_8_0= ruleClassification ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'Cree le:' ( (lv_created_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Last_mod:' ( (lv_last_mod_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Organisateur:' ( (lv_organizer_14_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Seq:' ( (lv_seq_16_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'Status:' ( (lv_status_18_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'Objet:' ( (lv_summary_20_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'URL:' ( (lv_url_22_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'Recurid:' ( (lv_recurid_24_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'Rrule' otherlv_26= '{' ( (lv_rrule_27_0= RULE_STR ) ) (otherlv_28= ',' ( (lv_rrule_29_0= RULE_STR ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'Attachements' otherlv_32= '{' ( (lv_attach_33_0= RULE_STR ) ) (otherlv_34= ',' ( (lv_attach_35_0= RULE_STR ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'Invites' otherlv_38= '{' ( (lv_attendee_39_0= RULE_STR ) ) (otherlv_40= ',' ( (lv_attendee_41_0= RULE_STR ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'Categories' otherlv_44= '{' ( (lv_categories_45_0= RULE_STR ) ) (otherlv_46= ',' ( (lv_categories_47_0= RULE_STR ) ) )* otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'Commentaire' otherlv_50= '{' ( (lv_comment_51_0= RULE_STR ) ) (otherlv_52= ',' ( (lv_comment_53_0= RULE_STR ) ) )* otherlv_54= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'Contact' otherlv_56= '{' ( (lv_contact_57_0= RULE_STR ) ) (otherlv_58= ',' ( (lv_contact_59_0= RULE_STR ) ) )* otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'Exdate' otherlv_62= '{' ( (lv_exdate_63_0= RULE_STR ) ) (otherlv_64= ',' ( (lv_exdate_65_0= RULE_STR ) ) )* otherlv_66= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_67= 'Rstatus' otherlv_68= '{' ( (lv_rstatus_69_0= RULE_STR ) ) (otherlv_70= ',' ( (lv_rstatus_71_0= RULE_STR ) ) )* otherlv_72= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'Relier a' otherlv_74= '{' ( (lv_related_75_0= RULE_STR ) ) (otherlv_76= ',' ( (lv_related_77_0= RULE_STR ) ) )* otherlv_78= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'Resources' otherlv_80= '{' ( (lv_resources_81_0= RULE_STR ) ) (otherlv_82= ',' ( (lv_resources_83_0= RULE_STR ) ) )* otherlv_84= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'Rdate' otherlv_86= '{' ( (lv_rdate_87_0= RULE_STR ) ) (otherlv_88= ',' ( (lv_rdate_89_0= RULE_STR ) ) )* otherlv_90= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'X_prop' otherlv_92= '{' ( (lv_x_prop_93_0= RULE_STR ) ) (otherlv_94= ',' ( (lv_x_prop_95_0= RULE_STR ) ) )* otherlv_96= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'Iana_prop' otherlv_98= '{' ( (lv_iana_prop_99_0= RULE_STR ) ) (otherlv_100= ',' ( (lv_iana_prop_101_0= RULE_STR ) ) )* otherlv_102= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_103= 'Description:' ( (lv_description_104_0= RULE_STR ) ) ) ) ) ) )+";
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
                        if ( (LA71_0==58) ) {s = 1;}

                        else if ( LA71_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA71_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA71_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA71_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA71_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA71_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA71_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA71_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA71_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA71_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA71_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA71_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA71_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA71_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA71_0 == 111 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA71_0 == 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA71_0 == 113 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA71_0 == 114 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 17) ) {s = 19;}

                        else if ( LA71_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 18) ) {s = 20;}

                        else if ( LA71_0 == 116 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 19) ) {s = 21;}

                        else if ( LA71_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 20) ) {s = 22;}

                        else if ( LA71_0 == 118 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 21) ) {s = 23;}

                        else if ( LA71_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 22) ) {s = 24;}

                        else if ( LA71_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 23) ) {s = 25;}

                        else if ( LA71_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getJournalCAccess().getUnorderedGroup_2(), 24) ) {s = 26;}

                         
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
    static final String dfa_20s = "\1\72\15\uffff";
    static final String dfa_21s = "\1\175\15\uffff";
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
            return "()+ loopback of 5920:6: ( ({...}? => ( ({...}? => (otherlv_3= 'Identifiant:' ( (lv_uid_4_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Date:' ( (lv_dtstart_6_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Organisateur:' ( (lv_organizer_8_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'URL:' ( (lv_url_10_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Contact:' ( (lv_contact_12_0= RULE_STR ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'Fin:' ( (lv_dtend_14_0= ruleDateT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'Invites' otherlv_16= '{' ( (lv_attendee_17_0= RULE_STR ) ) (otherlv_18= ',' ( (lv_attendee_19_0= RULE_STR ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'Commentaire' otherlv_22= '{' ( (lv_comment_23_0= RULE_STR ) ) (otherlv_24= ',' ( (lv_comment_25_0= RULE_STR ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'Freebusy' otherlv_28= '{' ( (lv_freebusy_29_0= RULE_STR ) ) (otherlv_30= ',' ( (lv_freebusy_31_0= RULE_STR ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'Rstatus' otherlv_34= '{' ( (lv_rstatus_35_0= RULE_STR ) ) (otherlv_36= ',' ( (lv_rstatus_37_0= RULE_STR ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'X_prop' otherlv_40= '{' ( (lv_x_prop_41_0= RULE_STR ) ) (otherlv_42= ',' ( (lv_x_prop_43_0= RULE_STR ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'Iana_prop' otherlv_46= '{' ( (lv_iana_prop_47_0= RULE_STR ) ) (otherlv_48= ',' ( (lv_iana_prop_49_0= RULE_STR ) ) )* otherlv_50= '}' ) ) ) ) )+";
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
                        if ( (LA78_0==58) ) {s = 1;}

                        else if ( LA78_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA78_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA78_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA78_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA78_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA78_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA78_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA78_0 == 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA78_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA78_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA78_0 == 119 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA78_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getVacationCAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                         
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FFE020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003E8000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0BC0000000000000L,0x5800008000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0FC0000000000000L,0x5800008000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xF000000000000000L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000FE00000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF400000000000000L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xF400000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0402L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400000000000000L,0x00000000001E0402L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1400000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L,0x0000000078000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L,0x0000006000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xF000000000000000L,0x07FFFF600000DC81L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xF400000000000000L,0x07FFFF600000DC81L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xF400000000000000L,0x07FFFF600000DC85L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xF000000000000000L,0x01FFFC6000004481L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xF400000000000000L,0x01FFFC6000004481L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x7000000000000000L,0x2189002000002041L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x7400000000000000L,0x2189002000002041L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x8180080000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L,0x8180080000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});

}
