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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         //Trace Queries
 *         pattern psmToUiTrace(jElement, identifiable) {
 *         	PSMToUITrace.psmElements(trace, jElement);
 *         	PSMToUITrace.uiElements(trace, identifiable);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PsmToUiTrace extends BaseGeneratedEMFQuerySpecification<PsmToUiTrace.Matcher> {
  /**
   * Pattern-specific match representation of the queries.psmToUiTrace pattern,
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
    private EObject fJElement;
    
    private EObject fIdentifiable;
    
    private static List<String> parameterNames = makeImmutableList("jElement", "identifiable");
    
    private Match(final EObject pJElement, final EObject pIdentifiable) {
      this.fJElement = pJElement;
      this.fIdentifiable = pIdentifiable;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jElement".equals(parameterName)) return this.fJElement;
      if ("identifiable".equals(parameterName)) return this.fIdentifiable;
      return null;
    }
    
    public EObject getJElement() {
      return this.fJElement;
    }
    
    public EObject getIdentifiable() {
      return this.fIdentifiable;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jElement".equals(parameterName) ) {
          this.fJElement = (EObject) newValue;
          return true;
      }
      if ("identifiable".equals(parameterName) ) {
          this.fIdentifiable = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJElement(final EObject pJElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJElement = pJElement;
    }
    
    public void setIdentifiable(final EObject pIdentifiable) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fIdentifiable = pIdentifiable;
    }
    
    @Override
    public String patternName() {
      return "queries.psmToUiTrace";
    }
    
    @Override
    public List<String> parameterNames() {
      return PsmToUiTrace.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJElement, fIdentifiable};
    }
    
    @Override
    public PsmToUiTrace.Match toImmutable() {
      return isMutable() ? newMatch(fJElement, fIdentifiable) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jElement\"=" + prettyPrintValue(fJElement) + ", ");
      result.append("\"identifiable\"=" + prettyPrintValue(fIdentifiable));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJElement, fIdentifiable);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PsmToUiTrace.Match)) {
          PsmToUiTrace.Match other = (PsmToUiTrace.Match) obj;
          return Objects.equals(fJElement, other.fJElement) && Objects.equals(fIdentifiable, other.fIdentifiable);
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
    public PsmToUiTrace specification() {
      return PsmToUiTrace.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PsmToUiTrace.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PsmToUiTrace.Match newMutableMatch(final EObject pJElement, final EObject pIdentifiable) {
      return new Mutable(pJElement, pIdentifiable);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PsmToUiTrace.Match newMatch(final EObject pJElement, final EObject pIdentifiable) {
      return new Immutable(pJElement, pIdentifiable);
    }
    
    private static final class Mutable extends PsmToUiTrace.Match {
      Mutable(final EObject pJElement, final EObject pIdentifiable) {
        super(pJElement, pIdentifiable);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PsmToUiTrace.Match {
      Immutable(final EObject pJElement, final EObject pIdentifiable) {
        super(pJElement, pIdentifiable);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.psmToUiTrace pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Trace Queries
   * pattern psmToUiTrace(jElement, identifiable) {
   * 	PSMToUITrace.psmElements(trace, jElement);
   * 	PSMToUITrace.uiElements(trace, identifiable);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PsmToUiTrace
   * 
   */
  public static class Matcher extends BaseMatcher<PsmToUiTrace.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PsmToUiTrace.Matcher on(final ViatraQueryEngine engine) {
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
    public static PsmToUiTrace.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JELEMENT = 0;
    
    private final static int POSITION_IDENTIFIABLE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PsmToUiTrace.Matcher.class);
    
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
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PsmToUiTrace.Match> getAllMatches(final EObject pJElement, final EObject pIdentifiable) {
      return rawStreamAllMatches(new Object[]{pJElement, pIdentifiable}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PsmToUiTrace.Match> streamAllMatches(final EObject pJElement, final EObject pIdentifiable) {
      return rawStreamAllMatches(new Object[]{pJElement, pIdentifiable});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PsmToUiTrace.Match> getOneArbitraryMatch(final EObject pJElement, final EObject pIdentifiable) {
      return rawGetOneArbitraryMatch(new Object[]{pJElement, pIdentifiable});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJElement, final EObject pIdentifiable) {
      return rawHasMatch(new Object[]{pJElement, pIdentifiable});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJElement, final EObject pIdentifiable) {
      return rawCountMatches(new Object[]{pJElement, pIdentifiable});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJElement, final EObject pIdentifiable, final Consumer<? super PsmToUiTrace.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJElement, pIdentifiable}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PsmToUiTrace.Match newMatch(final EObject pJElement, final EObject pIdentifiable) {
      return PsmToUiTrace.Match.newMatch(pJElement, pIdentifiable);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JELEMENT, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjElement() {
      return rawStreamAllValuesOfjElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjElement() {
      return rawStreamAllValuesOfjElement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjElement(final PsmToUiTrace.Match partialMatch) {
      return rawStreamAllValuesOfjElement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjElement(final EObject pIdentifiable) {
      return rawStreamAllValuesOfjElement(new Object[]{null, pIdentifiable});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjElement(final PsmToUiTrace.Match partialMatch) {
      return rawStreamAllValuesOfjElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjElement(final EObject pIdentifiable) {
      return rawStreamAllValuesOfjElement(new Object[]{null, pIdentifiable}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfidentifiable(final Object[] parameters) {
      return rawStreamAllValues(POSITION_IDENTIFIABLE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfidentifiable() {
      return rawStreamAllValuesOfidentifiable(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfidentifiable() {
      return rawStreamAllValuesOfidentifiable(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfidentifiable(final PsmToUiTrace.Match partialMatch) {
      return rawStreamAllValuesOfidentifiable(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfidentifiable(final EObject pJElement) {
      return rawStreamAllValuesOfidentifiable(new Object[]{pJElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfidentifiable(final PsmToUiTrace.Match partialMatch) {
      return rawStreamAllValuesOfidentifiable(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for identifiable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfidentifiable(final EObject pJElement) {
      return rawStreamAllValuesOfidentifiable(new Object[]{pJElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PsmToUiTrace.Match tupleToMatch(final Tuple t) {
      try {
          return PsmToUiTrace.Match.newMatch((EObject) t.get(POSITION_JELEMENT), (EObject) t.get(POSITION_IDENTIFIABLE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PsmToUiTrace.Match arrayToMatch(final Object[] match) {
      try {
          return PsmToUiTrace.Match.newMatch((EObject) match[POSITION_JELEMENT], (EObject) match[POSITION_IDENTIFIABLE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PsmToUiTrace.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PsmToUiTrace.Match.newMutableMatch((EObject) match[POSITION_JELEMENT], (EObject) match[POSITION_IDENTIFIABLE]);
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
    public static IQuerySpecification<PsmToUiTrace.Matcher> querySpecification() {
      return PsmToUiTrace.instance();
    }
  }
  
  private PsmToUiTrace() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PsmToUiTrace instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PsmToUiTrace.Matcher instantiate(final ViatraQueryEngine engine) {
    return PsmToUiTrace.Matcher.on(engine);
  }
  
  @Override
  public PsmToUiTrace.Matcher instantiate() {
    return PsmToUiTrace.Matcher.create();
  }
  
  @Override
  public PsmToUiTrace.Match newEmptyMatch() {
    return PsmToUiTrace.Match.newEmptyMatch();
  }
  
  @Override
  public PsmToUiTrace.Match newMatch(final Object... parameters) {
    return PsmToUiTrace.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.PsmToUiTrace (visibility: PUBLIC, simpleName: PsmToUiTrace, identifier: queries.PsmToUiTrace, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.PsmToUiTrace (visibility: PUBLIC, simpleName: PsmToUiTrace, identifier: queries.PsmToUiTrace, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PsmToUiTrace INSTANCE = new PsmToUiTrace();
    
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
    private final static PsmToUiTrace.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jElement = new PParameter("jElement", "org.eclipse.emf.ecore.EObject", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_identifiable = new PParameter("identifiable", "org.eclipse.emf.ecore.EObject", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jElement, parameter_identifiable);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.psmToUiTrace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jElement","identifiable");
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
          PVariable var_jElement = body.getOrCreateVariableByName("jElement");
          PVariable var_identifiable = body.getOrCreateVariableByName("identifiable");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jElement, parameter_jElement),
             new ExportedParameter(body, var_identifiable, parameter_identifiable)
          ));
          // 	PSMToUITrace.psmElements(trace, jElement)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_0_, var_jElement);
          // 	PSMToUITrace.uiElements(trace, identifiable)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_1_, var_identifiable);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
