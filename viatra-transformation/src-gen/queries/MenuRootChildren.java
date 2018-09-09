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
 *         pattern menuRootChildren(menuItem : JUIMenuItem) {
 *         	JModel.rootMenuItems(_JModel, Root);
 *         	JUIMenuItem.children(Root, menuItem);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MenuRootChildren extends BaseGeneratedEMFQuerySpecification<MenuRootChildren.Matcher> {
  /**
   * Pattern-specific match representation of the queries.menuRootChildren pattern,
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
    private EObject fMenuItem;
    
    private static List<String> parameterNames = makeImmutableList("menuItem");
    
    private Match(final EObject pMenuItem) {
      this.fMenuItem = pMenuItem;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("menuItem".equals(parameterName)) return this.fMenuItem;
      return null;
    }
    
    public EObject getMenuItem() {
      return this.fMenuItem;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("menuItem".equals(parameterName) ) {
          this.fMenuItem = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setMenuItem(final EObject pMenuItem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMenuItem = pMenuItem;
    }
    
    @Override
    public String patternName() {
      return "queries.menuRootChildren";
    }
    
    @Override
    public List<String> parameterNames() {
      return MenuRootChildren.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fMenuItem};
    }
    
    @Override
    public MenuRootChildren.Match toImmutable() {
      return isMutable() ? newMatch(fMenuItem) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"menuItem\"=" + prettyPrintValue(fMenuItem));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fMenuItem);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MenuRootChildren.Match)) {
          MenuRootChildren.Match other = (MenuRootChildren.Match) obj;
          return Objects.equals(fMenuItem, other.fMenuItem);
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
    public MenuRootChildren specification() {
      return MenuRootChildren.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MenuRootChildren.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MenuRootChildren.Match newMutableMatch(final EObject pMenuItem) {
      return new Mutable(pMenuItem);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MenuRootChildren.Match newMatch(final EObject pMenuItem) {
      return new Immutable(pMenuItem);
    }
    
    private static final class Mutable extends MenuRootChildren.Match {
      Mutable(final EObject pMenuItem) {
        super(pMenuItem);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MenuRootChildren.Match {
      Immutable(final EObject pMenuItem) {
        super(pMenuItem);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.menuRootChildren pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern menuRootChildren(menuItem : JUIMenuItem) {
   * 	JModel.rootMenuItems(_JModel, Root);
   * 	JUIMenuItem.children(Root, menuItem);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MenuRootChildren
   * 
   */
  public static class Matcher extends BaseMatcher<MenuRootChildren.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MenuRootChildren.Matcher on(final ViatraQueryEngine engine) {
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
    public static MenuRootChildren.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_MENUITEM = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MenuRootChildren.Matcher.class);
    
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
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MenuRootChildren.Match> getAllMatches(final EObject pMenuItem) {
      return rawStreamAllMatches(new Object[]{pMenuItem}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MenuRootChildren.Match> streamAllMatches(final EObject pMenuItem) {
      return rawStreamAllMatches(new Object[]{pMenuItem});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MenuRootChildren.Match> getOneArbitraryMatch(final EObject pMenuItem) {
      return rawGetOneArbitraryMatch(new Object[]{pMenuItem});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pMenuItem) {
      return rawHasMatch(new Object[]{pMenuItem});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pMenuItem) {
      return rawCountMatches(new Object[]{pMenuItem});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pMenuItem, final Consumer<? super MenuRootChildren.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pMenuItem}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMenuItem the fixed value of pattern parameter menuItem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MenuRootChildren.Match newMatch(final EObject pMenuItem) {
      return MenuRootChildren.Match.newMatch(pMenuItem);
    }
    
    /**
     * Retrieve the set of values that occur in matches for menuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfmenuItem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MENUITEM, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for menuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfmenuItem() {
      return rawStreamAllValuesOfmenuItem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for menuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfmenuItem() {
      return rawStreamAllValuesOfmenuItem(emptyArray());
    }
    
    @Override
    protected MenuRootChildren.Match tupleToMatch(final Tuple t) {
      try {
          return MenuRootChildren.Match.newMatch((EObject) t.get(POSITION_MENUITEM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MenuRootChildren.Match arrayToMatch(final Object[] match) {
      try {
          return MenuRootChildren.Match.newMatch((EObject) match[POSITION_MENUITEM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MenuRootChildren.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MenuRootChildren.Match.newMutableMatch((EObject) match[POSITION_MENUITEM]);
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
    public static IQuerySpecification<MenuRootChildren.Matcher> querySpecification() {
      return MenuRootChildren.instance();
    }
  }
  
  private MenuRootChildren() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MenuRootChildren instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MenuRootChildren.Matcher instantiate(final ViatraQueryEngine engine) {
    return MenuRootChildren.Matcher.on(engine);
  }
  
  @Override
  public MenuRootChildren.Matcher instantiate() {
    return MenuRootChildren.Matcher.create();
  }
  
  @Override
  public MenuRootChildren.Match newEmptyMatch() {
    return MenuRootChildren.Match.newEmptyMatch();
  }
  
  @Override
  public MenuRootChildren.Match newMatch(final Object... parameters) {
    return MenuRootChildren.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.MenuRootChildren (visibility: PUBLIC, simpleName: MenuRootChildren, identifier: queries.MenuRootChildren, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.MenuRootChildren (visibility: PUBLIC, simpleName: MenuRootChildren, identifier: queries.MenuRootChildren, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MenuRootChildren INSTANCE = new MenuRootChildren();
    
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
    private final static MenuRootChildren.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_menuItem = new PParameter("menuItem", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_menuItem);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.menuRootChildren";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("menuItem");
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
          PVariable var_menuItem = body.getOrCreateVariableByName("menuItem");
          PVariable var__JModel = body.getOrCreateVariableByName("_JModel");
          PVariable var_Root = body.getOrCreateVariableByName("Root");
          new TypeConstraint(body, Tuples.flatTupleOf(var_menuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_menuItem, parameter_menuItem)
          ));
          // 	JModel.rootMenuItems(_JModel, Root)
          new TypeConstraint(body, Tuples.flatTupleOf(var__JModel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JModel")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__JModel, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JModel", "rootMenuItems")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          new Equality(body, var__virtual_0_, var_Root);
          // 	JUIMenuItem.children(Root, menuItem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Root), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Root, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem", "children")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          new Equality(body, var__virtual_1_, var_menuItem);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
