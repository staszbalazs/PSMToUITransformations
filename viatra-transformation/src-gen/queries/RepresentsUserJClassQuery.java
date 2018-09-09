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
 *         pattern representsUserJClassQuery(jClass : JClass) {
 *         	JClass.representsUser(jClass, true);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RepresentsUserJClassQuery extends BaseGeneratedEMFQuerySpecification<RepresentsUserJClassQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.representsUserJClassQuery pattern,
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
    private EObject fJClass;
    
    private static List<String> parameterNames = makeImmutableList("jClass");
    
    private Match(final EObject pJClass) {
      this.fJClass = pJClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jClass".equals(parameterName)) return this.fJClass;
      return null;
    }
    
    public EObject getJClass() {
      return this.fJClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jClass".equals(parameterName) ) {
          this.fJClass = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJClass(final EObject pJClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJClass = pJClass;
    }
    
    @Override
    public String patternName() {
      return "queries.representsUserJClassQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return RepresentsUserJClassQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJClass};
    }
    
    @Override
    public RepresentsUserJClassQuery.Match toImmutable() {
      return isMutable() ? newMatch(fJClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jClass\"=" + prettyPrintValue(fJClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RepresentsUserJClassQuery.Match)) {
          RepresentsUserJClassQuery.Match other = (RepresentsUserJClassQuery.Match) obj;
          return Objects.equals(fJClass, other.fJClass);
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
    public RepresentsUserJClassQuery specification() {
      return RepresentsUserJClassQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RepresentsUserJClassQuery.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RepresentsUserJClassQuery.Match newMutableMatch(final EObject pJClass) {
      return new Mutable(pJClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RepresentsUserJClassQuery.Match newMatch(final EObject pJClass) {
      return new Immutable(pJClass);
    }
    
    private static final class Mutable extends RepresentsUserJClassQuery.Match {
      Mutable(final EObject pJClass) {
        super(pJClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RepresentsUserJClassQuery.Match {
      Immutable(final EObject pJClass) {
        super(pJClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.representsUserJClassQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern representsUserJClassQuery(jClass : JClass) {
   * 	JClass.representsUser(jClass, true);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RepresentsUserJClassQuery
   * 
   */
  public static class Matcher extends BaseMatcher<RepresentsUserJClassQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RepresentsUserJClassQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static RepresentsUserJClassQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JCLASS = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RepresentsUserJClassQuery.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RepresentsUserJClassQuery.Match> getAllMatches(final EObject pJClass) {
      return rawStreamAllMatches(new Object[]{pJClass}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RepresentsUserJClassQuery.Match> streamAllMatches(final EObject pJClass) {
      return rawStreamAllMatches(new Object[]{pJClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RepresentsUserJClassQuery.Match> getOneArbitraryMatch(final EObject pJClass) {
      return rawGetOneArbitraryMatch(new Object[]{pJClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJClass) {
      return rawHasMatch(new Object[]{pJClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJClass) {
      return rawCountMatches(new Object[]{pJClass});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJClass, final Consumer<? super RepresentsUserJClassQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RepresentsUserJClassQuery.Match newMatch(final EObject pJClass) {
      return RepresentsUserJClassQuery.Match.newMatch(pJClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JCLASS, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray());
    }
    
    @Override
    protected RepresentsUserJClassQuery.Match tupleToMatch(final Tuple t) {
      try {
          return RepresentsUserJClassQuery.Match.newMatch((EObject) t.get(POSITION_JCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RepresentsUserJClassQuery.Match arrayToMatch(final Object[] match) {
      try {
          return RepresentsUserJClassQuery.Match.newMatch((EObject) match[POSITION_JCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RepresentsUserJClassQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RepresentsUserJClassQuery.Match.newMutableMatch((EObject) match[POSITION_JCLASS]);
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
    public static IQuerySpecification<RepresentsUserJClassQuery.Matcher> querySpecification() {
      return RepresentsUserJClassQuery.instance();
    }
  }
  
  private RepresentsUserJClassQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RepresentsUserJClassQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RepresentsUserJClassQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return RepresentsUserJClassQuery.Matcher.on(engine);
  }
  
  @Override
  public RepresentsUserJClassQuery.Matcher instantiate() {
    return RepresentsUserJClassQuery.Matcher.create();
  }
  
  @Override
  public RepresentsUserJClassQuery.Match newEmptyMatch() {
    return RepresentsUserJClassQuery.Match.newEmptyMatch();
  }
  
  @Override
  public RepresentsUserJClassQuery.Match newMatch(final Object... parameters) {
    return RepresentsUserJClassQuery.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.RepresentsUserJClassQuery (visibility: PUBLIC, simpleName: RepresentsUserJClassQuery, identifier: queries.RepresentsUserJClassQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.RepresentsUserJClassQuery (visibility: PUBLIC, simpleName: RepresentsUserJClassQuery, identifier: queries.RepresentsUserJClassQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RepresentsUserJClassQuery INSTANCE = new RepresentsUserJClassQuery();
    
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
    private final static RepresentsUserJClassQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jClass = new PParameter("jClass", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.representsUserJClassQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jClass");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jClass, parameter_jClass)
          ));
          // 	JClass.representsUser(jClass, true)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JClass", "representsUser")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return true;
  }
}
