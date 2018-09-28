/**
 * Generated from platform:/resource/viatra_transformation/src/queries/PatternProvider.vql
 */
package queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JParameter;
import queries.AlreadyTransformed;
import traceability.PSMToUITrace;
import ui.Identifiable;
import ui.UIAction;
import ui.UIParameterComponentType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JParameterWithGuardQueryForModify(jParameter : JParameter, parameterType : UIParameterComponentType, uiAction : UIAction, trace : PSMToUITrace, uiType : Identifiable) {
 *         	JOperation.parameters(jOperation, jParameter);
 *         	JOperation.visibility(jOperation, JVisibility::PUBLIC);
 *         	PSMToUITrace.psmElements(opTrace, jOperation);
 *         	PSMToUITrace.uiElements(opTrace, uiAction);
 *         	find alreadyTransformed(jParameter, parameterType, trace);
 *         	JParameter.type(jParameter, type);
 *         	PSMToUITrace.psmElements(typeTrace, type);
 *         	PSMToUITrace.uiElements(typeTrace, uiType);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JParameterWithGuardQueryForModify extends BaseGeneratedEMFQuerySpecification<JParameterWithGuardQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JParameterWithGuardQueryForModify pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private JParameter fJParameter;
    
    private UIParameterComponentType fParameterType;
    
    private UIAction fUiAction;
    
    private PSMToUITrace fTrace;
    
    private Identifiable fUiType;
    
    private static List<String> parameterNames = makeImmutableList("jParameter", "parameterType", "uiAction", "trace", "uiType");
    
    private Match(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      this.fJParameter = pJParameter;
      this.fParameterType = pParameterType;
      this.fUiAction = pUiAction;
      this.fTrace = pTrace;
      this.fUiType = pUiType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jParameter".equals(parameterName)) return this.fJParameter;
      if ("parameterType".equals(parameterName)) return this.fParameterType;
      if ("uiAction".equals(parameterName)) return this.fUiAction;
      if ("trace".equals(parameterName)) return this.fTrace;
      if ("uiType".equals(parameterName)) return this.fUiType;
      return null;
    }
    
    public JParameter getJParameter() {
      return this.fJParameter;
    }
    
    public UIParameterComponentType getParameterType() {
      return this.fParameterType;
    }
    
    public UIAction getUiAction() {
      return this.fUiAction;
    }
    
    public PSMToUITrace getTrace() {
      return this.fTrace;
    }
    
    public Identifiable getUiType() {
      return this.fUiType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jParameter".equals(parameterName) ) {
          this.fJParameter = (JParameter) newValue;
          return true;
      }
      if ("parameterType".equals(parameterName) ) {
          this.fParameterType = (UIParameterComponentType) newValue;
          return true;
      }
      if ("uiAction".equals(parameterName) ) {
          this.fUiAction = (UIAction) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (PSMToUITrace) newValue;
          return true;
      }
      if ("uiType".equals(parameterName) ) {
          this.fUiType = (Identifiable) newValue;
          return true;
      }
      return false;
    }
    
    public void setJParameter(final JParameter pJParameter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJParameter = pJParameter;
    }
    
    public void setParameterType(final UIParameterComponentType pParameterType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParameterType = pParameterType;
    }
    
    public void setUiAction(final UIAction pUiAction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiAction = pUiAction;
    }
    
    public void setTrace(final PSMToUITrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    public void setUiType(final Identifiable pUiType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiType = pUiType;
    }
    
    @Override
    public String patternName() {
      return "queries.JParameterWithGuardQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JParameterWithGuardQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJParameter, fParameterType, fUiAction, fTrace, fUiType};
    }
    
    @Override
    public JParameterWithGuardQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJParameter, fParameterType, fUiAction, fTrace, fUiType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jParameter\"=" + prettyPrintValue(fJParameter) + ", ");
      result.append("\"parameterType\"=" + prettyPrintValue(fParameterType) + ", ");
      result.append("\"uiAction\"=" + prettyPrintValue(fUiAction) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
      result.append("\"uiType\"=" + prettyPrintValue(fUiType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJParameter, fParameterType, fUiAction, fTrace, fUiType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JParameterWithGuardQueryForModify.Match)) {
          JParameterWithGuardQueryForModify.Match other = (JParameterWithGuardQueryForModify.Match) obj;
          return Objects.equals(fJParameter, other.fJParameter) && Objects.equals(fParameterType, other.fParameterType) && Objects.equals(fUiAction, other.fUiAction) && Objects.equals(fTrace, other.fTrace) && Objects.equals(fUiType, other.fUiType);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public JParameterWithGuardQueryForModify specification() {
      return JParameterWithGuardQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JParameterWithGuardQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JParameterWithGuardQueryForModify.Match newMutableMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return new Mutable(pJParameter, pParameterType, pUiAction, pTrace, pUiType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JParameterWithGuardQueryForModify.Match newMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return new Immutable(pJParameter, pParameterType, pUiAction, pTrace, pUiType);
    }
    
    private static final class Mutable extends JParameterWithGuardQueryForModify.Match {
      Mutable(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
        super(pJParameter, pParameterType, pUiAction, pTrace, pUiType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JParameterWithGuardQueryForModify.Match {
      Immutable(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
        super(pJParameter, pParameterType, pUiAction, pTrace, pUiType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JParameterWithGuardQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JParameterWithGuardQueryForModify(jParameter : JParameter, parameterType : UIParameterComponentType, uiAction : UIAction, trace : PSMToUITrace, uiType : Identifiable) {
   * 	JOperation.parameters(jOperation, jParameter);
   * 	JOperation.visibility(jOperation, JVisibility::PUBLIC);
   * 	PSMToUITrace.psmElements(opTrace, jOperation);
   * 	PSMToUITrace.uiElements(opTrace, uiAction);
   * 	find alreadyTransformed(jParameter, parameterType, trace);
   * 	JParameter.type(jParameter, type);
   * 	PSMToUITrace.psmElements(typeTrace, type);
   * 	PSMToUITrace.uiElements(typeTrace, uiType);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JParameterWithGuardQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JParameterWithGuardQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JParameterWithGuardQueryForModify.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static JParameterWithGuardQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JPARAMETER = 0;
    
    private final static int POSITION_PARAMETERTYPE = 1;
    
    private final static int POSITION_UIACTION = 2;
    
    private final static int POSITION_TRACE = 3;
    
    private final static int POSITION_UITYPE = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JParameterWithGuardQueryForModify.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JParameterWithGuardQueryForModify.Match> getAllMatches(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllMatches(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JParameterWithGuardQueryForModify.Match> streamAllMatches(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllMatches(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JParameterWithGuardQueryForModify.Match> getOneArbitraryMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawGetOneArbitraryMatch(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawHasMatch(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawCountMatches(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType, final Consumer<? super JParameterWithGuardQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, pUiType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pParameterType the fixed value of pattern parameter parameterType, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pUiType the fixed value of pattern parameter uiType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JParameterWithGuardQueryForModify.Match newMatch(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return JParameterWithGuardQueryForModify.Match.newMatch(pJParameter, pParameterType, pUiAction, pTrace, pUiType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JParameter> rawStreamAllValuesOfjParameter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JPARAMETER, parameters).map(JParameter.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter() {
      return rawStreamAllValuesOfjParameter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter() {
      return rawStreamAllValuesOfjParameter(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjParameter(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter(final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfjParameter(new Object[]{null, pParameterType, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjParameter(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter(final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfjParameter(new Object[]{null, pParameterType, pUiAction, pTrace, pUiType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIParameterComponentType> rawStreamAllValuesOfparameterType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARAMETERTYPE, parameters).map(UIParameterComponentType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIParameterComponentType> getAllValuesOfparameterType() {
      return rawStreamAllValuesOfparameterType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIParameterComponentType> streamAllValuesOfparameterType() {
      return rawStreamAllValuesOfparameterType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIParameterComponentType> streamAllValuesOfparameterType(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfparameterType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIParameterComponentType> streamAllValuesOfparameterType(final JParameter pJParameter, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfparameterType(new Object[]{pJParameter, null, pUiAction, pTrace, pUiType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIParameterComponentType> getAllValuesOfparameterType(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfparameterType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameterType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIParameterComponentType> getAllValuesOfparameterType(final JParameter pJParameter, final UIAction pUiAction, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfparameterType(new Object[]{pJParameter, null, pUiAction, pTrace, pUiType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIAction> rawStreamAllValuesOfuiAction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIACTION, parameters).map(UIAction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIAction> getAllValuesOfuiAction() {
      return rawStreamAllValuesOfuiAction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIAction> streamAllValuesOfuiAction() {
      return rawStreamAllValuesOfuiAction(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIAction> streamAllValuesOfuiAction(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiAction(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIAction> streamAllValuesOfuiAction(final JParameter pJParameter, final UIParameterComponentType pParameterType, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfuiAction(new Object[]{pJParameter, pParameterType, null, pTrace, pUiType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIAction> getAllValuesOfuiAction(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiAction(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIAction> getAllValuesOfuiAction(final JParameter pJParameter, final UIParameterComponentType pParameterType, final PSMToUITrace pTrace, final Identifiable pUiType) {
      return rawStreamAllValuesOfuiAction(new Object[]{pJParameter, pParameterType, null, pTrace, pUiType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PSMToUITrace> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(PSMToUITrace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PSMToUITrace> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final Identifiable pUiType) {
      return rawStreamAllValuesOftrace(new Object[]{pJParameter, pParameterType, pUiAction, null, pUiType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final Identifiable pUiType) {
      return rawStreamAllValuesOftrace(new Object[]{pJParameter, pParameterType, pUiAction, null, pUiType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Identifiable> rawStreamAllValuesOfuiType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UITYPE, parameters).map(Identifiable.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfuiType() {
      return rawStreamAllValuesOfuiType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfuiType() {
      return rawStreamAllValuesOfuiType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfuiType(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfuiType(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiType(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfuiType(final JParameterWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfuiType(final JParameter pJParameter, final UIParameterComponentType pParameterType, final UIAction pUiAction, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiType(new Object[]{pJParameter, pParameterType, pUiAction, pTrace, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JParameterWithGuardQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JParameterWithGuardQueryForModify.Match.newMatch((JParameter) t.get(POSITION_JPARAMETER), (UIParameterComponentType) t.get(POSITION_PARAMETERTYPE), (UIAction) t.get(POSITION_UIACTION), (PSMToUITrace) t.get(POSITION_TRACE), (Identifiable) t.get(POSITION_UITYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JParameterWithGuardQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JParameterWithGuardQueryForModify.Match.newMatch((JParameter) match[POSITION_JPARAMETER], (UIParameterComponentType) match[POSITION_PARAMETERTYPE], (UIAction) match[POSITION_UIACTION], (PSMToUITrace) match[POSITION_TRACE], (Identifiable) match[POSITION_UITYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JParameterWithGuardQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JParameterWithGuardQueryForModify.Match.newMutableMatch((JParameter) match[POSITION_JPARAMETER], (UIParameterComponentType) match[POSITION_PARAMETERTYPE], (UIAction) match[POSITION_UIACTION], (PSMToUITrace) match[POSITION_TRACE], (Identifiable) match[POSITION_UITYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<JParameterWithGuardQueryForModify.Matcher> querySpecification() {
      return JParameterWithGuardQueryForModify.instance();
    }
  }
  
  private JParameterWithGuardQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JParameterWithGuardQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JParameterWithGuardQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JParameterWithGuardQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JParameterWithGuardQueryForModify.Matcher instantiate() {
    return JParameterWithGuardQueryForModify.Matcher.create();
  }
  
  @Override
  public JParameterWithGuardQueryForModify.Match newEmptyMatch() {
    return JParameterWithGuardQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JParameterWithGuardQueryForModify.Match newMatch(final Object... parameters) {
    return JParameterWithGuardQueryForModify.Match.newMatch((psm.JParameter) parameters[0], (ui.UIParameterComponentType) parameters[1], (ui.UIAction) parameters[2], (traceability.PSMToUITrace) parameters[3], (ui.Identifiable) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JParameterWithGuardQueryForModify (visibility: PUBLIC, simpleName: JParameterWithGuardQueryForModify, identifier: queries.JParameterWithGuardQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JParameterWithGuardQueryForModify (visibility: PUBLIC, simpleName: JParameterWithGuardQueryForModify, identifier: queries.JParameterWithGuardQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JParameterWithGuardQueryForModify INSTANCE = new JParameterWithGuardQueryForModify();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static JParameterWithGuardQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jParameter = new PParameter("jParameter", "psm.JParameter", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JParameter")), PParameterDirection.INOUT);
    
    private final PParameter parameter_parameterType = new PParameter("parameterType", "ui.UIParameterComponentType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIParameterComponentType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiAction = new PParameter("uiAction", "ui.UIAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIAction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "traceability.PSMToUITrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiType = new PParameter("uiType", "ui.Identifiable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jParameter, parameter_parameterType, parameter_uiAction, parameter_trace, parameter_uiType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JParameterWithGuardQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jParameter","parameterType","uiAction","trace","uiType");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_jParameter = body.getOrCreateVariableByName("jParameter");
          PVariable var_parameterType = body.getOrCreateVariableByName("parameterType");
          PVariable var_uiAction = body.getOrCreateVariableByName("uiAction");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_uiType = body.getOrCreateVariableByName("uiType");
          PVariable var_jOperation = body.getOrCreateVariableByName("jOperation");
          PVariable var_opTrace = body.getOrCreateVariableByName("opTrace");
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_typeTrace = body.getOrCreateVariableByName("typeTrace");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_parameterType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIParameterComponentType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jParameter, parameter_jParameter),
             new ExportedParameter(body, var_parameterType, parameter_parameterType),
             new ExportedParameter(body, var_uiAction, parameter_uiAction),
             new ExportedParameter(body, var_trace, parameter_trace),
             new ExportedParameter(body, var_uiType, parameter_uiType)
          ));
          // 	JOperation.parameters(jOperation, jParameter)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation", "parameters")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          new Equality(body, var__virtual_0_, var_jParameter);
          // 	JOperation.visibility(jOperation, JVisibility::PUBLIC)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://blackbelt.hu/judo/meta/psm", "JVisibility", "PUBLIC").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JElement", "visibility")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JVisibility")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          // 	PSMToUITrace.psmElements(opTrace, jOperation)
          new TypeConstraint(body, Tuples.flatTupleOf(var_opTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_opTrace, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_3_, var_jOperation);
          // 	PSMToUITrace.uiElements(opTrace, uiAction)
          new TypeConstraint(body, Tuples.flatTupleOf(var_opTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_opTrace, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_4_, var_uiAction);
          // 	find alreadyTransformed(jParameter, parameterType, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jParameter, var_parameterType, var_trace), AlreadyTransformed.instance().getInternalQueryRepresentation());
          // 	JParameter.type(jParameter, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JTypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JType")));
          new Equality(body, var__virtual_5_, var_type);
          // 	PSMToUITrace.psmElements(typeTrace, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_typeTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_typeTrace, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_6_, var_type);
          // 	PSMToUITrace.uiElements(typeTrace, uiType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_typeTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_typeTrace, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_7_, var_uiType);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
