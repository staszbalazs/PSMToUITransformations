package transformations;

import java.util.function.Consumer;
import operations.Views;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum;
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import psm.JClass;
import psm.JUIAlias;
import queries.JClassWithGuardConditionQuery;
import queries.PatternProvider;
import queries.PsmToUiTrace;
import ui.UIClass;
import ui.UIClassView;
import ui.UIListView;

@SuppressWarnings("all")
public class ViewRuleFactory {
  @Extension
  private EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory();
  
  @Extension
  private Views view;
  
  private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> viewRule;
  
  public EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> getViewRule(final ViatraQueryEngine engine) {
    if ((this.viewRule == null)) {
      final Consumer<JClassWithGuardConditionQuery.Match> _function = (JClassWithGuardConditionQuery.Match it) -> {
        EObject _jClass = it.getJClass();
        final JClass jClass = ((JClass) _jClass);
        final PsmToUiTrace.Match match = PatternProvider.instance().getPsmToUiTrace(engine).getOneArbitraryMatch(jClass, null).get();
        Object _identifiable = match.getIdentifiable();
        final UIClass uiClass = ((UIClass) _identifiable);
        UIClassView classView = this.view.createClassView(uiClass, jClass, null, Boolean.valueOf(true), engine);
        final UIListView listView = this.view.createListView(uiClass, jClass, null, classView, Boolean.valueOf(true), engine);
        uiClass.setSelector(listView);
        EList<JUIAlias> _aliases = jClass.getAliases();
        for (final JUIAlias alias : _aliases) {
          {
            classView = this.view.createClassView(uiClass, jClass, alias, Boolean.valueOf(false), engine);
            this.view.createListView(uiClass, jClass, alias, classView, Boolean.valueOf(false), engine);
          }
        }
      };
      final Consumer<JClassWithGuardConditionQuery.Match> _function_1 = (JClassWithGuardConditionQuery.Match it) -> {
      };
      final Consumer<JClassWithGuardConditionQuery.Match> _function_2 = (JClassWithGuardConditionQuery.Match it) -> {
      };
      this.viewRule = this.factory.<JClassWithGuardConditionQuery.Match, JClassWithGuardConditionQuery.Matcher>createRule().name("ViewRule").precondition(PatternProvider.instance().getJClassWithGuardConditionQuery()).action(CRUDActivationStateEnum.CREATED, _function).action(CRUDActivationStateEnum.UPDATED, _function_1).action(CRUDActivationStateEnum.DELETED, _function_2).addLifeCycle(Lifecycles.getDefault(true, true)).build();
    }
    return this.viewRule;
  }
}
