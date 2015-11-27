package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslSampleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslSampleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'|'", "'GET'", "'POST'", "'HEAD'", "'DELETE'", "'PUT'", "'HTTP'", "'HTTPS'", "'FTP'", "'SSH'", "'{'", "'belongTo'", "'source: '", "'}'", "'MaliciousRequest'", "'destination: '", "'port: '", "'data: '", "'protocol: '", "'NormalRequest'", "'SecurityPolicyList'", "'SecurityPolicy'", "'if'", "'('", "')'", "'then'", "'otherwise'", "'Condition'", "'endpoint'", "','", "'.'", "'User'", "'Attacker'", "'Defender'", "'isRequestProtocolEqualsTo'", "'isHTTPMethodEqualsTo'", "'isParaContentMatchRegExp'", "'isRequestFrequencyLessThan'", "'isParaLenghtLessThan'", "'isParaLenghtGreaterThan'", "'isParaLenghtEqualsTo'", "'drop'", "'block'", "'pass'"
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
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalMyDslSampleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslSampleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslSampleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g"; }


     
     	private MyDslSampleGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslSampleGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleHttpShieldModel"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:60:1: entryRuleHttpShieldModel : ruleHttpShieldModel EOF ;
    public final void entryRuleHttpShieldModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:61:1: ( ruleHttpShieldModel EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:62:1: ruleHttpShieldModel EOF
            {
             before(grammarAccess.getHttpShieldModelRule()); 
            pushFollow(FOLLOW_ruleHttpShieldModel_in_entryRuleHttpShieldModel61);
            ruleHttpShieldModel();

            state._fsp--;

             after(grammarAccess.getHttpShieldModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpShieldModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpShieldModel"


    // $ANTLR start "ruleHttpShieldModel"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:69:1: ruleHttpShieldModel : ( ( rule__HttpShieldModel__AgentsAssignment )* ) ;
    public final void ruleHttpShieldModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:73:2: ( ( ( rule__HttpShieldModel__AgentsAssignment )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:74:1: ( ( rule__HttpShieldModel__AgentsAssignment )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:74:1: ( ( rule__HttpShieldModel__AgentsAssignment )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:75:1: ( rule__HttpShieldModel__AgentsAssignment )*
            {
             before(grammarAccess.getHttpShieldModelAccess().getAgentsAssignment()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:76:1: ( rule__HttpShieldModel__AgentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=43 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:76:2: rule__HttpShieldModel__AgentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__HttpShieldModel__AgentsAssignment_in_ruleHttpShieldModel94);
            	    rule__HttpShieldModel__AgentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getHttpShieldModelAccess().getAgentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpShieldModel"


    // $ANTLR start "entryRuleAgent"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:88:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:89:1: ( ruleAgent EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:90:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent122);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:97:1: ruleAgent : ( ( rule__Agent__Alternatives ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:101:2: ( ( ( rule__Agent__Alternatives ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:102:1: ( ( rule__Agent__Alternatives ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:102:1: ( ( rule__Agent__Alternatives ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:103:1: ( rule__Agent__Alternatives )
            {
             before(grammarAccess.getAgentAccess().getAlternatives()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:104:1: ( rule__Agent__Alternatives )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:104:2: rule__Agent__Alternatives
            {
            pushFollow(FOLLOW_rule__Agent__Alternatives_in_ruleAgent155);
            rule__Agent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleUser"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:116:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:117:1: ( ruleUser EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:118:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser182);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:125:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:129:2: ( ( ( rule__User__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:130:1: ( ( rule__User__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:130:1: ( ( rule__User__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:131:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:132:1: ( rule__User__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:132:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser215);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleAttacker"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:144:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:145:1: ( ruleAttacker EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:146:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker242);
            ruleAttacker();

            state._fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttacker"


    // $ANTLR start "ruleAttacker"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:153:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:157:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:158:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:158:1: ( ( rule__Attacker__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:159:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:160:1: ( rule__Attacker__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:160:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker275);
            rule__Attacker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttacker"


    // $ANTLR start "entryRuleMaliciousRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:174:1: entryRuleMaliciousRequest : ruleMaliciousRequest EOF ;
    public final void entryRuleMaliciousRequest() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:175:1: ( ruleMaliciousRequest EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:176:1: ruleMaliciousRequest EOF
            {
             before(grammarAccess.getMaliciousRequestRule()); 
            pushFollow(FOLLOW_ruleMaliciousRequest_in_entryRuleMaliciousRequest304);
            ruleMaliciousRequest();

            state._fsp--;

             after(grammarAccess.getMaliciousRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaliciousRequest311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaliciousRequest"


    // $ANTLR start "ruleMaliciousRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:183:1: ruleMaliciousRequest : ( ( rule__MaliciousRequest__Group__0 ) ) ;
    public final void ruleMaliciousRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:187:2: ( ( ( rule__MaliciousRequest__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:188:1: ( ( rule__MaliciousRequest__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:188:1: ( ( rule__MaliciousRequest__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:189:1: ( rule__MaliciousRequest__Group__0 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:190:1: ( rule__MaliciousRequest__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:190:2: rule__MaliciousRequest__Group__0
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__0_in_ruleMaliciousRequest337);
            rule__MaliciousRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaliciousRequest"


    // $ANTLR start "entryRuleNormalRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:202:1: entryRuleNormalRequest : ruleNormalRequest EOF ;
    public final void entryRuleNormalRequest() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:203:1: ( ruleNormalRequest EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:204:1: ruleNormalRequest EOF
            {
             before(grammarAccess.getNormalRequestRule()); 
            pushFollow(FOLLOW_ruleNormalRequest_in_entryRuleNormalRequest364);
            ruleNormalRequest();

            state._fsp--;

             after(grammarAccess.getNormalRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalRequest371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormalRequest"


    // $ANTLR start "ruleNormalRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:211:1: ruleNormalRequest : ( ( rule__NormalRequest__Group__0 ) ) ;
    public final void ruleNormalRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:215:2: ( ( ( rule__NormalRequest__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:216:1: ( ( rule__NormalRequest__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:216:1: ( ( rule__NormalRequest__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:217:1: ( rule__NormalRequest__Group__0 )
            {
             before(grammarAccess.getNormalRequestAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:218:1: ( rule__NormalRequest__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:218:2: rule__NormalRequest__Group__0
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__0_in_ruleNormalRequest397);
            rule__NormalRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalRequest"


    // $ANTLR start "entryRuleDefender"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:230:1: entryRuleDefender : ruleDefender EOF ;
    public final void entryRuleDefender() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:231:1: ( ruleDefender EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:232:1: ruleDefender EOF
            {
             before(grammarAccess.getDefenderRule()); 
            pushFollow(FOLLOW_ruleDefender_in_entryRuleDefender424);
            ruleDefender();

            state._fsp--;

             after(grammarAccess.getDefenderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefender431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefender"


    // $ANTLR start "ruleDefender"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:239:1: ruleDefender : ( ( rule__Defender__Group__0 ) ) ;
    public final void ruleDefender() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:243:2: ( ( ( rule__Defender__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:244:1: ( ( rule__Defender__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:244:1: ( ( rule__Defender__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:245:1: ( rule__Defender__Group__0 )
            {
             before(grammarAccess.getDefenderAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:246:1: ( rule__Defender__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:246:2: rule__Defender__Group__0
            {
            pushFollow(FOLLOW_rule__Defender__Group__0_in_ruleDefender457);
            rule__Defender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefender"


    // $ANTLR start "entryRuleSecurityPolicyList"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:258:1: entryRuleSecurityPolicyList : ruleSecurityPolicyList EOF ;
    public final void entryRuleSecurityPolicyList() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:259:1: ( ruleSecurityPolicyList EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:260:1: ruleSecurityPolicyList EOF
            {
             before(grammarAccess.getSecurityPolicyListRule()); 
            pushFollow(FOLLOW_ruleSecurityPolicyList_in_entryRuleSecurityPolicyList484);
            ruleSecurityPolicyList();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityPolicyList491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityPolicyList"


    // $ANTLR start "ruleSecurityPolicyList"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:267:1: ruleSecurityPolicyList : ( ( rule__SecurityPolicyList__Group__0 ) ) ;
    public final void ruleSecurityPolicyList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:271:2: ( ( ( rule__SecurityPolicyList__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:272:1: ( ( rule__SecurityPolicyList__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:272:1: ( ( rule__SecurityPolicyList__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:273:1: ( rule__SecurityPolicyList__Group__0 )
            {
             before(grammarAccess.getSecurityPolicyListAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:274:1: ( rule__SecurityPolicyList__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:274:2: rule__SecurityPolicyList__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__0_in_ruleSecurityPolicyList517);
            rule__SecurityPolicyList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityPolicyList"


    // $ANTLR start "entryRuleSecurityPolicy"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:286:1: entryRuleSecurityPolicy : ruleSecurityPolicy EOF ;
    public final void entryRuleSecurityPolicy() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:287:1: ( ruleSecurityPolicy EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:288:1: ruleSecurityPolicy EOF
            {
             before(grammarAccess.getSecurityPolicyRule()); 
            pushFollow(FOLLOW_ruleSecurityPolicy_in_entryRuleSecurityPolicy544);
            ruleSecurityPolicy();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityPolicy551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityPolicy"


    // $ANTLR start "ruleSecurityPolicy"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:295:1: ruleSecurityPolicy : ( ( rule__SecurityPolicy__Group__0 ) ) ;
    public final void ruleSecurityPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:299:2: ( ( ( rule__SecurityPolicy__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:300:1: ( ( rule__SecurityPolicy__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:300:1: ( ( rule__SecurityPolicy__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:301:1: ( rule__SecurityPolicy__Group__0 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:302:1: ( rule__SecurityPolicy__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:302:2: rule__SecurityPolicy__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__0_in_ruleSecurityPolicy577);
            rule__SecurityPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityPolicy"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:314:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:315:1: ( ruleCondition EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:316:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition604);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition611); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:323:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:327:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:328:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:328:1: ( ( rule__Condition__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:329:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:330:1: ( rule__Condition__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:330:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition637);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:342:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:343:1: ( ruleAction EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:344:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction664);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction671); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:351:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:355:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:356:1: ( ( rule__Action__Alternatives ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:356:1: ( ( rule__Action__Alternatives ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:357:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:358:1: ( rule__Action__Alternatives )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:358:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction697);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleSubCondition"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:370:1: entryRuleSubCondition : ruleSubCondition EOF ;
    public final void entryRuleSubCondition() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:371:1: ( ruleSubCondition EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:372:1: ruleSubCondition EOF
            {
             before(grammarAccess.getSubConditionRule()); 
            pushFollow(FOLLOW_ruleSubCondition_in_entryRuleSubCondition724);
            ruleSubCondition();

            state._fsp--;

             after(grammarAccess.getSubConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubCondition731); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubCondition"


    // $ANTLR start "ruleSubCondition"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:379:1: ruleSubCondition : ( ( rule__SubCondition__Alternatives ) ) ;
    public final void ruleSubCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:383:2: ( ( ( rule__SubCondition__Alternatives ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:384:1: ( ( rule__SubCondition__Alternatives ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:384:1: ( ( rule__SubCondition__Alternatives ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:385:1: ( rule__SubCondition__Alternatives )
            {
             before(grammarAccess.getSubConditionAccess().getAlternatives()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:386:1: ( rule__SubCondition__Alternatives )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:386:2: rule__SubCondition__Alternatives
            {
            pushFollow(FOLLOW_rule__SubCondition__Alternatives_in_ruleSubCondition757);
            rule__SubCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubCondition"


    // $ANTLR start "entryRuleProtocolCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:398:1: entryRuleProtocolCheck : ruleProtocolCheck EOF ;
    public final void entryRuleProtocolCheck() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:399:1: ( ruleProtocolCheck EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:400:1: ruleProtocolCheck EOF
            {
             before(grammarAccess.getProtocolCheckRule()); 
            pushFollow(FOLLOW_ruleProtocolCheck_in_entryRuleProtocolCheck784);
            ruleProtocolCheck();

            state._fsp--;

             after(grammarAccess.getProtocolCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolCheck791); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocolCheck"


    // $ANTLR start "ruleProtocolCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:407:1: ruleProtocolCheck : ( ( rule__ProtocolCheck__Group__0 ) ) ;
    public final void ruleProtocolCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:411:2: ( ( ( rule__ProtocolCheck__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:412:1: ( ( rule__ProtocolCheck__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:412:1: ( ( rule__ProtocolCheck__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:413:1: ( rule__ProtocolCheck__Group__0 )
            {
             before(grammarAccess.getProtocolCheckAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:414:1: ( rule__ProtocolCheck__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:414:2: rule__ProtocolCheck__Group__0
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__Group__0_in_ruleProtocolCheck817);
            rule__ProtocolCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocolCheck"


    // $ANTLR start "entryRuleHTTPMethodCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:426:1: entryRuleHTTPMethodCheck : ruleHTTPMethodCheck EOF ;
    public final void entryRuleHTTPMethodCheck() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:427:1: ( ruleHTTPMethodCheck EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:428:1: ruleHTTPMethodCheck EOF
            {
             before(grammarAccess.getHTTPMethodCheckRule()); 
            pushFollow(FOLLOW_ruleHTTPMethodCheck_in_entryRuleHTTPMethodCheck844);
            ruleHTTPMethodCheck();

            state._fsp--;

             after(grammarAccess.getHTTPMethodCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHTTPMethodCheck851); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTTPMethodCheck"


    // $ANTLR start "ruleHTTPMethodCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:435:1: ruleHTTPMethodCheck : ( ( rule__HTTPMethodCheck__Group__0 ) ) ;
    public final void ruleHTTPMethodCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:439:2: ( ( ( rule__HTTPMethodCheck__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:440:1: ( ( rule__HTTPMethodCheck__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:440:1: ( ( rule__HTTPMethodCheck__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:441:1: ( rule__HTTPMethodCheck__Group__0 )
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:442:1: ( rule__HTTPMethodCheck__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:442:2: rule__HTTPMethodCheck__Group__0
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__0_in_ruleHTTPMethodCheck877);
            rule__HTTPMethodCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPMethodCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTTPMethodCheck"


    // $ANTLR start "entryRuleRegExpMatch"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:454:1: entryRuleRegExpMatch : ruleRegExpMatch EOF ;
    public final void entryRuleRegExpMatch() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:455:1: ( ruleRegExpMatch EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:456:1: ruleRegExpMatch EOF
            {
             before(grammarAccess.getRegExpMatchRule()); 
            pushFollow(FOLLOW_ruleRegExpMatch_in_entryRuleRegExpMatch904);
            ruleRegExpMatch();

            state._fsp--;

             after(grammarAccess.getRegExpMatchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegExpMatch911); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegExpMatch"


    // $ANTLR start "ruleRegExpMatch"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:463:1: ruleRegExpMatch : ( ( rule__RegExpMatch__Group__0 ) ) ;
    public final void ruleRegExpMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:467:2: ( ( ( rule__RegExpMatch__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:468:1: ( ( rule__RegExpMatch__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:468:1: ( ( rule__RegExpMatch__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:469:1: ( rule__RegExpMatch__Group__0 )
            {
             before(grammarAccess.getRegExpMatchAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:470:1: ( rule__RegExpMatch__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:470:2: rule__RegExpMatch__Group__0
            {
            pushFollow(FOLLOW_rule__RegExpMatch__Group__0_in_ruleRegExpMatch937);
            rule__RegExpMatch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegExpMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegExpMatch"


    // $ANTLR start "entryRuleFrequencyCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:482:1: entryRuleFrequencyCheck : ruleFrequencyCheck EOF ;
    public final void entryRuleFrequencyCheck() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:483:1: ( ruleFrequencyCheck EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:484:1: ruleFrequencyCheck EOF
            {
             before(grammarAccess.getFrequencyCheckRule()); 
            pushFollow(FOLLOW_ruleFrequencyCheck_in_entryRuleFrequencyCheck964);
            ruleFrequencyCheck();

            state._fsp--;

             after(grammarAccess.getFrequencyCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrequencyCheck971); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrequencyCheck"


    // $ANTLR start "ruleFrequencyCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:491:1: ruleFrequencyCheck : ( ( rule__FrequencyCheck__Group__0 ) ) ;
    public final void ruleFrequencyCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:495:2: ( ( ( rule__FrequencyCheck__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:496:1: ( ( rule__FrequencyCheck__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:496:1: ( ( rule__FrequencyCheck__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:497:1: ( rule__FrequencyCheck__Group__0 )
            {
             before(grammarAccess.getFrequencyCheckAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:498:1: ( rule__FrequencyCheck__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:498:2: rule__FrequencyCheck__Group__0
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__Group__0_in_ruleFrequencyCheck997);
            rule__FrequencyCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrequencyCheck"


    // $ANTLR start "entryRuleHTTPParamLenCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:510:1: entryRuleHTTPParamLenCheck : ruleHTTPParamLenCheck EOF ;
    public final void entryRuleHTTPParamLenCheck() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:511:1: ( ruleHTTPParamLenCheck EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:512:1: ruleHTTPParamLenCheck EOF
            {
             before(grammarAccess.getHTTPParamLenCheckRule()); 
            pushFollow(FOLLOW_ruleHTTPParamLenCheck_in_entryRuleHTTPParamLenCheck1024);
            ruleHTTPParamLenCheck();

            state._fsp--;

             after(grammarAccess.getHTTPParamLenCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHTTPParamLenCheck1031); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTTPParamLenCheck"


    // $ANTLR start "ruleHTTPParamLenCheck"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:519:1: ruleHTTPParamLenCheck : ( ( rule__HTTPParamLenCheck__Alternatives ) ) ;
    public final void ruleHTTPParamLenCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:523:2: ( ( ( rule__HTTPParamLenCheck__Alternatives ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:524:1: ( ( rule__HTTPParamLenCheck__Alternatives ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:524:1: ( ( rule__HTTPParamLenCheck__Alternatives ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:525:1: ( rule__HTTPParamLenCheck__Alternatives )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getAlternatives()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:526:1: ( rule__HTTPParamLenCheck__Alternatives )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:526:2: rule__HTTPParamLenCheck__Alternatives
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Alternatives_in_ruleHTTPParamLenCheck1057);
            rule__HTTPParamLenCheck__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTTPParamLenCheck"


    // $ANTLR start "entryRuleEndPoint"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:538:1: entryRuleEndPoint : ruleEndPoint EOF ;
    public final void entryRuleEndPoint() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:539:1: ( ruleEndPoint EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:540:1: ruleEndPoint EOF
            {
             before(grammarAccess.getEndPointRule()); 
            pushFollow(FOLLOW_ruleEndPoint_in_entryRuleEndPoint1084);
            ruleEndPoint();

            state._fsp--;

             after(grammarAccess.getEndPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndPoint1091); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndPoint"


    // $ANTLR start "ruleEndPoint"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:547:1: ruleEndPoint : ( ( rule__EndPoint__Group__0 ) ) ;
    public final void ruleEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:551:2: ( ( ( rule__EndPoint__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:552:1: ( ( rule__EndPoint__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:552:1: ( ( rule__EndPoint__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:553:1: ( rule__EndPoint__Group__0 )
            {
             before(grammarAccess.getEndPointAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:554:1: ( rule__EndPoint__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:554:2: rule__EndPoint__Group__0
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__0_in_ruleEndPoint1117);
            rule__EndPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndPoint"


    // $ANTLR start "entryRuleDropRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:566:1: entryRuleDropRequest : ruleDropRequest EOF ;
    public final void entryRuleDropRequest() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:567:1: ( ruleDropRequest EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:568:1: ruleDropRequest EOF
            {
             before(grammarAccess.getDropRequestRule()); 
            pushFollow(FOLLOW_ruleDropRequest_in_entryRuleDropRequest1144);
            ruleDropRequest();

            state._fsp--;

             after(grammarAccess.getDropRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropRequest1151); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDropRequest"


    // $ANTLR start "ruleDropRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:575:1: ruleDropRequest : ( ( rule__DropRequest__ActionAssignment ) ) ;
    public final void ruleDropRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:579:2: ( ( ( rule__DropRequest__ActionAssignment ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:580:1: ( ( rule__DropRequest__ActionAssignment ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:580:1: ( ( rule__DropRequest__ActionAssignment ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:581:1: ( rule__DropRequest__ActionAssignment )
            {
             before(grammarAccess.getDropRequestAccess().getActionAssignment()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:582:1: ( rule__DropRequest__ActionAssignment )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:582:2: rule__DropRequest__ActionAssignment
            {
            pushFollow(FOLLOW_rule__DropRequest__ActionAssignment_in_ruleDropRequest1177);
            rule__DropRequest__ActionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDropRequestAccess().getActionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropRequest"


    // $ANTLR start "entryRuleBlockSender"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:594:1: entryRuleBlockSender : ruleBlockSender EOF ;
    public final void entryRuleBlockSender() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:595:1: ( ruleBlockSender EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:596:1: ruleBlockSender EOF
            {
             before(grammarAccess.getBlockSenderRule()); 
            pushFollow(FOLLOW_ruleBlockSender_in_entryRuleBlockSender1204);
            ruleBlockSender();

            state._fsp--;

             after(grammarAccess.getBlockSenderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockSender1211); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockSender"


    // $ANTLR start "ruleBlockSender"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:603:1: ruleBlockSender : ( ( rule__BlockSender__ActionAssignment ) ) ;
    public final void ruleBlockSender() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:607:2: ( ( ( rule__BlockSender__ActionAssignment ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:608:1: ( ( rule__BlockSender__ActionAssignment ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:608:1: ( ( rule__BlockSender__ActionAssignment ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:609:1: ( rule__BlockSender__ActionAssignment )
            {
             before(grammarAccess.getBlockSenderAccess().getActionAssignment()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:610:1: ( rule__BlockSender__ActionAssignment )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:610:2: rule__BlockSender__ActionAssignment
            {
            pushFollow(FOLLOW_rule__BlockSender__ActionAssignment_in_ruleBlockSender1237);
            rule__BlockSender__ActionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBlockSenderAccess().getActionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockSender"


    // $ANTLR start "entryRulePassRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:622:1: entryRulePassRequest : rulePassRequest EOF ;
    public final void entryRulePassRequest() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:623:1: ( rulePassRequest EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:624:1: rulePassRequest EOF
            {
             before(grammarAccess.getPassRequestRule()); 
            pushFollow(FOLLOW_rulePassRequest_in_entryRulePassRequest1264);
            rulePassRequest();

            state._fsp--;

             after(grammarAccess.getPassRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassRequest1271); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePassRequest"


    // $ANTLR start "rulePassRequest"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:631:1: rulePassRequest : ( ( rule__PassRequest__ActionAssignment ) ) ;
    public final void rulePassRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:635:2: ( ( ( rule__PassRequest__ActionAssignment ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:636:1: ( ( rule__PassRequest__ActionAssignment ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:636:1: ( ( rule__PassRequest__ActionAssignment ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:637:1: ( rule__PassRequest__ActionAssignment )
            {
             before(grammarAccess.getPassRequestAccess().getActionAssignment()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:638:1: ( rule__PassRequest__ActionAssignment )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:638:2: rule__PassRequest__ActionAssignment
            {
            pushFollow(FOLLOW_rule__PassRequest__ActionAssignment_in_rulePassRequest1297);
            rule__PassRequest__ActionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPassRequestAccess().getActionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassRequest"


    // $ANTLR start "entryRuleIPAddress"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:650:1: entryRuleIPAddress : ruleIPAddress EOF ;
    public final void entryRuleIPAddress() throws RecognitionException {
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:651:1: ( ruleIPAddress EOF )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:652:1: ruleIPAddress EOF
            {
             before(grammarAccess.getIPAddressRule()); 
            pushFollow(FOLLOW_ruleIPAddress_in_entryRuleIPAddress1324);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getIPAddressRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPAddress1331); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIPAddress"


    // $ANTLR start "ruleIPAddress"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:659:1: ruleIPAddress : ( ( rule__IPAddress__Group__0 ) ) ;
    public final void ruleIPAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:663:2: ( ( ( rule__IPAddress__Group__0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:664:1: ( ( rule__IPAddress__Group__0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:664:1: ( ( rule__IPAddress__Group__0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:665:1: ( rule__IPAddress__Group__0 )
            {
             before(grammarAccess.getIPAddressAccess().getGroup()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:666:1: ( rule__IPAddress__Group__0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:666:2: rule__IPAddress__Group__0
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__0_in_ruleIPAddress1357);
            rule__IPAddress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIPAddress"


    // $ANTLR start "ruleProtocol"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:679:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:683:1: ( ( ( rule__Protocol__Alternatives ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:684:1: ( ( rule__Protocol__Alternatives ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:684:1: ( ( rule__Protocol__Alternatives ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:685:1: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:686:1: ( rule__Protocol__Alternatives )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:686:2: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_rule__Protocol__Alternatives_in_ruleProtocol1394);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "rule__Agent__Alternatives"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:697:1: rule__Agent__Alternatives : ( ( ruleUser ) | ( ruleAttacker ) | ( ruleDefender ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:701:1: ( ( ruleUser ) | ( ruleAttacker ) | ( ruleDefender ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 45:
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
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:702:1: ( ruleUser )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:702:1: ( ruleUser )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:703:1: ruleUser
                    {
                     before(grammarAccess.getAgentAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__Agent__Alternatives1429);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:708:6: ( ruleAttacker )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:708:6: ( ruleAttacker )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:709:1: ruleAttacker
                    {
                     before(grammarAccess.getAgentAccess().getAttackerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Agent__Alternatives1446);
                    ruleAttacker();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getAttackerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:714:6: ( ruleDefender )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:714:6: ( ruleDefender )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:715:1: ruleDefender
                    {
                     before(grammarAccess.getAgentAccess().getDefenderParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDefender_in_rule__Agent__Alternatives1463);
                    ruleDefender();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getDefenderParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Alternatives"


    // $ANTLR start "rule__SecurityPolicy__OperationListAlternatives_7_0_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:726:1: rule__SecurityPolicy__OperationListAlternatives_7_0_0 : ( ( '&' ) | ( '|' ) );
    public final void rule__SecurityPolicy__OperationListAlternatives_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:730:1: ( ( '&' ) | ( '|' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:731:1: ( '&' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:731:1: ( '&' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:732:1: '&'
                    {
                     before(grammarAccess.getSecurityPolicyAccess().getOperationListAmpersandKeyword_7_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__SecurityPolicy__OperationListAlternatives_7_0_01497); 
                     after(grammarAccess.getSecurityPolicyAccess().getOperationListAmpersandKeyword_7_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:739:6: ( '|' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:739:6: ( '|' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:740:1: '|'
                    {
                     before(grammarAccess.getSecurityPolicyAccess().getOperationListVerticalLineKeyword_7_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__SecurityPolicy__OperationListAlternatives_7_0_01517); 
                     after(grammarAccess.getSecurityPolicyAccess().getOperationListVerticalLineKeyword_7_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__OperationListAlternatives_7_0_0"


    // $ANTLR start "rule__Action__Alternatives"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:752:1: rule__Action__Alternatives : ( ( ruleDropRequest ) | ( ruleBlockSender ) | ( rulePassRequest ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:756:1: ( ( ruleDropRequest ) | ( ruleBlockSender ) | ( rulePassRequest ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt4=1;
                }
                break;
            case 54:
                {
                alt4=2;
                }
                break;
            case 55:
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
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:757:1: ( ruleDropRequest )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:757:1: ( ruleDropRequest )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:758:1: ruleDropRequest
                    {
                     before(grammarAccess.getActionAccess().getDropRequestParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDropRequest_in_rule__Action__Alternatives1551);
                    ruleDropRequest();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDropRequestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:763:6: ( ruleBlockSender )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:763:6: ( ruleBlockSender )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:764:1: ruleBlockSender
                    {
                     before(grammarAccess.getActionAccess().getBlockSenderParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBlockSender_in_rule__Action__Alternatives1568);
                    ruleBlockSender();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getBlockSenderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:769:6: ( rulePassRequest )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:769:6: ( rulePassRequest )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:770:1: rulePassRequest
                    {
                     before(grammarAccess.getActionAccess().getPassRequestParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePassRequest_in_rule__Action__Alternatives1585);
                    rulePassRequest();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPassRequestParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__SubCondition__Alternatives"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:780:1: rule__SubCondition__Alternatives : ( ( ruleProtocolCheck ) | ( ruleHTTPMethodCheck ) | ( ruleRegExpMatch ) | ( ruleFrequencyCheck ) | ( ruleHTTPParamLenCheck ) );
    public final void rule__SubCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:784:1: ( ( ruleProtocolCheck ) | ( ruleHTTPMethodCheck ) | ( ruleRegExpMatch ) | ( ruleFrequencyCheck ) | ( ruleHTTPParamLenCheck ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            case 49:
                {
                alt5=4;
                }
                break;
            case 50:
            case 51:
            case 52:
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
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:785:1: ( ruleProtocolCheck )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:785:1: ( ruleProtocolCheck )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:786:1: ruleProtocolCheck
                    {
                     before(grammarAccess.getSubConditionAccess().getProtocolCheckParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProtocolCheck_in_rule__SubCondition__Alternatives1617);
                    ruleProtocolCheck();

                    state._fsp--;

                     after(grammarAccess.getSubConditionAccess().getProtocolCheckParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:791:6: ( ruleHTTPMethodCheck )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:791:6: ( ruleHTTPMethodCheck )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:792:1: ruleHTTPMethodCheck
                    {
                     before(grammarAccess.getSubConditionAccess().getHTTPMethodCheckParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHTTPMethodCheck_in_rule__SubCondition__Alternatives1634);
                    ruleHTTPMethodCheck();

                    state._fsp--;

                     after(grammarAccess.getSubConditionAccess().getHTTPMethodCheckParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:797:6: ( ruleRegExpMatch )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:797:6: ( ruleRegExpMatch )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:798:1: ruleRegExpMatch
                    {
                     before(grammarAccess.getSubConditionAccess().getRegExpMatchParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRegExpMatch_in_rule__SubCondition__Alternatives1651);
                    ruleRegExpMatch();

                    state._fsp--;

                     after(grammarAccess.getSubConditionAccess().getRegExpMatchParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:803:6: ( ruleFrequencyCheck )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:803:6: ( ruleFrequencyCheck )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:804:1: ruleFrequencyCheck
                    {
                     before(grammarAccess.getSubConditionAccess().getFrequencyCheckParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFrequencyCheck_in_rule__SubCondition__Alternatives1668);
                    ruleFrequencyCheck();

                    state._fsp--;

                     after(grammarAccess.getSubConditionAccess().getFrequencyCheckParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:809:6: ( ruleHTTPParamLenCheck )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:809:6: ( ruleHTTPParamLenCheck )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:810:1: ruleHTTPParamLenCheck
                    {
                     before(grammarAccess.getSubConditionAccess().getHTTPParamLenCheckParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleHTTPParamLenCheck_in_rule__SubCondition__Alternatives1685);
                    ruleHTTPParamLenCheck();

                    state._fsp--;

                     after(grammarAccess.getSubConditionAccess().getHTTPParamLenCheckParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCondition__Alternatives"


    // $ANTLR start "rule__HTTPMethodCheck__ValueAlternatives_2_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:820:1: rule__HTTPMethodCheck__ValueAlternatives_2_0 : ( ( 'GET' ) | ( 'POST' ) | ( 'HEAD' ) | ( 'DELETE' ) | ( 'PUT' ) );
    public final void rule__HTTPMethodCheck__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:824:1: ( ( 'GET' ) | ( 'POST' ) | ( 'HEAD' ) | ( 'DELETE' ) | ( 'PUT' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
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
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:825:1: ( 'GET' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:825:1: ( 'GET' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:826:1: 'GET'
                    {
                     before(grammarAccess.getHTTPMethodCheckAccess().getValueGETKeyword_2_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__HTTPMethodCheck__ValueAlternatives_2_01718); 
                     after(grammarAccess.getHTTPMethodCheckAccess().getValueGETKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:833:6: ( 'POST' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:833:6: ( 'POST' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:834:1: 'POST'
                    {
                     before(grammarAccess.getHTTPMethodCheckAccess().getValuePOSTKeyword_2_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__HTTPMethodCheck__ValueAlternatives_2_01738); 
                     after(grammarAccess.getHTTPMethodCheckAccess().getValuePOSTKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:841:6: ( 'HEAD' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:841:6: ( 'HEAD' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:842:1: 'HEAD'
                    {
                     before(grammarAccess.getHTTPMethodCheckAccess().getValueHEADKeyword_2_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__HTTPMethodCheck__ValueAlternatives_2_01758); 
                     after(grammarAccess.getHTTPMethodCheckAccess().getValueHEADKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:849:6: ( 'DELETE' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:849:6: ( 'DELETE' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:850:1: 'DELETE'
                    {
                     before(grammarAccess.getHTTPMethodCheckAccess().getValueDELETEKeyword_2_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__HTTPMethodCheck__ValueAlternatives_2_01778); 
                     after(grammarAccess.getHTTPMethodCheckAccess().getValueDELETEKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:857:6: ( 'PUT' )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:857:6: ( 'PUT' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:858:1: 'PUT'
                    {
                     before(grammarAccess.getHTTPMethodCheckAccess().getValuePUTKeyword_2_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__HTTPMethodCheck__ValueAlternatives_2_01798); 
                     after(grammarAccess.getHTTPMethodCheckAccess().getValuePUTKeyword_2_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__ValueAlternatives_2_0"


    // $ANTLR start "rule__HTTPParamLenCheck__Alternatives"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:870:1: rule__HTTPParamLenCheck__Alternatives : ( ( ( rule__HTTPParamLenCheck__Group_0__0 ) ) | ( ( rule__HTTPParamLenCheck__Group_1__0 ) ) | ( ( rule__HTTPParamLenCheck__Group_2__0 ) ) );
    public final void rule__HTTPParamLenCheck__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:874:1: ( ( ( rule__HTTPParamLenCheck__Group_0__0 ) ) | ( ( rule__HTTPParamLenCheck__Group_1__0 ) ) | ( ( rule__HTTPParamLenCheck__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt7=1;
                }
                break;
            case 51:
                {
                alt7=2;
                }
                break;
            case 52:
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
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:875:1: ( ( rule__HTTPParamLenCheck__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:875:1: ( ( rule__HTTPParamLenCheck__Group_0__0 ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:876:1: ( rule__HTTPParamLenCheck__Group_0__0 )
                    {
                     before(grammarAccess.getHTTPParamLenCheckAccess().getGroup_0()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:877:1: ( rule__HTTPParamLenCheck__Group_0__0 )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:877:2: rule__HTTPParamLenCheck__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__0_in_rule__HTTPParamLenCheck__Alternatives1832);
                    rule__HTTPParamLenCheck__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHTTPParamLenCheckAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:881:6: ( ( rule__HTTPParamLenCheck__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:881:6: ( ( rule__HTTPParamLenCheck__Group_1__0 ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:882:1: ( rule__HTTPParamLenCheck__Group_1__0 )
                    {
                     before(grammarAccess.getHTTPParamLenCheckAccess().getGroup_1()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:883:1: ( rule__HTTPParamLenCheck__Group_1__0 )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:883:2: rule__HTTPParamLenCheck__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__0_in_rule__HTTPParamLenCheck__Alternatives1850);
                    rule__HTTPParamLenCheck__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHTTPParamLenCheckAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:887:6: ( ( rule__HTTPParamLenCheck__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:887:6: ( ( rule__HTTPParamLenCheck__Group_2__0 ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:888:1: ( rule__HTTPParamLenCheck__Group_2__0 )
                    {
                     before(grammarAccess.getHTTPParamLenCheckAccess().getGroup_2()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:889:1: ( rule__HTTPParamLenCheck__Group_2__0 )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:889:2: rule__HTTPParamLenCheck__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__0_in_rule__HTTPParamLenCheck__Alternatives1868);
                    rule__HTTPParamLenCheck__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHTTPParamLenCheckAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Alternatives"


    // $ANTLR start "rule__Protocol__Alternatives"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:898:1: rule__Protocol__Alternatives : ( ( ( 'HTTP' ) ) | ( ( 'HTTPS' ) ) | ( ( 'FTP' ) ) | ( ( 'SSH' ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:902:1: ( ( ( 'HTTP' ) ) | ( ( 'HTTPS' ) ) | ( ( 'FTP' ) ) | ( ( 'SSH' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:903:1: ( ( 'HTTP' ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:903:1: ( ( 'HTTP' ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:904:1: ( 'HTTP' )
                    {
                     before(grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:905:1: ( 'HTTP' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:905:3: 'HTTP'
                    {
                    match(input,18,FOLLOW_18_in_rule__Protocol__Alternatives1902); 

                    }

                     after(grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:910:6: ( ( 'HTTPS' ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:910:6: ( ( 'HTTPS' ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:911:1: ( 'HTTPS' )
                    {
                     before(grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:912:1: ( 'HTTPS' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:912:3: 'HTTPS'
                    {
                    match(input,19,FOLLOW_19_in_rule__Protocol__Alternatives1923); 

                    }

                     after(grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:917:6: ( ( 'FTP' ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:917:6: ( ( 'FTP' ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:918:1: ( 'FTP' )
                    {
                     before(grammarAccess.getProtocolAccess().getFTPEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:919:1: ( 'FTP' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:919:3: 'FTP'
                    {
                    match(input,20,FOLLOW_20_in_rule__Protocol__Alternatives1944); 

                    }

                     after(grammarAccess.getProtocolAccess().getFTPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:924:6: ( ( 'SSH' ) )
                    {
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:924:6: ( ( 'SSH' ) )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:925:1: ( 'SSH' )
                    {
                     before(grammarAccess.getProtocolAccess().getSSHEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:926:1: ( 'SSH' )
                    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:926:3: 'SSH'
                    {
                    match(input,21,FOLLOW_21_in_rule__Protocol__Alternatives1965); 

                    }

                     after(grammarAccess.getProtocolAccess().getSSHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__User__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:938:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:942:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:943:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01998);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__02001);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:950:1: rule__User__Group__0__Impl : ( ( rule__User__TypeAssignment_0 ) ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:954:1: ( ( ( rule__User__TypeAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:955:1: ( ( rule__User__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:955:1: ( ( rule__User__TypeAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:956:1: ( rule__User__TypeAssignment_0 )
            {
             before(grammarAccess.getUserAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:957:1: ( rule__User__TypeAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:957:2: rule__User__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__User__TypeAssignment_0_in_rule__User__Group__0__Impl2028);
            rule__User__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:967:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:971:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:972:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__12058);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__2_in_rule__User__Group__12061);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:979:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:983:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:984:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:984:1: ( ( rule__User__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:985:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:986:1: ( rule__User__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:986:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl2088);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:996:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1000:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1001:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__22118);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__3_in_rule__User__Group__22121);
            rule__User__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1008:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1012:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1013:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1013:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1014:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__User__Group__2__Impl2149); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1027:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1031:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1032:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__32180);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__4_in_rule__User__Group__32183);
            rule__User__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1039:1: rule__User__Group__3__Impl : ( 'belongTo' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1043:1: ( ( 'belongTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1044:1: ( 'belongTo' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1044:1: ( 'belongTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1045:1: 'belongTo'
            {
             before(grammarAccess.getUserAccess().getBelongToKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__User__Group__3__Impl2211); 
             after(grammarAccess.getUserAccess().getBelongToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1058:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1062:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1063:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__42242);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__5_in_rule__User__Group__42245);
            rule__User__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1070:1: rule__User__Group__4__Impl : ( ( rule__User__FilenameAssignment_4 ) ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1074:1: ( ( ( rule__User__FilenameAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1075:1: ( ( rule__User__FilenameAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1075:1: ( ( rule__User__FilenameAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1076:1: ( rule__User__FilenameAssignment_4 )
            {
             before(grammarAccess.getUserAccess().getFilenameAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1077:1: ( rule__User__FilenameAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1077:2: rule__User__FilenameAssignment_4
            {
            pushFollow(FOLLOW_rule__User__FilenameAssignment_4_in_rule__User__Group__4__Impl2272);
            rule__User__FilenameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getFilenameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1087:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1091:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1092:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__52302);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__6_in_rule__User__Group__52305);
            rule__User__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1099:1: rule__User__Group__5__Impl : ( 'source: ' ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1103:1: ( ( 'source: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1104:1: ( 'source: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1104:1: ( 'source: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1105:1: 'source: '
            {
             before(grammarAccess.getUserAccess().getSourceKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__User__Group__5__Impl2333); 
             after(grammarAccess.getUserAccess().getSourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1118:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1122:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1123:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__62364);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__7_in_rule__User__Group__62367);
            rule__User__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6"


    // $ANTLR start "rule__User__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1130:1: rule__User__Group__6__Impl : ( ( rule__User__SourceAssignment_6 ) ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1134:1: ( ( ( rule__User__SourceAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1135:1: ( ( rule__User__SourceAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1135:1: ( ( rule__User__SourceAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1136:1: ( rule__User__SourceAssignment_6 )
            {
             before(grammarAccess.getUserAccess().getSourceAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1137:1: ( rule__User__SourceAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1137:2: rule__User__SourceAssignment_6
            {
            pushFollow(FOLLOW_rule__User__SourceAssignment_6_in_rule__User__Group__6__Impl2394);
            rule__User__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6__Impl"


    // $ANTLR start "rule__User__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1147:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1151:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1152:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__72424);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__8_in_rule__User__Group__72427);
            rule__User__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7"


    // $ANTLR start "rule__User__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1159:1: rule__User__Group__7__Impl : ( ( rule__User__RequestsAssignment_7 )* ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1163:1: ( ( ( rule__User__RequestsAssignment_7 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1164:1: ( ( rule__User__RequestsAssignment_7 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1164:1: ( ( rule__User__RequestsAssignment_7 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1165:1: ( rule__User__RequestsAssignment_7 )*
            {
             before(grammarAccess.getUserAccess().getRequestsAssignment_7()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1166:1: ( rule__User__RequestsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1166:2: rule__User__RequestsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__User__RequestsAssignment_7_in_rule__User__Group__7__Impl2454);
            	    rule__User__RequestsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getRequestsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7__Impl"


    // $ANTLR start "rule__User__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1176:1: rule__User__Group__8 : rule__User__Group__8__Impl ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1180:1: ( rule__User__Group__8__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1181:2: rule__User__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__82485);
            rule__User__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8"


    // $ANTLR start "rule__User__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1187:1: rule__User__Group__8__Impl : ( '}' ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1191:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1192:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1192:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1193:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__User__Group__8__Impl2513); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8__Impl"


    // $ANTLR start "rule__Attacker__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1224:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1228:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1229:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__02562);
            rule__Attacker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__02565);
            rule__Attacker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__0"


    // $ANTLR start "rule__Attacker__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1236:1: rule__Attacker__Group__0__Impl : ( ( rule__Attacker__TypeAssignment_0 ) ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1240:1: ( ( ( rule__Attacker__TypeAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1241:1: ( ( rule__Attacker__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1241:1: ( ( rule__Attacker__TypeAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1242:1: ( rule__Attacker__TypeAssignment_0 )
            {
             before(grammarAccess.getAttackerAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1243:1: ( rule__Attacker__TypeAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1243:2: rule__Attacker__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attacker__TypeAssignment_0_in_rule__Attacker__Group__0__Impl2592);
            rule__Attacker__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__0__Impl"


    // $ANTLR start "rule__Attacker__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1253:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl rule__Attacker__Group__2 ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1257:1: ( rule__Attacker__Group__1__Impl rule__Attacker__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1258:2: rule__Attacker__Group__1__Impl rule__Attacker__Group__2
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__12622);
            rule__Attacker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__2_in_rule__Attacker__Group__12625);
            rule__Attacker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__1"


    // $ANTLR start "rule__Attacker__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1265:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__NameAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1269:1: ( ( ( rule__Attacker__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1270:1: ( ( rule__Attacker__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1270:1: ( ( rule__Attacker__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1271:1: ( rule__Attacker__NameAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1272:1: ( rule__Attacker__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1272:2: rule__Attacker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl2652);
            rule__Attacker__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__1__Impl"


    // $ANTLR start "rule__Attacker__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1282:1: rule__Attacker__Group__2 : rule__Attacker__Group__2__Impl rule__Attacker__Group__3 ;
    public final void rule__Attacker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1286:1: ( rule__Attacker__Group__2__Impl rule__Attacker__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1287:2: rule__Attacker__Group__2__Impl rule__Attacker__Group__3
            {
            pushFollow(FOLLOW_rule__Attacker__Group__2__Impl_in_rule__Attacker__Group__22682);
            rule__Attacker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__3_in_rule__Attacker__Group__22685);
            rule__Attacker__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__2"


    // $ANTLR start "rule__Attacker__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1294:1: rule__Attacker__Group__2__Impl : ( '{' ) ;
    public final void rule__Attacker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1298:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1299:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1299:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1300:1: '{'
            {
             before(grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Attacker__Group__2__Impl2713); 
             after(grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__2__Impl"


    // $ANTLR start "rule__Attacker__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1313:1: rule__Attacker__Group__3 : rule__Attacker__Group__3__Impl rule__Attacker__Group__4 ;
    public final void rule__Attacker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1317:1: ( rule__Attacker__Group__3__Impl rule__Attacker__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1318:2: rule__Attacker__Group__3__Impl rule__Attacker__Group__4
            {
            pushFollow(FOLLOW_rule__Attacker__Group__3__Impl_in_rule__Attacker__Group__32744);
            rule__Attacker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__4_in_rule__Attacker__Group__32747);
            rule__Attacker__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__3"


    // $ANTLR start "rule__Attacker__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1325:1: rule__Attacker__Group__3__Impl : ( 'belongTo' ) ;
    public final void rule__Attacker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1329:1: ( ( 'belongTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1330:1: ( 'belongTo' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1330:1: ( 'belongTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1331:1: 'belongTo'
            {
             before(grammarAccess.getAttackerAccess().getBelongToKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Attacker__Group__3__Impl2775); 
             after(grammarAccess.getAttackerAccess().getBelongToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__3__Impl"


    // $ANTLR start "rule__Attacker__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1344:1: rule__Attacker__Group__4 : rule__Attacker__Group__4__Impl rule__Attacker__Group__5 ;
    public final void rule__Attacker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1348:1: ( rule__Attacker__Group__4__Impl rule__Attacker__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1349:2: rule__Attacker__Group__4__Impl rule__Attacker__Group__5
            {
            pushFollow(FOLLOW_rule__Attacker__Group__4__Impl_in_rule__Attacker__Group__42806);
            rule__Attacker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__5_in_rule__Attacker__Group__42809);
            rule__Attacker__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__4"


    // $ANTLR start "rule__Attacker__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1356:1: rule__Attacker__Group__4__Impl : ( ( rule__Attacker__FilenameAssignment_4 ) ) ;
    public final void rule__Attacker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1360:1: ( ( ( rule__Attacker__FilenameAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1361:1: ( ( rule__Attacker__FilenameAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1361:1: ( ( rule__Attacker__FilenameAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1362:1: ( rule__Attacker__FilenameAssignment_4 )
            {
             before(grammarAccess.getAttackerAccess().getFilenameAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1363:1: ( rule__Attacker__FilenameAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1363:2: rule__Attacker__FilenameAssignment_4
            {
            pushFollow(FOLLOW_rule__Attacker__FilenameAssignment_4_in_rule__Attacker__Group__4__Impl2836);
            rule__Attacker__FilenameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getFilenameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__4__Impl"


    // $ANTLR start "rule__Attacker__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1373:1: rule__Attacker__Group__5 : rule__Attacker__Group__5__Impl rule__Attacker__Group__6 ;
    public final void rule__Attacker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1377:1: ( rule__Attacker__Group__5__Impl rule__Attacker__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1378:2: rule__Attacker__Group__5__Impl rule__Attacker__Group__6
            {
            pushFollow(FOLLOW_rule__Attacker__Group__5__Impl_in_rule__Attacker__Group__52866);
            rule__Attacker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__6_in_rule__Attacker__Group__52869);
            rule__Attacker__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__5"


    // $ANTLR start "rule__Attacker__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1385:1: rule__Attacker__Group__5__Impl : ( 'source: ' ) ;
    public final void rule__Attacker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1389:1: ( ( 'source: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1390:1: ( 'source: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1390:1: ( 'source: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1391:1: 'source: '
            {
             before(grammarAccess.getAttackerAccess().getSourceKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Attacker__Group__5__Impl2897); 
             after(grammarAccess.getAttackerAccess().getSourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__5__Impl"


    // $ANTLR start "rule__Attacker__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1404:1: rule__Attacker__Group__6 : rule__Attacker__Group__6__Impl rule__Attacker__Group__7 ;
    public final void rule__Attacker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1408:1: ( rule__Attacker__Group__6__Impl rule__Attacker__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1409:2: rule__Attacker__Group__6__Impl rule__Attacker__Group__7
            {
            pushFollow(FOLLOW_rule__Attacker__Group__6__Impl_in_rule__Attacker__Group__62928);
            rule__Attacker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__7_in_rule__Attacker__Group__62931);
            rule__Attacker__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__6"


    // $ANTLR start "rule__Attacker__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1416:1: rule__Attacker__Group__6__Impl : ( ( rule__Attacker__SourceAssignment_6 ) ) ;
    public final void rule__Attacker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1420:1: ( ( ( rule__Attacker__SourceAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1421:1: ( ( rule__Attacker__SourceAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1421:1: ( ( rule__Attacker__SourceAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1422:1: ( rule__Attacker__SourceAssignment_6 )
            {
             before(grammarAccess.getAttackerAccess().getSourceAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1423:1: ( rule__Attacker__SourceAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1423:2: rule__Attacker__SourceAssignment_6
            {
            pushFollow(FOLLOW_rule__Attacker__SourceAssignment_6_in_rule__Attacker__Group__6__Impl2958);
            rule__Attacker__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__6__Impl"


    // $ANTLR start "rule__Attacker__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1433:1: rule__Attacker__Group__7 : rule__Attacker__Group__7__Impl rule__Attacker__Group__8 ;
    public final void rule__Attacker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1437:1: ( rule__Attacker__Group__7__Impl rule__Attacker__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1438:2: rule__Attacker__Group__7__Impl rule__Attacker__Group__8
            {
            pushFollow(FOLLOW_rule__Attacker__Group__7__Impl_in_rule__Attacker__Group__72988);
            rule__Attacker__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__8_in_rule__Attacker__Group__72991);
            rule__Attacker__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__7"


    // $ANTLR start "rule__Attacker__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1445:1: rule__Attacker__Group__7__Impl : ( ( rule__Attacker__RequestsAssignment_7 )* ) ;
    public final void rule__Attacker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1449:1: ( ( ( rule__Attacker__RequestsAssignment_7 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1450:1: ( ( rule__Attacker__RequestsAssignment_7 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1450:1: ( ( rule__Attacker__RequestsAssignment_7 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1451:1: ( rule__Attacker__RequestsAssignment_7 )*
            {
             before(grammarAccess.getAttackerAccess().getRequestsAssignment_7()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1452:1: ( rule__Attacker__RequestsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1452:2: rule__Attacker__RequestsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Attacker__RequestsAssignment_7_in_rule__Attacker__Group__7__Impl3018);
            	    rule__Attacker__RequestsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAttackerAccess().getRequestsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__7__Impl"


    // $ANTLR start "rule__Attacker__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1462:1: rule__Attacker__Group__8 : rule__Attacker__Group__8__Impl ;
    public final void rule__Attacker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1466:1: ( rule__Attacker__Group__8__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1467:2: rule__Attacker__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__8__Impl_in_rule__Attacker__Group__83049);
            rule__Attacker__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__8"


    // $ANTLR start "rule__Attacker__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1473:1: rule__Attacker__Group__8__Impl : ( '}' ) ;
    public final void rule__Attacker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1477:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1478:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1478:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1479:1: '}'
            {
             before(grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__Attacker__Group__8__Impl3077); 
             after(grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__8__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1510:1: rule__MaliciousRequest__Group__0 : rule__MaliciousRequest__Group__0__Impl rule__MaliciousRequest__Group__1 ;
    public final void rule__MaliciousRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1514:1: ( rule__MaliciousRequest__Group__0__Impl rule__MaliciousRequest__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1515:2: rule__MaliciousRequest__Group__0__Impl rule__MaliciousRequest__Group__1
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__0__Impl_in_rule__MaliciousRequest__Group__03126);
            rule__MaliciousRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__1_in_rule__MaliciousRequest__Group__03129);
            rule__MaliciousRequest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__0"


    // $ANTLR start "rule__MaliciousRequest__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1522:1: rule__MaliciousRequest__Group__0__Impl : ( 'MaliciousRequest' ) ;
    public final void rule__MaliciousRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1526:1: ( ( 'MaliciousRequest' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1527:1: ( 'MaliciousRequest' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1527:1: ( 'MaliciousRequest' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1528:1: 'MaliciousRequest'
            {
             before(grammarAccess.getMaliciousRequestAccess().getMaliciousRequestKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__MaliciousRequest__Group__0__Impl3157); 
             after(grammarAccess.getMaliciousRequestAccess().getMaliciousRequestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__0__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1541:1: rule__MaliciousRequest__Group__1 : rule__MaliciousRequest__Group__1__Impl rule__MaliciousRequest__Group__2 ;
    public final void rule__MaliciousRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1545:1: ( rule__MaliciousRequest__Group__1__Impl rule__MaliciousRequest__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1546:2: rule__MaliciousRequest__Group__1__Impl rule__MaliciousRequest__Group__2
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__1__Impl_in_rule__MaliciousRequest__Group__13188);
            rule__MaliciousRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__2_in_rule__MaliciousRequest__Group__13191);
            rule__MaliciousRequest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__1"


    // $ANTLR start "rule__MaliciousRequest__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1553:1: rule__MaliciousRequest__Group__1__Impl : ( ( rule__MaliciousRequest__NameAssignment_1 ) ) ;
    public final void rule__MaliciousRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1557:1: ( ( ( rule__MaliciousRequest__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1558:1: ( ( rule__MaliciousRequest__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1558:1: ( ( rule__MaliciousRequest__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1559:1: ( rule__MaliciousRequest__NameAssignment_1 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1560:1: ( rule__MaliciousRequest__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1560:2: rule__MaliciousRequest__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__NameAssignment_1_in_rule__MaliciousRequest__Group__1__Impl3218);
            rule__MaliciousRequest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__1__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1570:1: rule__MaliciousRequest__Group__2 : rule__MaliciousRequest__Group__2__Impl rule__MaliciousRequest__Group__3 ;
    public final void rule__MaliciousRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1574:1: ( rule__MaliciousRequest__Group__2__Impl rule__MaliciousRequest__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1575:2: rule__MaliciousRequest__Group__2__Impl rule__MaliciousRequest__Group__3
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__2__Impl_in_rule__MaliciousRequest__Group__23248);
            rule__MaliciousRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__3_in_rule__MaliciousRequest__Group__23251);
            rule__MaliciousRequest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__2"


    // $ANTLR start "rule__MaliciousRequest__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1582:1: rule__MaliciousRequest__Group__2__Impl : ( '{' ) ;
    public final void rule__MaliciousRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1586:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1587:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1587:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1588:1: '{'
            {
             before(grammarAccess.getMaliciousRequestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__MaliciousRequest__Group__2__Impl3279); 
             after(grammarAccess.getMaliciousRequestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__2__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1601:1: rule__MaliciousRequest__Group__3 : rule__MaliciousRequest__Group__3__Impl rule__MaliciousRequest__Group__4 ;
    public final void rule__MaliciousRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1605:1: ( rule__MaliciousRequest__Group__3__Impl rule__MaliciousRequest__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1606:2: rule__MaliciousRequest__Group__3__Impl rule__MaliciousRequest__Group__4
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__3__Impl_in_rule__MaliciousRequest__Group__33310);
            rule__MaliciousRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__4_in_rule__MaliciousRequest__Group__33313);
            rule__MaliciousRequest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__3"


    // $ANTLR start "rule__MaliciousRequest__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1613:1: rule__MaliciousRequest__Group__3__Impl : ( 'source: ' ) ;
    public final void rule__MaliciousRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1617:1: ( ( 'source: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1618:1: ( 'source: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1618:1: ( 'source: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1619:1: 'source: '
            {
             before(grammarAccess.getMaliciousRequestAccess().getSourceKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__MaliciousRequest__Group__3__Impl3341); 
             after(grammarAccess.getMaliciousRequestAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__3__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1632:1: rule__MaliciousRequest__Group__4 : rule__MaliciousRequest__Group__4__Impl rule__MaliciousRequest__Group__5 ;
    public final void rule__MaliciousRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1636:1: ( rule__MaliciousRequest__Group__4__Impl rule__MaliciousRequest__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1637:2: rule__MaliciousRequest__Group__4__Impl rule__MaliciousRequest__Group__5
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__4__Impl_in_rule__MaliciousRequest__Group__43372);
            rule__MaliciousRequest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__5_in_rule__MaliciousRequest__Group__43375);
            rule__MaliciousRequest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__4"


    // $ANTLR start "rule__MaliciousRequest__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1644:1: rule__MaliciousRequest__Group__4__Impl : ( ( rule__MaliciousRequest__SourceAssignment_4 ) ) ;
    public final void rule__MaliciousRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1648:1: ( ( ( rule__MaliciousRequest__SourceAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1649:1: ( ( rule__MaliciousRequest__SourceAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1649:1: ( ( rule__MaliciousRequest__SourceAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1650:1: ( rule__MaliciousRequest__SourceAssignment_4 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getSourceAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1651:1: ( rule__MaliciousRequest__SourceAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1651:2: rule__MaliciousRequest__SourceAssignment_4
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__SourceAssignment_4_in_rule__MaliciousRequest__Group__4__Impl3402);
            rule__MaliciousRequest__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__4__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1661:1: rule__MaliciousRequest__Group__5 : rule__MaliciousRequest__Group__5__Impl rule__MaliciousRequest__Group__6 ;
    public final void rule__MaliciousRequest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1665:1: ( rule__MaliciousRequest__Group__5__Impl rule__MaliciousRequest__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1666:2: rule__MaliciousRequest__Group__5__Impl rule__MaliciousRequest__Group__6
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__5__Impl_in_rule__MaliciousRequest__Group__53432);
            rule__MaliciousRequest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__6_in_rule__MaliciousRequest__Group__53435);
            rule__MaliciousRequest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__5"


    // $ANTLR start "rule__MaliciousRequest__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1673:1: rule__MaliciousRequest__Group__5__Impl : ( 'destination: ' ) ;
    public final void rule__MaliciousRequest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1677:1: ( ( 'destination: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1678:1: ( 'destination: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1678:1: ( 'destination: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1679:1: 'destination: '
            {
             before(grammarAccess.getMaliciousRequestAccess().getDestinationKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__MaliciousRequest__Group__5__Impl3463); 
             after(grammarAccess.getMaliciousRequestAccess().getDestinationKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__5__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1692:1: rule__MaliciousRequest__Group__6 : rule__MaliciousRequest__Group__6__Impl rule__MaliciousRequest__Group__7 ;
    public final void rule__MaliciousRequest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1696:1: ( rule__MaliciousRequest__Group__6__Impl rule__MaliciousRequest__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1697:2: rule__MaliciousRequest__Group__6__Impl rule__MaliciousRequest__Group__7
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__6__Impl_in_rule__MaliciousRequest__Group__63494);
            rule__MaliciousRequest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__7_in_rule__MaliciousRequest__Group__63497);
            rule__MaliciousRequest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__6"


    // $ANTLR start "rule__MaliciousRequest__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1704:1: rule__MaliciousRequest__Group__6__Impl : ( ( rule__MaliciousRequest__DestinationAssignment_6 ) ) ;
    public final void rule__MaliciousRequest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1708:1: ( ( ( rule__MaliciousRequest__DestinationAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1709:1: ( ( rule__MaliciousRequest__DestinationAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1709:1: ( ( rule__MaliciousRequest__DestinationAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1710:1: ( rule__MaliciousRequest__DestinationAssignment_6 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getDestinationAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1711:1: ( rule__MaliciousRequest__DestinationAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1711:2: rule__MaliciousRequest__DestinationAssignment_6
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__DestinationAssignment_6_in_rule__MaliciousRequest__Group__6__Impl3524);
            rule__MaliciousRequest__DestinationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getDestinationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__6__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1721:1: rule__MaliciousRequest__Group__7 : rule__MaliciousRequest__Group__7__Impl rule__MaliciousRequest__Group__8 ;
    public final void rule__MaliciousRequest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1725:1: ( rule__MaliciousRequest__Group__7__Impl rule__MaliciousRequest__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1726:2: rule__MaliciousRequest__Group__7__Impl rule__MaliciousRequest__Group__8
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__7__Impl_in_rule__MaliciousRequest__Group__73554);
            rule__MaliciousRequest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__8_in_rule__MaliciousRequest__Group__73557);
            rule__MaliciousRequest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__7"


    // $ANTLR start "rule__MaliciousRequest__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1733:1: rule__MaliciousRequest__Group__7__Impl : ( 'port: ' ) ;
    public final void rule__MaliciousRequest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1737:1: ( ( 'port: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1738:1: ( 'port: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1738:1: ( 'port: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1739:1: 'port: '
            {
             before(grammarAccess.getMaliciousRequestAccess().getPortKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__MaliciousRequest__Group__7__Impl3585); 
             after(grammarAccess.getMaliciousRequestAccess().getPortKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__7__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1752:1: rule__MaliciousRequest__Group__8 : rule__MaliciousRequest__Group__8__Impl rule__MaliciousRequest__Group__9 ;
    public final void rule__MaliciousRequest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1756:1: ( rule__MaliciousRequest__Group__8__Impl rule__MaliciousRequest__Group__9 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1757:2: rule__MaliciousRequest__Group__8__Impl rule__MaliciousRequest__Group__9
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__8__Impl_in_rule__MaliciousRequest__Group__83616);
            rule__MaliciousRequest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__9_in_rule__MaliciousRequest__Group__83619);
            rule__MaliciousRequest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__8"


    // $ANTLR start "rule__MaliciousRequest__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1764:1: rule__MaliciousRequest__Group__8__Impl : ( ( rule__MaliciousRequest__PortAssignment_8 ) ) ;
    public final void rule__MaliciousRequest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1768:1: ( ( ( rule__MaliciousRequest__PortAssignment_8 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1769:1: ( ( rule__MaliciousRequest__PortAssignment_8 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1769:1: ( ( rule__MaliciousRequest__PortAssignment_8 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1770:1: ( rule__MaliciousRequest__PortAssignment_8 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getPortAssignment_8()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1771:1: ( rule__MaliciousRequest__PortAssignment_8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1771:2: rule__MaliciousRequest__PortAssignment_8
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__PortAssignment_8_in_rule__MaliciousRequest__Group__8__Impl3646);
            rule__MaliciousRequest__PortAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getPortAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__8__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__9"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1781:1: rule__MaliciousRequest__Group__9 : rule__MaliciousRequest__Group__9__Impl rule__MaliciousRequest__Group__10 ;
    public final void rule__MaliciousRequest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1785:1: ( rule__MaliciousRequest__Group__9__Impl rule__MaliciousRequest__Group__10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1786:2: rule__MaliciousRequest__Group__9__Impl rule__MaliciousRequest__Group__10
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__9__Impl_in_rule__MaliciousRequest__Group__93676);
            rule__MaliciousRequest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__10_in_rule__MaliciousRequest__Group__93679);
            rule__MaliciousRequest__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__9"


    // $ANTLR start "rule__MaliciousRequest__Group__9__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1793:1: rule__MaliciousRequest__Group__9__Impl : ( 'data: ' ) ;
    public final void rule__MaliciousRequest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1797:1: ( ( 'data: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1798:1: ( 'data: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1798:1: ( 'data: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1799:1: 'data: '
            {
             before(grammarAccess.getMaliciousRequestAccess().getDataKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__MaliciousRequest__Group__9__Impl3707); 
             after(grammarAccess.getMaliciousRequestAccess().getDataKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__9__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1812:1: rule__MaliciousRequest__Group__10 : rule__MaliciousRequest__Group__10__Impl rule__MaliciousRequest__Group__11 ;
    public final void rule__MaliciousRequest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1816:1: ( rule__MaliciousRequest__Group__10__Impl rule__MaliciousRequest__Group__11 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1817:2: rule__MaliciousRequest__Group__10__Impl rule__MaliciousRequest__Group__11
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__10__Impl_in_rule__MaliciousRequest__Group__103738);
            rule__MaliciousRequest__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__11_in_rule__MaliciousRequest__Group__103741);
            rule__MaliciousRequest__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__10"


    // $ANTLR start "rule__MaliciousRequest__Group__10__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1824:1: rule__MaliciousRequest__Group__10__Impl : ( ( rule__MaliciousRequest__DataAssignment_10 ) ) ;
    public final void rule__MaliciousRequest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1828:1: ( ( ( rule__MaliciousRequest__DataAssignment_10 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1829:1: ( ( rule__MaliciousRequest__DataAssignment_10 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1829:1: ( ( rule__MaliciousRequest__DataAssignment_10 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1830:1: ( rule__MaliciousRequest__DataAssignment_10 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getDataAssignment_10()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1831:1: ( rule__MaliciousRequest__DataAssignment_10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1831:2: rule__MaliciousRequest__DataAssignment_10
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__DataAssignment_10_in_rule__MaliciousRequest__Group__10__Impl3768);
            rule__MaliciousRequest__DataAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getDataAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__10__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__11"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1841:1: rule__MaliciousRequest__Group__11 : rule__MaliciousRequest__Group__11__Impl rule__MaliciousRequest__Group__12 ;
    public final void rule__MaliciousRequest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1845:1: ( rule__MaliciousRequest__Group__11__Impl rule__MaliciousRequest__Group__12 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1846:2: rule__MaliciousRequest__Group__11__Impl rule__MaliciousRequest__Group__12
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__11__Impl_in_rule__MaliciousRequest__Group__113798);
            rule__MaliciousRequest__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__12_in_rule__MaliciousRequest__Group__113801);
            rule__MaliciousRequest__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__11"


    // $ANTLR start "rule__MaliciousRequest__Group__11__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1853:1: rule__MaliciousRequest__Group__11__Impl : ( 'protocol: ' ) ;
    public final void rule__MaliciousRequest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1857:1: ( ( 'protocol: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1858:1: ( 'protocol: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1858:1: ( 'protocol: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1859:1: 'protocol: '
            {
             before(grammarAccess.getMaliciousRequestAccess().getProtocolKeyword_11()); 
            match(input,30,FOLLOW_30_in_rule__MaliciousRequest__Group__11__Impl3829); 
             after(grammarAccess.getMaliciousRequestAccess().getProtocolKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__11__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__12"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1872:1: rule__MaliciousRequest__Group__12 : rule__MaliciousRequest__Group__12__Impl rule__MaliciousRequest__Group__13 ;
    public final void rule__MaliciousRequest__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1876:1: ( rule__MaliciousRequest__Group__12__Impl rule__MaliciousRequest__Group__13 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1877:2: rule__MaliciousRequest__Group__12__Impl rule__MaliciousRequest__Group__13
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__12__Impl_in_rule__MaliciousRequest__Group__123860);
            rule__MaliciousRequest__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaliciousRequest__Group__13_in_rule__MaliciousRequest__Group__123863);
            rule__MaliciousRequest__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__12"


    // $ANTLR start "rule__MaliciousRequest__Group__12__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1884:1: rule__MaliciousRequest__Group__12__Impl : ( ( rule__MaliciousRequest__ProtocolAssignment_12 ) ) ;
    public final void rule__MaliciousRequest__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1888:1: ( ( ( rule__MaliciousRequest__ProtocolAssignment_12 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1889:1: ( ( rule__MaliciousRequest__ProtocolAssignment_12 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1889:1: ( ( rule__MaliciousRequest__ProtocolAssignment_12 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1890:1: ( rule__MaliciousRequest__ProtocolAssignment_12 )
            {
             before(grammarAccess.getMaliciousRequestAccess().getProtocolAssignment_12()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1891:1: ( rule__MaliciousRequest__ProtocolAssignment_12 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1891:2: rule__MaliciousRequest__ProtocolAssignment_12
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__ProtocolAssignment_12_in_rule__MaliciousRequest__Group__12__Impl3890);
            rule__MaliciousRequest__ProtocolAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMaliciousRequestAccess().getProtocolAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__12__Impl"


    // $ANTLR start "rule__MaliciousRequest__Group__13"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1901:1: rule__MaliciousRequest__Group__13 : rule__MaliciousRequest__Group__13__Impl ;
    public final void rule__MaliciousRequest__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1905:1: ( rule__MaliciousRequest__Group__13__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1906:2: rule__MaliciousRequest__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__MaliciousRequest__Group__13__Impl_in_rule__MaliciousRequest__Group__133920);
            rule__MaliciousRequest__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__13"


    // $ANTLR start "rule__MaliciousRequest__Group__13__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1912:1: rule__MaliciousRequest__Group__13__Impl : ( '}' ) ;
    public final void rule__MaliciousRequest__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1916:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1917:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1917:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1918:1: '}'
            {
             before(grammarAccess.getMaliciousRequestAccess().getRightCurlyBracketKeyword_13()); 
            match(input,25,FOLLOW_25_in_rule__MaliciousRequest__Group__13__Impl3948); 
             after(grammarAccess.getMaliciousRequestAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__Group__13__Impl"


    // $ANTLR start "rule__NormalRequest__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1959:1: rule__NormalRequest__Group__0 : rule__NormalRequest__Group__0__Impl rule__NormalRequest__Group__1 ;
    public final void rule__NormalRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1963:1: ( rule__NormalRequest__Group__0__Impl rule__NormalRequest__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1964:2: rule__NormalRequest__Group__0__Impl rule__NormalRequest__Group__1
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__0__Impl_in_rule__NormalRequest__Group__04007);
            rule__NormalRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__1_in_rule__NormalRequest__Group__04010);
            rule__NormalRequest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__0"


    // $ANTLR start "rule__NormalRequest__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1971:1: rule__NormalRequest__Group__0__Impl : ( 'NormalRequest' ) ;
    public final void rule__NormalRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1975:1: ( ( 'NormalRequest' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1976:1: ( 'NormalRequest' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1976:1: ( 'NormalRequest' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1977:1: 'NormalRequest'
            {
             before(grammarAccess.getNormalRequestAccess().getNormalRequestKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__NormalRequest__Group__0__Impl4038); 
             after(grammarAccess.getNormalRequestAccess().getNormalRequestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__0__Impl"


    // $ANTLR start "rule__NormalRequest__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1990:1: rule__NormalRequest__Group__1 : rule__NormalRequest__Group__1__Impl rule__NormalRequest__Group__2 ;
    public final void rule__NormalRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1994:1: ( rule__NormalRequest__Group__1__Impl rule__NormalRequest__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:1995:2: rule__NormalRequest__Group__1__Impl rule__NormalRequest__Group__2
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__1__Impl_in_rule__NormalRequest__Group__14069);
            rule__NormalRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__2_in_rule__NormalRequest__Group__14072);
            rule__NormalRequest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__1"


    // $ANTLR start "rule__NormalRequest__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2002:1: rule__NormalRequest__Group__1__Impl : ( ( rule__NormalRequest__NameAssignment_1 ) ) ;
    public final void rule__NormalRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2006:1: ( ( ( rule__NormalRequest__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2007:1: ( ( rule__NormalRequest__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2007:1: ( ( rule__NormalRequest__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2008:1: ( rule__NormalRequest__NameAssignment_1 )
            {
             before(grammarAccess.getNormalRequestAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2009:1: ( rule__NormalRequest__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2009:2: rule__NormalRequest__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NormalRequest__NameAssignment_1_in_rule__NormalRequest__Group__1__Impl4099);
            rule__NormalRequest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__1__Impl"


    // $ANTLR start "rule__NormalRequest__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2019:1: rule__NormalRequest__Group__2 : rule__NormalRequest__Group__2__Impl rule__NormalRequest__Group__3 ;
    public final void rule__NormalRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2023:1: ( rule__NormalRequest__Group__2__Impl rule__NormalRequest__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2024:2: rule__NormalRequest__Group__2__Impl rule__NormalRequest__Group__3
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__2__Impl_in_rule__NormalRequest__Group__24129);
            rule__NormalRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__3_in_rule__NormalRequest__Group__24132);
            rule__NormalRequest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__2"


    // $ANTLR start "rule__NormalRequest__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2031:1: rule__NormalRequest__Group__2__Impl : ( '{' ) ;
    public final void rule__NormalRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2035:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2036:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2036:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2037:1: '{'
            {
             before(grammarAccess.getNormalRequestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__NormalRequest__Group__2__Impl4160); 
             after(grammarAccess.getNormalRequestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__2__Impl"


    // $ANTLR start "rule__NormalRequest__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2050:1: rule__NormalRequest__Group__3 : rule__NormalRequest__Group__3__Impl rule__NormalRequest__Group__4 ;
    public final void rule__NormalRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2054:1: ( rule__NormalRequest__Group__3__Impl rule__NormalRequest__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2055:2: rule__NormalRequest__Group__3__Impl rule__NormalRequest__Group__4
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__3__Impl_in_rule__NormalRequest__Group__34191);
            rule__NormalRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__4_in_rule__NormalRequest__Group__34194);
            rule__NormalRequest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__3"


    // $ANTLR start "rule__NormalRequest__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2062:1: rule__NormalRequest__Group__3__Impl : ( 'source: ' ) ;
    public final void rule__NormalRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2066:1: ( ( 'source: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2067:1: ( 'source: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2067:1: ( 'source: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2068:1: 'source: '
            {
             before(grammarAccess.getNormalRequestAccess().getSourceKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__NormalRequest__Group__3__Impl4222); 
             after(grammarAccess.getNormalRequestAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__3__Impl"


    // $ANTLR start "rule__NormalRequest__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2081:1: rule__NormalRequest__Group__4 : rule__NormalRequest__Group__4__Impl rule__NormalRequest__Group__5 ;
    public final void rule__NormalRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2085:1: ( rule__NormalRequest__Group__4__Impl rule__NormalRequest__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2086:2: rule__NormalRequest__Group__4__Impl rule__NormalRequest__Group__5
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__4__Impl_in_rule__NormalRequest__Group__44253);
            rule__NormalRequest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__5_in_rule__NormalRequest__Group__44256);
            rule__NormalRequest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__4"


    // $ANTLR start "rule__NormalRequest__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2093:1: rule__NormalRequest__Group__4__Impl : ( ( rule__NormalRequest__SourceAssignment_4 ) ) ;
    public final void rule__NormalRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2097:1: ( ( ( rule__NormalRequest__SourceAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2098:1: ( ( rule__NormalRequest__SourceAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2098:1: ( ( rule__NormalRequest__SourceAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2099:1: ( rule__NormalRequest__SourceAssignment_4 )
            {
             before(grammarAccess.getNormalRequestAccess().getSourceAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2100:1: ( rule__NormalRequest__SourceAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2100:2: rule__NormalRequest__SourceAssignment_4
            {
            pushFollow(FOLLOW_rule__NormalRequest__SourceAssignment_4_in_rule__NormalRequest__Group__4__Impl4283);
            rule__NormalRequest__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__4__Impl"


    // $ANTLR start "rule__NormalRequest__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2110:1: rule__NormalRequest__Group__5 : rule__NormalRequest__Group__5__Impl rule__NormalRequest__Group__6 ;
    public final void rule__NormalRequest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2114:1: ( rule__NormalRequest__Group__5__Impl rule__NormalRequest__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2115:2: rule__NormalRequest__Group__5__Impl rule__NormalRequest__Group__6
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__5__Impl_in_rule__NormalRequest__Group__54313);
            rule__NormalRequest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__6_in_rule__NormalRequest__Group__54316);
            rule__NormalRequest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__5"


    // $ANTLR start "rule__NormalRequest__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2122:1: rule__NormalRequest__Group__5__Impl : ( 'destination: ' ) ;
    public final void rule__NormalRequest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2126:1: ( ( 'destination: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2127:1: ( 'destination: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2127:1: ( 'destination: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2128:1: 'destination: '
            {
             before(grammarAccess.getNormalRequestAccess().getDestinationKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__NormalRequest__Group__5__Impl4344); 
             after(grammarAccess.getNormalRequestAccess().getDestinationKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__5__Impl"


    // $ANTLR start "rule__NormalRequest__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2141:1: rule__NormalRequest__Group__6 : rule__NormalRequest__Group__6__Impl rule__NormalRequest__Group__7 ;
    public final void rule__NormalRequest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2145:1: ( rule__NormalRequest__Group__6__Impl rule__NormalRequest__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2146:2: rule__NormalRequest__Group__6__Impl rule__NormalRequest__Group__7
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__6__Impl_in_rule__NormalRequest__Group__64375);
            rule__NormalRequest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__7_in_rule__NormalRequest__Group__64378);
            rule__NormalRequest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__6"


    // $ANTLR start "rule__NormalRequest__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2153:1: rule__NormalRequest__Group__6__Impl : ( ( rule__NormalRequest__DestinationAssignment_6 ) ) ;
    public final void rule__NormalRequest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2157:1: ( ( ( rule__NormalRequest__DestinationAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2158:1: ( ( rule__NormalRequest__DestinationAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2158:1: ( ( rule__NormalRequest__DestinationAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2159:1: ( rule__NormalRequest__DestinationAssignment_6 )
            {
             before(grammarAccess.getNormalRequestAccess().getDestinationAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2160:1: ( rule__NormalRequest__DestinationAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2160:2: rule__NormalRequest__DestinationAssignment_6
            {
            pushFollow(FOLLOW_rule__NormalRequest__DestinationAssignment_6_in_rule__NormalRequest__Group__6__Impl4405);
            rule__NormalRequest__DestinationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getDestinationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__6__Impl"


    // $ANTLR start "rule__NormalRequest__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2170:1: rule__NormalRequest__Group__7 : rule__NormalRequest__Group__7__Impl rule__NormalRequest__Group__8 ;
    public final void rule__NormalRequest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2174:1: ( rule__NormalRequest__Group__7__Impl rule__NormalRequest__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2175:2: rule__NormalRequest__Group__7__Impl rule__NormalRequest__Group__8
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__7__Impl_in_rule__NormalRequest__Group__74435);
            rule__NormalRequest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__8_in_rule__NormalRequest__Group__74438);
            rule__NormalRequest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__7"


    // $ANTLR start "rule__NormalRequest__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2182:1: rule__NormalRequest__Group__7__Impl : ( 'port: ' ) ;
    public final void rule__NormalRequest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2186:1: ( ( 'port: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2187:1: ( 'port: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2187:1: ( 'port: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2188:1: 'port: '
            {
             before(grammarAccess.getNormalRequestAccess().getPortKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__NormalRequest__Group__7__Impl4466); 
             after(grammarAccess.getNormalRequestAccess().getPortKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__7__Impl"


    // $ANTLR start "rule__NormalRequest__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2201:1: rule__NormalRequest__Group__8 : rule__NormalRequest__Group__8__Impl rule__NormalRequest__Group__9 ;
    public final void rule__NormalRequest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2205:1: ( rule__NormalRequest__Group__8__Impl rule__NormalRequest__Group__9 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2206:2: rule__NormalRequest__Group__8__Impl rule__NormalRequest__Group__9
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__8__Impl_in_rule__NormalRequest__Group__84497);
            rule__NormalRequest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__9_in_rule__NormalRequest__Group__84500);
            rule__NormalRequest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__8"


    // $ANTLR start "rule__NormalRequest__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2213:1: rule__NormalRequest__Group__8__Impl : ( ( rule__NormalRequest__PortAssignment_8 ) ) ;
    public final void rule__NormalRequest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2217:1: ( ( ( rule__NormalRequest__PortAssignment_8 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2218:1: ( ( rule__NormalRequest__PortAssignment_8 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2218:1: ( ( rule__NormalRequest__PortAssignment_8 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2219:1: ( rule__NormalRequest__PortAssignment_8 )
            {
             before(grammarAccess.getNormalRequestAccess().getPortAssignment_8()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2220:1: ( rule__NormalRequest__PortAssignment_8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2220:2: rule__NormalRequest__PortAssignment_8
            {
            pushFollow(FOLLOW_rule__NormalRequest__PortAssignment_8_in_rule__NormalRequest__Group__8__Impl4527);
            rule__NormalRequest__PortAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getPortAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__8__Impl"


    // $ANTLR start "rule__NormalRequest__Group__9"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2230:1: rule__NormalRequest__Group__9 : rule__NormalRequest__Group__9__Impl rule__NormalRequest__Group__10 ;
    public final void rule__NormalRequest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2234:1: ( rule__NormalRequest__Group__9__Impl rule__NormalRequest__Group__10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2235:2: rule__NormalRequest__Group__9__Impl rule__NormalRequest__Group__10
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__9__Impl_in_rule__NormalRequest__Group__94557);
            rule__NormalRequest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__10_in_rule__NormalRequest__Group__94560);
            rule__NormalRequest__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__9"


    // $ANTLR start "rule__NormalRequest__Group__9__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2242:1: rule__NormalRequest__Group__9__Impl : ( 'data: ' ) ;
    public final void rule__NormalRequest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2246:1: ( ( 'data: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2247:1: ( 'data: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2247:1: ( 'data: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2248:1: 'data: '
            {
             before(grammarAccess.getNormalRequestAccess().getDataKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__NormalRequest__Group__9__Impl4588); 
             after(grammarAccess.getNormalRequestAccess().getDataKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__9__Impl"


    // $ANTLR start "rule__NormalRequest__Group__10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2261:1: rule__NormalRequest__Group__10 : rule__NormalRequest__Group__10__Impl rule__NormalRequest__Group__11 ;
    public final void rule__NormalRequest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2265:1: ( rule__NormalRequest__Group__10__Impl rule__NormalRequest__Group__11 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2266:2: rule__NormalRequest__Group__10__Impl rule__NormalRequest__Group__11
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__10__Impl_in_rule__NormalRequest__Group__104619);
            rule__NormalRequest__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__11_in_rule__NormalRequest__Group__104622);
            rule__NormalRequest__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__10"


    // $ANTLR start "rule__NormalRequest__Group__10__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2273:1: rule__NormalRequest__Group__10__Impl : ( ( rule__NormalRequest__DataAssignment_10 ) ) ;
    public final void rule__NormalRequest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2277:1: ( ( ( rule__NormalRequest__DataAssignment_10 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2278:1: ( ( rule__NormalRequest__DataAssignment_10 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2278:1: ( ( rule__NormalRequest__DataAssignment_10 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2279:1: ( rule__NormalRequest__DataAssignment_10 )
            {
             before(grammarAccess.getNormalRequestAccess().getDataAssignment_10()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2280:1: ( rule__NormalRequest__DataAssignment_10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2280:2: rule__NormalRequest__DataAssignment_10
            {
            pushFollow(FOLLOW_rule__NormalRequest__DataAssignment_10_in_rule__NormalRequest__Group__10__Impl4649);
            rule__NormalRequest__DataAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getDataAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__10__Impl"


    // $ANTLR start "rule__NormalRequest__Group__11"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2290:1: rule__NormalRequest__Group__11 : rule__NormalRequest__Group__11__Impl rule__NormalRequest__Group__12 ;
    public final void rule__NormalRequest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2294:1: ( rule__NormalRequest__Group__11__Impl rule__NormalRequest__Group__12 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2295:2: rule__NormalRequest__Group__11__Impl rule__NormalRequest__Group__12
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__11__Impl_in_rule__NormalRequest__Group__114679);
            rule__NormalRequest__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__12_in_rule__NormalRequest__Group__114682);
            rule__NormalRequest__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__11"


    // $ANTLR start "rule__NormalRequest__Group__11__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2302:1: rule__NormalRequest__Group__11__Impl : ( 'protocol: ' ) ;
    public final void rule__NormalRequest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2306:1: ( ( 'protocol: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2307:1: ( 'protocol: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2307:1: ( 'protocol: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2308:1: 'protocol: '
            {
             before(grammarAccess.getNormalRequestAccess().getProtocolKeyword_11()); 
            match(input,30,FOLLOW_30_in_rule__NormalRequest__Group__11__Impl4710); 
             after(grammarAccess.getNormalRequestAccess().getProtocolKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__11__Impl"


    // $ANTLR start "rule__NormalRequest__Group__12"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2321:1: rule__NormalRequest__Group__12 : rule__NormalRequest__Group__12__Impl rule__NormalRequest__Group__13 ;
    public final void rule__NormalRequest__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2325:1: ( rule__NormalRequest__Group__12__Impl rule__NormalRequest__Group__13 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2326:2: rule__NormalRequest__Group__12__Impl rule__NormalRequest__Group__13
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__12__Impl_in_rule__NormalRequest__Group__124741);
            rule__NormalRequest__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalRequest__Group__13_in_rule__NormalRequest__Group__124744);
            rule__NormalRequest__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__12"


    // $ANTLR start "rule__NormalRequest__Group__12__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2333:1: rule__NormalRequest__Group__12__Impl : ( ( rule__NormalRequest__ProtocolAssignment_12 ) ) ;
    public final void rule__NormalRequest__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2337:1: ( ( ( rule__NormalRequest__ProtocolAssignment_12 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2338:1: ( ( rule__NormalRequest__ProtocolAssignment_12 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2338:1: ( ( rule__NormalRequest__ProtocolAssignment_12 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2339:1: ( rule__NormalRequest__ProtocolAssignment_12 )
            {
             before(grammarAccess.getNormalRequestAccess().getProtocolAssignment_12()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2340:1: ( rule__NormalRequest__ProtocolAssignment_12 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2340:2: rule__NormalRequest__ProtocolAssignment_12
            {
            pushFollow(FOLLOW_rule__NormalRequest__ProtocolAssignment_12_in_rule__NormalRequest__Group__12__Impl4771);
            rule__NormalRequest__ProtocolAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getNormalRequestAccess().getProtocolAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__12__Impl"


    // $ANTLR start "rule__NormalRequest__Group__13"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2350:1: rule__NormalRequest__Group__13 : rule__NormalRequest__Group__13__Impl ;
    public final void rule__NormalRequest__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2354:1: ( rule__NormalRequest__Group__13__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2355:2: rule__NormalRequest__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__NormalRequest__Group__13__Impl_in_rule__NormalRequest__Group__134801);
            rule__NormalRequest__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__13"


    // $ANTLR start "rule__NormalRequest__Group__13__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2361:1: rule__NormalRequest__Group__13__Impl : ( '}' ) ;
    public final void rule__NormalRequest__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2365:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2366:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2366:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2367:1: '}'
            {
             before(grammarAccess.getNormalRequestAccess().getRightCurlyBracketKeyword_13()); 
            match(input,25,FOLLOW_25_in_rule__NormalRequest__Group__13__Impl4829); 
             after(grammarAccess.getNormalRequestAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__Group__13__Impl"


    // $ANTLR start "rule__Defender__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2408:1: rule__Defender__Group__0 : rule__Defender__Group__0__Impl rule__Defender__Group__1 ;
    public final void rule__Defender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2412:1: ( rule__Defender__Group__0__Impl rule__Defender__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2413:2: rule__Defender__Group__0__Impl rule__Defender__Group__1
            {
            pushFollow(FOLLOW_rule__Defender__Group__0__Impl_in_rule__Defender__Group__04888);
            rule__Defender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__1_in_rule__Defender__Group__04891);
            rule__Defender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__0"


    // $ANTLR start "rule__Defender__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2420:1: rule__Defender__Group__0__Impl : ( ( rule__Defender__TypeAssignment_0 ) ) ;
    public final void rule__Defender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2424:1: ( ( ( rule__Defender__TypeAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2425:1: ( ( rule__Defender__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2425:1: ( ( rule__Defender__TypeAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2426:1: ( rule__Defender__TypeAssignment_0 )
            {
             before(grammarAccess.getDefenderAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2427:1: ( rule__Defender__TypeAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2427:2: rule__Defender__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Defender__TypeAssignment_0_in_rule__Defender__Group__0__Impl4918);
            rule__Defender__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__0__Impl"


    // $ANTLR start "rule__Defender__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2437:1: rule__Defender__Group__1 : rule__Defender__Group__1__Impl rule__Defender__Group__2 ;
    public final void rule__Defender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2441:1: ( rule__Defender__Group__1__Impl rule__Defender__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2442:2: rule__Defender__Group__1__Impl rule__Defender__Group__2
            {
            pushFollow(FOLLOW_rule__Defender__Group__1__Impl_in_rule__Defender__Group__14948);
            rule__Defender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__2_in_rule__Defender__Group__14951);
            rule__Defender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__1"


    // $ANTLR start "rule__Defender__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2449:1: rule__Defender__Group__1__Impl : ( ( rule__Defender__NameAssignment_1 ) ) ;
    public final void rule__Defender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2453:1: ( ( ( rule__Defender__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2454:1: ( ( rule__Defender__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2454:1: ( ( rule__Defender__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2455:1: ( rule__Defender__NameAssignment_1 )
            {
             before(grammarAccess.getDefenderAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2456:1: ( rule__Defender__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2456:2: rule__Defender__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Defender__NameAssignment_1_in_rule__Defender__Group__1__Impl4978);
            rule__Defender__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__1__Impl"


    // $ANTLR start "rule__Defender__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2466:1: rule__Defender__Group__2 : rule__Defender__Group__2__Impl rule__Defender__Group__3 ;
    public final void rule__Defender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2470:1: ( rule__Defender__Group__2__Impl rule__Defender__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2471:2: rule__Defender__Group__2__Impl rule__Defender__Group__3
            {
            pushFollow(FOLLOW_rule__Defender__Group__2__Impl_in_rule__Defender__Group__25008);
            rule__Defender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__3_in_rule__Defender__Group__25011);
            rule__Defender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__2"


    // $ANTLR start "rule__Defender__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2478:1: rule__Defender__Group__2__Impl : ( '{' ) ;
    public final void rule__Defender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2482:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2483:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2483:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2484:1: '{'
            {
             before(grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Defender__Group__2__Impl5039); 
             after(grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__2__Impl"


    // $ANTLR start "rule__Defender__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2497:1: rule__Defender__Group__3 : rule__Defender__Group__3__Impl rule__Defender__Group__4 ;
    public final void rule__Defender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2501:1: ( rule__Defender__Group__3__Impl rule__Defender__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2502:2: rule__Defender__Group__3__Impl rule__Defender__Group__4
            {
            pushFollow(FOLLOW_rule__Defender__Group__3__Impl_in_rule__Defender__Group__35070);
            rule__Defender__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__4_in_rule__Defender__Group__35073);
            rule__Defender__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__3"


    // $ANTLR start "rule__Defender__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2509:1: rule__Defender__Group__3__Impl : ( 'belongTo' ) ;
    public final void rule__Defender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2513:1: ( ( 'belongTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2514:1: ( 'belongTo' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2514:1: ( 'belongTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2515:1: 'belongTo'
            {
             before(grammarAccess.getDefenderAccess().getBelongToKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Defender__Group__3__Impl5101); 
             after(grammarAccess.getDefenderAccess().getBelongToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__3__Impl"


    // $ANTLR start "rule__Defender__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2528:1: rule__Defender__Group__4 : rule__Defender__Group__4__Impl rule__Defender__Group__5 ;
    public final void rule__Defender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2532:1: ( rule__Defender__Group__4__Impl rule__Defender__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2533:2: rule__Defender__Group__4__Impl rule__Defender__Group__5
            {
            pushFollow(FOLLOW_rule__Defender__Group__4__Impl_in_rule__Defender__Group__45132);
            rule__Defender__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__5_in_rule__Defender__Group__45135);
            rule__Defender__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__4"


    // $ANTLR start "rule__Defender__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2540:1: rule__Defender__Group__4__Impl : ( ( rule__Defender__FilenameAssignment_4 ) ) ;
    public final void rule__Defender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2544:1: ( ( ( rule__Defender__FilenameAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2545:1: ( ( rule__Defender__FilenameAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2545:1: ( ( rule__Defender__FilenameAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2546:1: ( rule__Defender__FilenameAssignment_4 )
            {
             before(grammarAccess.getDefenderAccess().getFilenameAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2547:1: ( rule__Defender__FilenameAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2547:2: rule__Defender__FilenameAssignment_4
            {
            pushFollow(FOLLOW_rule__Defender__FilenameAssignment_4_in_rule__Defender__Group__4__Impl5162);
            rule__Defender__FilenameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getFilenameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__4__Impl"


    // $ANTLR start "rule__Defender__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2557:1: rule__Defender__Group__5 : rule__Defender__Group__5__Impl rule__Defender__Group__6 ;
    public final void rule__Defender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2561:1: ( rule__Defender__Group__5__Impl rule__Defender__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2562:2: rule__Defender__Group__5__Impl rule__Defender__Group__6
            {
            pushFollow(FOLLOW_rule__Defender__Group__5__Impl_in_rule__Defender__Group__55192);
            rule__Defender__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__6_in_rule__Defender__Group__55195);
            rule__Defender__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__5"


    // $ANTLR start "rule__Defender__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2569:1: rule__Defender__Group__5__Impl : ( 'source: ' ) ;
    public final void rule__Defender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2573:1: ( ( 'source: ' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2574:1: ( 'source: ' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2574:1: ( 'source: ' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2575:1: 'source: '
            {
             before(grammarAccess.getDefenderAccess().getSourceKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Defender__Group__5__Impl5223); 
             after(grammarAccess.getDefenderAccess().getSourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__5__Impl"


    // $ANTLR start "rule__Defender__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2588:1: rule__Defender__Group__6 : rule__Defender__Group__6__Impl rule__Defender__Group__7 ;
    public final void rule__Defender__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2592:1: ( rule__Defender__Group__6__Impl rule__Defender__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2593:2: rule__Defender__Group__6__Impl rule__Defender__Group__7
            {
            pushFollow(FOLLOW_rule__Defender__Group__6__Impl_in_rule__Defender__Group__65254);
            rule__Defender__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__7_in_rule__Defender__Group__65257);
            rule__Defender__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__6"


    // $ANTLR start "rule__Defender__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2600:1: rule__Defender__Group__6__Impl : ( ( rule__Defender__SourceAssignment_6 ) ) ;
    public final void rule__Defender__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2604:1: ( ( ( rule__Defender__SourceAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2605:1: ( ( rule__Defender__SourceAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2605:1: ( ( rule__Defender__SourceAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2606:1: ( rule__Defender__SourceAssignment_6 )
            {
             before(grammarAccess.getDefenderAccess().getSourceAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2607:1: ( rule__Defender__SourceAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2607:2: rule__Defender__SourceAssignment_6
            {
            pushFollow(FOLLOW_rule__Defender__SourceAssignment_6_in_rule__Defender__Group__6__Impl5284);
            rule__Defender__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__6__Impl"


    // $ANTLR start "rule__Defender__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2617:1: rule__Defender__Group__7 : rule__Defender__Group__7__Impl rule__Defender__Group__8 ;
    public final void rule__Defender__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2621:1: ( rule__Defender__Group__7__Impl rule__Defender__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2622:2: rule__Defender__Group__7__Impl rule__Defender__Group__8
            {
            pushFollow(FOLLOW_rule__Defender__Group__7__Impl_in_rule__Defender__Group__75314);
            rule__Defender__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Defender__Group__8_in_rule__Defender__Group__75317);
            rule__Defender__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__7"


    // $ANTLR start "rule__Defender__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2629:1: rule__Defender__Group__7__Impl : ( ( rule__Defender__SecurityPolicylistAssignment_7 ) ) ;
    public final void rule__Defender__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2633:1: ( ( ( rule__Defender__SecurityPolicylistAssignment_7 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2634:1: ( ( rule__Defender__SecurityPolicylistAssignment_7 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2634:1: ( ( rule__Defender__SecurityPolicylistAssignment_7 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2635:1: ( rule__Defender__SecurityPolicylistAssignment_7 )
            {
             before(grammarAccess.getDefenderAccess().getSecurityPolicylistAssignment_7()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2636:1: ( rule__Defender__SecurityPolicylistAssignment_7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2636:2: rule__Defender__SecurityPolicylistAssignment_7
            {
            pushFollow(FOLLOW_rule__Defender__SecurityPolicylistAssignment_7_in_rule__Defender__Group__7__Impl5344);
            rule__Defender__SecurityPolicylistAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getSecurityPolicylistAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__7__Impl"


    // $ANTLR start "rule__Defender__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2646:1: rule__Defender__Group__8 : rule__Defender__Group__8__Impl ;
    public final void rule__Defender__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2650:1: ( rule__Defender__Group__8__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2651:2: rule__Defender__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Defender__Group__8__Impl_in_rule__Defender__Group__85374);
            rule__Defender__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__8"


    // $ANTLR start "rule__Defender__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2657:1: rule__Defender__Group__8__Impl : ( '}' ) ;
    public final void rule__Defender__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2661:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2662:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2662:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2663:1: '}'
            {
             before(grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__Defender__Group__8__Impl5402); 
             after(grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__8__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2694:1: rule__SecurityPolicyList__Group__0 : rule__SecurityPolicyList__Group__0__Impl rule__SecurityPolicyList__Group__1 ;
    public final void rule__SecurityPolicyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2698:1: ( rule__SecurityPolicyList__Group__0__Impl rule__SecurityPolicyList__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2699:2: rule__SecurityPolicyList__Group__0__Impl rule__SecurityPolicyList__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__0__Impl_in_rule__SecurityPolicyList__Group__05451);
            rule__SecurityPolicyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__1_in_rule__SecurityPolicyList__Group__05454);
            rule__SecurityPolicyList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__0"


    // $ANTLR start "rule__SecurityPolicyList__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2706:1: rule__SecurityPolicyList__Group__0__Impl : ( 'SecurityPolicyList' ) ;
    public final void rule__SecurityPolicyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2710:1: ( ( 'SecurityPolicyList' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2711:1: ( 'SecurityPolicyList' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2711:1: ( 'SecurityPolicyList' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2712:1: 'SecurityPolicyList'
            {
             before(grammarAccess.getSecurityPolicyListAccess().getSecurityPolicyListKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__SecurityPolicyList__Group__0__Impl5482); 
             after(grammarAccess.getSecurityPolicyListAccess().getSecurityPolicyListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__0__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2725:1: rule__SecurityPolicyList__Group__1 : rule__SecurityPolicyList__Group__1__Impl rule__SecurityPolicyList__Group__2 ;
    public final void rule__SecurityPolicyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2729:1: ( rule__SecurityPolicyList__Group__1__Impl rule__SecurityPolicyList__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2730:2: rule__SecurityPolicyList__Group__1__Impl rule__SecurityPolicyList__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__1__Impl_in_rule__SecurityPolicyList__Group__15513);
            rule__SecurityPolicyList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__2_in_rule__SecurityPolicyList__Group__15516);
            rule__SecurityPolicyList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__1"


    // $ANTLR start "rule__SecurityPolicyList__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2737:1: rule__SecurityPolicyList__Group__1__Impl : ( ( rule__SecurityPolicyList__NameAssignment_1 ) ) ;
    public final void rule__SecurityPolicyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2741:1: ( ( ( rule__SecurityPolicyList__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2742:1: ( ( rule__SecurityPolicyList__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2742:1: ( ( rule__SecurityPolicyList__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2743:1: ( rule__SecurityPolicyList__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityPolicyListAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2744:1: ( rule__SecurityPolicyList__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2744:2: rule__SecurityPolicyList__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__NameAssignment_1_in_rule__SecurityPolicyList__Group__1__Impl5543);
            rule__SecurityPolicyList__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__1__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2754:1: rule__SecurityPolicyList__Group__2 : rule__SecurityPolicyList__Group__2__Impl rule__SecurityPolicyList__Group__3 ;
    public final void rule__SecurityPolicyList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2758:1: ( rule__SecurityPolicyList__Group__2__Impl rule__SecurityPolicyList__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2759:2: rule__SecurityPolicyList__Group__2__Impl rule__SecurityPolicyList__Group__3
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__2__Impl_in_rule__SecurityPolicyList__Group__25573);
            rule__SecurityPolicyList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__3_in_rule__SecurityPolicyList__Group__25576);
            rule__SecurityPolicyList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__2"


    // $ANTLR start "rule__SecurityPolicyList__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2766:1: rule__SecurityPolicyList__Group__2__Impl : ( '{' ) ;
    public final void rule__SecurityPolicyList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2770:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2771:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2771:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2772:1: '{'
            {
             before(grammarAccess.getSecurityPolicyListAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__SecurityPolicyList__Group__2__Impl5604); 
             after(grammarAccess.getSecurityPolicyListAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__2__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2785:1: rule__SecurityPolicyList__Group__3 : rule__SecurityPolicyList__Group__3__Impl rule__SecurityPolicyList__Group__4 ;
    public final void rule__SecurityPolicyList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2789:1: ( rule__SecurityPolicyList__Group__3__Impl rule__SecurityPolicyList__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2790:2: rule__SecurityPolicyList__Group__3__Impl rule__SecurityPolicyList__Group__4
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__3__Impl_in_rule__SecurityPolicyList__Group__35635);
            rule__SecurityPolicyList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__4_in_rule__SecurityPolicyList__Group__35638);
            rule__SecurityPolicyList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__3"


    // $ANTLR start "rule__SecurityPolicyList__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2797:1: rule__SecurityPolicyList__Group__3__Impl : ( ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )* ) ;
    public final void rule__SecurityPolicyList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2801:1: ( ( ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2802:1: ( ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2802:1: ( ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2803:1: ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )*
            {
             before(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesAssignment_3()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2804:1: ( rule__SecurityPolicyList__SecurityPoliciesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2804:2: rule__SecurityPolicyList__SecurityPoliciesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SecurityPolicyList__SecurityPoliciesAssignment_3_in_rule__SecurityPolicyList__Group__3__Impl5665);
            	    rule__SecurityPolicyList__SecurityPoliciesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__3__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2814:1: rule__SecurityPolicyList__Group__4 : rule__SecurityPolicyList__Group__4__Impl rule__SecurityPolicyList__Group__5 ;
    public final void rule__SecurityPolicyList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2818:1: ( rule__SecurityPolicyList__Group__4__Impl rule__SecurityPolicyList__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2819:2: rule__SecurityPolicyList__Group__4__Impl rule__SecurityPolicyList__Group__5
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__4__Impl_in_rule__SecurityPolicyList__Group__45696);
            rule__SecurityPolicyList__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__5_in_rule__SecurityPolicyList__Group__45699);
            rule__SecurityPolicyList__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__4"


    // $ANTLR start "rule__SecurityPolicyList__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2826:1: rule__SecurityPolicyList__Group__4__Impl : ( ( rule__SecurityPolicyList__ConditionsAssignment_4 )* ) ;
    public final void rule__SecurityPolicyList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2830:1: ( ( ( rule__SecurityPolicyList__ConditionsAssignment_4 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2831:1: ( ( rule__SecurityPolicyList__ConditionsAssignment_4 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2831:1: ( ( rule__SecurityPolicyList__ConditionsAssignment_4 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2832:1: ( rule__SecurityPolicyList__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getSecurityPolicyListAccess().getConditionsAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2833:1: ( rule__SecurityPolicyList__ConditionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2833:2: rule__SecurityPolicyList__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SecurityPolicyList__ConditionsAssignment_4_in_rule__SecurityPolicyList__Group__4__Impl5726);
            	    rule__SecurityPolicyList__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSecurityPolicyListAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__4__Impl"


    // $ANTLR start "rule__SecurityPolicyList__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2843:1: rule__SecurityPolicyList__Group__5 : rule__SecurityPolicyList__Group__5__Impl ;
    public final void rule__SecurityPolicyList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2847:1: ( rule__SecurityPolicyList__Group__5__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2848:2: rule__SecurityPolicyList__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SecurityPolicyList__Group__5__Impl_in_rule__SecurityPolicyList__Group__55757);
            rule__SecurityPolicyList__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__5"


    // $ANTLR start "rule__SecurityPolicyList__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2854:1: rule__SecurityPolicyList__Group__5__Impl : ( '}' ) ;
    public final void rule__SecurityPolicyList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2858:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2859:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2859:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2860:1: '}'
            {
             before(grammarAccess.getSecurityPolicyListAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__SecurityPolicyList__Group__5__Impl5785); 
             after(grammarAccess.getSecurityPolicyListAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__Group__5__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2885:1: rule__SecurityPolicy__Group__0 : rule__SecurityPolicy__Group__0__Impl rule__SecurityPolicy__Group__1 ;
    public final void rule__SecurityPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2889:1: ( rule__SecurityPolicy__Group__0__Impl rule__SecurityPolicy__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2890:2: rule__SecurityPolicy__Group__0__Impl rule__SecurityPolicy__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__0__Impl_in_rule__SecurityPolicy__Group__05828);
            rule__SecurityPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__1_in_rule__SecurityPolicy__Group__05831);
            rule__SecurityPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__0"


    // $ANTLR start "rule__SecurityPolicy__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2897:1: rule__SecurityPolicy__Group__0__Impl : ( 'SecurityPolicy' ) ;
    public final void rule__SecurityPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2901:1: ( ( 'SecurityPolicy' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2902:1: ( 'SecurityPolicy' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2902:1: ( 'SecurityPolicy' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2903:1: 'SecurityPolicy'
            {
             before(grammarAccess.getSecurityPolicyAccess().getSecurityPolicyKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SecurityPolicy__Group__0__Impl5859); 
             after(grammarAccess.getSecurityPolicyAccess().getSecurityPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__0__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2916:1: rule__SecurityPolicy__Group__1 : rule__SecurityPolicy__Group__1__Impl rule__SecurityPolicy__Group__2 ;
    public final void rule__SecurityPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2920:1: ( rule__SecurityPolicy__Group__1__Impl rule__SecurityPolicy__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2921:2: rule__SecurityPolicy__Group__1__Impl rule__SecurityPolicy__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__1__Impl_in_rule__SecurityPolicy__Group__15890);
            rule__SecurityPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__2_in_rule__SecurityPolicy__Group__15893);
            rule__SecurityPolicy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__1"


    // $ANTLR start "rule__SecurityPolicy__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2928:1: rule__SecurityPolicy__Group__1__Impl : ( ( rule__SecurityPolicy__NameAssignment_1 ) ) ;
    public final void rule__SecurityPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2932:1: ( ( ( rule__SecurityPolicy__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2933:1: ( ( rule__SecurityPolicy__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2933:1: ( ( rule__SecurityPolicy__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2934:1: ( rule__SecurityPolicy__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2935:1: ( rule__SecurityPolicy__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2935:2: rule__SecurityPolicy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__NameAssignment_1_in_rule__SecurityPolicy__Group__1__Impl5920);
            rule__SecurityPolicy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__1__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2945:1: rule__SecurityPolicy__Group__2 : rule__SecurityPolicy__Group__2__Impl rule__SecurityPolicy__Group__3 ;
    public final void rule__SecurityPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2949:1: ( rule__SecurityPolicy__Group__2__Impl rule__SecurityPolicy__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2950:2: rule__SecurityPolicy__Group__2__Impl rule__SecurityPolicy__Group__3
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__2__Impl_in_rule__SecurityPolicy__Group__25950);
            rule__SecurityPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__3_in_rule__SecurityPolicy__Group__25953);
            rule__SecurityPolicy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__2"


    // $ANTLR start "rule__SecurityPolicy__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2957:1: rule__SecurityPolicy__Group__2__Impl : ( '{' ) ;
    public final void rule__SecurityPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2961:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2962:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2962:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2963:1: '{'
            {
             before(grammarAccess.getSecurityPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__SecurityPolicy__Group__2__Impl5981); 
             after(grammarAccess.getSecurityPolicyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__2__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2976:1: rule__SecurityPolicy__Group__3 : rule__SecurityPolicy__Group__3__Impl rule__SecurityPolicy__Group__4 ;
    public final void rule__SecurityPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2980:1: ( rule__SecurityPolicy__Group__3__Impl rule__SecurityPolicy__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2981:2: rule__SecurityPolicy__Group__3__Impl rule__SecurityPolicy__Group__4
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__3__Impl_in_rule__SecurityPolicy__Group__36012);
            rule__SecurityPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__4_in_rule__SecurityPolicy__Group__36015);
            rule__SecurityPolicy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__3"


    // $ANTLR start "rule__SecurityPolicy__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2988:1: rule__SecurityPolicy__Group__3__Impl : ( ( rule__SecurityPolicy__EndPointAssignment_3 ) ) ;
    public final void rule__SecurityPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2992:1: ( ( ( rule__SecurityPolicy__EndPointAssignment_3 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2993:1: ( ( rule__SecurityPolicy__EndPointAssignment_3 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2993:1: ( ( rule__SecurityPolicy__EndPointAssignment_3 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2994:1: ( rule__SecurityPolicy__EndPointAssignment_3 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getEndPointAssignment_3()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2995:1: ( rule__SecurityPolicy__EndPointAssignment_3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:2995:2: rule__SecurityPolicy__EndPointAssignment_3
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__EndPointAssignment_3_in_rule__SecurityPolicy__Group__3__Impl6042);
            rule__SecurityPolicy__EndPointAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getEndPointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__3__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3005:1: rule__SecurityPolicy__Group__4 : rule__SecurityPolicy__Group__4__Impl rule__SecurityPolicy__Group__5 ;
    public final void rule__SecurityPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3009:1: ( rule__SecurityPolicy__Group__4__Impl rule__SecurityPolicy__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3010:2: rule__SecurityPolicy__Group__4__Impl rule__SecurityPolicy__Group__5
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__4__Impl_in_rule__SecurityPolicy__Group__46072);
            rule__SecurityPolicy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__5_in_rule__SecurityPolicy__Group__46075);
            rule__SecurityPolicy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__4"


    // $ANTLR start "rule__SecurityPolicy__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3017:1: rule__SecurityPolicy__Group__4__Impl : ( 'if' ) ;
    public final void rule__SecurityPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3021:1: ( ( 'if' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3022:1: ( 'if' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3022:1: ( 'if' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3023:1: 'if'
            {
             before(grammarAccess.getSecurityPolicyAccess().getIfKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__SecurityPolicy__Group__4__Impl6103); 
             after(grammarAccess.getSecurityPolicyAccess().getIfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__4__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3036:1: rule__SecurityPolicy__Group__5 : rule__SecurityPolicy__Group__5__Impl rule__SecurityPolicy__Group__6 ;
    public final void rule__SecurityPolicy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3040:1: ( rule__SecurityPolicy__Group__5__Impl rule__SecurityPolicy__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3041:2: rule__SecurityPolicy__Group__5__Impl rule__SecurityPolicy__Group__6
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__5__Impl_in_rule__SecurityPolicy__Group__56134);
            rule__SecurityPolicy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__6_in_rule__SecurityPolicy__Group__56137);
            rule__SecurityPolicy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__5"


    // $ANTLR start "rule__SecurityPolicy__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3048:1: rule__SecurityPolicy__Group__5__Impl : ( '(' ) ;
    public final void rule__SecurityPolicy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3052:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3053:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3053:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3054:1: '('
            {
             before(grammarAccess.getSecurityPolicyAccess().getLeftParenthesisKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__SecurityPolicy__Group__5__Impl6165); 
             after(grammarAccess.getSecurityPolicyAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__5__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3067:1: rule__SecurityPolicy__Group__6 : rule__SecurityPolicy__Group__6__Impl rule__SecurityPolicy__Group__7 ;
    public final void rule__SecurityPolicy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3071:1: ( rule__SecurityPolicy__Group__6__Impl rule__SecurityPolicy__Group__7 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3072:2: rule__SecurityPolicy__Group__6__Impl rule__SecurityPolicy__Group__7
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__6__Impl_in_rule__SecurityPolicy__Group__66196);
            rule__SecurityPolicy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__7_in_rule__SecurityPolicy__Group__66199);
            rule__SecurityPolicy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__6"


    // $ANTLR start "rule__SecurityPolicy__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3079:1: rule__SecurityPolicy__Group__6__Impl : ( ( rule__SecurityPolicy__ConditionlistAssignment_6 ) ) ;
    public final void rule__SecurityPolicy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3083:1: ( ( ( rule__SecurityPolicy__ConditionlistAssignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3084:1: ( ( rule__SecurityPolicy__ConditionlistAssignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3084:1: ( ( rule__SecurityPolicy__ConditionlistAssignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3085:1: ( rule__SecurityPolicy__ConditionlistAssignment_6 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3086:1: ( rule__SecurityPolicy__ConditionlistAssignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3086:2: rule__SecurityPolicy__ConditionlistAssignment_6
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__ConditionlistAssignment_6_in_rule__SecurityPolicy__Group__6__Impl6226);
            rule__SecurityPolicy__ConditionlistAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__6__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3096:1: rule__SecurityPolicy__Group__7 : rule__SecurityPolicy__Group__7__Impl rule__SecurityPolicy__Group__8 ;
    public final void rule__SecurityPolicy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3100:1: ( rule__SecurityPolicy__Group__7__Impl rule__SecurityPolicy__Group__8 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3101:2: rule__SecurityPolicy__Group__7__Impl rule__SecurityPolicy__Group__8
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__7__Impl_in_rule__SecurityPolicy__Group__76256);
            rule__SecurityPolicy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__8_in_rule__SecurityPolicy__Group__76259);
            rule__SecurityPolicy__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__7"


    // $ANTLR start "rule__SecurityPolicy__Group__7__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3108:1: rule__SecurityPolicy__Group__7__Impl : ( ( rule__SecurityPolicy__Group_7__0 )* ) ;
    public final void rule__SecurityPolicy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3112:1: ( ( ( rule__SecurityPolicy__Group_7__0 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3113:1: ( ( rule__SecurityPolicy__Group_7__0 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3113:1: ( ( rule__SecurityPolicy__Group_7__0 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3114:1: ( rule__SecurityPolicy__Group_7__0 )*
            {
             before(grammarAccess.getSecurityPolicyAccess().getGroup_7()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3115:1: ( rule__SecurityPolicy__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3115:2: rule__SecurityPolicy__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityPolicy__Group_7__0_in_rule__SecurityPolicy__Group__7__Impl6286);
            	    rule__SecurityPolicy__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSecurityPolicyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__7__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3125:1: rule__SecurityPolicy__Group__8 : rule__SecurityPolicy__Group__8__Impl rule__SecurityPolicy__Group__9 ;
    public final void rule__SecurityPolicy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3129:1: ( rule__SecurityPolicy__Group__8__Impl rule__SecurityPolicy__Group__9 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3130:2: rule__SecurityPolicy__Group__8__Impl rule__SecurityPolicy__Group__9
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__8__Impl_in_rule__SecurityPolicy__Group__86317);
            rule__SecurityPolicy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__9_in_rule__SecurityPolicy__Group__86320);
            rule__SecurityPolicy__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__8"


    // $ANTLR start "rule__SecurityPolicy__Group__8__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3137:1: rule__SecurityPolicy__Group__8__Impl : ( ')' ) ;
    public final void rule__SecurityPolicy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3141:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3142:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3142:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3143:1: ')'
            {
             before(grammarAccess.getSecurityPolicyAccess().getRightParenthesisKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__SecurityPolicy__Group__8__Impl6348); 
             after(grammarAccess.getSecurityPolicyAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__8__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__9"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3156:1: rule__SecurityPolicy__Group__9 : rule__SecurityPolicy__Group__9__Impl rule__SecurityPolicy__Group__10 ;
    public final void rule__SecurityPolicy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3160:1: ( rule__SecurityPolicy__Group__9__Impl rule__SecurityPolicy__Group__10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3161:2: rule__SecurityPolicy__Group__9__Impl rule__SecurityPolicy__Group__10
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__9__Impl_in_rule__SecurityPolicy__Group__96379);
            rule__SecurityPolicy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__10_in_rule__SecurityPolicy__Group__96382);
            rule__SecurityPolicy__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__9"


    // $ANTLR start "rule__SecurityPolicy__Group__9__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3168:1: rule__SecurityPolicy__Group__9__Impl : ( 'then' ) ;
    public final void rule__SecurityPolicy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3172:1: ( ( 'then' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3173:1: ( 'then' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3173:1: ( 'then' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3174:1: 'then'
            {
             before(grammarAccess.getSecurityPolicyAccess().getThenKeyword_9()); 
            match(input,37,FOLLOW_37_in_rule__SecurityPolicy__Group__9__Impl6410); 
             after(grammarAccess.getSecurityPolicyAccess().getThenKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__9__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3187:1: rule__SecurityPolicy__Group__10 : rule__SecurityPolicy__Group__10__Impl rule__SecurityPolicy__Group__11 ;
    public final void rule__SecurityPolicy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3191:1: ( rule__SecurityPolicy__Group__10__Impl rule__SecurityPolicy__Group__11 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3192:2: rule__SecurityPolicy__Group__10__Impl rule__SecurityPolicy__Group__11
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__10__Impl_in_rule__SecurityPolicy__Group__106441);
            rule__SecurityPolicy__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__11_in_rule__SecurityPolicy__Group__106444);
            rule__SecurityPolicy__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__10"


    // $ANTLR start "rule__SecurityPolicy__Group__10__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3199:1: rule__SecurityPolicy__Group__10__Impl : ( ( rule__SecurityPolicy__TrueActionListAssignment_10 ) ) ;
    public final void rule__SecurityPolicy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3203:1: ( ( ( rule__SecurityPolicy__TrueActionListAssignment_10 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3204:1: ( ( rule__SecurityPolicy__TrueActionListAssignment_10 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3204:1: ( ( rule__SecurityPolicy__TrueActionListAssignment_10 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3205:1: ( rule__SecurityPolicy__TrueActionListAssignment_10 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_10()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3206:1: ( rule__SecurityPolicy__TrueActionListAssignment_10 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3206:2: rule__SecurityPolicy__TrueActionListAssignment_10
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__TrueActionListAssignment_10_in_rule__SecurityPolicy__Group__10__Impl6471);
            rule__SecurityPolicy__TrueActionListAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__10__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__11"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3216:1: rule__SecurityPolicy__Group__11 : rule__SecurityPolicy__Group__11__Impl rule__SecurityPolicy__Group__12 ;
    public final void rule__SecurityPolicy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3220:1: ( rule__SecurityPolicy__Group__11__Impl rule__SecurityPolicy__Group__12 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3221:2: rule__SecurityPolicy__Group__11__Impl rule__SecurityPolicy__Group__12
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__11__Impl_in_rule__SecurityPolicy__Group__116501);
            rule__SecurityPolicy__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__12_in_rule__SecurityPolicy__Group__116504);
            rule__SecurityPolicy__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__11"


    // $ANTLR start "rule__SecurityPolicy__Group__11__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3228:1: rule__SecurityPolicy__Group__11__Impl : ( ( rule__SecurityPolicy__Group_11__0 )* ) ;
    public final void rule__SecurityPolicy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3232:1: ( ( ( rule__SecurityPolicy__Group_11__0 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3233:1: ( ( rule__SecurityPolicy__Group_11__0 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3233:1: ( ( rule__SecurityPolicy__Group_11__0 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3234:1: ( rule__SecurityPolicy__Group_11__0 )*
            {
             before(grammarAccess.getSecurityPolicyAccess().getGroup_11()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3235:1: ( rule__SecurityPolicy__Group_11__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==11) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3235:2: rule__SecurityPolicy__Group_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityPolicy__Group_11__0_in_rule__SecurityPolicy__Group__11__Impl6531);
            	    rule__SecurityPolicy__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSecurityPolicyAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__11__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__12"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3245:1: rule__SecurityPolicy__Group__12 : rule__SecurityPolicy__Group__12__Impl rule__SecurityPolicy__Group__13 ;
    public final void rule__SecurityPolicy__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3249:1: ( rule__SecurityPolicy__Group__12__Impl rule__SecurityPolicy__Group__13 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3250:2: rule__SecurityPolicy__Group__12__Impl rule__SecurityPolicy__Group__13
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__12__Impl_in_rule__SecurityPolicy__Group__126562);
            rule__SecurityPolicy__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__13_in_rule__SecurityPolicy__Group__126565);
            rule__SecurityPolicy__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__12"


    // $ANTLR start "rule__SecurityPolicy__Group__12__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3257:1: rule__SecurityPolicy__Group__12__Impl : ( 'otherwise' ) ;
    public final void rule__SecurityPolicy__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3261:1: ( ( 'otherwise' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3262:1: ( 'otherwise' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3262:1: ( 'otherwise' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3263:1: 'otherwise'
            {
             before(grammarAccess.getSecurityPolicyAccess().getOtherwiseKeyword_12()); 
            match(input,38,FOLLOW_38_in_rule__SecurityPolicy__Group__12__Impl6593); 
             after(grammarAccess.getSecurityPolicyAccess().getOtherwiseKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__12__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__13"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3276:1: rule__SecurityPolicy__Group__13 : rule__SecurityPolicy__Group__13__Impl rule__SecurityPolicy__Group__14 ;
    public final void rule__SecurityPolicy__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3280:1: ( rule__SecurityPolicy__Group__13__Impl rule__SecurityPolicy__Group__14 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3281:2: rule__SecurityPolicy__Group__13__Impl rule__SecurityPolicy__Group__14
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__13__Impl_in_rule__SecurityPolicy__Group__136624);
            rule__SecurityPolicy__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__14_in_rule__SecurityPolicy__Group__136627);
            rule__SecurityPolicy__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__13"


    // $ANTLR start "rule__SecurityPolicy__Group__13__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3288:1: rule__SecurityPolicy__Group__13__Impl : ( ( rule__SecurityPolicy__FalseActionListAssignment_13 ) ) ;
    public final void rule__SecurityPolicy__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3292:1: ( ( ( rule__SecurityPolicy__FalseActionListAssignment_13 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3293:1: ( ( rule__SecurityPolicy__FalseActionListAssignment_13 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3293:1: ( ( rule__SecurityPolicy__FalseActionListAssignment_13 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3294:1: ( rule__SecurityPolicy__FalseActionListAssignment_13 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_13()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3295:1: ( rule__SecurityPolicy__FalseActionListAssignment_13 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3295:2: rule__SecurityPolicy__FalseActionListAssignment_13
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__FalseActionListAssignment_13_in_rule__SecurityPolicy__Group__13__Impl6654);
            rule__SecurityPolicy__FalseActionListAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__13__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__14"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3305:1: rule__SecurityPolicy__Group__14 : rule__SecurityPolicy__Group__14__Impl rule__SecurityPolicy__Group__15 ;
    public final void rule__SecurityPolicy__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3309:1: ( rule__SecurityPolicy__Group__14__Impl rule__SecurityPolicy__Group__15 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3310:2: rule__SecurityPolicy__Group__14__Impl rule__SecurityPolicy__Group__15
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__14__Impl_in_rule__SecurityPolicy__Group__146684);
            rule__SecurityPolicy__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group__15_in_rule__SecurityPolicy__Group__146687);
            rule__SecurityPolicy__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__14"


    // $ANTLR start "rule__SecurityPolicy__Group__14__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3317:1: rule__SecurityPolicy__Group__14__Impl : ( ( rule__SecurityPolicy__Group_14__0 )* ) ;
    public final void rule__SecurityPolicy__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3321:1: ( ( ( rule__SecurityPolicy__Group_14__0 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3322:1: ( ( rule__SecurityPolicy__Group_14__0 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3322:1: ( ( rule__SecurityPolicy__Group_14__0 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3323:1: ( rule__SecurityPolicy__Group_14__0 )*
            {
             before(grammarAccess.getSecurityPolicyAccess().getGroup_14()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3324:1: ( rule__SecurityPolicy__Group_14__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3324:2: rule__SecurityPolicy__Group_14__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityPolicy__Group_14__0_in_rule__SecurityPolicy__Group__14__Impl6714);
            	    rule__SecurityPolicy__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSecurityPolicyAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__14__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group__15"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3334:1: rule__SecurityPolicy__Group__15 : rule__SecurityPolicy__Group__15__Impl ;
    public final void rule__SecurityPolicy__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3338:1: ( rule__SecurityPolicy__Group__15__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3339:2: rule__SecurityPolicy__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group__15__Impl_in_rule__SecurityPolicy__Group__156745);
            rule__SecurityPolicy__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__15"


    // $ANTLR start "rule__SecurityPolicy__Group__15__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3345:1: rule__SecurityPolicy__Group__15__Impl : ( '}' ) ;
    public final void rule__SecurityPolicy__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3349:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3350:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3350:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3351:1: '}'
            {
             before(grammarAccess.getSecurityPolicyAccess().getRightCurlyBracketKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__SecurityPolicy__Group__15__Impl6773); 
             after(grammarAccess.getSecurityPolicyAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group__15__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_7__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3396:1: rule__SecurityPolicy__Group_7__0 : rule__SecurityPolicy__Group_7__0__Impl rule__SecurityPolicy__Group_7__1 ;
    public final void rule__SecurityPolicy__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3400:1: ( rule__SecurityPolicy__Group_7__0__Impl rule__SecurityPolicy__Group_7__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3401:2: rule__SecurityPolicy__Group_7__0__Impl rule__SecurityPolicy__Group_7__1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_7__0__Impl_in_rule__SecurityPolicy__Group_7__06836);
            rule__SecurityPolicy__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group_7__1_in_rule__SecurityPolicy__Group_7__06839);
            rule__SecurityPolicy__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_7__0"


    // $ANTLR start "rule__SecurityPolicy__Group_7__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3408:1: rule__SecurityPolicy__Group_7__0__Impl : ( ( rule__SecurityPolicy__OperationListAssignment_7_0 ) ) ;
    public final void rule__SecurityPolicy__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3412:1: ( ( ( rule__SecurityPolicy__OperationListAssignment_7_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3413:1: ( ( rule__SecurityPolicy__OperationListAssignment_7_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3413:1: ( ( rule__SecurityPolicy__OperationListAssignment_7_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3414:1: ( rule__SecurityPolicy__OperationListAssignment_7_0 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getOperationListAssignment_7_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3415:1: ( rule__SecurityPolicy__OperationListAssignment_7_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3415:2: rule__SecurityPolicy__OperationListAssignment_7_0
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__OperationListAssignment_7_0_in_rule__SecurityPolicy__Group_7__0__Impl6866);
            rule__SecurityPolicy__OperationListAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getOperationListAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_7__0__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_7__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3425:1: rule__SecurityPolicy__Group_7__1 : rule__SecurityPolicy__Group_7__1__Impl ;
    public final void rule__SecurityPolicy__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3429:1: ( rule__SecurityPolicy__Group_7__1__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3430:2: rule__SecurityPolicy__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_7__1__Impl_in_rule__SecurityPolicy__Group_7__16896);
            rule__SecurityPolicy__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_7__1"


    // $ANTLR start "rule__SecurityPolicy__Group_7__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3436:1: rule__SecurityPolicy__Group_7__1__Impl : ( ( rule__SecurityPolicy__ConditionlistAssignment_7_1 ) ) ;
    public final void rule__SecurityPolicy__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3440:1: ( ( ( rule__SecurityPolicy__ConditionlistAssignment_7_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3441:1: ( ( rule__SecurityPolicy__ConditionlistAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3441:1: ( ( rule__SecurityPolicy__ConditionlistAssignment_7_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3442:1: ( rule__SecurityPolicy__ConditionlistAssignment_7_1 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_7_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3443:1: ( rule__SecurityPolicy__ConditionlistAssignment_7_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3443:2: rule__SecurityPolicy__ConditionlistAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__ConditionlistAssignment_7_1_in_rule__SecurityPolicy__Group_7__1__Impl6923);
            rule__SecurityPolicy__ConditionlistAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_7__1__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_11__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3457:1: rule__SecurityPolicy__Group_11__0 : rule__SecurityPolicy__Group_11__0__Impl rule__SecurityPolicy__Group_11__1 ;
    public final void rule__SecurityPolicy__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3461:1: ( rule__SecurityPolicy__Group_11__0__Impl rule__SecurityPolicy__Group_11__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3462:2: rule__SecurityPolicy__Group_11__0__Impl rule__SecurityPolicy__Group_11__1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_11__0__Impl_in_rule__SecurityPolicy__Group_11__06957);
            rule__SecurityPolicy__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group_11__1_in_rule__SecurityPolicy__Group_11__06960);
            rule__SecurityPolicy__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_11__0"


    // $ANTLR start "rule__SecurityPolicy__Group_11__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3469:1: rule__SecurityPolicy__Group_11__0__Impl : ( '&' ) ;
    public final void rule__SecurityPolicy__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3473:1: ( ( '&' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3474:1: ( '&' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3474:1: ( '&' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3475:1: '&'
            {
             before(grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_11_0()); 
            match(input,11,FOLLOW_11_in_rule__SecurityPolicy__Group_11__0__Impl6988); 
             after(grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_11__0__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_11__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3488:1: rule__SecurityPolicy__Group_11__1 : rule__SecurityPolicy__Group_11__1__Impl ;
    public final void rule__SecurityPolicy__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3492:1: ( rule__SecurityPolicy__Group_11__1__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3493:2: rule__SecurityPolicy__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_11__1__Impl_in_rule__SecurityPolicy__Group_11__17019);
            rule__SecurityPolicy__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_11__1"


    // $ANTLR start "rule__SecurityPolicy__Group_11__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3499:1: rule__SecurityPolicy__Group_11__1__Impl : ( ( rule__SecurityPolicy__TrueActionListAssignment_11_1 ) ) ;
    public final void rule__SecurityPolicy__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3503:1: ( ( ( rule__SecurityPolicy__TrueActionListAssignment_11_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3504:1: ( ( rule__SecurityPolicy__TrueActionListAssignment_11_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3504:1: ( ( rule__SecurityPolicy__TrueActionListAssignment_11_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3505:1: ( rule__SecurityPolicy__TrueActionListAssignment_11_1 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_11_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3506:1: ( rule__SecurityPolicy__TrueActionListAssignment_11_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3506:2: rule__SecurityPolicy__TrueActionListAssignment_11_1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__TrueActionListAssignment_11_1_in_rule__SecurityPolicy__Group_11__1__Impl7046);
            rule__SecurityPolicy__TrueActionListAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_11__1__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_14__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3520:1: rule__SecurityPolicy__Group_14__0 : rule__SecurityPolicy__Group_14__0__Impl rule__SecurityPolicy__Group_14__1 ;
    public final void rule__SecurityPolicy__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3524:1: ( rule__SecurityPolicy__Group_14__0__Impl rule__SecurityPolicy__Group_14__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3525:2: rule__SecurityPolicy__Group_14__0__Impl rule__SecurityPolicy__Group_14__1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_14__0__Impl_in_rule__SecurityPolicy__Group_14__07080);
            rule__SecurityPolicy__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityPolicy__Group_14__1_in_rule__SecurityPolicy__Group_14__07083);
            rule__SecurityPolicy__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_14__0"


    // $ANTLR start "rule__SecurityPolicy__Group_14__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3532:1: rule__SecurityPolicy__Group_14__0__Impl : ( '&' ) ;
    public final void rule__SecurityPolicy__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3536:1: ( ( '&' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3537:1: ( '&' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3537:1: ( '&' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3538:1: '&'
            {
             before(grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_14_0()); 
            match(input,11,FOLLOW_11_in_rule__SecurityPolicy__Group_14__0__Impl7111); 
             after(grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_14__0__Impl"


    // $ANTLR start "rule__SecurityPolicy__Group_14__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3551:1: rule__SecurityPolicy__Group_14__1 : rule__SecurityPolicy__Group_14__1__Impl ;
    public final void rule__SecurityPolicy__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3555:1: ( rule__SecurityPolicy__Group_14__1__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3556:2: rule__SecurityPolicy__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__Group_14__1__Impl_in_rule__SecurityPolicy__Group_14__17142);
            rule__SecurityPolicy__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_14__1"


    // $ANTLR start "rule__SecurityPolicy__Group_14__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3562:1: rule__SecurityPolicy__Group_14__1__Impl : ( ( rule__SecurityPolicy__FalseActionListAssignment_14_1 ) ) ;
    public final void rule__SecurityPolicy__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3566:1: ( ( ( rule__SecurityPolicy__FalseActionListAssignment_14_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3567:1: ( ( rule__SecurityPolicy__FalseActionListAssignment_14_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3567:1: ( ( rule__SecurityPolicy__FalseActionListAssignment_14_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3568:1: ( rule__SecurityPolicy__FalseActionListAssignment_14_1 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_14_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3569:1: ( rule__SecurityPolicy__FalseActionListAssignment_14_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3569:2: rule__SecurityPolicy__FalseActionListAssignment_14_1
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__FalseActionListAssignment_14_1_in_rule__SecurityPolicy__Group_14__1__Impl7169);
            rule__SecurityPolicy__FalseActionListAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__Group_14__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3583:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3587:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3588:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07203);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07206);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3595:1: rule__Condition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3599:1: ( ( 'Condition' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3600:1: ( 'Condition' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3600:1: ( 'Condition' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3601:1: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Condition__Group__0__Impl7234); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3614:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3618:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3619:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__17265);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__17268);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3626:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3630:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3631:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3631:1: ( ( rule__Condition__NameAssignment_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3632:1: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3633:1: ( rule__Condition__NameAssignment_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3633:2: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__NameAssignment_1_in_rule__Condition__Group__1__Impl7295);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3643:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3647:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3648:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__27325);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__27328);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3655:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3659:1: ( ( '{' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3660:1: ( '{' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3660:1: ( '{' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3661:1: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Condition__Group__2__Impl7356); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3674:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3678:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3679:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__37387);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__4_in_rule__Condition__Group__37390);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3686:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__SubConditionListAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3690:1: ( ( ( rule__Condition__SubConditionListAssignment_3 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3691:1: ( ( rule__Condition__SubConditionListAssignment_3 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3691:1: ( ( rule__Condition__SubConditionListAssignment_3 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3692:1: ( rule__Condition__SubConditionListAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getSubConditionListAssignment_3()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3693:1: ( rule__Condition__SubConditionListAssignment_3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3693:2: rule__Condition__SubConditionListAssignment_3
            {
            pushFollow(FOLLOW_rule__Condition__SubConditionListAssignment_3_in_rule__Condition__Group__3__Impl7417);
            rule__Condition__SubConditionListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSubConditionListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3703:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3707:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3708:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_rule__Condition__Group__4__Impl_in_rule__Condition__Group__47447);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__5_in_rule__Condition__Group__47450);
            rule__Condition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3715:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__Group_4__0 )* ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3719:1: ( ( ( rule__Condition__Group_4__0 )* ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3720:1: ( ( rule__Condition__Group_4__0 )* )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3720:1: ( ( rule__Condition__Group_4__0 )* )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3721:1: ( rule__Condition__Group_4__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3722:1: ( rule__Condition__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3722:2: rule__Condition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Condition__Group_4__0_in_rule__Condition__Group__4__Impl7477);
            	    rule__Condition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3732:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3736:1: ( rule__Condition__Group__5__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3737:2: rule__Condition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__5__Impl_in_rule__Condition__Group__57508);
            rule__Condition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3743:1: rule__Condition__Group__5__Impl : ( '}' ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3747:1: ( ( '}' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3748:1: ( '}' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3748:1: ( '}' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3749:1: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Condition__Group__5__Impl7536); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group_4__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3774:1: rule__Condition__Group_4__0 : rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 ;
    public final void rule__Condition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3778:1: ( rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3779:2: rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_4__0__Impl_in_rule__Condition__Group_4__07579);
            rule__Condition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_4__1_in_rule__Condition__Group_4__07582);
            rule__Condition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__0"


    // $ANTLR start "rule__Condition__Group_4__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3786:1: rule__Condition__Group_4__0__Impl : ( '&' ) ;
    public final void rule__Condition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3790:1: ( ( '&' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3791:1: ( '&' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3791:1: ( '&' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3792:1: '&'
            {
             before(grammarAccess.getConditionAccess().getAmpersandKeyword_4_0()); 
            match(input,11,FOLLOW_11_in_rule__Condition__Group_4__0__Impl7610); 
             after(grammarAccess.getConditionAccess().getAmpersandKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__0__Impl"


    // $ANTLR start "rule__Condition__Group_4__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3805:1: rule__Condition__Group_4__1 : rule__Condition__Group_4__1__Impl ;
    public final void rule__Condition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3809:1: ( rule__Condition__Group_4__1__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3810:2: rule__Condition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_4__1__Impl_in_rule__Condition__Group_4__17641);
            rule__Condition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__1"


    // $ANTLR start "rule__Condition__Group_4__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3816:1: rule__Condition__Group_4__1__Impl : ( ( rule__Condition__SubConditionListAssignment_4_1 ) ) ;
    public final void rule__Condition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3820:1: ( ( ( rule__Condition__SubConditionListAssignment_4_1 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3821:1: ( ( rule__Condition__SubConditionListAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3821:1: ( ( rule__Condition__SubConditionListAssignment_4_1 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3822:1: ( rule__Condition__SubConditionListAssignment_4_1 )
            {
             before(grammarAccess.getConditionAccess().getSubConditionListAssignment_4_1()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3823:1: ( rule__Condition__SubConditionListAssignment_4_1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3823:2: rule__Condition__SubConditionListAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Condition__SubConditionListAssignment_4_1_in_rule__Condition__Group_4__1__Impl7668);
            rule__Condition__SubConditionListAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSubConditionListAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__1__Impl"


    // $ANTLR start "rule__ProtocolCheck__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3837:1: rule__ProtocolCheck__Group__0 : rule__ProtocolCheck__Group__0__Impl rule__ProtocolCheck__Group__1 ;
    public final void rule__ProtocolCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3841:1: ( rule__ProtocolCheck__Group__0__Impl rule__ProtocolCheck__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3842:2: rule__ProtocolCheck__Group__0__Impl rule__ProtocolCheck__Group__1
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__Group__0__Impl_in_rule__ProtocolCheck__Group__07702);
            rule__ProtocolCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProtocolCheck__Group__1_in_rule__ProtocolCheck__Group__07705);
            rule__ProtocolCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__0"


    // $ANTLR start "rule__ProtocolCheck__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3849:1: rule__ProtocolCheck__Group__0__Impl : ( ( rule__ProtocolCheck__NameAssignment_0 ) ) ;
    public final void rule__ProtocolCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3853:1: ( ( ( rule__ProtocolCheck__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3854:1: ( ( rule__ProtocolCheck__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3854:1: ( ( rule__ProtocolCheck__NameAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3855:1: ( rule__ProtocolCheck__NameAssignment_0 )
            {
             before(grammarAccess.getProtocolCheckAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3856:1: ( rule__ProtocolCheck__NameAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3856:2: rule__ProtocolCheck__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__NameAssignment_0_in_rule__ProtocolCheck__Group__0__Impl7732);
            rule__ProtocolCheck__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolCheckAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__0__Impl"


    // $ANTLR start "rule__ProtocolCheck__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3866:1: rule__ProtocolCheck__Group__1 : rule__ProtocolCheck__Group__1__Impl rule__ProtocolCheck__Group__2 ;
    public final void rule__ProtocolCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3870:1: ( rule__ProtocolCheck__Group__1__Impl rule__ProtocolCheck__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3871:2: rule__ProtocolCheck__Group__1__Impl rule__ProtocolCheck__Group__2
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__Group__1__Impl_in_rule__ProtocolCheck__Group__17762);
            rule__ProtocolCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProtocolCheck__Group__2_in_rule__ProtocolCheck__Group__17765);
            rule__ProtocolCheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__1"


    // $ANTLR start "rule__ProtocolCheck__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3878:1: rule__ProtocolCheck__Group__1__Impl : ( '(' ) ;
    public final void rule__ProtocolCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3882:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3883:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3883:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3884:1: '('
            {
             before(grammarAccess.getProtocolCheckAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__ProtocolCheck__Group__1__Impl7793); 
             after(grammarAccess.getProtocolCheckAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__1__Impl"


    // $ANTLR start "rule__ProtocolCheck__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3897:1: rule__ProtocolCheck__Group__2 : rule__ProtocolCheck__Group__2__Impl rule__ProtocolCheck__Group__3 ;
    public final void rule__ProtocolCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3901:1: ( rule__ProtocolCheck__Group__2__Impl rule__ProtocolCheck__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3902:2: rule__ProtocolCheck__Group__2__Impl rule__ProtocolCheck__Group__3
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__Group__2__Impl_in_rule__ProtocolCheck__Group__27824);
            rule__ProtocolCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProtocolCheck__Group__3_in_rule__ProtocolCheck__Group__27827);
            rule__ProtocolCheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__2"


    // $ANTLR start "rule__ProtocolCheck__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3909:1: rule__ProtocolCheck__Group__2__Impl : ( ( rule__ProtocolCheck__ValueAssignment_2 ) ) ;
    public final void rule__ProtocolCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3913:1: ( ( ( rule__ProtocolCheck__ValueAssignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3914:1: ( ( rule__ProtocolCheck__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3914:1: ( ( rule__ProtocolCheck__ValueAssignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3915:1: ( rule__ProtocolCheck__ValueAssignment_2 )
            {
             before(grammarAccess.getProtocolCheckAccess().getValueAssignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3916:1: ( rule__ProtocolCheck__ValueAssignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3916:2: rule__ProtocolCheck__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__ValueAssignment_2_in_rule__ProtocolCheck__Group__2__Impl7854);
            rule__ProtocolCheck__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProtocolCheckAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__2__Impl"


    // $ANTLR start "rule__ProtocolCheck__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3926:1: rule__ProtocolCheck__Group__3 : rule__ProtocolCheck__Group__3__Impl ;
    public final void rule__ProtocolCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3930:1: ( rule__ProtocolCheck__Group__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3931:2: rule__ProtocolCheck__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProtocolCheck__Group__3__Impl_in_rule__ProtocolCheck__Group__37884);
            rule__ProtocolCheck__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__3"


    // $ANTLR start "rule__ProtocolCheck__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3937:1: rule__ProtocolCheck__Group__3__Impl : ( ')' ) ;
    public final void rule__ProtocolCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3941:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3942:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3942:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3943:1: ')'
            {
             before(grammarAccess.getProtocolCheckAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__ProtocolCheck__Group__3__Impl7912); 
             after(grammarAccess.getProtocolCheckAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__Group__3__Impl"


    // $ANTLR start "rule__HTTPMethodCheck__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3964:1: rule__HTTPMethodCheck__Group__0 : rule__HTTPMethodCheck__Group__0__Impl rule__HTTPMethodCheck__Group__1 ;
    public final void rule__HTTPMethodCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3968:1: ( rule__HTTPMethodCheck__Group__0__Impl rule__HTTPMethodCheck__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3969:2: rule__HTTPMethodCheck__Group__0__Impl rule__HTTPMethodCheck__Group__1
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__0__Impl_in_rule__HTTPMethodCheck__Group__07951);
            rule__HTTPMethodCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__1_in_rule__HTTPMethodCheck__Group__07954);
            rule__HTTPMethodCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__0"


    // $ANTLR start "rule__HTTPMethodCheck__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3976:1: rule__HTTPMethodCheck__Group__0__Impl : ( ( rule__HTTPMethodCheck__NameAssignment_0 ) ) ;
    public final void rule__HTTPMethodCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3980:1: ( ( ( rule__HTTPMethodCheck__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3981:1: ( ( rule__HTTPMethodCheck__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3981:1: ( ( rule__HTTPMethodCheck__NameAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3982:1: ( rule__HTTPMethodCheck__NameAssignment_0 )
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3983:1: ( rule__HTTPMethodCheck__NameAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3983:2: rule__HTTPMethodCheck__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__NameAssignment_0_in_rule__HTTPMethodCheck__Group__0__Impl7981);
            rule__HTTPMethodCheck__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPMethodCheckAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__0__Impl"


    // $ANTLR start "rule__HTTPMethodCheck__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3993:1: rule__HTTPMethodCheck__Group__1 : rule__HTTPMethodCheck__Group__1__Impl rule__HTTPMethodCheck__Group__2 ;
    public final void rule__HTTPMethodCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3997:1: ( rule__HTTPMethodCheck__Group__1__Impl rule__HTTPMethodCheck__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:3998:2: rule__HTTPMethodCheck__Group__1__Impl rule__HTTPMethodCheck__Group__2
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__1__Impl_in_rule__HTTPMethodCheck__Group__18011);
            rule__HTTPMethodCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__2_in_rule__HTTPMethodCheck__Group__18014);
            rule__HTTPMethodCheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__1"


    // $ANTLR start "rule__HTTPMethodCheck__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4005:1: rule__HTTPMethodCheck__Group__1__Impl : ( '(' ) ;
    public final void rule__HTTPMethodCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4009:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4010:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4010:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4011:1: '('
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__HTTPMethodCheck__Group__1__Impl8042); 
             after(grammarAccess.getHTTPMethodCheckAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__1__Impl"


    // $ANTLR start "rule__HTTPMethodCheck__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4024:1: rule__HTTPMethodCheck__Group__2 : rule__HTTPMethodCheck__Group__2__Impl rule__HTTPMethodCheck__Group__3 ;
    public final void rule__HTTPMethodCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4028:1: ( rule__HTTPMethodCheck__Group__2__Impl rule__HTTPMethodCheck__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4029:2: rule__HTTPMethodCheck__Group__2__Impl rule__HTTPMethodCheck__Group__3
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__2__Impl_in_rule__HTTPMethodCheck__Group__28073);
            rule__HTTPMethodCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__3_in_rule__HTTPMethodCheck__Group__28076);
            rule__HTTPMethodCheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__2"


    // $ANTLR start "rule__HTTPMethodCheck__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4036:1: rule__HTTPMethodCheck__Group__2__Impl : ( ( rule__HTTPMethodCheck__ValueAssignment_2 ) ) ;
    public final void rule__HTTPMethodCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4040:1: ( ( ( rule__HTTPMethodCheck__ValueAssignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4041:1: ( ( rule__HTTPMethodCheck__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4041:1: ( ( rule__HTTPMethodCheck__ValueAssignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4042:1: ( rule__HTTPMethodCheck__ValueAssignment_2 )
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getValueAssignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4043:1: ( rule__HTTPMethodCheck__ValueAssignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4043:2: rule__HTTPMethodCheck__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__ValueAssignment_2_in_rule__HTTPMethodCheck__Group__2__Impl8103);
            rule__HTTPMethodCheck__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHTTPMethodCheckAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__2__Impl"


    // $ANTLR start "rule__HTTPMethodCheck__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4053:1: rule__HTTPMethodCheck__Group__3 : rule__HTTPMethodCheck__Group__3__Impl ;
    public final void rule__HTTPMethodCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4057:1: ( rule__HTTPMethodCheck__Group__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4058:2: rule__HTTPMethodCheck__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__Group__3__Impl_in_rule__HTTPMethodCheck__Group__38133);
            rule__HTTPMethodCheck__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__3"


    // $ANTLR start "rule__HTTPMethodCheck__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4064:1: rule__HTTPMethodCheck__Group__3__Impl : ( ')' ) ;
    public final void rule__HTTPMethodCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4068:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4069:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4069:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4070:1: ')'
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__HTTPMethodCheck__Group__3__Impl8161); 
             after(grammarAccess.getHTTPMethodCheckAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__Group__3__Impl"


    // $ANTLR start "rule__RegExpMatch__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4091:1: rule__RegExpMatch__Group__0 : rule__RegExpMatch__Group__0__Impl rule__RegExpMatch__Group__1 ;
    public final void rule__RegExpMatch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4095:1: ( rule__RegExpMatch__Group__0__Impl rule__RegExpMatch__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4096:2: rule__RegExpMatch__Group__0__Impl rule__RegExpMatch__Group__1
            {
            pushFollow(FOLLOW_rule__RegExpMatch__Group__0__Impl_in_rule__RegExpMatch__Group__08200);
            rule__RegExpMatch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RegExpMatch__Group__1_in_rule__RegExpMatch__Group__08203);
            rule__RegExpMatch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__0"


    // $ANTLR start "rule__RegExpMatch__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4103:1: rule__RegExpMatch__Group__0__Impl : ( ( rule__RegExpMatch__NameAssignment_0 ) ) ;
    public final void rule__RegExpMatch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4107:1: ( ( ( rule__RegExpMatch__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4108:1: ( ( rule__RegExpMatch__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4108:1: ( ( rule__RegExpMatch__NameAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4109:1: ( rule__RegExpMatch__NameAssignment_0 )
            {
             before(grammarAccess.getRegExpMatchAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4110:1: ( rule__RegExpMatch__NameAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4110:2: rule__RegExpMatch__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RegExpMatch__NameAssignment_0_in_rule__RegExpMatch__Group__0__Impl8230);
            rule__RegExpMatch__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegExpMatchAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__0__Impl"


    // $ANTLR start "rule__RegExpMatch__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4120:1: rule__RegExpMatch__Group__1 : rule__RegExpMatch__Group__1__Impl rule__RegExpMatch__Group__2 ;
    public final void rule__RegExpMatch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4124:1: ( rule__RegExpMatch__Group__1__Impl rule__RegExpMatch__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4125:2: rule__RegExpMatch__Group__1__Impl rule__RegExpMatch__Group__2
            {
            pushFollow(FOLLOW_rule__RegExpMatch__Group__1__Impl_in_rule__RegExpMatch__Group__18260);
            rule__RegExpMatch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RegExpMatch__Group__2_in_rule__RegExpMatch__Group__18263);
            rule__RegExpMatch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__1"


    // $ANTLR start "rule__RegExpMatch__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4132:1: rule__RegExpMatch__Group__1__Impl : ( '(' ) ;
    public final void rule__RegExpMatch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4136:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4137:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4137:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4138:1: '('
            {
             before(grammarAccess.getRegExpMatchAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__RegExpMatch__Group__1__Impl8291); 
             after(grammarAccess.getRegExpMatchAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__1__Impl"


    // $ANTLR start "rule__RegExpMatch__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4151:1: rule__RegExpMatch__Group__2 : rule__RegExpMatch__Group__2__Impl rule__RegExpMatch__Group__3 ;
    public final void rule__RegExpMatch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4155:1: ( rule__RegExpMatch__Group__2__Impl rule__RegExpMatch__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4156:2: rule__RegExpMatch__Group__2__Impl rule__RegExpMatch__Group__3
            {
            pushFollow(FOLLOW_rule__RegExpMatch__Group__2__Impl_in_rule__RegExpMatch__Group__28322);
            rule__RegExpMatch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RegExpMatch__Group__3_in_rule__RegExpMatch__Group__28325);
            rule__RegExpMatch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__2"


    // $ANTLR start "rule__RegExpMatch__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4163:1: rule__RegExpMatch__Group__2__Impl : ( ( rule__RegExpMatch__ValueAssignment_2 ) ) ;
    public final void rule__RegExpMatch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4167:1: ( ( ( rule__RegExpMatch__ValueAssignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4168:1: ( ( rule__RegExpMatch__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4168:1: ( ( rule__RegExpMatch__ValueAssignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4169:1: ( rule__RegExpMatch__ValueAssignment_2 )
            {
             before(grammarAccess.getRegExpMatchAccess().getValueAssignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4170:1: ( rule__RegExpMatch__ValueAssignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4170:2: rule__RegExpMatch__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__RegExpMatch__ValueAssignment_2_in_rule__RegExpMatch__Group__2__Impl8352);
            rule__RegExpMatch__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegExpMatchAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__2__Impl"


    // $ANTLR start "rule__RegExpMatch__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4180:1: rule__RegExpMatch__Group__3 : rule__RegExpMatch__Group__3__Impl ;
    public final void rule__RegExpMatch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4184:1: ( rule__RegExpMatch__Group__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4185:2: rule__RegExpMatch__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RegExpMatch__Group__3__Impl_in_rule__RegExpMatch__Group__38382);
            rule__RegExpMatch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__3"


    // $ANTLR start "rule__RegExpMatch__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4191:1: rule__RegExpMatch__Group__3__Impl : ( ')' ) ;
    public final void rule__RegExpMatch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4195:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4196:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4196:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4197:1: ')'
            {
             before(grammarAccess.getRegExpMatchAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__RegExpMatch__Group__3__Impl8410); 
             after(grammarAccess.getRegExpMatchAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__Group__3__Impl"


    // $ANTLR start "rule__FrequencyCheck__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4218:1: rule__FrequencyCheck__Group__0 : rule__FrequencyCheck__Group__0__Impl rule__FrequencyCheck__Group__1 ;
    public final void rule__FrequencyCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4222:1: ( rule__FrequencyCheck__Group__0__Impl rule__FrequencyCheck__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4223:2: rule__FrequencyCheck__Group__0__Impl rule__FrequencyCheck__Group__1
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__Group__0__Impl_in_rule__FrequencyCheck__Group__08449);
            rule__FrequencyCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrequencyCheck__Group__1_in_rule__FrequencyCheck__Group__08452);
            rule__FrequencyCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__0"


    // $ANTLR start "rule__FrequencyCheck__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4230:1: rule__FrequencyCheck__Group__0__Impl : ( ( rule__FrequencyCheck__NameAssignment_0 ) ) ;
    public final void rule__FrequencyCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4234:1: ( ( ( rule__FrequencyCheck__NameAssignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4235:1: ( ( rule__FrequencyCheck__NameAssignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4235:1: ( ( rule__FrequencyCheck__NameAssignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4236:1: ( rule__FrequencyCheck__NameAssignment_0 )
            {
             before(grammarAccess.getFrequencyCheckAccess().getNameAssignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4237:1: ( rule__FrequencyCheck__NameAssignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4237:2: rule__FrequencyCheck__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__NameAssignment_0_in_rule__FrequencyCheck__Group__0__Impl8479);
            rule__FrequencyCheck__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyCheckAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__0__Impl"


    // $ANTLR start "rule__FrequencyCheck__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4247:1: rule__FrequencyCheck__Group__1 : rule__FrequencyCheck__Group__1__Impl rule__FrequencyCheck__Group__2 ;
    public final void rule__FrequencyCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4251:1: ( rule__FrequencyCheck__Group__1__Impl rule__FrequencyCheck__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4252:2: rule__FrequencyCheck__Group__1__Impl rule__FrequencyCheck__Group__2
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__Group__1__Impl_in_rule__FrequencyCheck__Group__18509);
            rule__FrequencyCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrequencyCheck__Group__2_in_rule__FrequencyCheck__Group__18512);
            rule__FrequencyCheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__1"


    // $ANTLR start "rule__FrequencyCheck__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4259:1: rule__FrequencyCheck__Group__1__Impl : ( '(' ) ;
    public final void rule__FrequencyCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4263:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4264:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4264:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4265:1: '('
            {
             before(grammarAccess.getFrequencyCheckAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FrequencyCheck__Group__1__Impl8540); 
             after(grammarAccess.getFrequencyCheckAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__1__Impl"


    // $ANTLR start "rule__FrequencyCheck__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4278:1: rule__FrequencyCheck__Group__2 : rule__FrequencyCheck__Group__2__Impl rule__FrequencyCheck__Group__3 ;
    public final void rule__FrequencyCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4282:1: ( rule__FrequencyCheck__Group__2__Impl rule__FrequencyCheck__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4283:2: rule__FrequencyCheck__Group__2__Impl rule__FrequencyCheck__Group__3
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__Group__2__Impl_in_rule__FrequencyCheck__Group__28571);
            rule__FrequencyCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrequencyCheck__Group__3_in_rule__FrequencyCheck__Group__28574);
            rule__FrequencyCheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__2"


    // $ANTLR start "rule__FrequencyCheck__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4290:1: rule__FrequencyCheck__Group__2__Impl : ( ( rule__FrequencyCheck__ValueAssignment_2 ) ) ;
    public final void rule__FrequencyCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4294:1: ( ( ( rule__FrequencyCheck__ValueAssignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4295:1: ( ( rule__FrequencyCheck__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4295:1: ( ( rule__FrequencyCheck__ValueAssignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4296:1: ( rule__FrequencyCheck__ValueAssignment_2 )
            {
             before(grammarAccess.getFrequencyCheckAccess().getValueAssignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4297:1: ( rule__FrequencyCheck__ValueAssignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4297:2: rule__FrequencyCheck__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__ValueAssignment_2_in_rule__FrequencyCheck__Group__2__Impl8601);
            rule__FrequencyCheck__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyCheckAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__2__Impl"


    // $ANTLR start "rule__FrequencyCheck__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4307:1: rule__FrequencyCheck__Group__3 : rule__FrequencyCheck__Group__3__Impl ;
    public final void rule__FrequencyCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4311:1: ( rule__FrequencyCheck__Group__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4312:2: rule__FrequencyCheck__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FrequencyCheck__Group__3__Impl_in_rule__FrequencyCheck__Group__38631);
            rule__FrequencyCheck__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__3"


    // $ANTLR start "rule__FrequencyCheck__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4318:1: rule__FrequencyCheck__Group__3__Impl : ( ')' ) ;
    public final void rule__FrequencyCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4322:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4323:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4323:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4324:1: ')'
            {
             before(grammarAccess.getFrequencyCheckAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__FrequencyCheck__Group__3__Impl8659); 
             after(grammarAccess.getFrequencyCheckAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__Group__3__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4345:1: rule__HTTPParamLenCheck__Group_0__0 : rule__HTTPParamLenCheck__Group_0__0__Impl rule__HTTPParamLenCheck__Group_0__1 ;
    public final void rule__HTTPParamLenCheck__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4349:1: ( rule__HTTPParamLenCheck__Group_0__0__Impl rule__HTTPParamLenCheck__Group_0__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4350:2: rule__HTTPParamLenCheck__Group_0__0__Impl rule__HTTPParamLenCheck__Group_0__1
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__0__Impl_in_rule__HTTPParamLenCheck__Group_0__08698);
            rule__HTTPParamLenCheck__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__1_in_rule__HTTPParamLenCheck__Group_0__08701);
            rule__HTTPParamLenCheck__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__0"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4357:1: rule__HTTPParamLenCheck__Group_0__0__Impl : ( ( rule__HTTPParamLenCheck__NameAssignment_0_0 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4361:1: ( ( ( rule__HTTPParamLenCheck__NameAssignment_0_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4362:1: ( ( rule__HTTPParamLenCheck__NameAssignment_0_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4362:1: ( ( rule__HTTPParamLenCheck__NameAssignment_0_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4363:1: ( rule__HTTPParamLenCheck__NameAssignment_0_0 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4364:1: ( rule__HTTPParamLenCheck__NameAssignment_0_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4364:2: rule__HTTPParamLenCheck__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__NameAssignment_0_0_in_rule__HTTPParamLenCheck__Group_0__0__Impl8728);
            rule__HTTPParamLenCheck__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__0__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4374:1: rule__HTTPParamLenCheck__Group_0__1 : rule__HTTPParamLenCheck__Group_0__1__Impl rule__HTTPParamLenCheck__Group_0__2 ;
    public final void rule__HTTPParamLenCheck__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4378:1: ( rule__HTTPParamLenCheck__Group_0__1__Impl rule__HTTPParamLenCheck__Group_0__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4379:2: rule__HTTPParamLenCheck__Group_0__1__Impl rule__HTTPParamLenCheck__Group_0__2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__1__Impl_in_rule__HTTPParamLenCheck__Group_0__18758);
            rule__HTTPParamLenCheck__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__2_in_rule__HTTPParamLenCheck__Group_0__18761);
            rule__HTTPParamLenCheck__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__1"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4386:1: rule__HTTPParamLenCheck__Group_0__1__Impl : ( '(' ) ;
    public final void rule__HTTPParamLenCheck__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4390:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4391:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4391:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4392:1: '('
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__HTTPParamLenCheck__Group_0__1__Impl8789); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__1__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4405:1: rule__HTTPParamLenCheck__Group_0__2 : rule__HTTPParamLenCheck__Group_0__2__Impl rule__HTTPParamLenCheck__Group_0__3 ;
    public final void rule__HTTPParamLenCheck__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4409:1: ( rule__HTTPParamLenCheck__Group_0__2__Impl rule__HTTPParamLenCheck__Group_0__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4410:2: rule__HTTPParamLenCheck__Group_0__2__Impl rule__HTTPParamLenCheck__Group_0__3
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__2__Impl_in_rule__HTTPParamLenCheck__Group_0__28820);
            rule__HTTPParamLenCheck__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__3_in_rule__HTTPParamLenCheck__Group_0__28823);
            rule__HTTPParamLenCheck__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__2"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4417:1: rule__HTTPParamLenCheck__Group_0__2__Impl : ( ( rule__HTTPParamLenCheck__ValueAssignment_0_2 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4421:1: ( ( ( rule__HTTPParamLenCheck__ValueAssignment_0_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4422:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_0_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4422:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_0_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4423:1: ( rule__HTTPParamLenCheck__ValueAssignment_0_2 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_0_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4424:1: ( rule__HTTPParamLenCheck__ValueAssignment_0_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4424:2: rule__HTTPParamLenCheck__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_0_2_in_rule__HTTPParamLenCheck__Group_0__2__Impl8850);
            rule__HTTPParamLenCheck__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__2__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4434:1: rule__HTTPParamLenCheck__Group_0__3 : rule__HTTPParamLenCheck__Group_0__3__Impl ;
    public final void rule__HTTPParamLenCheck__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4438:1: ( rule__HTTPParamLenCheck__Group_0__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4439:2: rule__HTTPParamLenCheck__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_0__3__Impl_in_rule__HTTPParamLenCheck__Group_0__38880);
            rule__HTTPParamLenCheck__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__3"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_0__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4445:1: rule__HTTPParamLenCheck__Group_0__3__Impl : ( ')' ) ;
    public final void rule__HTTPParamLenCheck__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4449:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4450:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4450:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4451:1: ')'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_0_3()); 
            match(input,36,FOLLOW_36_in_rule__HTTPParamLenCheck__Group_0__3__Impl8908); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_0__3__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4472:1: rule__HTTPParamLenCheck__Group_1__0 : rule__HTTPParamLenCheck__Group_1__0__Impl rule__HTTPParamLenCheck__Group_1__1 ;
    public final void rule__HTTPParamLenCheck__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4476:1: ( rule__HTTPParamLenCheck__Group_1__0__Impl rule__HTTPParamLenCheck__Group_1__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4477:2: rule__HTTPParamLenCheck__Group_1__0__Impl rule__HTTPParamLenCheck__Group_1__1
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__0__Impl_in_rule__HTTPParamLenCheck__Group_1__08947);
            rule__HTTPParamLenCheck__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__1_in_rule__HTTPParamLenCheck__Group_1__08950);
            rule__HTTPParamLenCheck__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__0"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4484:1: rule__HTTPParamLenCheck__Group_1__0__Impl : ( ( rule__HTTPParamLenCheck__NameAssignment_1_0 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4488:1: ( ( ( rule__HTTPParamLenCheck__NameAssignment_1_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4489:1: ( ( rule__HTTPParamLenCheck__NameAssignment_1_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4489:1: ( ( rule__HTTPParamLenCheck__NameAssignment_1_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4490:1: ( rule__HTTPParamLenCheck__NameAssignment_1_0 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_1_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4491:1: ( rule__HTTPParamLenCheck__NameAssignment_1_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4491:2: rule__HTTPParamLenCheck__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__NameAssignment_1_0_in_rule__HTTPParamLenCheck__Group_1__0__Impl8977);
            rule__HTTPParamLenCheck__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__0__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4501:1: rule__HTTPParamLenCheck__Group_1__1 : rule__HTTPParamLenCheck__Group_1__1__Impl rule__HTTPParamLenCheck__Group_1__2 ;
    public final void rule__HTTPParamLenCheck__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4505:1: ( rule__HTTPParamLenCheck__Group_1__1__Impl rule__HTTPParamLenCheck__Group_1__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4506:2: rule__HTTPParamLenCheck__Group_1__1__Impl rule__HTTPParamLenCheck__Group_1__2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__1__Impl_in_rule__HTTPParamLenCheck__Group_1__19007);
            rule__HTTPParamLenCheck__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__2_in_rule__HTTPParamLenCheck__Group_1__19010);
            rule__HTTPParamLenCheck__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__1"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4513:1: rule__HTTPParamLenCheck__Group_1__1__Impl : ( '(' ) ;
    public final void rule__HTTPParamLenCheck__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4517:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4518:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4518:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4519:1: '('
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__HTTPParamLenCheck__Group_1__1__Impl9038); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__1__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4532:1: rule__HTTPParamLenCheck__Group_1__2 : rule__HTTPParamLenCheck__Group_1__2__Impl rule__HTTPParamLenCheck__Group_1__3 ;
    public final void rule__HTTPParamLenCheck__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4536:1: ( rule__HTTPParamLenCheck__Group_1__2__Impl rule__HTTPParamLenCheck__Group_1__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4537:2: rule__HTTPParamLenCheck__Group_1__2__Impl rule__HTTPParamLenCheck__Group_1__3
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__2__Impl_in_rule__HTTPParamLenCheck__Group_1__29069);
            rule__HTTPParamLenCheck__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__3_in_rule__HTTPParamLenCheck__Group_1__29072);
            rule__HTTPParamLenCheck__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__2"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4544:1: rule__HTTPParamLenCheck__Group_1__2__Impl : ( ( rule__HTTPParamLenCheck__ValueAssignment_1_2 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4548:1: ( ( ( rule__HTTPParamLenCheck__ValueAssignment_1_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4549:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4549:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_1_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4550:1: ( rule__HTTPParamLenCheck__ValueAssignment_1_2 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_1_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4551:1: ( rule__HTTPParamLenCheck__ValueAssignment_1_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4551:2: rule__HTTPParamLenCheck__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_1_2_in_rule__HTTPParamLenCheck__Group_1__2__Impl9099);
            rule__HTTPParamLenCheck__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__2__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4561:1: rule__HTTPParamLenCheck__Group_1__3 : rule__HTTPParamLenCheck__Group_1__3__Impl ;
    public final void rule__HTTPParamLenCheck__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4565:1: ( rule__HTTPParamLenCheck__Group_1__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4566:2: rule__HTTPParamLenCheck__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_1__3__Impl_in_rule__HTTPParamLenCheck__Group_1__39129);
            rule__HTTPParamLenCheck__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__3"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_1__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4572:1: rule__HTTPParamLenCheck__Group_1__3__Impl : ( ')' ) ;
    public final void rule__HTTPParamLenCheck__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4576:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4577:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4577:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4578:1: ')'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_1_3()); 
            match(input,36,FOLLOW_36_in_rule__HTTPParamLenCheck__Group_1__3__Impl9157); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_1__3__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4599:1: rule__HTTPParamLenCheck__Group_2__0 : rule__HTTPParamLenCheck__Group_2__0__Impl rule__HTTPParamLenCheck__Group_2__1 ;
    public final void rule__HTTPParamLenCheck__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4603:1: ( rule__HTTPParamLenCheck__Group_2__0__Impl rule__HTTPParamLenCheck__Group_2__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4604:2: rule__HTTPParamLenCheck__Group_2__0__Impl rule__HTTPParamLenCheck__Group_2__1
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__0__Impl_in_rule__HTTPParamLenCheck__Group_2__09196);
            rule__HTTPParamLenCheck__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__1_in_rule__HTTPParamLenCheck__Group_2__09199);
            rule__HTTPParamLenCheck__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__0"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4611:1: rule__HTTPParamLenCheck__Group_2__0__Impl : ( ( rule__HTTPParamLenCheck__NameAssignment_2_0 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4615:1: ( ( ( rule__HTTPParamLenCheck__NameAssignment_2_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4616:1: ( ( rule__HTTPParamLenCheck__NameAssignment_2_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4616:1: ( ( rule__HTTPParamLenCheck__NameAssignment_2_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4617:1: ( rule__HTTPParamLenCheck__NameAssignment_2_0 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_2_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4618:1: ( rule__HTTPParamLenCheck__NameAssignment_2_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4618:2: rule__HTTPParamLenCheck__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__NameAssignment_2_0_in_rule__HTTPParamLenCheck__Group_2__0__Impl9226);
            rule__HTTPParamLenCheck__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__0__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4628:1: rule__HTTPParamLenCheck__Group_2__1 : rule__HTTPParamLenCheck__Group_2__1__Impl rule__HTTPParamLenCheck__Group_2__2 ;
    public final void rule__HTTPParamLenCheck__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4632:1: ( rule__HTTPParamLenCheck__Group_2__1__Impl rule__HTTPParamLenCheck__Group_2__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4633:2: rule__HTTPParamLenCheck__Group_2__1__Impl rule__HTTPParamLenCheck__Group_2__2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__1__Impl_in_rule__HTTPParamLenCheck__Group_2__19256);
            rule__HTTPParamLenCheck__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__2_in_rule__HTTPParamLenCheck__Group_2__19259);
            rule__HTTPParamLenCheck__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__1"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4640:1: rule__HTTPParamLenCheck__Group_2__1__Impl : ( '(' ) ;
    public final void rule__HTTPParamLenCheck__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4644:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4645:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4645:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4646:1: '('
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,35,FOLLOW_35_in_rule__HTTPParamLenCheck__Group_2__1__Impl9287); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__1__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4659:1: rule__HTTPParamLenCheck__Group_2__2 : rule__HTTPParamLenCheck__Group_2__2__Impl rule__HTTPParamLenCheck__Group_2__3 ;
    public final void rule__HTTPParamLenCheck__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4663:1: ( rule__HTTPParamLenCheck__Group_2__2__Impl rule__HTTPParamLenCheck__Group_2__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4664:2: rule__HTTPParamLenCheck__Group_2__2__Impl rule__HTTPParamLenCheck__Group_2__3
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__2__Impl_in_rule__HTTPParamLenCheck__Group_2__29318);
            rule__HTTPParamLenCheck__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__3_in_rule__HTTPParamLenCheck__Group_2__29321);
            rule__HTTPParamLenCheck__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__2"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4671:1: rule__HTTPParamLenCheck__Group_2__2__Impl : ( ( rule__HTTPParamLenCheck__ValueAssignment_2_2 ) ) ;
    public final void rule__HTTPParamLenCheck__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4675:1: ( ( ( rule__HTTPParamLenCheck__ValueAssignment_2_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4676:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_2_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4676:1: ( ( rule__HTTPParamLenCheck__ValueAssignment_2_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4677:1: ( rule__HTTPParamLenCheck__ValueAssignment_2_2 )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_2_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4678:1: ( rule__HTTPParamLenCheck__ValueAssignment_2_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4678:2: rule__HTTPParamLenCheck__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_2_2_in_rule__HTTPParamLenCheck__Group_2__2__Impl9348);
            rule__HTTPParamLenCheck__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__2__Impl"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4688:1: rule__HTTPParamLenCheck__Group_2__3 : rule__HTTPParamLenCheck__Group_2__3__Impl ;
    public final void rule__HTTPParamLenCheck__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4692:1: ( rule__HTTPParamLenCheck__Group_2__3__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4693:2: rule__HTTPParamLenCheck__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__HTTPParamLenCheck__Group_2__3__Impl_in_rule__HTTPParamLenCheck__Group_2__39378);
            rule__HTTPParamLenCheck__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__3"


    // $ANTLR start "rule__HTTPParamLenCheck__Group_2__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4699:1: rule__HTTPParamLenCheck__Group_2__3__Impl : ( ')' ) ;
    public final void rule__HTTPParamLenCheck__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4703:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4704:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4704:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4705:1: ')'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_2_3()); 
            match(input,36,FOLLOW_36_in_rule__HTTPParamLenCheck__Group_2__3__Impl9406); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__Group_2__3__Impl"


    // $ANTLR start "rule__EndPoint__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4726:1: rule__EndPoint__Group__0 : rule__EndPoint__Group__0__Impl rule__EndPoint__Group__1 ;
    public final void rule__EndPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4730:1: ( rule__EndPoint__Group__0__Impl rule__EndPoint__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4731:2: rule__EndPoint__Group__0__Impl rule__EndPoint__Group__1
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__0__Impl_in_rule__EndPoint__Group__09445);
            rule__EndPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndPoint__Group__1_in_rule__EndPoint__Group__09448);
            rule__EndPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__0"


    // $ANTLR start "rule__EndPoint__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4738:1: rule__EndPoint__Group__0__Impl : ( 'endpoint' ) ;
    public final void rule__EndPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4742:1: ( ( 'endpoint' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4743:1: ( 'endpoint' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4743:1: ( 'endpoint' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4744:1: 'endpoint'
            {
             before(grammarAccess.getEndPointAccess().getEndpointKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__EndPoint__Group__0__Impl9476); 
             after(grammarAccess.getEndPointAccess().getEndpointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__0__Impl"


    // $ANTLR start "rule__EndPoint__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4757:1: rule__EndPoint__Group__1 : rule__EndPoint__Group__1__Impl rule__EndPoint__Group__2 ;
    public final void rule__EndPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4761:1: ( rule__EndPoint__Group__1__Impl rule__EndPoint__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4762:2: rule__EndPoint__Group__1__Impl rule__EndPoint__Group__2
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__1__Impl_in_rule__EndPoint__Group__19507);
            rule__EndPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndPoint__Group__2_in_rule__EndPoint__Group__19510);
            rule__EndPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__1"


    // $ANTLR start "rule__EndPoint__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4769:1: rule__EndPoint__Group__1__Impl : ( '(' ) ;
    public final void rule__EndPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4773:1: ( ( '(' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4774:1: ( '(' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4774:1: ( '(' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4775:1: '('
            {
             before(grammarAccess.getEndPointAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__EndPoint__Group__1__Impl9538); 
             after(grammarAccess.getEndPointAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__1__Impl"


    // $ANTLR start "rule__EndPoint__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4788:1: rule__EndPoint__Group__2 : rule__EndPoint__Group__2__Impl rule__EndPoint__Group__3 ;
    public final void rule__EndPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4792:1: ( rule__EndPoint__Group__2__Impl rule__EndPoint__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4793:2: rule__EndPoint__Group__2__Impl rule__EndPoint__Group__3
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__2__Impl_in_rule__EndPoint__Group__29569);
            rule__EndPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndPoint__Group__3_in_rule__EndPoint__Group__29572);
            rule__EndPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__2"


    // $ANTLR start "rule__EndPoint__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4800:1: rule__EndPoint__Group__2__Impl : ( ( rule__EndPoint__PortAssignment_2 ) ) ;
    public final void rule__EndPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4804:1: ( ( ( rule__EndPoint__PortAssignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4805:1: ( ( rule__EndPoint__PortAssignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4805:1: ( ( rule__EndPoint__PortAssignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4806:1: ( rule__EndPoint__PortAssignment_2 )
            {
             before(grammarAccess.getEndPointAccess().getPortAssignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4807:1: ( rule__EndPoint__PortAssignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4807:2: rule__EndPoint__PortAssignment_2
            {
            pushFollow(FOLLOW_rule__EndPoint__PortAssignment_2_in_rule__EndPoint__Group__2__Impl9599);
            rule__EndPoint__PortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndPointAccess().getPortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__2__Impl"


    // $ANTLR start "rule__EndPoint__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4817:1: rule__EndPoint__Group__3 : rule__EndPoint__Group__3__Impl rule__EndPoint__Group__4 ;
    public final void rule__EndPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4821:1: ( rule__EndPoint__Group__3__Impl rule__EndPoint__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4822:2: rule__EndPoint__Group__3__Impl rule__EndPoint__Group__4
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__3__Impl_in_rule__EndPoint__Group__39629);
            rule__EndPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndPoint__Group__4_in_rule__EndPoint__Group__39632);
            rule__EndPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__3"


    // $ANTLR start "rule__EndPoint__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4829:1: rule__EndPoint__Group__3__Impl : ( ',' ) ;
    public final void rule__EndPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4833:1: ( ( ',' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4834:1: ( ',' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4834:1: ( ',' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4835:1: ','
            {
             before(grammarAccess.getEndPointAccess().getCommaKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__EndPoint__Group__3__Impl9660); 
             after(grammarAccess.getEndPointAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__3__Impl"


    // $ANTLR start "rule__EndPoint__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4848:1: rule__EndPoint__Group__4 : rule__EndPoint__Group__4__Impl rule__EndPoint__Group__5 ;
    public final void rule__EndPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4852:1: ( rule__EndPoint__Group__4__Impl rule__EndPoint__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4853:2: rule__EndPoint__Group__4__Impl rule__EndPoint__Group__5
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__4__Impl_in_rule__EndPoint__Group__49691);
            rule__EndPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndPoint__Group__5_in_rule__EndPoint__Group__49694);
            rule__EndPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__4"


    // $ANTLR start "rule__EndPoint__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4860:1: rule__EndPoint__Group__4__Impl : ( ( rule__EndPoint__ProtocolAssignment_4 ) ) ;
    public final void rule__EndPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4864:1: ( ( ( rule__EndPoint__ProtocolAssignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4865:1: ( ( rule__EndPoint__ProtocolAssignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4865:1: ( ( rule__EndPoint__ProtocolAssignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4866:1: ( rule__EndPoint__ProtocolAssignment_4 )
            {
             before(grammarAccess.getEndPointAccess().getProtocolAssignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4867:1: ( rule__EndPoint__ProtocolAssignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4867:2: rule__EndPoint__ProtocolAssignment_4
            {
            pushFollow(FOLLOW_rule__EndPoint__ProtocolAssignment_4_in_rule__EndPoint__Group__4__Impl9721);
            rule__EndPoint__ProtocolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEndPointAccess().getProtocolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__4__Impl"


    // $ANTLR start "rule__EndPoint__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4877:1: rule__EndPoint__Group__5 : rule__EndPoint__Group__5__Impl ;
    public final void rule__EndPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4881:1: ( rule__EndPoint__Group__5__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4882:2: rule__EndPoint__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EndPoint__Group__5__Impl_in_rule__EndPoint__Group__59751);
            rule__EndPoint__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__5"


    // $ANTLR start "rule__EndPoint__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4888:1: rule__EndPoint__Group__5__Impl : ( ')' ) ;
    public final void rule__EndPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4892:1: ( ( ')' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4893:1: ( ')' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4893:1: ( ')' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4894:1: ')'
            {
             before(grammarAccess.getEndPointAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__EndPoint__Group__5__Impl9779); 
             after(grammarAccess.getEndPointAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Group__5__Impl"


    // $ANTLR start "rule__IPAddress__Group__0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4919:1: rule__IPAddress__Group__0 : rule__IPAddress__Group__0__Impl rule__IPAddress__Group__1 ;
    public final void rule__IPAddress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4923:1: ( rule__IPAddress__Group__0__Impl rule__IPAddress__Group__1 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4924:2: rule__IPAddress__Group__0__Impl rule__IPAddress__Group__1
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__0__Impl_in_rule__IPAddress__Group__09822);
            rule__IPAddress__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__1_in_rule__IPAddress__Group__09825);
            rule__IPAddress__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__0"


    // $ANTLR start "rule__IPAddress__Group__0__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4931:1: rule__IPAddress__Group__0__Impl : ( ( rule__IPAddress__Byte1Assignment_0 ) ) ;
    public final void rule__IPAddress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4935:1: ( ( ( rule__IPAddress__Byte1Assignment_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4936:1: ( ( rule__IPAddress__Byte1Assignment_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4936:1: ( ( rule__IPAddress__Byte1Assignment_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4937:1: ( rule__IPAddress__Byte1Assignment_0 )
            {
             before(grammarAccess.getIPAddressAccess().getByte1Assignment_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4938:1: ( rule__IPAddress__Byte1Assignment_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4938:2: rule__IPAddress__Byte1Assignment_0
            {
            pushFollow(FOLLOW_rule__IPAddress__Byte1Assignment_0_in_rule__IPAddress__Group__0__Impl9852);
            rule__IPAddress__Byte1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIPAddressAccess().getByte1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__0__Impl"


    // $ANTLR start "rule__IPAddress__Group__1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4948:1: rule__IPAddress__Group__1 : rule__IPAddress__Group__1__Impl rule__IPAddress__Group__2 ;
    public final void rule__IPAddress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4952:1: ( rule__IPAddress__Group__1__Impl rule__IPAddress__Group__2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4953:2: rule__IPAddress__Group__1__Impl rule__IPAddress__Group__2
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__1__Impl_in_rule__IPAddress__Group__19882);
            rule__IPAddress__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__2_in_rule__IPAddress__Group__19885);
            rule__IPAddress__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__1"


    // $ANTLR start "rule__IPAddress__Group__1__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4960:1: rule__IPAddress__Group__1__Impl : ( '.' ) ;
    public final void rule__IPAddress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4964:1: ( ( '.' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4965:1: ( '.' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4965:1: ( '.' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4966:1: '.'
            {
             before(grammarAccess.getIPAddressAccess().getFullStopKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__IPAddress__Group__1__Impl9913); 
             after(grammarAccess.getIPAddressAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__1__Impl"


    // $ANTLR start "rule__IPAddress__Group__2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4979:1: rule__IPAddress__Group__2 : rule__IPAddress__Group__2__Impl rule__IPAddress__Group__3 ;
    public final void rule__IPAddress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4983:1: ( rule__IPAddress__Group__2__Impl rule__IPAddress__Group__3 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4984:2: rule__IPAddress__Group__2__Impl rule__IPAddress__Group__3
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__2__Impl_in_rule__IPAddress__Group__29944);
            rule__IPAddress__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__3_in_rule__IPAddress__Group__29947);
            rule__IPAddress__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__2"


    // $ANTLR start "rule__IPAddress__Group__2__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4991:1: rule__IPAddress__Group__2__Impl : ( ( rule__IPAddress__Byte2Assignment_2 ) ) ;
    public final void rule__IPAddress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4995:1: ( ( ( rule__IPAddress__Byte2Assignment_2 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4996:1: ( ( rule__IPAddress__Byte2Assignment_2 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4996:1: ( ( rule__IPAddress__Byte2Assignment_2 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4997:1: ( rule__IPAddress__Byte2Assignment_2 )
            {
             before(grammarAccess.getIPAddressAccess().getByte2Assignment_2()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4998:1: ( rule__IPAddress__Byte2Assignment_2 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:4998:2: rule__IPAddress__Byte2Assignment_2
            {
            pushFollow(FOLLOW_rule__IPAddress__Byte2Assignment_2_in_rule__IPAddress__Group__2__Impl9974);
            rule__IPAddress__Byte2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIPAddressAccess().getByte2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__2__Impl"


    // $ANTLR start "rule__IPAddress__Group__3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5008:1: rule__IPAddress__Group__3 : rule__IPAddress__Group__3__Impl rule__IPAddress__Group__4 ;
    public final void rule__IPAddress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5012:1: ( rule__IPAddress__Group__3__Impl rule__IPAddress__Group__4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5013:2: rule__IPAddress__Group__3__Impl rule__IPAddress__Group__4
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__3__Impl_in_rule__IPAddress__Group__310004);
            rule__IPAddress__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__4_in_rule__IPAddress__Group__310007);
            rule__IPAddress__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__3"


    // $ANTLR start "rule__IPAddress__Group__3__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5020:1: rule__IPAddress__Group__3__Impl : ( '.' ) ;
    public final void rule__IPAddress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5024:1: ( ( '.' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5025:1: ( '.' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5025:1: ( '.' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5026:1: '.'
            {
             before(grammarAccess.getIPAddressAccess().getFullStopKeyword_3()); 
            match(input,42,FOLLOW_42_in_rule__IPAddress__Group__3__Impl10035); 
             after(grammarAccess.getIPAddressAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__3__Impl"


    // $ANTLR start "rule__IPAddress__Group__4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5039:1: rule__IPAddress__Group__4 : rule__IPAddress__Group__4__Impl rule__IPAddress__Group__5 ;
    public final void rule__IPAddress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5043:1: ( rule__IPAddress__Group__4__Impl rule__IPAddress__Group__5 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5044:2: rule__IPAddress__Group__4__Impl rule__IPAddress__Group__5
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__4__Impl_in_rule__IPAddress__Group__410066);
            rule__IPAddress__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__5_in_rule__IPAddress__Group__410069);
            rule__IPAddress__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__4"


    // $ANTLR start "rule__IPAddress__Group__4__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5051:1: rule__IPAddress__Group__4__Impl : ( ( rule__IPAddress__Byte3Assignment_4 ) ) ;
    public final void rule__IPAddress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5055:1: ( ( ( rule__IPAddress__Byte3Assignment_4 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5056:1: ( ( rule__IPAddress__Byte3Assignment_4 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5056:1: ( ( rule__IPAddress__Byte3Assignment_4 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5057:1: ( rule__IPAddress__Byte3Assignment_4 )
            {
             before(grammarAccess.getIPAddressAccess().getByte3Assignment_4()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5058:1: ( rule__IPAddress__Byte3Assignment_4 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5058:2: rule__IPAddress__Byte3Assignment_4
            {
            pushFollow(FOLLOW_rule__IPAddress__Byte3Assignment_4_in_rule__IPAddress__Group__4__Impl10096);
            rule__IPAddress__Byte3Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIPAddressAccess().getByte3Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__4__Impl"


    // $ANTLR start "rule__IPAddress__Group__5"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5068:1: rule__IPAddress__Group__5 : rule__IPAddress__Group__5__Impl rule__IPAddress__Group__6 ;
    public final void rule__IPAddress__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5072:1: ( rule__IPAddress__Group__5__Impl rule__IPAddress__Group__6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5073:2: rule__IPAddress__Group__5__Impl rule__IPAddress__Group__6
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__5__Impl_in_rule__IPAddress__Group__510126);
            rule__IPAddress__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPAddress__Group__6_in_rule__IPAddress__Group__510129);
            rule__IPAddress__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__5"


    // $ANTLR start "rule__IPAddress__Group__5__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5080:1: rule__IPAddress__Group__5__Impl : ( '.' ) ;
    public final void rule__IPAddress__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5084:1: ( ( '.' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5085:1: ( '.' )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5085:1: ( '.' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5086:1: '.'
            {
             before(grammarAccess.getIPAddressAccess().getFullStopKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__IPAddress__Group__5__Impl10157); 
             after(grammarAccess.getIPAddressAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__5__Impl"


    // $ANTLR start "rule__IPAddress__Group__6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5099:1: rule__IPAddress__Group__6 : rule__IPAddress__Group__6__Impl ;
    public final void rule__IPAddress__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5103:1: ( rule__IPAddress__Group__6__Impl )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5104:2: rule__IPAddress__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IPAddress__Group__6__Impl_in_rule__IPAddress__Group__610188);
            rule__IPAddress__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__6"


    // $ANTLR start "rule__IPAddress__Group__6__Impl"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5110:1: rule__IPAddress__Group__6__Impl : ( ( rule__IPAddress__Byte4Assignment_6 ) ) ;
    public final void rule__IPAddress__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5114:1: ( ( ( rule__IPAddress__Byte4Assignment_6 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5115:1: ( ( rule__IPAddress__Byte4Assignment_6 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5115:1: ( ( rule__IPAddress__Byte4Assignment_6 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5116:1: ( rule__IPAddress__Byte4Assignment_6 )
            {
             before(grammarAccess.getIPAddressAccess().getByte4Assignment_6()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5117:1: ( rule__IPAddress__Byte4Assignment_6 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5117:2: rule__IPAddress__Byte4Assignment_6
            {
            pushFollow(FOLLOW_rule__IPAddress__Byte4Assignment_6_in_rule__IPAddress__Group__6__Impl10215);
            rule__IPAddress__Byte4Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIPAddressAccess().getByte4Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Group__6__Impl"


    // $ANTLR start "rule__HttpShieldModel__AgentsAssignment"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5142:1: rule__HttpShieldModel__AgentsAssignment : ( ruleAgent ) ;
    public final void rule__HttpShieldModel__AgentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5146:1: ( ( ruleAgent ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5147:1: ( ruleAgent )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5147:1: ( ruleAgent )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5148:1: ruleAgent
            {
             before(grammarAccess.getHttpShieldModelAccess().getAgentsAgentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAgent_in_rule__HttpShieldModel__AgentsAssignment10264);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getHttpShieldModelAccess().getAgentsAgentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpShieldModel__AgentsAssignment"


    // $ANTLR start "rule__User__TypeAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5157:1: rule__User__TypeAssignment_0 : ( ( 'User' ) ) ;
    public final void rule__User__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5161:1: ( ( ( 'User' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5162:1: ( ( 'User' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5162:1: ( ( 'User' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5163:1: ( 'User' )
            {
             before(grammarAccess.getUserAccess().getTypeUserKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5164:1: ( 'User' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5165:1: 'User'
            {
             before(grammarAccess.getUserAccess().getTypeUserKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__User__TypeAssignment_010300); 
             after(grammarAccess.getUserAccess().getTypeUserKeyword_0_0()); 

            }

             after(grammarAccess.getUserAccess().getTypeUserKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__TypeAssignment_0"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5180:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5184:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5185:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5185:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5186:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_110339); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__User__FilenameAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5195:1: rule__User__FilenameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__User__FilenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5199:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5200:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5200:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5201:1: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__User__FilenameAssignment_410370); 
             after(grammarAccess.getUserAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__FilenameAssignment_4"


    // $ANTLR start "rule__User__SourceAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5210:1: rule__User__SourceAssignment_6 : ( ruleIPAddress ) ;
    public final void rule__User__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5214:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5215:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5215:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5216:1: ruleIPAddress
            {
             before(grammarAccess.getUserAccess().getSourceIPAddressParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__User__SourceAssignment_610401);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getUserAccess().getSourceIPAddressParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__SourceAssignment_6"


    // $ANTLR start "rule__User__RequestsAssignment_7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5225:1: rule__User__RequestsAssignment_7 : ( ruleNormalRequest ) ;
    public final void rule__User__RequestsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5229:1: ( ( ruleNormalRequest ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5230:1: ( ruleNormalRequest )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5230:1: ( ruleNormalRequest )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5231:1: ruleNormalRequest
            {
             before(grammarAccess.getUserAccess().getRequestsNormalRequestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNormalRequest_in_rule__User__RequestsAssignment_710432);
            ruleNormalRequest();

            state._fsp--;

             after(grammarAccess.getUserAccess().getRequestsNormalRequestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__RequestsAssignment_7"


    // $ANTLR start "rule__Attacker__TypeAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5240:1: rule__Attacker__TypeAssignment_0 : ( ( 'Attacker' ) ) ;
    public final void rule__Attacker__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5244:1: ( ( ( 'Attacker' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5245:1: ( ( 'Attacker' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5245:1: ( ( 'Attacker' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5246:1: ( 'Attacker' )
            {
             before(grammarAccess.getAttackerAccess().getTypeAttackerKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5247:1: ( 'Attacker' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5248:1: 'Attacker'
            {
             before(grammarAccess.getAttackerAccess().getTypeAttackerKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Attacker__TypeAssignment_010468); 
             after(grammarAccess.getAttackerAccess().getTypeAttackerKeyword_0_0()); 

            }

             after(grammarAccess.getAttackerAccess().getTypeAttackerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__TypeAssignment_0"


    // $ANTLR start "rule__Attacker__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5263:1: rule__Attacker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5267:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5268:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5268:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5269:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_110507); 
             after(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__NameAssignment_1"


    // $ANTLR start "rule__Attacker__FilenameAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5278:1: rule__Attacker__FilenameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Attacker__FilenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5282:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5283:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5283:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5284:1: RULE_STRING
            {
             before(grammarAccess.getAttackerAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attacker__FilenameAssignment_410538); 
             after(grammarAccess.getAttackerAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__FilenameAssignment_4"


    // $ANTLR start "rule__Attacker__SourceAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5293:1: rule__Attacker__SourceAssignment_6 : ( ruleIPAddress ) ;
    public final void rule__Attacker__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5297:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5298:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5298:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5299:1: ruleIPAddress
            {
             before(grammarAccess.getAttackerAccess().getSourceIPAddressParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__Attacker__SourceAssignment_610569);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getSourceIPAddressParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__SourceAssignment_6"


    // $ANTLR start "rule__Attacker__RequestsAssignment_7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5308:1: rule__Attacker__RequestsAssignment_7 : ( ruleMaliciousRequest ) ;
    public final void rule__Attacker__RequestsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5312:1: ( ( ruleMaliciousRequest ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5313:1: ( ruleMaliciousRequest )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5313:1: ( ruleMaliciousRequest )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5314:1: ruleMaliciousRequest
            {
             before(grammarAccess.getAttackerAccess().getRequestsMaliciousRequestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMaliciousRequest_in_rule__Attacker__RequestsAssignment_710600);
            ruleMaliciousRequest();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getRequestsMaliciousRequestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__RequestsAssignment_7"


    // $ANTLR start "rule__MaliciousRequest__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5323:1: rule__MaliciousRequest__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MaliciousRequest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5327:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5328:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5328:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5329:1: RULE_ID
            {
             before(grammarAccess.getMaliciousRequestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MaliciousRequest__NameAssignment_110631); 
             after(grammarAccess.getMaliciousRequestAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__NameAssignment_1"


    // $ANTLR start "rule__MaliciousRequest__SourceAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5338:1: rule__MaliciousRequest__SourceAssignment_4 : ( ruleIPAddress ) ;
    public final void rule__MaliciousRequest__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5342:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5343:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5343:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5344:1: ruleIPAddress
            {
             before(grammarAccess.getMaliciousRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__MaliciousRequest__SourceAssignment_410662);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getMaliciousRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__SourceAssignment_4"


    // $ANTLR start "rule__MaliciousRequest__DestinationAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5353:1: rule__MaliciousRequest__DestinationAssignment_6 : ( ruleIPAddress ) ;
    public final void rule__MaliciousRequest__DestinationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5357:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5358:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5358:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5359:1: ruleIPAddress
            {
             before(grammarAccess.getMaliciousRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__MaliciousRequest__DestinationAssignment_610693);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getMaliciousRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__DestinationAssignment_6"


    // $ANTLR start "rule__MaliciousRequest__PortAssignment_8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5368:1: rule__MaliciousRequest__PortAssignment_8 : ( RULE_INT ) ;
    public final void rule__MaliciousRequest__PortAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5372:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5373:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5373:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5374:1: RULE_INT
            {
             before(grammarAccess.getMaliciousRequestAccess().getPortINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MaliciousRequest__PortAssignment_810724); 
             after(grammarAccess.getMaliciousRequestAccess().getPortINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__PortAssignment_8"


    // $ANTLR start "rule__MaliciousRequest__DataAssignment_10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5383:1: rule__MaliciousRequest__DataAssignment_10 : ( RULE_STRING ) ;
    public final void rule__MaliciousRequest__DataAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5387:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5388:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5388:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5389:1: RULE_STRING
            {
             before(grammarAccess.getMaliciousRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MaliciousRequest__DataAssignment_1010755); 
             after(grammarAccess.getMaliciousRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__DataAssignment_10"


    // $ANTLR start "rule__MaliciousRequest__ProtocolAssignment_12"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5398:1: rule__MaliciousRequest__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__MaliciousRequest__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5402:1: ( ( ruleProtocol ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5403:1: ( ruleProtocol )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5403:1: ( ruleProtocol )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5404:1: ruleProtocol
            {
             before(grammarAccess.getMaliciousRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleProtocol_in_rule__MaliciousRequest__ProtocolAssignment_1210786);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getMaliciousRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaliciousRequest__ProtocolAssignment_12"


    // $ANTLR start "rule__NormalRequest__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5413:1: rule__NormalRequest__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NormalRequest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5417:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5418:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5418:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5419:1: RULE_ID
            {
             before(grammarAccess.getNormalRequestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalRequest__NameAssignment_110817); 
             after(grammarAccess.getNormalRequestAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__NameAssignment_1"


    // $ANTLR start "rule__NormalRequest__SourceAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5428:1: rule__NormalRequest__SourceAssignment_4 : ( ruleIPAddress ) ;
    public final void rule__NormalRequest__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5432:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5433:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5433:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5434:1: ruleIPAddress
            {
             before(grammarAccess.getNormalRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__NormalRequest__SourceAssignment_410848);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getNormalRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__SourceAssignment_4"


    // $ANTLR start "rule__NormalRequest__DestinationAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5443:1: rule__NormalRequest__DestinationAssignment_6 : ( ruleIPAddress ) ;
    public final void rule__NormalRequest__DestinationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5447:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5448:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5448:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5449:1: ruleIPAddress
            {
             before(grammarAccess.getNormalRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__NormalRequest__DestinationAssignment_610879);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getNormalRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__DestinationAssignment_6"


    // $ANTLR start "rule__NormalRequest__PortAssignment_8"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5458:1: rule__NormalRequest__PortAssignment_8 : ( RULE_INT ) ;
    public final void rule__NormalRequest__PortAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5462:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5463:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5463:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5464:1: RULE_INT
            {
             before(grammarAccess.getNormalRequestAccess().getPortINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NormalRequest__PortAssignment_810910); 
             after(grammarAccess.getNormalRequestAccess().getPortINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__PortAssignment_8"


    // $ANTLR start "rule__NormalRequest__DataAssignment_10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5473:1: rule__NormalRequest__DataAssignment_10 : ( RULE_STRING ) ;
    public final void rule__NormalRequest__DataAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5477:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5478:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5478:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5479:1: RULE_STRING
            {
             before(grammarAccess.getNormalRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NormalRequest__DataAssignment_1010941); 
             after(grammarAccess.getNormalRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__DataAssignment_10"


    // $ANTLR start "rule__NormalRequest__ProtocolAssignment_12"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5488:1: rule__NormalRequest__ProtocolAssignment_12 : ( ruleProtocol ) ;
    public final void rule__NormalRequest__ProtocolAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5492:1: ( ( ruleProtocol ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5493:1: ( ruleProtocol )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5493:1: ( ruleProtocol )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5494:1: ruleProtocol
            {
             before(grammarAccess.getNormalRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleProtocol_in_rule__NormalRequest__ProtocolAssignment_1210972);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getNormalRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalRequest__ProtocolAssignment_12"


    // $ANTLR start "rule__Defender__TypeAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5503:1: rule__Defender__TypeAssignment_0 : ( ( 'Defender' ) ) ;
    public final void rule__Defender__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5507:1: ( ( ( 'Defender' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5508:1: ( ( 'Defender' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5508:1: ( ( 'Defender' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5509:1: ( 'Defender' )
            {
             before(grammarAccess.getDefenderAccess().getTypeDefenderKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5510:1: ( 'Defender' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5511:1: 'Defender'
            {
             before(grammarAccess.getDefenderAccess().getTypeDefenderKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Defender__TypeAssignment_011008); 
             after(grammarAccess.getDefenderAccess().getTypeDefenderKeyword_0_0()); 

            }

             after(grammarAccess.getDefenderAccess().getTypeDefenderKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__TypeAssignment_0"


    // $ANTLR start "rule__Defender__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5526:1: rule__Defender__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Defender__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5530:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5531:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5531:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5532:1: RULE_ID
            {
             before(grammarAccess.getDefenderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Defender__NameAssignment_111047); 
             after(grammarAccess.getDefenderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__NameAssignment_1"


    // $ANTLR start "rule__Defender__FilenameAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5541:1: rule__Defender__FilenameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Defender__FilenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5545:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5546:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5546:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5547:1: RULE_STRING
            {
             before(grammarAccess.getDefenderAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Defender__FilenameAssignment_411078); 
             after(grammarAccess.getDefenderAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__FilenameAssignment_4"


    // $ANTLR start "rule__Defender__SourceAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5556:1: rule__Defender__SourceAssignment_6 : ( ruleIPAddress ) ;
    public final void rule__Defender__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5560:1: ( ( ruleIPAddress ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5561:1: ( ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5561:1: ( ruleIPAddress )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5562:1: ruleIPAddress
            {
             before(grammarAccess.getDefenderAccess().getSourceIPAddressParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIPAddress_in_rule__Defender__SourceAssignment_611109);
            ruleIPAddress();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getSourceIPAddressParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__SourceAssignment_6"


    // $ANTLR start "rule__Defender__SecurityPolicylistAssignment_7"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5571:1: rule__Defender__SecurityPolicylistAssignment_7 : ( ruleSecurityPolicyList ) ;
    public final void rule__Defender__SecurityPolicylistAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5575:1: ( ( ruleSecurityPolicyList ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5576:1: ( ruleSecurityPolicyList )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5576:1: ( ruleSecurityPolicyList )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5577:1: ruleSecurityPolicyList
            {
             before(grammarAccess.getDefenderAccess().getSecurityPolicylistSecurityPolicyListParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleSecurityPolicyList_in_rule__Defender__SecurityPolicylistAssignment_711140);
            ruleSecurityPolicyList();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getSecurityPolicylistSecurityPolicyListParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__SecurityPolicylistAssignment_7"


    // $ANTLR start "rule__SecurityPolicyList__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5586:1: rule__SecurityPolicyList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityPolicyList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5590:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5591:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5591:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5592:1: RULE_ID
            {
             before(grammarAccess.getSecurityPolicyListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityPolicyList__NameAssignment_111171); 
             after(grammarAccess.getSecurityPolicyListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__NameAssignment_1"


    // $ANTLR start "rule__SecurityPolicyList__SecurityPoliciesAssignment_3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5601:1: rule__SecurityPolicyList__SecurityPoliciesAssignment_3 : ( ruleSecurityPolicy ) ;
    public final void rule__SecurityPolicyList__SecurityPoliciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5605:1: ( ( ruleSecurityPolicy ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5606:1: ( ruleSecurityPolicy )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5606:1: ( ruleSecurityPolicy )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5607:1: ruleSecurityPolicy
            {
             before(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesSecurityPolicyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSecurityPolicy_in_rule__SecurityPolicyList__SecurityPoliciesAssignment_311202);
            ruleSecurityPolicy();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesSecurityPolicyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__SecurityPoliciesAssignment_3"


    // $ANTLR start "rule__SecurityPolicyList__ConditionsAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5616:1: rule__SecurityPolicyList__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__SecurityPolicyList__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5620:1: ( ( ruleCondition ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5621:1: ( ruleCondition )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5621:1: ( ruleCondition )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5622:1: ruleCondition
            {
             before(grammarAccess.getSecurityPolicyListAccess().getConditionsConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__SecurityPolicyList__ConditionsAssignment_411233);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyListAccess().getConditionsConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicyList__ConditionsAssignment_4"


    // $ANTLR start "rule__SecurityPolicy__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5631:1: rule__SecurityPolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityPolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5635:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5636:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5636:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5637:1: RULE_ID
            {
             before(grammarAccess.getSecurityPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityPolicy__NameAssignment_111264); 
             after(grammarAccess.getSecurityPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__NameAssignment_1"


    // $ANTLR start "rule__SecurityPolicy__EndPointAssignment_3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5646:1: rule__SecurityPolicy__EndPointAssignment_3 : ( ruleEndPoint ) ;
    public final void rule__SecurityPolicy__EndPointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5650:1: ( ( ruleEndPoint ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5651:1: ( ruleEndPoint )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5651:1: ( ruleEndPoint )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5652:1: ruleEndPoint
            {
             before(grammarAccess.getSecurityPolicyAccess().getEndPointEndPointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEndPoint_in_rule__SecurityPolicy__EndPointAssignment_311295);
            ruleEndPoint();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyAccess().getEndPointEndPointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__EndPointAssignment_3"


    // $ANTLR start "rule__SecurityPolicy__ConditionlistAssignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5661:1: rule__SecurityPolicy__ConditionlistAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SecurityPolicy__ConditionlistAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5665:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5666:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5666:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5667:1: ( RULE_ID )
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_6_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5668:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5669:1: RULE_ID
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityPolicy__ConditionlistAssignment_611330); 
             after(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__ConditionlistAssignment_6"


    // $ANTLR start "rule__SecurityPolicy__OperationListAssignment_7_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5680:1: rule__SecurityPolicy__OperationListAssignment_7_0 : ( ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 ) ) ;
    public final void rule__SecurityPolicy__OperationListAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5684:1: ( ( ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5685:1: ( ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5685:1: ( ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5686:1: ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 )
            {
             before(grammarAccess.getSecurityPolicyAccess().getOperationListAlternatives_7_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5687:1: ( rule__SecurityPolicy__OperationListAlternatives_7_0_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5687:2: rule__SecurityPolicy__OperationListAlternatives_7_0_0
            {
            pushFollow(FOLLOW_rule__SecurityPolicy__OperationListAlternatives_7_0_0_in_rule__SecurityPolicy__OperationListAssignment_7_011365);
            rule__SecurityPolicy__OperationListAlternatives_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPolicyAccess().getOperationListAlternatives_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__OperationListAssignment_7_0"


    // $ANTLR start "rule__SecurityPolicy__ConditionlistAssignment_7_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5696:1: rule__SecurityPolicy__ConditionlistAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__SecurityPolicy__ConditionlistAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5700:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5701:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5701:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5702:1: ( RULE_ID )
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_7_1_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5703:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5704:1: RULE_ID
            {
             before(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityPolicy__ConditionlistAssignment_7_111402); 
             after(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__ConditionlistAssignment_7_1"


    // $ANTLR start "rule__SecurityPolicy__TrueActionListAssignment_10"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5715:1: rule__SecurityPolicy__TrueActionListAssignment_10 : ( ruleAction ) ;
    public final void rule__SecurityPolicy__TrueActionListAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5719:1: ( ( ruleAction ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5720:1: ( ruleAction )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5720:1: ( ruleAction )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5721:1: ruleAction
            {
             before(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__SecurityPolicy__TrueActionListAssignment_1011437);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__TrueActionListAssignment_10"


    // $ANTLR start "rule__SecurityPolicy__TrueActionListAssignment_11_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5730:1: rule__SecurityPolicy__TrueActionListAssignment_11_1 : ( ruleAction ) ;
    public final void rule__SecurityPolicy__TrueActionListAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5734:1: ( ( ruleAction ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5735:1: ( ruleAction )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5735:1: ( ruleAction )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5736:1: ruleAction
            {
             before(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__SecurityPolicy__TrueActionListAssignment_11_111468);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__TrueActionListAssignment_11_1"


    // $ANTLR start "rule__SecurityPolicy__FalseActionListAssignment_13"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5745:1: rule__SecurityPolicy__FalseActionListAssignment_13 : ( ruleAction ) ;
    public final void rule__SecurityPolicy__FalseActionListAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5749:1: ( ( ruleAction ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5750:1: ( ruleAction )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5750:1: ( ruleAction )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5751:1: ruleAction
            {
             before(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__SecurityPolicy__FalseActionListAssignment_1311499);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__FalseActionListAssignment_13"


    // $ANTLR start "rule__SecurityPolicy__FalseActionListAssignment_14_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5760:1: rule__SecurityPolicy__FalseActionListAssignment_14_1 : ( ruleAction ) ;
    public final void rule__SecurityPolicy__FalseActionListAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5764:1: ( ( ruleAction ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5765:1: ( ruleAction )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5765:1: ( ruleAction )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5766:1: ruleAction
            {
             before(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__SecurityPolicy__FalseActionListAssignment_14_111530);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityPolicy__FalseActionListAssignment_14_1"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5775:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5779:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5780:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5780:1: ( RULE_ID )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5781:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_111561); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Condition__SubConditionListAssignment_3"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5790:1: rule__Condition__SubConditionListAssignment_3 : ( ruleSubCondition ) ;
    public final void rule__Condition__SubConditionListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5794:1: ( ( ruleSubCondition ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5795:1: ( ruleSubCondition )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5795:1: ( ruleSubCondition )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5796:1: ruleSubCondition
            {
             before(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSubCondition_in_rule__Condition__SubConditionListAssignment_311592);
            ruleSubCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SubConditionListAssignment_3"


    // $ANTLR start "rule__Condition__SubConditionListAssignment_4_1"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5805:1: rule__Condition__SubConditionListAssignment_4_1 : ( ruleSubCondition ) ;
    public final void rule__Condition__SubConditionListAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5809:1: ( ( ruleSubCondition ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5810:1: ( ruleSubCondition )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5810:1: ( ruleSubCondition )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5811:1: ruleSubCondition
            {
             before(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSubCondition_in_rule__Condition__SubConditionListAssignment_4_111623);
            ruleSubCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SubConditionListAssignment_4_1"


    // $ANTLR start "rule__ProtocolCheck__NameAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5820:1: rule__ProtocolCheck__NameAssignment_0 : ( ( 'isRequestProtocolEqualsTo' ) ) ;
    public final void rule__ProtocolCheck__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5824:1: ( ( ( 'isRequestProtocolEqualsTo' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5825:1: ( ( 'isRequestProtocolEqualsTo' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5825:1: ( ( 'isRequestProtocolEqualsTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5826:1: ( 'isRequestProtocolEqualsTo' )
            {
             before(grammarAccess.getProtocolCheckAccess().getNameIsRequestProtocolEqualsToKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5827:1: ( 'isRequestProtocolEqualsTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5828:1: 'isRequestProtocolEqualsTo'
            {
             before(grammarAccess.getProtocolCheckAccess().getNameIsRequestProtocolEqualsToKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__ProtocolCheck__NameAssignment_011659); 
             after(grammarAccess.getProtocolCheckAccess().getNameIsRequestProtocolEqualsToKeyword_0_0()); 

            }

             after(grammarAccess.getProtocolCheckAccess().getNameIsRequestProtocolEqualsToKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__NameAssignment_0"


    // $ANTLR start "rule__ProtocolCheck__ValueAssignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5843:1: rule__ProtocolCheck__ValueAssignment_2 : ( ruleProtocol ) ;
    public final void rule__ProtocolCheck__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5847:1: ( ( ruleProtocol ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5848:1: ( ruleProtocol )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5848:1: ( ruleProtocol )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5849:1: ruleProtocol
            {
             before(grammarAccess.getProtocolCheckAccess().getValueProtocolEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProtocol_in_rule__ProtocolCheck__ValueAssignment_211698);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolCheckAccess().getValueProtocolEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolCheck__ValueAssignment_2"


    // $ANTLR start "rule__HTTPMethodCheck__NameAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5858:1: rule__HTTPMethodCheck__NameAssignment_0 : ( ( 'isHTTPMethodEqualsTo' ) ) ;
    public final void rule__HTTPMethodCheck__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5862:1: ( ( ( 'isHTTPMethodEqualsTo' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5863:1: ( ( 'isHTTPMethodEqualsTo' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5863:1: ( ( 'isHTTPMethodEqualsTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5864:1: ( 'isHTTPMethodEqualsTo' )
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getNameIsHTTPMethodEqualsToKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5865:1: ( 'isHTTPMethodEqualsTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5866:1: 'isHTTPMethodEqualsTo'
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getNameIsHTTPMethodEqualsToKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__HTTPMethodCheck__NameAssignment_011734); 
             after(grammarAccess.getHTTPMethodCheckAccess().getNameIsHTTPMethodEqualsToKeyword_0_0()); 

            }

             after(grammarAccess.getHTTPMethodCheckAccess().getNameIsHTTPMethodEqualsToKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__NameAssignment_0"


    // $ANTLR start "rule__HTTPMethodCheck__ValueAssignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5881:1: rule__HTTPMethodCheck__ValueAssignment_2 : ( ( rule__HTTPMethodCheck__ValueAlternatives_2_0 ) ) ;
    public final void rule__HTTPMethodCheck__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5885:1: ( ( ( rule__HTTPMethodCheck__ValueAlternatives_2_0 ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5886:1: ( ( rule__HTTPMethodCheck__ValueAlternatives_2_0 ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5886:1: ( ( rule__HTTPMethodCheck__ValueAlternatives_2_0 ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5887:1: ( rule__HTTPMethodCheck__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getHTTPMethodCheckAccess().getValueAlternatives_2_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5888:1: ( rule__HTTPMethodCheck__ValueAlternatives_2_0 )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5888:2: rule__HTTPMethodCheck__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__HTTPMethodCheck__ValueAlternatives_2_0_in_rule__HTTPMethodCheck__ValueAssignment_211773);
            rule__HTTPMethodCheck__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHTTPMethodCheckAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPMethodCheck__ValueAssignment_2"


    // $ANTLR start "rule__RegExpMatch__NameAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5897:1: rule__RegExpMatch__NameAssignment_0 : ( ( 'isParaContentMatchRegExp' ) ) ;
    public final void rule__RegExpMatch__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5901:1: ( ( ( 'isParaContentMatchRegExp' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5902:1: ( ( 'isParaContentMatchRegExp' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5902:1: ( ( 'isParaContentMatchRegExp' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5903:1: ( 'isParaContentMatchRegExp' )
            {
             before(grammarAccess.getRegExpMatchAccess().getNameIsParaContentMatchRegExpKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5904:1: ( 'isParaContentMatchRegExp' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5905:1: 'isParaContentMatchRegExp'
            {
             before(grammarAccess.getRegExpMatchAccess().getNameIsParaContentMatchRegExpKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__RegExpMatch__NameAssignment_011811); 
             after(grammarAccess.getRegExpMatchAccess().getNameIsParaContentMatchRegExpKeyword_0_0()); 

            }

             after(grammarAccess.getRegExpMatchAccess().getNameIsParaContentMatchRegExpKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__NameAssignment_0"


    // $ANTLR start "rule__RegExpMatch__ValueAssignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5920:1: rule__RegExpMatch__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RegExpMatch__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5924:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5925:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5925:1: ( RULE_STRING )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5926:1: RULE_STRING
            {
             before(grammarAccess.getRegExpMatchAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegExpMatch__ValueAssignment_211850); 
             after(grammarAccess.getRegExpMatchAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExpMatch__ValueAssignment_2"


    // $ANTLR start "rule__FrequencyCheck__NameAssignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5935:1: rule__FrequencyCheck__NameAssignment_0 : ( ( 'isRequestFrequencyLessThan' ) ) ;
    public final void rule__FrequencyCheck__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5939:1: ( ( ( 'isRequestFrequencyLessThan' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5940:1: ( ( 'isRequestFrequencyLessThan' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5940:1: ( ( 'isRequestFrequencyLessThan' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5941:1: ( 'isRequestFrequencyLessThan' )
            {
             before(grammarAccess.getFrequencyCheckAccess().getNameIsRequestFrequencyLessThanKeyword_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5942:1: ( 'isRequestFrequencyLessThan' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5943:1: 'isRequestFrequencyLessThan'
            {
             before(grammarAccess.getFrequencyCheckAccess().getNameIsRequestFrequencyLessThanKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__FrequencyCheck__NameAssignment_011886); 
             after(grammarAccess.getFrequencyCheckAccess().getNameIsRequestFrequencyLessThanKeyword_0_0()); 

            }

             after(grammarAccess.getFrequencyCheckAccess().getNameIsRequestFrequencyLessThanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__NameAssignment_0"


    // $ANTLR start "rule__FrequencyCheck__ValueAssignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5958:1: rule__FrequencyCheck__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FrequencyCheck__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5962:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5963:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5963:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5964:1: RULE_INT
            {
             before(grammarAccess.getFrequencyCheckAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FrequencyCheck__ValueAssignment_211925); 
             after(grammarAccess.getFrequencyCheckAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrequencyCheck__ValueAssignment_2"


    // $ANTLR start "rule__HTTPParamLenCheck__NameAssignment_0_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5973:1: rule__HTTPParamLenCheck__NameAssignment_0_0 : ( ( 'isParaLenghtLessThan' ) ) ;
    public final void rule__HTTPParamLenCheck__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5977:1: ( ( ( 'isParaLenghtLessThan' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5978:1: ( ( 'isParaLenghtLessThan' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5978:1: ( ( 'isParaLenghtLessThan' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5979:1: ( 'isParaLenghtLessThan' )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtLessThanKeyword_0_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5980:1: ( 'isParaLenghtLessThan' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5981:1: 'isParaLenghtLessThan'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtLessThanKeyword_0_0_0()); 
            match(input,50,FOLLOW_50_in_rule__HTTPParamLenCheck__NameAssignment_0_011961); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtLessThanKeyword_0_0_0()); 

            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtLessThanKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__NameAssignment_0_0"


    // $ANTLR start "rule__HTTPParamLenCheck__ValueAssignment_0_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:5996:1: rule__HTTPParamLenCheck__ValueAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__HTTPParamLenCheck__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6000:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6001:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6001:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6002:1: RULE_INT
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_0_212000); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__ValueAssignment_0_2"


    // $ANTLR start "rule__HTTPParamLenCheck__NameAssignment_1_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6011:1: rule__HTTPParamLenCheck__NameAssignment_1_0 : ( ( 'isParaLenghtGreaterThan' ) ) ;
    public final void rule__HTTPParamLenCheck__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6015:1: ( ( ( 'isParaLenghtGreaterThan' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6016:1: ( ( 'isParaLenghtGreaterThan' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6016:1: ( ( 'isParaLenghtGreaterThan' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6017:1: ( 'isParaLenghtGreaterThan' )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtGreaterThanKeyword_1_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6018:1: ( 'isParaLenghtGreaterThan' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6019:1: 'isParaLenghtGreaterThan'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtGreaterThanKeyword_1_0_0()); 
            match(input,51,FOLLOW_51_in_rule__HTTPParamLenCheck__NameAssignment_1_012036); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtGreaterThanKeyword_1_0_0()); 

            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtGreaterThanKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__NameAssignment_1_0"


    // $ANTLR start "rule__HTTPParamLenCheck__ValueAssignment_1_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6034:1: rule__HTTPParamLenCheck__ValueAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__HTTPParamLenCheck__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6038:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6039:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6039:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6040:1: RULE_INT
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_1_212075); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__ValueAssignment_1_2"


    // $ANTLR start "rule__HTTPParamLenCheck__NameAssignment_2_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6049:1: rule__HTTPParamLenCheck__NameAssignment_2_0 : ( ( 'isParaLenghtEqualsTo' ) ) ;
    public final void rule__HTTPParamLenCheck__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6053:1: ( ( ( 'isParaLenghtEqualsTo' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6054:1: ( ( 'isParaLenghtEqualsTo' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6054:1: ( ( 'isParaLenghtEqualsTo' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6055:1: ( 'isParaLenghtEqualsTo' )
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtEqualsToKeyword_2_0_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6056:1: ( 'isParaLenghtEqualsTo' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6057:1: 'isParaLenghtEqualsTo'
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtEqualsToKeyword_2_0_0()); 
            match(input,52,FOLLOW_52_in_rule__HTTPParamLenCheck__NameAssignment_2_012111); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtEqualsToKeyword_2_0_0()); 

            }

             after(grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtEqualsToKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__NameAssignment_2_0"


    // $ANTLR start "rule__HTTPParamLenCheck__ValueAssignment_2_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6072:1: rule__HTTPParamLenCheck__ValueAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__HTTPParamLenCheck__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6076:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6077:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6077:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6078:1: RULE_INT
            {
             before(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_2_212150); 
             after(grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTTPParamLenCheck__ValueAssignment_2_2"


    // $ANTLR start "rule__EndPoint__PortAssignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6087:1: rule__EndPoint__PortAssignment_2 : ( RULE_INT ) ;
    public final void rule__EndPoint__PortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6091:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6092:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6092:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6093:1: RULE_INT
            {
             before(grammarAccess.getEndPointAccess().getPortINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EndPoint__PortAssignment_212181); 
             after(grammarAccess.getEndPointAccess().getPortINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__PortAssignment_2"


    // $ANTLR start "rule__EndPoint__ProtocolAssignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6102:1: rule__EndPoint__ProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__EndPoint__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6106:1: ( ( ruleProtocol ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6107:1: ( ruleProtocol )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6107:1: ( ruleProtocol )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6108:1: ruleProtocol
            {
             before(grammarAccess.getEndPointAccess().getProtocolProtocolEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProtocol_in_rule__EndPoint__ProtocolAssignment_412212);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getEndPointAccess().getProtocolProtocolEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__ProtocolAssignment_4"


    // $ANTLR start "rule__DropRequest__ActionAssignment"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6117:1: rule__DropRequest__ActionAssignment : ( ( 'drop' ) ) ;
    public final void rule__DropRequest__ActionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6121:1: ( ( ( 'drop' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6122:1: ( ( 'drop' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6122:1: ( ( 'drop' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6123:1: ( 'drop' )
            {
             before(grammarAccess.getDropRequestAccess().getActionDropKeyword_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6124:1: ( 'drop' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6125:1: 'drop'
            {
             before(grammarAccess.getDropRequestAccess().getActionDropKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__DropRequest__ActionAssignment12248); 
             after(grammarAccess.getDropRequestAccess().getActionDropKeyword_0()); 

            }

             after(grammarAccess.getDropRequestAccess().getActionDropKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRequest__ActionAssignment"


    // $ANTLR start "rule__BlockSender__ActionAssignment"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6140:1: rule__BlockSender__ActionAssignment : ( ( 'block' ) ) ;
    public final void rule__BlockSender__ActionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6144:1: ( ( ( 'block' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6145:1: ( ( 'block' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6145:1: ( ( 'block' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6146:1: ( 'block' )
            {
             before(grammarAccess.getBlockSenderAccess().getActionBlockKeyword_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6147:1: ( 'block' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6148:1: 'block'
            {
             before(grammarAccess.getBlockSenderAccess().getActionBlockKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__BlockSender__ActionAssignment12292); 
             after(grammarAccess.getBlockSenderAccess().getActionBlockKeyword_0()); 

            }

             after(grammarAccess.getBlockSenderAccess().getActionBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSender__ActionAssignment"


    // $ANTLR start "rule__PassRequest__ActionAssignment"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6163:1: rule__PassRequest__ActionAssignment : ( ( 'pass' ) ) ;
    public final void rule__PassRequest__ActionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6167:1: ( ( ( 'pass' ) ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6168:1: ( ( 'pass' ) )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6168:1: ( ( 'pass' ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6169:1: ( 'pass' )
            {
             before(grammarAccess.getPassRequestAccess().getActionPassKeyword_0()); 
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6170:1: ( 'pass' )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6171:1: 'pass'
            {
             before(grammarAccess.getPassRequestAccess().getActionPassKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__PassRequest__ActionAssignment12336); 
             after(grammarAccess.getPassRequestAccess().getActionPassKeyword_0()); 

            }

             after(grammarAccess.getPassRequestAccess().getActionPassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassRequest__ActionAssignment"


    // $ANTLR start "rule__IPAddress__Byte1Assignment_0"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6186:1: rule__IPAddress__Byte1Assignment_0 : ( RULE_INT ) ;
    public final void rule__IPAddress__Byte1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6190:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6191:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6191:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6192:1: RULE_INT
            {
             before(grammarAccess.getIPAddressAccess().getByte1INTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IPAddress__Byte1Assignment_012375); 
             after(grammarAccess.getIPAddressAccess().getByte1INTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Byte1Assignment_0"


    // $ANTLR start "rule__IPAddress__Byte2Assignment_2"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6201:1: rule__IPAddress__Byte2Assignment_2 : ( RULE_INT ) ;
    public final void rule__IPAddress__Byte2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6205:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6206:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6206:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6207:1: RULE_INT
            {
             before(grammarAccess.getIPAddressAccess().getByte2INTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IPAddress__Byte2Assignment_212406); 
             after(grammarAccess.getIPAddressAccess().getByte2INTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Byte2Assignment_2"


    // $ANTLR start "rule__IPAddress__Byte3Assignment_4"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6216:1: rule__IPAddress__Byte3Assignment_4 : ( RULE_INT ) ;
    public final void rule__IPAddress__Byte3Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6220:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6221:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6221:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6222:1: RULE_INT
            {
             before(grammarAccess.getIPAddressAccess().getByte3INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IPAddress__Byte3Assignment_412437); 
             after(grammarAccess.getIPAddressAccess().getByte3INTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Byte3Assignment_4"


    // $ANTLR start "rule__IPAddress__Byte4Assignment_6"
    // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6231:1: rule__IPAddress__Byte4Assignment_6 : ( RULE_INT ) ;
    public final void rule__IPAddress__Byte4Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6235:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6236:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6236:1: ( RULE_INT )
            // ../org.xtext.example.mydslsample.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDslSample.g:6237:1: RULE_INT
            {
             before(grammarAccess.getIPAddressAccess().getByte4INTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IPAddress__Byte4Assignment_612468); 
             after(grammarAccess.getIPAddressAccess().getByte4INTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPAddress__Byte4Assignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHttpShieldModel_in_entryRuleHttpShieldModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpShieldModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpShieldModel__AgentsAssignment_in_ruleHttpShieldModel94 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Alternatives_in_ruleAgent155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaliciousRequest_in_entryRuleMaliciousRequest304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaliciousRequest311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__0_in_ruleMaliciousRequest337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalRequest_in_entryRuleNormalRequest364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalRequest371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__0_in_ruleNormalRequest397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefender_in_entryRuleDefender424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefender431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__0_in_ruleDefender457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicyList_in_entryRuleSecurityPolicyList484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityPolicyList491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__0_in_ruleSecurityPolicyList517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicy_in_entryRuleSecurityPolicy544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityPolicy551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__0_in_ruleSecurityPolicy577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubCondition_in_entryRuleSubCondition724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubCondition731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubCondition__Alternatives_in_ruleSubCondition757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolCheck_in_entryRuleProtocolCheck784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolCheck791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__0_in_ruleProtocolCheck817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPMethodCheck_in_entryRuleHTTPMethodCheck844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHTTPMethodCheck851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__0_in_ruleHTTPMethodCheck877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegExpMatch_in_entryRuleRegExpMatch904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegExpMatch911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__0_in_ruleRegExpMatch937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequencyCheck_in_entryRuleFrequencyCheck964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrequencyCheck971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__0_in_ruleFrequencyCheck997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPParamLenCheck_in_entryRuleHTTPParamLenCheck1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHTTPParamLenCheck1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Alternatives_in_ruleHTTPParamLenCheck1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndPoint_in_entryRuleEndPoint1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndPoint1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__0_in_ruleEndPoint1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropRequest_in_entryRuleDropRequest1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropRequest1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DropRequest__ActionAssignment_in_ruleDropRequest1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSender_in_entryRuleBlockSender1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockSender1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSender__ActionAssignment_in_ruleBlockSender1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassRequest_in_entryRulePassRequest1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassRequest1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PassRequest__ActionAssignment_in_rulePassRequest1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_entryRuleIPAddress1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPAddress1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__0_in_ruleIPAddress1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Alternatives_in_ruleProtocol1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Agent__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Agent__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefender_in_rule__Agent__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SecurityPolicy__OperationListAlternatives_7_0_01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SecurityPolicy__OperationListAlternatives_7_0_01517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropRequest_in_rule__Action__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSender_in_rule__Action__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassRequest_in_rule__Action__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolCheck_in_rule__SubCondition__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPMethodCheck_in_rule__SubCondition__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegExpMatch_in_rule__SubCondition__Alternatives1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequencyCheck_in_rule__SubCondition__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPParamLenCheck_in_rule__SubCondition__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HTTPMethodCheck__ValueAlternatives_2_01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HTTPMethodCheck__ValueAlternatives_2_01738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HTTPMethodCheck__ValueAlternatives_2_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__HTTPMethodCheck__ValueAlternatives_2_01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HTTPMethodCheck__ValueAlternatives_2_01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__0_in_rule__HTTPParamLenCheck__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__0_in_rule__HTTPParamLenCheck__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__0_in_rule__HTTPParamLenCheck__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Protocol__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Protocol__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Protocol__Alternatives1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Protocol__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__TypeAssignment_0_in_rule__User__Group__0__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__12058 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__22118 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__22121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__User__Group__2__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__32180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__32183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__User__Group__3__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__42242 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__User__Group__5_in_rule__User__Group__42245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__FilenameAssignment_4_in_rule__User__Group__4__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__52302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__User__Group__6_in_rule__User__Group__52305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__User__Group__5__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__62364 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__User__Group__7_in_rule__User__Group__62367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__SourceAssignment_6_in_rule__User__Group__6__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__72424 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__User__Group__8_in_rule__User__Group__72427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__RequestsAssignment_7_in_rule__User__Group__7__Impl2454 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__82485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__User__Group__8__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__02562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__02565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__TypeAssignment_0_in_rule__Attacker__Group__0__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__12622 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__2_in_rule__Attacker__Group__12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__2__Impl_in_rule__Attacker__Group__22682 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__3_in_rule__Attacker__Group__22685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attacker__Group__2__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__3__Impl_in_rule__Attacker__Group__32744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attacker__Group__4_in_rule__Attacker__Group__32747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attacker__Group__3__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__4__Impl_in_rule__Attacker__Group__42806 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__5_in_rule__Attacker__Group__42809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__FilenameAssignment_4_in_rule__Attacker__Group__4__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__5__Impl_in_rule__Attacker__Group__52866 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attacker__Group__6_in_rule__Attacker__Group__52869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attacker__Group__5__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__6__Impl_in_rule__Attacker__Group__62928 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__7_in_rule__Attacker__Group__62931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__SourceAssignment_6_in_rule__Attacker__Group__6__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__7__Impl_in_rule__Attacker__Group__72988 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__8_in_rule__Attacker__Group__72991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__RequestsAssignment_7_in_rule__Attacker__Group__7__Impl3018 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__8__Impl_in_rule__Attacker__Group__83049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Attacker__Group__8__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__0__Impl_in_rule__MaliciousRequest__Group__03126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__1_in_rule__MaliciousRequest__Group__03129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MaliciousRequest__Group__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__1__Impl_in_rule__MaliciousRequest__Group__13188 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__2_in_rule__MaliciousRequest__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__NameAssignment_1_in_rule__MaliciousRequest__Group__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__2__Impl_in_rule__MaliciousRequest__Group__23248 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__3_in_rule__MaliciousRequest__Group__23251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MaliciousRequest__Group__2__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__3__Impl_in_rule__MaliciousRequest__Group__33310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__4_in_rule__MaliciousRequest__Group__33313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MaliciousRequest__Group__3__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__4__Impl_in_rule__MaliciousRequest__Group__43372 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__5_in_rule__MaliciousRequest__Group__43375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__SourceAssignment_4_in_rule__MaliciousRequest__Group__4__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__5__Impl_in_rule__MaliciousRequest__Group__53432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__6_in_rule__MaliciousRequest__Group__53435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MaliciousRequest__Group__5__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__6__Impl_in_rule__MaliciousRequest__Group__63494 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__7_in_rule__MaliciousRequest__Group__63497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__DestinationAssignment_6_in_rule__MaliciousRequest__Group__6__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__7__Impl_in_rule__MaliciousRequest__Group__73554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__8_in_rule__MaliciousRequest__Group__73557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MaliciousRequest__Group__7__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__8__Impl_in_rule__MaliciousRequest__Group__83616 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__9_in_rule__MaliciousRequest__Group__83619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__PortAssignment_8_in_rule__MaliciousRequest__Group__8__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__9__Impl_in_rule__MaliciousRequest__Group__93676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__10_in_rule__MaliciousRequest__Group__93679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MaliciousRequest__Group__9__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__10__Impl_in_rule__MaliciousRequest__Group__103738 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__11_in_rule__MaliciousRequest__Group__103741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__DataAssignment_10_in_rule__MaliciousRequest__Group__10__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__11__Impl_in_rule__MaliciousRequest__Group__113798 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__12_in_rule__MaliciousRequest__Group__113801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MaliciousRequest__Group__11__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__12__Impl_in_rule__MaliciousRequest__Group__123860 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__13_in_rule__MaliciousRequest__Group__123863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__ProtocolAssignment_12_in_rule__MaliciousRequest__Group__12__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaliciousRequest__Group__13__Impl_in_rule__MaliciousRequest__Group__133920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MaliciousRequest__Group__13__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__0__Impl_in_rule__NormalRequest__Group__04007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__1_in_rule__NormalRequest__Group__04010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NormalRequest__Group__0__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__1__Impl_in_rule__NormalRequest__Group__14069 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__2_in_rule__NormalRequest__Group__14072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__NameAssignment_1_in_rule__NormalRequest__Group__1__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__2__Impl_in_rule__NormalRequest__Group__24129 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__3_in_rule__NormalRequest__Group__24132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NormalRequest__Group__2__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__3__Impl_in_rule__NormalRequest__Group__34191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__4_in_rule__NormalRequest__Group__34194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NormalRequest__Group__3__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__4__Impl_in_rule__NormalRequest__Group__44253 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__5_in_rule__NormalRequest__Group__44256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__SourceAssignment_4_in_rule__NormalRequest__Group__4__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__5__Impl_in_rule__NormalRequest__Group__54313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__6_in_rule__NormalRequest__Group__54316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NormalRequest__Group__5__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__6__Impl_in_rule__NormalRequest__Group__64375 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__7_in_rule__NormalRequest__Group__64378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__DestinationAssignment_6_in_rule__NormalRequest__Group__6__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__7__Impl_in_rule__NormalRequest__Group__74435 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__8_in_rule__NormalRequest__Group__74438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NormalRequest__Group__7__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__8__Impl_in_rule__NormalRequest__Group__84497 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__9_in_rule__NormalRequest__Group__84500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__PortAssignment_8_in_rule__NormalRequest__Group__8__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__9__Impl_in_rule__NormalRequest__Group__94557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__10_in_rule__NormalRequest__Group__94560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NormalRequest__Group__9__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__10__Impl_in_rule__NormalRequest__Group__104619 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__11_in_rule__NormalRequest__Group__104622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__DataAssignment_10_in_rule__NormalRequest__Group__10__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__11__Impl_in_rule__NormalRequest__Group__114679 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__12_in_rule__NormalRequest__Group__114682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NormalRequest__Group__11__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__12__Impl_in_rule__NormalRequest__Group__124741 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__13_in_rule__NormalRequest__Group__124744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__ProtocolAssignment_12_in_rule__NormalRequest__Group__12__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalRequest__Group__13__Impl_in_rule__NormalRequest__Group__134801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NormalRequest__Group__13__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__0__Impl_in_rule__Defender__Group__04888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Defender__Group__1_in_rule__Defender__Group__04891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__TypeAssignment_0_in_rule__Defender__Group__0__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__1__Impl_in_rule__Defender__Group__14948 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Defender__Group__2_in_rule__Defender__Group__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__NameAssignment_1_in_rule__Defender__Group__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__2__Impl_in_rule__Defender__Group__25008 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Defender__Group__3_in_rule__Defender__Group__25011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Defender__Group__2__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__3__Impl_in_rule__Defender__Group__35070 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Defender__Group__4_in_rule__Defender__Group__35073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Defender__Group__3__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__4__Impl_in_rule__Defender__Group__45132 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Defender__Group__5_in_rule__Defender__Group__45135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__FilenameAssignment_4_in_rule__Defender__Group__4__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__5__Impl_in_rule__Defender__Group__55192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Defender__Group__6_in_rule__Defender__Group__55195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Defender__Group__5__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__6__Impl_in_rule__Defender__Group__65254 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Defender__Group__7_in_rule__Defender__Group__65257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__SourceAssignment_6_in_rule__Defender__Group__6__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__7__Impl_in_rule__Defender__Group__75314 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Defender__Group__8_in_rule__Defender__Group__75317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__SecurityPolicylistAssignment_7_in_rule__Defender__Group__7__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Defender__Group__8__Impl_in_rule__Defender__Group__85374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Defender__Group__8__Impl5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__0__Impl_in_rule__SecurityPolicyList__Group__05451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__1_in_rule__SecurityPolicyList__Group__05454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SecurityPolicyList__Group__0__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__1__Impl_in_rule__SecurityPolicyList__Group__15513 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__2_in_rule__SecurityPolicyList__Group__15516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__NameAssignment_1_in_rule__SecurityPolicyList__Group__1__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__2__Impl_in_rule__SecurityPolicyList__Group__25573 = new BitSet(new long[]{0x0000008202000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__3_in_rule__SecurityPolicyList__Group__25576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SecurityPolicyList__Group__2__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__3__Impl_in_rule__SecurityPolicyList__Group__35635 = new BitSet(new long[]{0x0000008202000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__4_in_rule__SecurityPolicyList__Group__35638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__SecurityPoliciesAssignment_3_in_rule__SecurityPolicyList__Group__3__Impl5665 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__4__Impl_in_rule__SecurityPolicyList__Group__45696 = new BitSet(new long[]{0x0000008202000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__5_in_rule__SecurityPolicyList__Group__45699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__ConditionsAssignment_4_in_rule__SecurityPolicyList__Group__4__Impl5726 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicyList__Group__5__Impl_in_rule__SecurityPolicyList__Group__55757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SecurityPolicyList__Group__5__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__0__Impl_in_rule__SecurityPolicy__Group__05828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__1_in_rule__SecurityPolicy__Group__05831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SecurityPolicy__Group__0__Impl5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__1__Impl_in_rule__SecurityPolicy__Group__15890 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__2_in_rule__SecurityPolicy__Group__15893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__NameAssignment_1_in_rule__SecurityPolicy__Group__1__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__2__Impl_in_rule__SecurityPolicy__Group__25950 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__3_in_rule__SecurityPolicy__Group__25953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SecurityPolicy__Group__2__Impl5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__3__Impl_in_rule__SecurityPolicy__Group__36012 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__4_in_rule__SecurityPolicy__Group__36015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__EndPointAssignment_3_in_rule__SecurityPolicy__Group__3__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__4__Impl_in_rule__SecurityPolicy__Group__46072 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__5_in_rule__SecurityPolicy__Group__46075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SecurityPolicy__Group__4__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__5__Impl_in_rule__SecurityPolicy__Group__56134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__6_in_rule__SecurityPolicy__Group__56137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SecurityPolicy__Group__5__Impl6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__6__Impl_in_rule__SecurityPolicy__Group__66196 = new BitSet(new long[]{0x0000001000001800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__7_in_rule__SecurityPolicy__Group__66199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__ConditionlistAssignment_6_in_rule__SecurityPolicy__Group__6__Impl6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__7__Impl_in_rule__SecurityPolicy__Group__76256 = new BitSet(new long[]{0x0000001000001800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__8_in_rule__SecurityPolicy__Group__76259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_7__0_in_rule__SecurityPolicy__Group__7__Impl6286 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__8__Impl_in_rule__SecurityPolicy__Group__86317 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__9_in_rule__SecurityPolicy__Group__86320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SecurityPolicy__Group__8__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__9__Impl_in_rule__SecurityPolicy__Group__96379 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__10_in_rule__SecurityPolicy__Group__96382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SecurityPolicy__Group__9__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__10__Impl_in_rule__SecurityPolicy__Group__106441 = new BitSet(new long[]{0x0000004000000800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__11_in_rule__SecurityPolicy__Group__106444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__TrueActionListAssignment_10_in_rule__SecurityPolicy__Group__10__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__11__Impl_in_rule__SecurityPolicy__Group__116501 = new BitSet(new long[]{0x0000004000000800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__12_in_rule__SecurityPolicy__Group__116504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_11__0_in_rule__SecurityPolicy__Group__11__Impl6531 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__12__Impl_in_rule__SecurityPolicy__Group__126562 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__13_in_rule__SecurityPolicy__Group__126565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SecurityPolicy__Group__12__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__13__Impl_in_rule__SecurityPolicy__Group__136624 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__14_in_rule__SecurityPolicy__Group__136627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__FalseActionListAssignment_13_in_rule__SecurityPolicy__Group__13__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__14__Impl_in_rule__SecurityPolicy__Group__146684 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__15_in_rule__SecurityPolicy__Group__146687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_14__0_in_rule__SecurityPolicy__Group__14__Impl6714 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group__15__Impl_in_rule__SecurityPolicy__Group__156745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SecurityPolicy__Group__15__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_7__0__Impl_in_rule__SecurityPolicy__Group_7__06836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_7__1_in_rule__SecurityPolicy__Group_7__06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__OperationListAssignment_7_0_in_rule__SecurityPolicy__Group_7__0__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_7__1__Impl_in_rule__SecurityPolicy__Group_7__16896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__ConditionlistAssignment_7_1_in_rule__SecurityPolicy__Group_7__1__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_11__0__Impl_in_rule__SecurityPolicy__Group_11__06957 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_11__1_in_rule__SecurityPolicy__Group_11__06960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SecurityPolicy__Group_11__0__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_11__1__Impl_in_rule__SecurityPolicy__Group_11__17019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__TrueActionListAssignment_11_1_in_rule__SecurityPolicy__Group_11__1__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_14__0__Impl_in_rule__SecurityPolicy__Group_14__07080 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_14__1_in_rule__SecurityPolicy__Group_14__07083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SecurityPolicy__Group_14__0__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__Group_14__1__Impl_in_rule__SecurityPolicy__Group_14__17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__FalseActionListAssignment_14_1_in_rule__SecurityPolicy__Group_14__1__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Condition__Group__0__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__17265 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__17268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__NameAssignment_1_in_rule__Condition__Group__1__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__27325 = new BitSet(new long[]{0x001FC00000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__27328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Condition__Group__2__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__37387 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__Condition__Group__4_in_rule__Condition__Group__37390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__SubConditionListAssignment_3_in_rule__Condition__Group__3__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__4__Impl_in_rule__Condition__Group__47447 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__Condition__Group__5_in_rule__Condition__Group__47450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_4__0_in_rule__Condition__Group__4__Impl7477 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Condition__Group__5__Impl_in_rule__Condition__Group__57508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Condition__Group__5__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_4__0__Impl_in_rule__Condition__Group_4__07579 = new BitSet(new long[]{0x001FC00000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group_4__1_in_rule__Condition__Group_4__07582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Condition__Group_4__0__Impl7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_4__1__Impl_in_rule__Condition__Group_4__17641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__SubConditionListAssignment_4_1_in_rule__Condition__Group_4__1__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__0__Impl_in_rule__ProtocolCheck__Group__07702 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__1_in_rule__ProtocolCheck__Group__07705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__NameAssignment_0_in_rule__ProtocolCheck__Group__0__Impl7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__1__Impl_in_rule__ProtocolCheck__Group__17762 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__2_in_rule__ProtocolCheck__Group__17765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ProtocolCheck__Group__1__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__2__Impl_in_rule__ProtocolCheck__Group__27824 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__3_in_rule__ProtocolCheck__Group__27827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__ValueAssignment_2_in_rule__ProtocolCheck__Group__2__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProtocolCheck__Group__3__Impl_in_rule__ProtocolCheck__Group__37884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ProtocolCheck__Group__3__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__0__Impl_in_rule__HTTPMethodCheck__Group__07951 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__1_in_rule__HTTPMethodCheck__Group__07954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__NameAssignment_0_in_rule__HTTPMethodCheck__Group__0__Impl7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__1__Impl_in_rule__HTTPMethodCheck__Group__18011 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__2_in_rule__HTTPMethodCheck__Group__18014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__HTTPMethodCheck__Group__1__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__2__Impl_in_rule__HTTPMethodCheck__Group__28073 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__3_in_rule__HTTPMethodCheck__Group__28076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__ValueAssignment_2_in_rule__HTTPMethodCheck__Group__2__Impl8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__Group__3__Impl_in_rule__HTTPMethodCheck__Group__38133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HTTPMethodCheck__Group__3__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__0__Impl_in_rule__RegExpMatch__Group__08200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__1_in_rule__RegExpMatch__Group__08203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__NameAssignment_0_in_rule__RegExpMatch__Group__0__Impl8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__1__Impl_in_rule__RegExpMatch__Group__18260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__2_in_rule__RegExpMatch__Group__18263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RegExpMatch__Group__1__Impl8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__2__Impl_in_rule__RegExpMatch__Group__28322 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__3_in_rule__RegExpMatch__Group__28325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__ValueAssignment_2_in_rule__RegExpMatch__Group__2__Impl8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegExpMatch__Group__3__Impl_in_rule__RegExpMatch__Group__38382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RegExpMatch__Group__3__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__0__Impl_in_rule__FrequencyCheck__Group__08449 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__1_in_rule__FrequencyCheck__Group__08452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__NameAssignment_0_in_rule__FrequencyCheck__Group__0__Impl8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__1__Impl_in_rule__FrequencyCheck__Group__18509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__2_in_rule__FrequencyCheck__Group__18512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FrequencyCheck__Group__1__Impl8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__2__Impl_in_rule__FrequencyCheck__Group__28571 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__3_in_rule__FrequencyCheck__Group__28574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__ValueAssignment_2_in_rule__FrequencyCheck__Group__2__Impl8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrequencyCheck__Group__3__Impl_in_rule__FrequencyCheck__Group__38631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FrequencyCheck__Group__3__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__0__Impl_in_rule__HTTPParamLenCheck__Group_0__08698 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__1_in_rule__HTTPParamLenCheck__Group_0__08701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__NameAssignment_0_0_in_rule__HTTPParamLenCheck__Group_0__0__Impl8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__1__Impl_in_rule__HTTPParamLenCheck__Group_0__18758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__2_in_rule__HTTPParamLenCheck__Group_0__18761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__HTTPParamLenCheck__Group_0__1__Impl8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__2__Impl_in_rule__HTTPParamLenCheck__Group_0__28820 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__3_in_rule__HTTPParamLenCheck__Group_0__28823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_0_2_in_rule__HTTPParamLenCheck__Group_0__2__Impl8850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_0__3__Impl_in_rule__HTTPParamLenCheck__Group_0__38880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HTTPParamLenCheck__Group_0__3__Impl8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__0__Impl_in_rule__HTTPParamLenCheck__Group_1__08947 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__1_in_rule__HTTPParamLenCheck__Group_1__08950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__NameAssignment_1_0_in_rule__HTTPParamLenCheck__Group_1__0__Impl8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__1__Impl_in_rule__HTTPParamLenCheck__Group_1__19007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__2_in_rule__HTTPParamLenCheck__Group_1__19010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__HTTPParamLenCheck__Group_1__1__Impl9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__2__Impl_in_rule__HTTPParamLenCheck__Group_1__29069 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__3_in_rule__HTTPParamLenCheck__Group_1__29072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_1_2_in_rule__HTTPParamLenCheck__Group_1__2__Impl9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_1__3__Impl_in_rule__HTTPParamLenCheck__Group_1__39129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HTTPParamLenCheck__Group_1__3__Impl9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__0__Impl_in_rule__HTTPParamLenCheck__Group_2__09196 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__1_in_rule__HTTPParamLenCheck__Group_2__09199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__NameAssignment_2_0_in_rule__HTTPParamLenCheck__Group_2__0__Impl9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__1__Impl_in_rule__HTTPParamLenCheck__Group_2__19256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__2_in_rule__HTTPParamLenCheck__Group_2__19259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__HTTPParamLenCheck__Group_2__1__Impl9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__2__Impl_in_rule__HTTPParamLenCheck__Group_2__29318 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__3_in_rule__HTTPParamLenCheck__Group_2__29321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__ValueAssignment_2_2_in_rule__HTTPParamLenCheck__Group_2__2__Impl9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPParamLenCheck__Group_2__3__Impl_in_rule__HTTPParamLenCheck__Group_2__39378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HTTPParamLenCheck__Group_2__3__Impl9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__0__Impl_in_rule__EndPoint__Group__09445 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__1_in_rule__EndPoint__Group__09448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EndPoint__Group__0__Impl9476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__1__Impl_in_rule__EndPoint__Group__19507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__2_in_rule__EndPoint__Group__19510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EndPoint__Group__1__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__2__Impl_in_rule__EndPoint__Group__29569 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__3_in_rule__EndPoint__Group__29572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__PortAssignment_2_in_rule__EndPoint__Group__2__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__3__Impl_in_rule__EndPoint__Group__39629 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__4_in_rule__EndPoint__Group__39632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EndPoint__Group__3__Impl9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__4__Impl_in_rule__EndPoint__Group__49691 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__5_in_rule__EndPoint__Group__49694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__ProtocolAssignment_4_in_rule__EndPoint__Group__4__Impl9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndPoint__Group__5__Impl_in_rule__EndPoint__Group__59751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EndPoint__Group__5__Impl9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__0__Impl_in_rule__IPAddress__Group__09822 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__1_in_rule__IPAddress__Group__09825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Byte1Assignment_0_in_rule__IPAddress__Group__0__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__1__Impl_in_rule__IPAddress__Group__19882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__2_in_rule__IPAddress__Group__19885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IPAddress__Group__1__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__2__Impl_in_rule__IPAddress__Group__29944 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__3_in_rule__IPAddress__Group__29947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Byte2Assignment_2_in_rule__IPAddress__Group__2__Impl9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__3__Impl_in_rule__IPAddress__Group__310004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__4_in_rule__IPAddress__Group__310007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IPAddress__Group__3__Impl10035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__4__Impl_in_rule__IPAddress__Group__410066 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__5_in_rule__IPAddress__Group__410069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Byte3Assignment_4_in_rule__IPAddress__Group__4__Impl10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__5__Impl_in_rule__IPAddress__Group__510126 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__6_in_rule__IPAddress__Group__510129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IPAddress__Group__5__Impl10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Group__6__Impl_in_rule__IPAddress__Group__610188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPAddress__Byte4Assignment_6_in_rule__IPAddress__Group__6__Impl10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__HttpShieldModel__AgentsAssignment10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__User__TypeAssignment_010300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_110339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__User__FilenameAssignment_410370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__User__SourceAssignment_610401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalRequest_in_rule__User__RequestsAssignment_710432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Attacker__TypeAssignment_010468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_110507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attacker__FilenameAssignment_410538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__Attacker__SourceAssignment_610569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaliciousRequest_in_rule__Attacker__RequestsAssignment_710600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MaliciousRequest__NameAssignment_110631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__MaliciousRequest__SourceAssignment_410662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__MaliciousRequest__DestinationAssignment_610693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MaliciousRequest__PortAssignment_810724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MaliciousRequest__DataAssignment_1010755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__MaliciousRequest__ProtocolAssignment_1210786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NormalRequest__NameAssignment_110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__NormalRequest__SourceAssignment_410848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__NormalRequest__DestinationAssignment_610879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NormalRequest__PortAssignment_810910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NormalRequest__DataAssignment_1010941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__NormalRequest__ProtocolAssignment_1210972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Defender__TypeAssignment_011008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Defender__NameAssignment_111047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Defender__FilenameAssignment_411078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_rule__Defender__SourceAssignment_611109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicyList_in_rule__Defender__SecurityPolicylistAssignment_711140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityPolicyList__NameAssignment_111171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicy_in_rule__SecurityPolicyList__SecurityPoliciesAssignment_311202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__SecurityPolicyList__ConditionsAssignment_411233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityPolicy__NameAssignment_111264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndPoint_in_rule__SecurityPolicy__EndPointAssignment_311295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityPolicy__ConditionlistAssignment_611330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityPolicy__OperationListAlternatives_7_0_0_in_rule__SecurityPolicy__OperationListAssignment_7_011365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityPolicy__ConditionlistAssignment_7_111402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__SecurityPolicy__TrueActionListAssignment_1011437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__SecurityPolicy__TrueActionListAssignment_11_111468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__SecurityPolicy__FalseActionListAssignment_1311499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__SecurityPolicy__FalseActionListAssignment_14_111530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__NameAssignment_111561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubCondition_in_rule__Condition__SubConditionListAssignment_311592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubCondition_in_rule__Condition__SubConditionListAssignment_4_111623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ProtocolCheck__NameAssignment_011659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__ProtocolCheck__ValueAssignment_211698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__HTTPMethodCheck__NameAssignment_011734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HTTPMethodCheck__ValueAlternatives_2_0_in_rule__HTTPMethodCheck__ValueAssignment_211773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RegExpMatch__NameAssignment_011811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegExpMatch__ValueAssignment_211850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FrequencyCheck__NameAssignment_011886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FrequencyCheck__ValueAssignment_211925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__HTTPParamLenCheck__NameAssignment_0_011961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_0_212000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__HTTPParamLenCheck__NameAssignment_1_012036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_1_212075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__HTTPParamLenCheck__NameAssignment_2_012111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HTTPParamLenCheck__ValueAssignment_2_212150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EndPoint__PortAssignment_212181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__EndPoint__ProtocolAssignment_412212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DropRequest__ActionAssignment12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__BlockSender__ActionAssignment12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PassRequest__ActionAssignment12336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IPAddress__Byte1Assignment_012375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IPAddress__Byte2Assignment_212406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IPAddress__Byte3Assignment_412437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IPAddress__Byte4Assignment_612468 = new BitSet(new long[]{0x0000000000000002L});

}