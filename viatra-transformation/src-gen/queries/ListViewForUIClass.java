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
 *         pattern listViewForUIClass(uiClass : UIClass, view : UIListView) {
 *         	UIClass(uiClass);
 *         	UIClass.listView(uiClass, view);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ListViewForUIClass extends BaseGeneratedEMFQuerySpecification<ListViewForUIClass.Matcher> {
  /**
   * Pattern-specific match representation of the queries.listViewForUIClass pattern,
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
    private EObject fUiClass;
    
    private EObject fView;
    
    private static List<String> parameterNames = makeImmutableList("uiClass", "view");
    
    private Match(final EObject pUiClass, final EObject pView) {
      this.fUiClass = pUiClass;
      this.fView = pView;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("uiClass".equals(parameterName)) return this.fUiClass;
      if ("view".equals(parameterName)) return this.fView;
      return null;
    }
    
    public EObject getUiClass() {
      return this.fUiClass;
    }
    
    public EObject getView() {
      return this.fView;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("uiClass".equals(parameterName) ) {
          this.fUiClass = (EObject) newValue;
          return true;
      }
      if ("view".equals(parameterName) ) {
          this.fView = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setUiClass(final EObject pUiClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiClass = pUiClass;
    }
    
    public void setView(final EObject pView) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fView = pView;
    }
    
    @Override
    public String patternName() {
      return "queries.listViewForUIClass";
    }
    
    @Override
    public List<String> parameterNames() {
      return ListViewForUIClass.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fUiClass, fView};
    }
    
    @Override
    public ListViewForUIClass.Match toImmutable() {
      return isMutable() ? newMatch(fUiClass, fView) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"uiClass\"=" + prettyPrintValue(fUiClass) + ", ");
      result.append("\"view\"=" + prettyPrintValue(fView));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fUiClass, fView);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ListViewForUIClass.Match)) {
          ListViewForUIClass.Match other = (ListViewForUIClass.Match) obj;
          return Objects.equals(fUiClass, other.fUiClass) && Objects.equals(fView, other.fView);
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
    public ListViewForUIClass specification() {
      return ListViewForUIClass.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ListViewForUIClass.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ListViewForUIClass.Match newMutableMatch(final EObject pUiClass, final EObject pView) {
      return new Mutable(pUiClass, pView);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ListViewForUIClass.Match newMatch(final EObject pUiClass, final EObject pView) {
      return new Immutable(pUiClass, pView);
    }
    
    private static final class Mutable extends ListViewForUIClass.Match {
      Mutable(final EObject pUiClass, final EObject pView) {
        super(pUiClass, pView);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ListViewForUIClass.Match {
      Immutable(final EObject pUiClass, final EObject pView) {
        super(pUiClass, pView);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.listViewForUIClass pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern listViewForUIClass(uiClass : UIClass, view : UIListView) {
   * 	UIClass(uiClass);
   * 	UIClass.listView(uiClass, view);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ListViewForUIClass
   * 
   */
  public static class Matcher extends BaseMatcher<ListViewForUIClass.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ListViewForUIClass.Matcher on(final ViatraQueryEngine engine) {
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
    public static ListViewForUIClass.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_UICLASS = 0;
    
    private final static int POSITION_VIEW = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ListViewForUIClass.Matcher.class);
    
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
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ListViewForUIClass.Match> getAllMatches(final EObject pUiClass, final EObject pView) {
      return rawStreamAllMatches(new Object[]{pUiClass, pView}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ListViewForUIClass.Match> streamAllMatches(final EObject pUiClass, final EObject pView) {
      return rawStreamAllMatches(new Object[]{pUiClass, pView});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ListViewForUIClass.Match> getOneArbitraryMatch(final EObject pUiClass, final EObject pView) {
      return rawGetOneArbitraryMatch(new Object[]{pUiClass, pView});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pUiClass, final EObject pView) {
      return rawHasMatch(new Object[]{pUiClass, pView});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pUiClass, final EObject pView) {
      return rawCountMatches(new Object[]{pUiClass, pView});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pUiClass, final EObject pView, final Consumer<? super ListViewForUIClass.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUiClass, pView}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUiClass the fixed value of pattern parameter uiClass, or null if not bound.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ListViewForUIClass.Match newMatch(final EObject pUiClass, final EObject pView) {
      return ListViewForUIClass.Match.newMatch(pUiClass, pView);
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
    public Stream<EObject> streamAllValuesOfuiClass(final ListViewForUIClass.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOfuiClass(final EObject pView) {
      return rawStreamAllValuesOfuiClass(new Object[]{null, pView});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiClass(final ListViewForUIClass.Match partialMatch) {
      return rawStreamAllValuesOfuiClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiClass(final EObject pView) {
      return rawStreamAllValuesOfuiClass(new Object[]{null, pView}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfview(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VIEW, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfview() {
      return rawStreamAllValuesOfview(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfview() {
      return rawStreamAllValuesOfview(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfview(final ListViewForUIClass.Match partialMatch) {
      return rawStreamAllValuesOfview(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfview(final EObject pUiClass) {
      return rawStreamAllValuesOfview(new Object[]{pUiClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfview(final ListViewForUIClass.Match partialMatch) {
      return rawStreamAllValuesOfview(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfview(final EObject pUiClass) {
      return rawStreamAllValuesOfview(new Object[]{pUiClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ListViewForUIClass.Match tupleToMatch(final Tuple t) {
      try {
          return ListViewForUIClass.Match.newMatch((EObject) t.get(POSITION_UICLASS), (EObject) t.get(POSITION_VIEW));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ListViewForUIClass.Match arrayToMatch(final Object[] match) {
      try {
          return ListViewForUIClass.Match.newMatch((EObject) match[POSITION_UICLASS], (EObject) match[POSITION_VIEW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ListViewForUIClass.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ListViewForUIClass.Match.newMutableMatch((EObject) match[POSITION_UICLASS], (EObject) match[POSITION_VIEW]);
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
    public static IQuerySpecification<ListViewForUIClass.Matcher> querySpecification() {
      return ListViewForUIClass.instance();
    }
  }
  
  private ListViewForUIClass() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ListViewForUIClass instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ListViewForUIClass.Matcher instantiate(final ViatraQueryEngine engine) {
    return ListViewForUIClass.Matcher.on(engine);
  }
  
  @Override
  public ListViewForUIClass.Matcher instantiate() {
    return ListViewForUIClass.Matcher.create();
  }
  
  @Override
  public ListViewForUIClass.Match newEmptyMatch() {
    return ListViewForUIClass.Match.newEmptyMatch();
  }
  
  @Override
  public ListViewForUIClass.Match newMatch(final Object... parameters) {
    return ListViewForUIClass.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.ListViewForUIClass (visibility: PUBLIC, simpleName: ListViewForUIClass, identifier: queries.ListViewForUIClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.ListViewForUIClass (visibility: PUBLIC, simpleName: ListViewForUIClass, identifier: queries.ListViewForUIClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ListViewForUIClass INSTANCE = new ListViewForUIClass();
    
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
    private final static ListViewForUIClass.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_uiClass = new PParameter("uiClass", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_view = new PParameter("view", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIListView")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_uiClass, parameter_view);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.listViewForUIClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("uiClass","view");
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
          PVariable var_uiClass = body.getOrCreateVariableByName("uiClass");
          PVariable var_view = body.getOrCreateVariableByName("view");
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_view), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIListView")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_uiClass, parameter_uiClass),
             new ExportedParameter(body, var_view, parameter_view)
          ));
          // 	UIClass(uiClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")));
          // 	UIClass.listView(uiClass, view)
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIClass")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIClass", "listView")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIListView")));
          new Equality(body, var__virtual_0_, var_view);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
