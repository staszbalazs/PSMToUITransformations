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
import org.eclipse.emf.ecore.EObject;
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
import queries.AlreadyTransformed;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JOperationWithGuardQueryForModify(jOperation : JOperation, uiAction : UIAction, uiClass : UIClass, trace : PSMToUITrace) {
 *         	JOperation(jOperation);
 *         	JOperation.visibility(jOperation, JVisibility::PUBLIC);
 *         	JOperation.ownerClass(jOperation, jClass);
 *         	PSMToUITrace.psmElements(trace, jClass);
 *         	PSMToUITrace.uiElements(trace, uiClass);
 *         	find alreadyTransformed(jOperation, uiAction, trace);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JOperationWithGuardQueryForModify extends BaseGeneratedEMFQuerySpecification<JOperationWithGuardQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JOperationWithGuardQueryForModify pattern,
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
    private EObject fJOperation;
    
    private EObject fUiAction;
    
    private EObject fUiClass;
    
    private EObject fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jOperation", "uiAction", "uiClass", "trace");
    
    private Match(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      this.fJOperation = pJOperation;
      this.fUiAction = pUiAction;
      this.fUiClass = pUiClass;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jOperation".equals(parameterName)) return this.fJOperation;
      if ("uiAction".equals(parameterName)) return this.fUiAction;
      if ("uiClass".equals(parameterName)) return this.fUiClass;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public EObject getJOperation() {
      return this.fJOperation;
    }
    
    public EObject getUiAction() {
      return this.fUiAction;
    }
    
    public EObject getUiClass() {
      return this.fUiClass;
    }
    
    public EObject getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jOperation".equals(parameterName) ) {
          this.fJOperation = (EObject) newValue;
          return true;
      }
      if ("uiAction".equals(parameterName) ) {
          this.fUiAction = (EObject) newValue;
          return true;
      }
      if ("uiClass".equals(parameterName) ) {
          this.fUiClass = (EObject) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJOperation(final EObject pJOperation) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJOperation = pJOperation;
    }
    
    public void setUiAction(final EObject pUiAction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiAction = pUiAction;
    }
    
    public void setUiClass(final EObject pUiClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiClass = pUiClass;
    }
    
    public void setTrace(final EObject pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JOperationWithGuardQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JOperationWithGuardQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJOperation, fUiAction, fUiClass, fTrace};
    }
    
    @Override
    public JOperationWithGuardQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJOperation, fUiAction, fUiClass, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jOperation\"=" + prettyPrintValue(fJOperation) + ", ");
      result.append("\"uiAction\"=" + prettyPrintValue(fUiAction) + ", ");
      result.append("\"uiClass\"=" + prettyPrintValue(fUiClass) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJOperation, fUiAction, fUiClass, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JOperationWithGuardQueryForModify.Match)) {
          JOperationWithGuardQueryForModify.Match other = (JOperationWithGuardQueryForModify.Match) obj;
          return Objects.equals(fJOperation, other.fJOperation) && Objects.equals(fUiAction, other.fUiAction) && Objects.equals(fUiClass, other.fUiClass) && Objects.equals(fTrace, other.fTrace);
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
    public JOperationWithGuardQueryForModify specification() {
      return JOperationWithGuardQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JOperationWithGuardQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JOperationWithGuardQueryForModify.Match newMutableMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return new Mutable(pJOperation, pUiAction, pUiClass, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JOperationWithGuardQueryForModify.Match newMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return new Immutable(pJOperation, pUiAction, pUiClass, pTrace);
    }
    
    private static final class Mutable extends JOperationWithGuardQueryForModify.Match {
      Mutable(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
        super(pJOperation, pUiAction, pUiClass, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JOperationWithGuardQueryForModify.Match {
      Immutable(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
        super(pJOperation, pUiAction, pUiClass, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JOperationWithGuardQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JOperationWithGuardQueryForModify(jOperation : JOperation, uiAction : UIAction, uiClass : UIClass, trace : PSMToUITrace) {
   * 	JOperation(jOperation);
   * 	JOperation.visibility(jOperation, JVisibility::PUBLIC);
   * 	JOperation.ownerClass(jOperation, jClass);
   * 	PSMToUITrace.psmElements(trace, jClass);
   * 	PSMToUITrace.uiElements(trace, uiClass);
   * 	find alreadyTransformed(jOperation, uiAction, trace);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JOperationWithGuardQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JOperationWithGuardQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JOperationWithGuardQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JOperationWithGuardQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JOPERATION = 0;
    
    private final static int POSITION_UIACTION = 1;
    
    private final static int POSITION_UICLASS = 2;
    
    private final static int POSITION_TRACE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JOperationWithGuardQueryForModify.Matcher.class);
    
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
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JOperationWithGuardQueryForModify.Match> getAllMatches(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllMatches(new Object[]{pJOperation, pUiAction, pUiClass, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JOperationWithGuardQueryForModify.Match> streamAllMatches(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllMatches(new Object[]{pJOperation, pUiAction, pUiClass, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JOperationWithGuardQueryForModify.Match> getOneArbitraryMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJOperation, pUiAction, pUiClass, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawHasMatch(new Object[]{pJOperation, pUiAction, pUiClass, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawCountMatches(new Object[]{pJOperation, pUiAction, pUiClass, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace, final Consumer<? super JOperationWithGuardQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJOperation, pUiAction, pUiClass, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pUiAction the fixed value of pattern parameter uiAction, or null if not bound.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JOperationWithGuardQueryForModify.Match newMatch(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return JOperationWithGuardQueryForModify.Match.newMatch(pJOperation, pUiAction, pUiClass, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjOperation(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JOPERATION, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjOperation() {
      return rawStreamAllValuesOfjOperation(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjOperation() {
      return rawStreamAllValuesOfjOperation(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjOperation(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjOperation(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjOperation(final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllValuesOfjOperation(new Object[]{null, pUiAction, pUiClass, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjOperation(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjOperation(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjOperation(final EObject pUiAction, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllValuesOfjOperation(new Object[]{null, pUiAction, pUiClass, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfuiAction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIACTION, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiAction() {
      return rawStreamAllValuesOfuiAction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiAction() {
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
    public Stream<EObject> streamAllValuesOfuiAction(final JOperationWithGuardQueryForModify.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOfuiAction(final EObject pJOperation, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllValuesOfuiAction(new Object[]{pJOperation, null, pUiClass, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiAction(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiAction(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiAction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiAction(final EObject pJOperation, final EObject pUiClass, final EObject pTrace) {
      return rawStreamAllValuesOfuiAction(new Object[]{pJOperation, null, pUiClass, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfuiClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UICLASS, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiClass() {
      return rawStreamAllValuesOfuiClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiClass() {
      return rawStreamAllValuesOfuiClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiClass(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiClass(final EObject pJOperation, final EObject pUiAction, final EObject pTrace) {
      return rawStreamAllValuesOfuiClass(new Object[]{pJOperation, pUiAction, null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiClass(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiClass(final EObject pJOperation, final EObject pUiAction, final EObject pTrace) {
      return rawStreamAllValuesOfuiClass(new Object[]{pJOperation, pUiAction, null, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOftrace() {
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
    public Stream<EObject> streamAllValuesOftrace(final JOperationWithGuardQueryForModify.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOftrace(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass) {
      return rawStreamAllValuesOftrace(new Object[]{pJOperation, pUiAction, pUiClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace(final JOperationWithGuardQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace(final EObject pJOperation, final EObject pUiAction, final EObject pUiClass) {
      return rawStreamAllValuesOftrace(new Object[]{pJOperation, pUiAction, pUiClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JOperationWithGuardQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JOperationWithGuardQueryForModify.Match.newMatch((EObject) t.get(POSITION_JOPERATION), (EObject) t.get(POSITION_UIACTION), (EObject) t.get(POSITION_UICLASS), (EObject) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JOperationWithGuardQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JOperationWithGuardQueryForModify.Match.newMatch((EObject) match[POSITION_JOPERATION], (EObject) match[POSITION_UIACTION], (EObject) match[POSITION_UICLASS], (EObject) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JOperationWithGuardQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JOperationWithGuardQueryForModify.Match.newMutableMatch((EObject) match[POSITION_JOPERATION], (EObject) match[POSITION_UIACTION], (EObject) match[POSITION_UICLASS], (EObject) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JOperationWithGuardQueryForModify.Matcher> querySpecification() {
      return JOperationWithGuardQueryForModify.instance();
    }
  }
  
  private JOperationWithGuardQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JOperationWithGuardQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JOperationWithGuardQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JOperationWithGuardQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JOperationWithGuardQueryForModify.Matcher instantiate() {
    return JOperationWithGuardQueryForModify.Matcher.create();
  }
  
  @Override
  public JOperationWithGuardQueryForModify.Match newEmptyMatch() {
    return JOperationWithGuardQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JOperationWithGuardQueryForModify.Match newMatch(final Object... parameters) {
    return JOperationWithGuardQueryForModify.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2], (org.eclipse.emf.ecore.EObject) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JOperationWithGuardQueryForModify (visibility: PUBLIC, simpleName: JOperationWithGuardQueryForModify, identifier: queries.JOperationWithGuardQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JOperationWithGuardQueryForModify (visibility: PUBLIC, simpleName: JOperationWithGuardQueryForModify, identifier: queries.JOperationWithGuardQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JOperationWithGuardQueryForModify INSTANCE = new JOperationWithGuardQueryForModify();
    
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
    private final static JOperationWithGuardQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jOperation = new PParameter("jOperation", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JOperation")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiAction = new PParameter("uiAction", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIAction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiClass = new PParameter("uiClass", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jOperation, parameter_uiAction, parameter_uiClass, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JOperationWithGuardQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jOperation","uiAction","uiClass","trace");
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
          PVariable var_jOperation = body.getOrCreateVariableByName("jOperation");
          PVariable var_uiAction = body.getOrCreateVariableByName("uiAction");
          PVariable var_uiClass = body.getOrCreateVariableByName("uiClass");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_jClass = body.getOrCreateVariableByName("jClass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jOperation, parameter_jOperation),
             new ExportedParameter(body, var_uiAction, parameter_uiAction),
             new ExportedParameter(body, var_uiClass, parameter_uiClass),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	JOperation(jOperation)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          // 	JOperation.visibility(jOperation, JVisibility::PUBLIC)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://blackbelt.hu/judo/meta/psm", "JVisibility", "PUBLIC").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JElement", "visibility")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JVisibility")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	JOperation.ownerClass(jOperation, jClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation", "ownerClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          new Equality(body, var__virtual_2_, var_jClass);
          // 	PSMToUITrace.psmElements(trace, jClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_3_, var_jClass);
          // 	PSMToUITrace.uiElements(trace, uiClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_4_, var_uiClass);
          // 	find alreadyTransformed(jOperation, uiAction, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jOperation, var_uiAction, var_trace), AlreadyTransformed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
