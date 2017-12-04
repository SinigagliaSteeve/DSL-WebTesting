/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.serializer;

import com.google.inject.Inject;
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;
import fr.imta.renaud.ssinigaglia.webDsl.AssertContains;
import fr.imta.renaud.ssinigaglia.webDsl.AssertEquals;
import fr.imta.renaud.ssinigaglia.webDsl.CallProcedure;
import fr.imta.renaud.ssinigaglia.webDsl.CheckboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Core;
import fr.imta.renaud.ssinigaglia.webDsl.CountAction;
import fr.imta.renaud.ssinigaglia.webDsl.GeneralSelection;
import fr.imta.renaud.ssinigaglia.webDsl.GoAction;
import fr.imta.renaud.ssinigaglia.webDsl.LinkButtonSelection;
import fr.imta.renaud.ssinigaglia.webDsl.PageSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Procedure;
import fr.imta.renaud.ssinigaglia.webDsl.Program;
import fr.imta.renaud.ssinigaglia.webDsl.SetAction;
import fr.imta.renaud.ssinigaglia.webDsl.StoreAction;
import fr.imta.renaud.ssinigaglia.webDsl.TypeSelection;
import fr.imta.renaud.ssinigaglia.webDsl.Var;
import fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class WebDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WebDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WebDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WebDslPackage.ASSERT_CONTAINS:
				sequence_AssertContains(context, (AssertContains) semanticObject); 
				return; 
			case WebDslPackage.ASSERT_EQUALS:
				sequence_AssertEquals(context, (AssertEquals) semanticObject); 
				return; 
			case WebDslPackage.CALL_PROCEDURE:
				sequence_CallProcedure(context, (CallProcedure) semanticObject); 
				return; 
			case WebDslPackage.CHECKBOX_SELECTION:
				sequence_CheckboxSelection(context, (CheckboxSelection) semanticObject); 
				return; 
			case WebDslPackage.COMBOBOX_SELECTION:
				sequence_ComboboxSelection(context, (ComboboxSelection) semanticObject); 
				return; 
			case WebDslPackage.COMPARABLE:
				sequence_Comparable(context, (fr.imta.renaud.ssinigaglia.webDsl.Comparable) semanticObject); 
				return; 
			case WebDslPackage.CORE:
				sequence_Core(context, (Core) semanticObject); 
				return; 
			case WebDslPackage.COUNT_ACTION:
				sequence_CountAction(context, (CountAction) semanticObject); 
				return; 
			case WebDslPackage.GENERAL_SELECTION:
				sequence_GeneralSelection(context, (GeneralSelection) semanticObject); 
				return; 
			case WebDslPackage.GO_ACTION:
				sequence_GoAction(context, (GoAction) semanticObject); 
				return; 
			case WebDslPackage.LINK_BUTTON_SELECTION:
				sequence_LinkButtonSelection(context, (LinkButtonSelection) semanticObject); 
				return; 
			case WebDslPackage.PAGE_SELECTION:
				sequence_PageSelection(context, (PageSelection) semanticObject); 
				return; 
			case WebDslPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case WebDslPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case WebDslPackage.SET_ACTION:
				sequence_SetAction(context, (SetAction) semanticObject); 
				return; 
			case WebDslPackage.STORE_ACTION:
				sequence_StoreAction(context, (StoreAction) semanticObject); 
				return; 
			case WebDslPackage.TYPE_SELECTION:
				sequence_TypeSelection(context, (TypeSelection) semanticObject); 
				return; 
			case WebDslPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assert returns AssertContains
	 *     AssertContains returns AssertContains
	 *
	 * Constraint:
	 *     (((htmlElement=HtmlElement attribute=Attribute) | text='TEXT') value=STRING)
	 */
	protected void sequence_AssertContains(ISerializationContext context, AssertContains semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Assert returns AssertEquals
	 *     AssertEquals returns AssertEquals
	 *
	 * Constraint:
	 *     (c1=Comparable c2=Comparable)
	 */
	protected void sequence_AssertEquals(ISerializationContext context, AssertEquals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.ASSERT_EQUALS__C1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.ASSERT_EQUALS__C1));
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.ASSERT_EQUALS__C2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.ASSERT_EQUALS__C2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0(), semanticObject.getC1());
		feeder.accept(grammarAccess.getAssertEqualsAccess().getC2ComparableParserRuleCall_2_0(), semanticObject.getC2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns CallProcedure
	 *     CallProcedure returns CallProcedure
	 *
	 * Constraint:
	 *     (ref=[Procedure|ID] arg=STRING)
	 */
	protected void sequence_CallProcedure(ISerializationContext context, CallProcedure semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.CALL_PROCEDURE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.CALL_PROCEDURE__REF));
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.CALL_PROCEDURE__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.CALL_PROCEDURE__ARG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallProcedureAccess().getRefProcedureIDTerminalRuleCall_1_0_1(), semanticObject.eGet(WebDslPackage.Literals.CALL_PROCEDURE__REF, false));
		feeder.accept(grammarAccess.getCallProcedureAccess().getArgSTRINGTerminalRuleCall_3_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns CheckboxSelection
	 *     Selection returns CheckboxSelection
	 *     CheckboxSelection returns CheckboxSelection
	 *     GeneralAction returns CheckboxSelection
	 *
	 * Constraint:
	 *     (typeElement='CHECKBOX' typeSelection=TypeSelection (action='check' | action='uncheck'))
	 */
	protected void sequence_CheckboxSelection(ISerializationContext context, CheckboxSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ComboboxSelection
	 *     Selection returns ComboboxSelection
	 *     ComboboxSelection returns ComboboxSelection
	 *     GeneralAction returns ComboboxSelection
	 *
	 * Constraint:
	 *     (typeElement='COMBO_BOX' typeSelection=TypeSelection generalActions+=GeneralAction*)
	 */
	protected void sequence_ComboboxSelection(ISerializationContext context, ComboboxSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparable returns Comparable
	 *
	 * Constraint:
	 *     (var=Var | (htmlElement=HtmlElement attribute=Attribute))
	 */
	protected void sequence_Comparable(ISerializationContext context, fr.imta.renaud.ssinigaglia.webDsl.Comparable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Core returns Core
	 *
	 * Constraint:
	 *     (name=ID browser=Browser actions+=Action*)
	 */
	protected void sequence_Core(ISerializationContext context, Core semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CountAction returns CountAction
	 *
	 * Constraint:
	 *     (htmlElement=HtmlElement typeSelection=TypeSelection)
	 */
	protected void sequence_CountAction(ISerializationContext context, CountAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.COUNT_ACTION__HTML_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.COUNT_ACTION__HTML_ELEMENT));
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.COUNT_ACTION__TYPE_SELECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.COUNT_ACTION__TYPE_SELECTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCountActionAccess().getHtmlElementHtmlElementEnumRuleCall_1_0(), semanticObject.getHtmlElement());
		feeder.accept(grammarAccess.getCountActionAccess().getTypeSelectionTypeSelectionParserRuleCall_2_0(), semanticObject.getTypeSelection());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns GeneralSelection
	 *     Selection returns GeneralSelection
	 *     GeneralSelection returns GeneralSelection
	 *     GeneralAction returns GeneralSelection
	 *
	 * Constraint:
	 *     ((typeElement='SEARCH_FIELD' | typeElement='DIV') typeSelection=TypeSelection generalActions+=GeneralAction*)
	 */
	protected void sequence_GeneralSelection(ISerializationContext context, GeneralSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns GoAction
	 *     GoAction returns GoAction
	 *
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_GoAction(ISerializationContext context, GoAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.GO_ACTION__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.GO_ACTION__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoActionAccess().getUrlSTRINGTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns LinkButtonSelection
	 *     Selection returns LinkButtonSelection
	 *     LinkButtonSelection returns LinkButtonSelection
	 *     GeneralAction returns LinkButtonSelection
	 *
	 * Constraint:
	 *     (
	 *         (typeElement='LINK' | typeElement='BUTTON' | typeElement='IMAGE') 
	 *         typeSelection=TypeSelection 
	 *         (generalActions+=GeneralAction | clicks+='click')*
	 *     )
	 */
	protected void sequence_LinkButtonSelection(ISerializationContext context, LinkButtonSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns PageSelection
	 *     Selection returns PageSelection
	 *     PageSelection returns PageSelection
	 *     GeneralAction returns PageSelection
	 *
	 * Constraint:
	 *     (typeElement='PAGE' (storeActions+=StoreAction | assertions+=Assert)*)
	 */
	protected void sequence_PageSelection(ISerializationContext context, PageSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (name=ID var=Var actions+=Action*)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     ((procedures+=Procedure+ cores+=Core+) | cores+=Core+)?
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GeneralAction returns SetAction
	 *     SetAction returns SetAction
	 *
	 * Constraint:
	 *     (attribute=Attribute value=STRING)
	 */
	protected void sequence_SetAction(ISerializationContext context, SetAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.SET_ACTION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.SET_ACTION__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.SET_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.SET_ACTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getSetActionAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GeneralAction returns StoreAction
	 *     StoreAction returns StoreAction
	 *
	 * Constraint:
	 *     ((val=Attribute | count=CountAction) var=Var)
	 */
	protected void sequence_StoreAction(ISerializationContext context, StoreAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeSelection returns TypeSelection
	 *
	 * Constraint:
	 *     (attribute=Attribute (value=STRING | var=[Var|ID]))
	 */
	protected void sequence_TypeSelection(ISerializationContext context, TypeSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WebDslPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WebDslPackage.Literals.VAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
