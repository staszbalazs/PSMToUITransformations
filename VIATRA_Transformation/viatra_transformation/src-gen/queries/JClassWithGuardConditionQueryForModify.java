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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JClass;
import queries.PsmToUiTrace;
import traceability.PSMToUITrace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JClassWithGuardConditionQueryForModify(jClass : JClass, trace : PSMToUITrace) {
 *         	find psmToUiTrace(jClass, _, trace);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JClassWithGuardConditionQueryForModify extends BaseGeneratedEMFQuerySpecification<JClassWithGuardConditionQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JClassWithGuardConditionQueryForModify pattern,
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
    private JClass fJClass;
    
    private PSMToUITrace fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jClass", "trace");
    
    private Match(final JClass pJClass, final PSMToUITrace pTrace) {
      this.fJClass = pJClass;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jClass".equals(parameterName)) return this.fJClass;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public JClass getJClass() {
      return this.fJClass;
    }
    
    public PSMToUITrace getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jClass".equals(parameterName) ) {
          this.fJClass = (JClass) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (PSMToUITrace) newValue;
          return true;
      }
      return false;
    }
    
    public void setJClass(final JClass pJClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJClass = pJClass;
    }
    
    public void setTrace(final PSMToUITrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JClassWithGuardConditionQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JClassWithGuardConditionQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJClass, fTrace};
    }
    
    @Override
    public JClassWithGuardConditionQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJClass, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jClass\"=" + prettyPrintValue(fJClass) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJClass, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JClassWithGuardConditionQueryForModify.Match)) {
          JClassWithGuardConditionQueryForModify.Match other = (JClassWithGuardConditionQueryForModify.Match) obj;
          return Objects.equals(fJClass, other.fJClass) && Objects.equals(fTrace, other.fTrace);
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
    public JClassWithGuardConditionQueryForModify specification() {
      return JClassWithGuardConditionQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JClassWithGuardConditionQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JClassWithGuardConditionQueryForModify.Match newMutableMatch(final JClass pJClass, final PSMToUITrace pTrace) {
      return new Mutable(pJClass, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JClassWithGuardConditionQueryForModify.Match newMatch(final JClass pJClass, final PSMToUITrace pTrace) {
      return new Immutable(pJClass, pTrace);
    }
    
    private static final class Mutable extends JClassWithGuardConditionQueryForModify.Match {
      Mutable(final JClass pJClass, final PSMToUITrace pTrace) {
        super(pJClass, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JClassWithGuardConditionQueryForModify.Match {
      Immutable(final JClass pJClass, final PSMToUITrace pTrace) {
        super(pJClass, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JClassWithGuardConditionQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JClassWithGuardConditionQueryForModify(jClass : JClass, trace : PSMToUITrace) {
   * 	find psmToUiTrace(jClass, _, trace);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JClassWithGuardConditionQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JClassWithGuardConditionQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JClassWithGuardConditionQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JClassWithGuardConditionQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JCLASS = 0;
    
    private final static int POSITION_TRACE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JClassWithGuardConditionQueryForModify.Matcher.class);
    
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
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JClassWithGuardConditionQueryForModify.Match> getAllMatches(final JClass pJClass, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJClass, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JClassWithGuardConditionQueryForModify.Match> streamAllMatches(final JClass pJClass, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJClass, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JClassWithGuardConditionQueryForModify.Match> getOneArbitraryMatch(final JClass pJClass, final PSMToUITrace pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJClass, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JClass pJClass, final PSMToUITrace pTrace) {
      return rawHasMatch(new Object[]{pJClass, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JClass pJClass, final PSMToUITrace pTrace) {
      return rawCountMatches(new Object[]{pJClass, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JClass pJClass, final PSMToUITrace pTrace, final Consumer<? super JClassWithGuardConditionQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJClass, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JClassWithGuardConditionQueryForModify.Match newMatch(final JClass pJClass, final PSMToUITrace pTrace) {
      return JClassWithGuardConditionQueryForModify.Match.newMatch(pJClass, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JClass> rawStreamAllValuesOfjClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JCLASS, parameters).map(JClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JClass> getAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JClass> streamAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JClass> streamAllValuesOfjClass(final JClassWithGuardConditionQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JClass> streamAllValuesOfjClass(final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjClass(new Object[]{null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JClass> getAllValuesOfjClass(final JClassWithGuardConditionQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JClass> getAllValuesOfjClass(final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjClass(new Object[]{null, pTrace}).collect(Collectors.toSet());
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JClassWithGuardConditionQueryForModify.Match partialMatch) {
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JClass pJClass) {
      return rawStreamAllValuesOftrace(new Object[]{pJClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JClassWithGuardConditionQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JClass pJClass) {
      return rawStreamAllValuesOftrace(new Object[]{pJClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JClassWithGuardConditionQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JClassWithGuardConditionQueryForModify.Match.newMatch((JClass) t.get(POSITION_JCLASS), (PSMToUITrace) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JClassWithGuardConditionQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JClassWithGuardConditionQueryForModify.Match.newMatch((JClass) match[POSITION_JCLASS], (PSMToUITrace) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JClassWithGuardConditionQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JClassWithGuardConditionQueryForModify.Match.newMutableMatch((JClass) match[POSITION_JCLASS], (PSMToUITrace) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JClassWithGuardConditionQueryForModify.Matcher> querySpecification() {
      return JClassWithGuardConditionQueryForModify.instance();
    }
  }
  
  private JClassWithGuardConditionQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JClassWithGuardConditionQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JClassWithGuardConditionQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JClassWithGuardConditionQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JClassWithGuardConditionQueryForModify.Matcher instantiate() {
    return JClassWithGuardConditionQueryForModify.Matcher.create();
  }
  
  @Override
  public JClassWithGuardConditionQueryForModify.Match newEmptyMatch() {
    return JClassWithGuardConditionQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JClassWithGuardConditionQueryForModify.Match newMatch(final Object... parameters) {
    return JClassWithGuardConditionQueryForModify.Match.newMatch((psm.JClass) parameters[0], (traceability.PSMToUITrace) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JClassWithGuardConditionQueryForModify (visibility: PUBLIC, simpleName: JClassWithGuardConditionQueryForModify, identifier: queries.JClassWithGuardConditionQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JClassWithGuardConditionQueryForModify (visibility: PUBLIC, simpleName: JClassWithGuardConditionQueryForModify, identifier: queries.JClassWithGuardConditionQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JClassWithGuardConditionQueryForModify INSTANCE = new JClassWithGuardConditionQueryForModify();
    
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
    private final static JClassWithGuardConditionQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jClass = new PParameter("jClass", "psm.JClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt/judo/meta/psm", "JClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "traceability.PSMToUITrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jClass, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JClassWithGuardConditionQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jClass","trace");
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
          PVariable var_jClass = body.getOrCreateVariableByName("jClass");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt/judo/meta/psm", "JClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jClass, parameter_jClass),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	find psmToUiTrace(jClass, _, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jClass, var___0_, var_trace), PsmToUiTrace.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
