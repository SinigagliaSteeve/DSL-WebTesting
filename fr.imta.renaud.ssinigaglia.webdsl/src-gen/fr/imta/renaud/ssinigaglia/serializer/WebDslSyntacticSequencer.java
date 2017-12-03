/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.serializer;

import com.google.inject.Inject;
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class WebDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WebDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CheckboxSelection___CheckKeyword_3_1_or_UncheckKeyword_3_2__a;
	protected AbstractElementAlias match_ComboboxSelection___SelectKeyword_3_1_0_STRINGTerminalRuleCall_3_1_1__a;
	protected AbstractElementAlias match_LinkButtonSelection_ClickKeyword_3_1_a;
	protected AbstractElementAlias match_TypeSelection_ALLKeyword_4_or_FIRSTKeyword_2_or_LASTKeyword_3_or_PARENTKeyword_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WebDslGrammarAccess) access;
		match_CheckboxSelection___CheckKeyword_3_1_or_UncheckKeyword_3_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2()));
		match_ComboboxSelection___SelectKeyword_3_1_0_STRINGTerminalRuleCall_3_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1()));
		match_LinkButtonSelection_ClickKeyword_3_1_a = new TokenAlias(true, true, grammarAccess.getLinkButtonSelectionAccess().getClickKeyword_3_1());
		match_TypeSelection_ALLKeyword_4_or_FIRSTKeyword_2_or_LASTKeyword_3_or_PARENTKeyword_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeSelectionAccess().getALLKeyword_4()), new TokenAlias(false, false, grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()), new TokenAlias(false, false, grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()), new TokenAlias(false, false, grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CheckboxSelection___CheckKeyword_3_1_or_UncheckKeyword_3_2__a.equals(syntax))
				emit_CheckboxSelection___CheckKeyword_3_1_or_UncheckKeyword_3_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComboboxSelection___SelectKeyword_3_1_0_STRINGTerminalRuleCall_3_1_1__a.equals(syntax))
				emit_ComboboxSelection___SelectKeyword_3_1_0_STRINGTerminalRuleCall_3_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinkButtonSelection_ClickKeyword_3_1_a.equals(syntax))
				emit_LinkButtonSelection_ClickKeyword_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TypeSelection_ALLKeyword_4_or_FIRSTKeyword_2_or_LASTKeyword_3_or_PARENTKeyword_1.equals(syntax))
				emit_TypeSelection_ALLKeyword_4_or_FIRSTKeyword_2_or_LASTKeyword_3_or_PARENTKeyword_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('uncheck' | 'check')*
	 *
	 * This ambiguous syntax occurs at:
	 *     generalActions+=GeneralAction (ambiguity) '}' (rule end)
	 *     generalActions+=GeneralAction (ambiguity) generalActions+=GeneralAction
	 *     typeSelection=TypeSelection '{' (ambiguity) '}' (rule end)
	 *     typeSelection=TypeSelection '{' (ambiguity) generalActions+=GeneralAction
	 */
	protected void emit_CheckboxSelection___CheckKeyword_3_1_or_UncheckKeyword_3_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('select' STRING)*
	 *
	 * This ambiguous syntax occurs at:
	 *     generalActions+=GeneralAction (ambiguity) '}' (rule end)
	 *     generalActions+=GeneralAction (ambiguity) generalActions+=GeneralAction
	 *     typeSelection=TypeSelection '{' (ambiguity) '}' (rule end)
	 *     typeSelection=TypeSelection '{' (ambiguity) generalActions+=GeneralAction
	 */
	protected void emit_ComboboxSelection___SelectKeyword_3_1_0_STRINGTerminalRuleCall_3_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'click'*
	 *
	 * This ambiguous syntax occurs at:
	 *     generalActions+=GeneralAction (ambiguity) '}' (rule end)
	 *     generalActions+=GeneralAction (ambiguity) generalActions+=GeneralAction
	 *     typeSelection=TypeSelection '{' (ambiguity) '}' (rule end)
	 *     typeSelection=TypeSelection '{' (ambiguity) generalActions+=GeneralAction
	 */
	protected void emit_LinkButtonSelection_ClickKeyword_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'PARENT' | 'FIRST' | 'LAST' | 'ALL'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_TypeSelection_ALLKeyword_4_or_FIRSTKeyword_2_or_LASTKeyword_3_or_PARENTKeyword_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
