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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
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
 *         //UIBase Queries
 *         pattern UIBaseQuery(uiBase: UIBase) {
 *         	UIBase(uiBase);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UIBaseQuery extends BaseGeneratedEMFQuerySpecification<UIBaseQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.UIBaseQuery pattern,
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
    private EObject fUiBase;
    
    private static List<String> parameterNames = makeImmutableList("uiBase");
    
    private Match(final EObject pUiBase) {
      this.fUiBase = pUiBase;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("uiBase".equals(parameterName)) return this.fUiBase;
      return null;
    }
    
    public EObject getUiBase() {
      return this.fUiBase;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("uiBase".equals(parameterName) ) {
          this.fUiBase = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setUiBase(final EObject pUiBase) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiBase = pUiBase;
    }
    
    @Override
    public String patternName() {
      return "queries.UIBaseQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return UIBaseQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fUiBase};
    }
    
    @Override
    public UIBaseQuery.Match toImmutable() {
      return isMutable() ? newMatch(fUiBase) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"uiBase\"=" + prettyPrintValue(fUiBase));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fUiBase);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UIBaseQuery.Match)) {
          UIBaseQuery.Match other = (UIBaseQuery.Match) obj;
          return Objects.equals(fUiBase, other.fUiBase);
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
    public UIBaseQuery specification() {
      return UIBaseQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UIBaseQuery.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UIBaseQuery.Match newMutableMatch(final EObject pUiBase) {
      return new Mutable(pUiBase);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UIBaseQuery.Match newMatch(final EObject pUiBase) {
      return new Immutable(pUiBase);
    }
    
    private static final class Mutable extends UIBaseQuery.Match {
      Mutable(final EObject pUiBase) {
        super(pUiBase);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends UIBaseQuery.Match {
      Immutable(final EObject pUiBase) {
        super(pUiBase);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.UIBaseQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //UIBase Queries
   * pattern UIBaseQuery(uiBase: UIBase) {
   * 	UIBase(uiBase);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UIBaseQuery
   * 
   */
  public static class Matcher extends BaseMatcher<UIBaseQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UIBaseQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static UIBaseQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_UIBASE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UIBaseQuery.Matcher.class);
    
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
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UIBaseQuery.Match> getAllMatches(final EObject pUiBase) {
      return rawStreamAllMatches(new Object[]{pUiBase}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UIBaseQuery.Match> streamAllMatches(final EObject pUiBase) {
      return rawStreamAllMatches(new Object[]{pUiBase});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UIBaseQuery.Match> getOneArbitraryMatch(final EObject pUiBase) {
      return rawGetOneArbitraryMatch(new Object[]{pUiBase});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pUiBase) {
      return rawHasMatch(new Object[]{pUiBase});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pUiBase) {
      return rawCountMatches(new Object[]{pUiBase});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pUiBase, final Consumer<? super UIBaseQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUiBase}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUiBase the fixed value of pattern parameter uiBase, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UIBaseQuery.Match newMatch(final EObject pUiBase) {
      return UIBaseQuery.Match.newMatch(pUiBase);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiBase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfuiBase(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIBASE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiBase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiBase() {
      return rawStreamAllValuesOfuiBase(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiBase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiBase() {
      return rawStreamAllValuesOfuiBase(emptyArray());
    }
    
    @Override
    protected UIBaseQuery.Match tupleToMatch(final Tuple t) {
      try {
          return UIBaseQuery.Match.newMatch((EObject) t.get(POSITION_UIBASE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UIBaseQuery.Match arrayToMatch(final Object[] match) {
      try {
          return UIBaseQuery.Match.newMatch((EObject) match[POSITION_UIBASE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UIBaseQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UIBaseQuery.Match.newMutableMatch((EObject) match[POSITION_UIBASE]);
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
    public static IQuerySpecification<UIBaseQuery.Matcher> querySpecification() {
      return UIBaseQuery.instance();
    }
  }
  
  private UIBaseQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UIBaseQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected UIBaseQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return UIBaseQuery.Matcher.on(engine);
  }
  
  @Override
  public UIBaseQuery.Matcher instantiate() {
    return UIBaseQuery.Matcher.create();
  }
  
  @Override
  public UIBaseQuery.Match newEmptyMatch() {
    return UIBaseQuery.Match.newEmptyMatch();
  }
  
  @Override
  public UIBaseQuery.Match newMatch(final Object... parameters) {
    return UIBaseQuery.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.UIBaseQuery (visibility: PUBLIC, simpleName: UIBaseQuery, identifier: queries.UIBaseQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.UIBaseQuery (visibility: PUBLIC, simpleName: UIBaseQuery, identifier: queries.UIBaseQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static UIBaseQuery INSTANCE = new UIBaseQuery();
    
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
    private final static UIBaseQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_uiBase = new PParameter("uiBase", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIBase")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_uiBase);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.UIBaseQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("uiBase");
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
          PVariable var_uiBase = body.getOrCreateVariableByName("uiBase");
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiBase), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIBase")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_uiBase, parameter_uiBase)
          ));
          // 	UIBase(uiBase)
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiBase), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIBase")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
