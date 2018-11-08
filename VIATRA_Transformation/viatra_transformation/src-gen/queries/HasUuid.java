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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JElement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //General
 *         pattern hasUuid(jElement : JElement, uuid : java String) {
 *         	JElement.uuid(jElement, uuid);
 *         	check (
 *         		uuid.length {@literal >} 0
 *         	);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class HasUuid extends BaseGeneratedEMFQuerySpecification<HasUuid.Matcher> {
  /**
   * Pattern-specific match representation of the queries.hasUuid pattern,
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
    private JElement fJElement;
    
    private String fUuid;
    
    private static List<String> parameterNames = makeImmutableList("jElement", "uuid");
    
    private Match(final JElement pJElement, final String pUuid) {
      this.fJElement = pJElement;
      this.fUuid = pUuid;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jElement".equals(parameterName)) return this.fJElement;
      if ("uuid".equals(parameterName)) return this.fUuid;
      return null;
    }
    
    public JElement getJElement() {
      return this.fJElement;
    }
    
    public String getUuid() {
      return this.fUuid;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jElement".equals(parameterName) ) {
          this.fJElement = (JElement) newValue;
          return true;
      }
      if ("uuid".equals(parameterName) ) {
          this.fUuid = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setJElement(final JElement pJElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJElement = pJElement;
    }
    
    public void setUuid(final String pUuid) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUuid = pUuid;
    }
    
    @Override
    public String patternName() {
      return "queries.hasUuid";
    }
    
    @Override
    public List<String> parameterNames() {
      return HasUuid.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJElement, fUuid};
    }
    
    @Override
    public HasUuid.Match toImmutable() {
      return isMutable() ? newMatch(fJElement, fUuid) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jElement\"=" + prettyPrintValue(fJElement) + ", ");
      result.append("\"uuid\"=" + prettyPrintValue(fUuid));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJElement, fUuid);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof HasUuid.Match)) {
          HasUuid.Match other = (HasUuid.Match) obj;
          return Objects.equals(fJElement, other.fJElement) && Objects.equals(fUuid, other.fUuid);
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
    public HasUuid specification() {
      return HasUuid.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static HasUuid.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static HasUuid.Match newMutableMatch(final JElement pJElement, final String pUuid) {
      return new Mutable(pJElement, pUuid);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static HasUuid.Match newMatch(final JElement pJElement, final String pUuid) {
      return new Immutable(pJElement, pUuid);
    }
    
    private static final class Mutable extends HasUuid.Match {
      Mutable(final JElement pJElement, final String pUuid) {
        super(pJElement, pUuid);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends HasUuid.Match {
      Immutable(final JElement pJElement, final String pUuid) {
        super(pJElement, pUuid);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.hasUuid pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //General
   * pattern hasUuid(jElement : JElement, uuid : java String) {
   * 	JElement.uuid(jElement, uuid);
   * 	check (
   * 		uuid.length {@literal >} 0
   * 	);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see HasUuid
   * 
   */
  public static class Matcher extends BaseMatcher<HasUuid.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static HasUuid.Matcher on(final ViatraQueryEngine engine) {
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
    public static HasUuid.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JELEMENT = 0;
    
    private final static int POSITION_UUID = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HasUuid.Matcher.class);
    
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
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<HasUuid.Match> getAllMatches(final JElement pJElement, final String pUuid) {
      return rawStreamAllMatches(new Object[]{pJElement, pUuid}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<HasUuid.Match> streamAllMatches(final JElement pJElement, final String pUuid) {
      return rawStreamAllMatches(new Object[]{pJElement, pUuid});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<HasUuid.Match> getOneArbitraryMatch(final JElement pJElement, final String pUuid) {
      return rawGetOneArbitraryMatch(new Object[]{pJElement, pUuid});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JElement pJElement, final String pUuid) {
      return rawHasMatch(new Object[]{pJElement, pUuid});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JElement pJElement, final String pUuid) {
      return rawCountMatches(new Object[]{pJElement, pUuid});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JElement pJElement, final String pUuid, final Consumer<? super HasUuid.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJElement, pUuid}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJElement the fixed value of pattern parameter jElement, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public HasUuid.Match newMatch(final JElement pJElement, final String pUuid) {
      return HasUuid.Match.newMatch(pJElement, pUuid);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JElement> rawStreamAllValuesOfjElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JELEMENT, parameters).map(JElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JElement> getAllValuesOfjElement() {
      return rawStreamAllValuesOfjElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JElement> streamAllValuesOfjElement() {
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
    public Stream<JElement> streamAllValuesOfjElement(final HasUuid.Match partialMatch) {
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
    public Stream<JElement> streamAllValuesOfjElement(final String pUuid) {
      return rawStreamAllValuesOfjElement(new Object[]{null, pUuid});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JElement> getAllValuesOfjElement(final HasUuid.Match partialMatch) {
      return rawStreamAllValuesOfjElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JElement> getAllValuesOfjElement(final String pUuid) {
      return rawStreamAllValuesOfjElement(new Object[]{null, pUuid}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfuuid(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UUID, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid() {
      return rawStreamAllValuesOfuuid(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid() {
      return rawStreamAllValuesOfuuid(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid(final HasUuid.Match partialMatch) {
      return rawStreamAllValuesOfuuid(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid(final JElement pJElement) {
      return rawStreamAllValuesOfuuid(new Object[]{pJElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid(final HasUuid.Match partialMatch) {
      return rawStreamAllValuesOfuuid(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid(final JElement pJElement) {
      return rawStreamAllValuesOfuuid(new Object[]{pJElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected HasUuid.Match tupleToMatch(final Tuple t) {
      try {
          return HasUuid.Match.newMatch((JElement) t.get(POSITION_JELEMENT), (String) t.get(POSITION_UUID));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasUuid.Match arrayToMatch(final Object[] match) {
      try {
          return HasUuid.Match.newMatch((JElement) match[POSITION_JELEMENT], (String) match[POSITION_UUID]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasUuid.Match arrayToMatchMutable(final Object[] match) {
      try {
          return HasUuid.Match.newMutableMatch((JElement) match[POSITION_JELEMENT], (String) match[POSITION_UUID]);
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
    public static IQuerySpecification<HasUuid.Matcher> querySpecification() {
      return HasUuid.instance();
    }
  }
  
  private HasUuid() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static HasUuid instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasUuid.Matcher instantiate(final ViatraQueryEngine engine) {
    return HasUuid.Matcher.on(engine);
  }
  
  @Override
  public HasUuid.Matcher instantiate() {
    return HasUuid.Matcher.create();
  }
  
  @Override
  public HasUuid.Match newEmptyMatch() {
    return HasUuid.Match.newEmptyMatch();
  }
  
  @Override
  public HasUuid.Match newMatch(final Object... parameters) {
    return HasUuid.Match.newMatch((psm.JElement) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.HasUuid (visibility: PUBLIC, simpleName: HasUuid, identifier: queries.HasUuid, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.HasUuid (visibility: PUBLIC, simpleName: HasUuid, identifier: queries.HasUuid, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HasUuid INSTANCE = new HasUuid();
    
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
    private final static HasUuid.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jElement = new PParameter("jElement", "psm.JElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt/judo/meta/psm", "JElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uuid = new PParameter("uuid", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jElement, parameter_uuid);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.hasUuid";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jElement","uuid");
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
          PVariable var_uuid = body.getOrCreateVariableByName("uuid");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt/judo/meta/psm", "JElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_uuid), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jElement, parameter_jElement),
             new ExportedParameter(body, var_uuid, parameter_uuid)
          ));
          // 	JElement.uuid(jElement, uuid)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt/judo/meta/psm", "JElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jElement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt/judo/meta/psm", "JElement", "uuid")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_uuid);
          // 	check (		uuid.length > 0	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern hasUuid";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("uuid");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String uuid = (String) provider.getValue("uuid");
                  return evaluateExpression_1_1(uuid);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String uuid) {
    int _length = uuid.length();
    boolean _greaterThan = (_length > 0);
    return _greaterThan;
  }
}
