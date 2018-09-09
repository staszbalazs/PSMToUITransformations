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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern resultJParameter(jOperation : JOperation, jParameter : JParameter) {
 *         	JOperation.parameters(jOperation, jParameter);
 *         	JParameter.input(jParameter, false);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ResultJParameter extends BaseGeneratedEMFQuerySpecification<ResultJParameter.Matcher> {
  /**
   * Pattern-specific match representation of the queries.resultJParameter pattern,
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
    
    private EObject fJParameter;
    
    private static List<String> parameterNames = makeImmutableList("jOperation", "jParameter");
    
    private Match(final EObject pJOperation, final EObject pJParameter) {
      this.fJOperation = pJOperation;
      this.fJParameter = pJParameter;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jOperation".equals(parameterName)) return this.fJOperation;
      if ("jParameter".equals(parameterName)) return this.fJParameter;
      return null;
    }
    
    public EObject getJOperation() {
      return this.fJOperation;
    }
    
    public EObject getJParameter() {
      return this.fJParameter;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jOperation".equals(parameterName) ) {
          this.fJOperation = (EObject) newValue;
          return true;
      }
      if ("jParameter".equals(parameterName) ) {
          this.fJParameter = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJOperation(final EObject pJOperation) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJOperation = pJOperation;
    }
    
    public void setJParameter(final EObject pJParameter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJParameter = pJParameter;
    }
    
    @Override
    public String patternName() {
      return "queries.resultJParameter";
    }
    
    @Override
    public List<String> parameterNames() {
      return ResultJParameter.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJOperation, fJParameter};
    }
    
    @Override
    public ResultJParameter.Match toImmutable() {
      return isMutable() ? newMatch(fJOperation, fJParameter) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jOperation\"=" + prettyPrintValue(fJOperation) + ", ");
      result.append("\"jParameter\"=" + prettyPrintValue(fJParameter));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJOperation, fJParameter);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ResultJParameter.Match)) {
          ResultJParameter.Match other = (ResultJParameter.Match) obj;
          return Objects.equals(fJOperation, other.fJOperation) && Objects.equals(fJParameter, other.fJParameter);
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
    public ResultJParameter specification() {
      return ResultJParameter.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ResultJParameter.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ResultJParameter.Match newMutableMatch(final EObject pJOperation, final EObject pJParameter) {
      return new Mutable(pJOperation, pJParameter);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ResultJParameter.Match newMatch(final EObject pJOperation, final EObject pJParameter) {
      return new Immutable(pJOperation, pJParameter);
    }
    
    private static final class Mutable extends ResultJParameter.Match {
      Mutable(final EObject pJOperation, final EObject pJParameter) {
        super(pJOperation, pJParameter);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ResultJParameter.Match {
      Immutable(final EObject pJOperation, final EObject pJParameter) {
        super(pJOperation, pJParameter);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.resultJParameter pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern resultJParameter(jOperation : JOperation, jParameter : JParameter) {
   * 	JOperation.parameters(jOperation, jParameter);
   * 	JParameter.input(jParameter, false);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ResultJParameter
   * 
   */
  public static class Matcher extends BaseMatcher<ResultJParameter.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ResultJParameter.Matcher on(final ViatraQueryEngine engine) {
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
    public static ResultJParameter.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JOPERATION = 0;
    
    private final static int POSITION_JPARAMETER = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ResultJParameter.Matcher.class);
    
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
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ResultJParameter.Match> getAllMatches(final EObject pJOperation, final EObject pJParameter) {
      return rawStreamAllMatches(new Object[]{pJOperation, pJParameter}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ResultJParameter.Match> streamAllMatches(final EObject pJOperation, final EObject pJParameter) {
      return rawStreamAllMatches(new Object[]{pJOperation, pJParameter});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ResultJParameter.Match> getOneArbitraryMatch(final EObject pJOperation, final EObject pJParameter) {
      return rawGetOneArbitraryMatch(new Object[]{pJOperation, pJParameter});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJOperation, final EObject pJParameter) {
      return rawHasMatch(new Object[]{pJOperation, pJParameter});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJOperation, final EObject pJParameter) {
      return rawCountMatches(new Object[]{pJOperation, pJParameter});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJOperation, final EObject pJParameter, final Consumer<? super ResultJParameter.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJOperation, pJParameter}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJOperation the fixed value of pattern parameter jOperation, or null if not bound.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ResultJParameter.Match newMatch(final EObject pJOperation, final EObject pJParameter) {
      return ResultJParameter.Match.newMatch(pJOperation, pJParameter);
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
    public Stream<EObject> streamAllValuesOfjOperation(final ResultJParameter.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOfjOperation(final EObject pJParameter) {
      return rawStreamAllValuesOfjOperation(new Object[]{null, pJParameter});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjOperation(final ResultJParameter.Match partialMatch) {
      return rawStreamAllValuesOfjOperation(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jOperation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjOperation(final EObject pJParameter) {
      return rawStreamAllValuesOfjOperation(new Object[]{null, pJParameter}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjParameter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JPARAMETER, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjParameter() {
      return rawStreamAllValuesOfjParameter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjParameter() {
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
    public Stream<EObject> streamAllValuesOfjParameter(final ResultJParameter.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOfjParameter(final EObject pJOperation) {
      return rawStreamAllValuesOfjParameter(new Object[]{pJOperation, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjParameter(final ResultJParameter.Match partialMatch) {
      return rawStreamAllValuesOfjParameter(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjParameter(final EObject pJOperation) {
      return rawStreamAllValuesOfjParameter(new Object[]{pJOperation, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ResultJParameter.Match tupleToMatch(final Tuple t) {
      try {
          return ResultJParameter.Match.newMatch((EObject) t.get(POSITION_JOPERATION), (EObject) t.get(POSITION_JPARAMETER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResultJParameter.Match arrayToMatch(final Object[] match) {
      try {
          return ResultJParameter.Match.newMatch((EObject) match[POSITION_JOPERATION], (EObject) match[POSITION_JPARAMETER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResultJParameter.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ResultJParameter.Match.newMutableMatch((EObject) match[POSITION_JOPERATION], (EObject) match[POSITION_JPARAMETER]);
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
    public static IQuerySpecification<ResultJParameter.Matcher> querySpecification() {
      return ResultJParameter.instance();
    }
  }
  
  private ResultJParameter() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ResultJParameter instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ResultJParameter.Matcher instantiate(final ViatraQueryEngine engine) {
    return ResultJParameter.Matcher.on(engine);
  }
  
  @Override
  public ResultJParameter.Matcher instantiate() {
    return ResultJParameter.Matcher.create();
  }
  
  @Override
  public ResultJParameter.Match newEmptyMatch() {
    return ResultJParameter.Match.newEmptyMatch();
  }
  
  @Override
  public ResultJParameter.Match newMatch(final Object... parameters) {
    return ResultJParameter.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.ResultJParameter (visibility: PUBLIC, simpleName: ResultJParameter, identifier: queries.ResultJParameter, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.ResultJParameter (visibility: PUBLIC, simpleName: ResultJParameter, identifier: queries.ResultJParameter, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ResultJParameter INSTANCE = new ResultJParameter();
    
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
    private final static ResultJParameter.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jOperation = new PParameter("jOperation", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JOperation")), PParameterDirection.INOUT);
    
    private final PParameter parameter_jParameter = new PParameter("jParameter", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JParameter")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jOperation, parameter_jParameter);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.resultJParameter";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jOperation","jParameter");
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
          PVariable var_jParameter = body.getOrCreateVariableByName("jParameter");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jOperation, parameter_jOperation),
             new ExportedParameter(body, var_jParameter, parameter_jParameter)
          ));
          // 	JOperation.parameters(jOperation, jParameter)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jOperation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JOperation", "parameters")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          new Equality(body, var__virtual_0_, var_jParameter);
          // 	JParameter.input(jParameter, false)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, false);
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter", "input")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return false;
  }
}
