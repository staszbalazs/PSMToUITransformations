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
 *         //JModel Queries
 *         pattern domainJModelQuery(jModel : JModel) {
 *         	JModel(jModel);
 *         	JModel.framework(jModel, false);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DomainJModelQuery extends BaseGeneratedEMFQuerySpecification<DomainJModelQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.domainJModelQuery pattern,
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
    private EObject fJModel;
    
    private static List<String> parameterNames = makeImmutableList("jModel");
    
    private Match(final EObject pJModel) {
      this.fJModel = pJModel;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jModel".equals(parameterName)) return this.fJModel;
      return null;
    }
    
    public EObject getJModel() {
      return this.fJModel;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jModel".equals(parameterName) ) {
          this.fJModel = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJModel(final EObject pJModel) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJModel = pJModel;
    }
    
    @Override
    public String patternName() {
      return "queries.domainJModelQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return DomainJModelQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJModel};
    }
    
    @Override
    public DomainJModelQuery.Match toImmutable() {
      return isMutable() ? newMatch(fJModel) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jModel\"=" + prettyPrintValue(fJModel));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJModel);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DomainJModelQuery.Match)) {
          DomainJModelQuery.Match other = (DomainJModelQuery.Match) obj;
          return Objects.equals(fJModel, other.fJModel);
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
    public DomainJModelQuery specification() {
      return DomainJModelQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DomainJModelQuery.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DomainJModelQuery.Match newMutableMatch(final EObject pJModel) {
      return new Mutable(pJModel);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DomainJModelQuery.Match newMatch(final EObject pJModel) {
      return new Immutable(pJModel);
    }
    
    private static final class Mutable extends DomainJModelQuery.Match {
      Mutable(final EObject pJModel) {
        super(pJModel);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DomainJModelQuery.Match {
      Immutable(final EObject pJModel) {
        super(pJModel);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.domainJModelQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //JModel Queries
   * pattern domainJModelQuery(jModel : JModel) {
   * 	JModel(jModel);
   * 	JModel.framework(jModel, false);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DomainJModelQuery
   * 
   */
  public static class Matcher extends BaseMatcher<DomainJModelQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DomainJModelQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static DomainJModelQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JMODEL = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DomainJModelQuery.Matcher.class);
    
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
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DomainJModelQuery.Match> getAllMatches(final EObject pJModel) {
      return rawStreamAllMatches(new Object[]{pJModel}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DomainJModelQuery.Match> streamAllMatches(final EObject pJModel) {
      return rawStreamAllMatches(new Object[]{pJModel});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DomainJModelQuery.Match> getOneArbitraryMatch(final EObject pJModel) {
      return rawGetOneArbitraryMatch(new Object[]{pJModel});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJModel) {
      return rawHasMatch(new Object[]{pJModel});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJModel) {
      return rawCountMatches(new Object[]{pJModel});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJModel, final Consumer<? super DomainJModelQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJModel}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJModel the fixed value of pattern parameter jModel, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DomainJModelQuery.Match newMatch(final EObject pJModel) {
      return DomainJModelQuery.Match.newMatch(pJModel);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jModel.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjModel(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JMODEL, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jModel.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjModel() {
      return rawStreamAllValuesOfjModel(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jModel.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjModel() {
      return rawStreamAllValuesOfjModel(emptyArray());
    }
    
    @Override
    protected DomainJModelQuery.Match tupleToMatch(final Tuple t) {
      try {
          return DomainJModelQuery.Match.newMatch((EObject) t.get(POSITION_JMODEL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DomainJModelQuery.Match arrayToMatch(final Object[] match) {
      try {
          return DomainJModelQuery.Match.newMatch((EObject) match[POSITION_JMODEL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DomainJModelQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DomainJModelQuery.Match.newMutableMatch((EObject) match[POSITION_JMODEL]);
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
    public static IQuerySpecification<DomainJModelQuery.Matcher> querySpecification() {
      return DomainJModelQuery.instance();
    }
  }
  
  private DomainJModelQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DomainJModelQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DomainJModelQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return DomainJModelQuery.Matcher.on(engine);
  }
  
  @Override
  public DomainJModelQuery.Matcher instantiate() {
    return DomainJModelQuery.Matcher.create();
  }
  
  @Override
  public DomainJModelQuery.Match newEmptyMatch() {
    return DomainJModelQuery.Match.newEmptyMatch();
  }
  
  @Override
  public DomainJModelQuery.Match newMatch(final Object... parameters) {
    return DomainJModelQuery.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.DomainJModelQuery (visibility: PUBLIC, simpleName: DomainJModelQuery, identifier: queries.DomainJModelQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.DomainJModelQuery (visibility: PUBLIC, simpleName: DomainJModelQuery, identifier: queries.DomainJModelQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DomainJModelQuery INSTANCE = new DomainJModelQuery();
    
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
    private final static DomainJModelQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jModel = new PParameter("jModel", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JModel")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jModel);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.domainJModelQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jModel");
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
          PVariable var_jModel = body.getOrCreateVariableByName("jModel");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jModel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JModel")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jModel, parameter_jModel)
          ));
          // 	JModel(jModel)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jModel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JModel")));
          // 	JModel.framework(jModel, false)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, false);
          new TypeConstraint(body, Tuples.flatTupleOf(var_jModel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JModel")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jModel, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JElement", "framework")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return false;
  }
}
