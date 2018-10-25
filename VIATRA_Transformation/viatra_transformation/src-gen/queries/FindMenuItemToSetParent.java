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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JUIMenuItem;
import queries.AlreadyTransformed;
import ui.UIMenuItem;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern findMenuItemToSetParent(jMenuItem : JUIMenuItem, uiMenuItem : UIMenuItem, parentMenuItem : UIMenuItem) {
 *         	JUIMenuItem.parent(jMenuItem, parent);
 *         	find alreadyTransformed(jMenuItem, uiMenuItem, _);
 *         	find alreadyTransformed(parent, parentMenuItem, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FindMenuItemToSetParent extends BaseGeneratedEMFQuerySpecification<FindMenuItemToSetParent.Matcher> {
  /**
   * Pattern-specific match representation of the queries.findMenuItemToSetParent pattern,
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
    private JUIMenuItem fJMenuItem;
    
    private UIMenuItem fUiMenuItem;
    
    private UIMenuItem fParentMenuItem;
    
    private static List<String> parameterNames = makeImmutableList("jMenuItem", "uiMenuItem", "parentMenuItem");
    
    private Match(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      this.fJMenuItem = pJMenuItem;
      this.fUiMenuItem = pUiMenuItem;
      this.fParentMenuItem = pParentMenuItem;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jMenuItem".equals(parameterName)) return this.fJMenuItem;
      if ("uiMenuItem".equals(parameterName)) return this.fUiMenuItem;
      if ("parentMenuItem".equals(parameterName)) return this.fParentMenuItem;
      return null;
    }
    
    public JUIMenuItem getJMenuItem() {
      return this.fJMenuItem;
    }
    
    public UIMenuItem getUiMenuItem() {
      return this.fUiMenuItem;
    }
    
    public UIMenuItem getParentMenuItem() {
      return this.fParentMenuItem;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jMenuItem".equals(parameterName) ) {
          this.fJMenuItem = (JUIMenuItem) newValue;
          return true;
      }
      if ("uiMenuItem".equals(parameterName) ) {
          this.fUiMenuItem = (UIMenuItem) newValue;
          return true;
      }
      if ("parentMenuItem".equals(parameterName) ) {
          this.fParentMenuItem = (UIMenuItem) newValue;
          return true;
      }
      return false;
    }
    
    public void setJMenuItem(final JUIMenuItem pJMenuItem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJMenuItem = pJMenuItem;
    }
    
    public void setUiMenuItem(final UIMenuItem pUiMenuItem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiMenuItem = pUiMenuItem;
    }
    
    public void setParentMenuItem(final UIMenuItem pParentMenuItem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParentMenuItem = pParentMenuItem;
    }
    
    @Override
    public String patternName() {
      return "queries.findMenuItemToSetParent";
    }
    
    @Override
    public List<String> parameterNames() {
      return FindMenuItemToSetParent.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJMenuItem, fUiMenuItem, fParentMenuItem};
    }
    
    @Override
    public FindMenuItemToSetParent.Match toImmutable() {
      return isMutable() ? newMatch(fJMenuItem, fUiMenuItem, fParentMenuItem) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jMenuItem\"=" + prettyPrintValue(fJMenuItem) + ", ");
      result.append("\"uiMenuItem\"=" + prettyPrintValue(fUiMenuItem) + ", ");
      result.append("\"parentMenuItem\"=" + prettyPrintValue(fParentMenuItem));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJMenuItem, fUiMenuItem, fParentMenuItem);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FindMenuItemToSetParent.Match)) {
          FindMenuItemToSetParent.Match other = (FindMenuItemToSetParent.Match) obj;
          return Objects.equals(fJMenuItem, other.fJMenuItem) && Objects.equals(fUiMenuItem, other.fUiMenuItem) && Objects.equals(fParentMenuItem, other.fParentMenuItem);
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
    public FindMenuItemToSetParent specification() {
      return FindMenuItemToSetParent.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FindMenuItemToSetParent.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FindMenuItemToSetParent.Match newMutableMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return new Mutable(pJMenuItem, pUiMenuItem, pParentMenuItem);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FindMenuItemToSetParent.Match newMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return new Immutable(pJMenuItem, pUiMenuItem, pParentMenuItem);
    }
    
    private static final class Mutable extends FindMenuItemToSetParent.Match {
      Mutable(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
        super(pJMenuItem, pUiMenuItem, pParentMenuItem);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FindMenuItemToSetParent.Match {
      Immutable(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
        super(pJMenuItem, pUiMenuItem, pParentMenuItem);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.findMenuItemToSetParent pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern findMenuItemToSetParent(jMenuItem : JUIMenuItem, uiMenuItem : UIMenuItem, parentMenuItem : UIMenuItem) {
   * 	JUIMenuItem.parent(jMenuItem, parent);
   * 	find alreadyTransformed(jMenuItem, uiMenuItem, _);
   * 	find alreadyTransformed(parent, parentMenuItem, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FindMenuItemToSetParent
   * 
   */
  public static class Matcher extends BaseMatcher<FindMenuItemToSetParent.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FindMenuItemToSetParent.Matcher on(final ViatraQueryEngine engine) {
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
    public static FindMenuItemToSetParent.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JMENUITEM = 0;
    
    private final static int POSITION_UIMENUITEM = 1;
    
    private final static int POSITION_PARENTMENUITEM = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FindMenuItemToSetParent.Matcher.class);
    
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
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FindMenuItemToSetParent.Match> getAllMatches(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllMatches(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FindMenuItemToSetParent.Match> streamAllMatches(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllMatches(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FindMenuItemToSetParent.Match> getOneArbitraryMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawGetOneArbitraryMatch(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawHasMatch(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawCountMatches(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem, final Consumer<? super FindMenuItemToSetParent.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJMenuItem, pUiMenuItem, pParentMenuItem}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJMenuItem the fixed value of pattern parameter jMenuItem, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pParentMenuItem the fixed value of pattern parameter parentMenuItem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FindMenuItemToSetParent.Match newMatch(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return FindMenuItemToSetParent.Match.newMatch(pJMenuItem, pUiMenuItem, pParentMenuItem);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JUIMenuItem> rawStreamAllValuesOfjMenuItem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JMENUITEM, parameters).map(JUIMenuItem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JUIMenuItem> getAllValuesOfjMenuItem() {
      return rawStreamAllValuesOfjMenuItem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JUIMenuItem> streamAllValuesOfjMenuItem() {
      return rawStreamAllValuesOfjMenuItem(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JUIMenuItem> streamAllValuesOfjMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfjMenuItem(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JUIMenuItem> streamAllValuesOfjMenuItem(final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllValuesOfjMenuItem(new Object[]{null, pUiMenuItem, pParentMenuItem});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JUIMenuItem> getAllValuesOfjMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfjMenuItem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JUIMenuItem> getAllValuesOfjMenuItem(final UIMenuItem pUiMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllValuesOfjMenuItem(new Object[]{null, pUiMenuItem, pParentMenuItem}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIMenuItem> rawStreamAllValuesOfuiMenuItem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIMENUITEM, parameters).map(UIMenuItem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfuiMenuItem() {
      return rawStreamAllValuesOfuiMenuItem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfuiMenuItem() {
      return rawStreamAllValuesOfuiMenuItem(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfuiMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfuiMenuItem(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfuiMenuItem(final JUIMenuItem pJMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllValuesOfuiMenuItem(new Object[]{pJMenuItem, null, pParentMenuItem});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfuiMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfuiMenuItem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfuiMenuItem(final JUIMenuItem pJMenuItem, final UIMenuItem pParentMenuItem) {
      return rawStreamAllValuesOfuiMenuItem(new Object[]{pJMenuItem, null, pParentMenuItem}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIMenuItem> rawStreamAllValuesOfparentMenuItem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENTMENUITEM, parameters).map(UIMenuItem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfparentMenuItem() {
      return rawStreamAllValuesOfparentMenuItem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfparentMenuItem() {
      return rawStreamAllValuesOfparentMenuItem(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfparentMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfparentMenuItem(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIMenuItem> streamAllValuesOfparentMenuItem(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem) {
      return rawStreamAllValuesOfparentMenuItem(new Object[]{pJMenuItem, pUiMenuItem, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfparentMenuItem(final FindMenuItemToSetParent.Match partialMatch) {
      return rawStreamAllValuesOfparentMenuItem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIMenuItem> getAllValuesOfparentMenuItem(final JUIMenuItem pJMenuItem, final UIMenuItem pUiMenuItem) {
      return rawStreamAllValuesOfparentMenuItem(new Object[]{pJMenuItem, pUiMenuItem, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected FindMenuItemToSetParent.Match tupleToMatch(final Tuple t) {
      try {
          return FindMenuItemToSetParent.Match.newMatch((JUIMenuItem) t.get(POSITION_JMENUITEM), (UIMenuItem) t.get(POSITION_UIMENUITEM), (UIMenuItem) t.get(POSITION_PARENTMENUITEM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FindMenuItemToSetParent.Match arrayToMatch(final Object[] match) {
      try {
          return FindMenuItemToSetParent.Match.newMatch((JUIMenuItem) match[POSITION_JMENUITEM], (UIMenuItem) match[POSITION_UIMENUITEM], (UIMenuItem) match[POSITION_PARENTMENUITEM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FindMenuItemToSetParent.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FindMenuItemToSetParent.Match.newMutableMatch((JUIMenuItem) match[POSITION_JMENUITEM], (UIMenuItem) match[POSITION_UIMENUITEM], (UIMenuItem) match[POSITION_PARENTMENUITEM]);
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
    public static IQuerySpecification<FindMenuItemToSetParent.Matcher> querySpecification() {
      return FindMenuItemToSetParent.instance();
    }
  }
  
  private FindMenuItemToSetParent() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FindMenuItemToSetParent instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FindMenuItemToSetParent.Matcher instantiate(final ViatraQueryEngine engine) {
    return FindMenuItemToSetParent.Matcher.on(engine);
  }
  
  @Override
  public FindMenuItemToSetParent.Matcher instantiate() {
    return FindMenuItemToSetParent.Matcher.create();
  }
  
  @Override
  public FindMenuItemToSetParent.Match newEmptyMatch() {
    return FindMenuItemToSetParent.Match.newEmptyMatch();
  }
  
  @Override
  public FindMenuItemToSetParent.Match newMatch(final Object... parameters) {
    return FindMenuItemToSetParent.Match.newMatch((psm.JUIMenuItem) parameters[0], (ui.UIMenuItem) parameters[1], (ui.UIMenuItem) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.FindMenuItemToSetParent (visibility: PUBLIC, simpleName: FindMenuItemToSetParent, identifier: queries.FindMenuItemToSetParent, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.FindMenuItemToSetParent (visibility: PUBLIC, simpleName: FindMenuItemToSetParent, identifier: queries.FindMenuItemToSetParent, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static FindMenuItemToSetParent INSTANCE = new FindMenuItemToSetParent();
    
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
    private final static FindMenuItemToSetParent.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jMenuItem = new PParameter("jMenuItem", "psm.JUIMenuItem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiMenuItem = new PParameter("uiMenuItem", "ui.UIMenuItem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_parentMenuItem = new PParameter("parentMenuItem", "ui.UIMenuItem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jMenuItem, parameter_uiMenuItem, parameter_parentMenuItem);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.findMenuItemToSetParent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jMenuItem","uiMenuItem","parentMenuItem");
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
          PVariable var_jMenuItem = body.getOrCreateVariableByName("jMenuItem");
          PVariable var_uiMenuItem = body.getOrCreateVariableByName("uiMenuItem");
          PVariable var_parentMenuItem = body.getOrCreateVariableByName("parentMenuItem");
          PVariable var_parent = body.getOrCreateVariableByName("parent");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jMenuItem, parameter_jMenuItem),
             new ExportedParameter(body, var_uiMenuItem, parameter_uiMenuItem),
             new ExportedParameter(body, var_parentMenuItem, parameter_parentMenuItem)
          ));
          // 	JUIMenuItem.parent(jMenuItem, parent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jMenuItem, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem", "parent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          new Equality(body, var__virtual_0_, var_parent);
          // 	find alreadyTransformed(jMenuItem, uiMenuItem, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jMenuItem, var_uiMenuItem, var___0_), AlreadyTransformed.instance().getInternalQueryRepresentation());
          // 	find alreadyTransformed(parent, parentMenuItem, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_parent, var_parentMenuItem, var___1_), AlreadyTransformed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
