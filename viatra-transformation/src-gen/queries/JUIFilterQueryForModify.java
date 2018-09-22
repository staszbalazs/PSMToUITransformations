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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.AlreadyTransformed;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JUIFilterQueryForModify(jFilter : JUIFilter, uiFilter : UIFilter, uiMenuItem : UIMenuItem, componentType : UIBaseComponentType, trace : PSMToUITrace) {
 *         	JUIMenuItem.uifilters(jMenuItem, jFilter);
 *         	PSMToUITrace.psmElements(menuTrace, jMenuItem);
 *         	PSMToUITrace.uiElements(menuTrace, uiMenuItem);
 *         	
 *         	JUIFilter.attribute(jFilter, attribute);
 *         	PSMToUITrace.psmElements(componentTrace, attribute);
 *         	PSMToUITrace.uiElements(componentTrace, componentType);
 *         	
 *         	find alreadyTransformed(jFilter, uiFilter, trace);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JUIFilterQueryForModify extends BaseGeneratedEMFQuerySpecification<JUIFilterQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JUIFilterQueryForModify pattern,
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
    private EObject fJFilter;
    
    private EObject fUiFilter;
    
    private EObject fUiMenuItem;
    
    private EObject fComponentType;
    
    private EObject fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jFilter", "uiFilter", "uiMenuItem", "componentType", "trace");
    
    private Match(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      this.fJFilter = pJFilter;
      this.fUiFilter = pUiFilter;
      this.fUiMenuItem = pUiMenuItem;
      this.fComponentType = pComponentType;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jFilter".equals(parameterName)) return this.fJFilter;
      if ("uiFilter".equals(parameterName)) return this.fUiFilter;
      if ("uiMenuItem".equals(parameterName)) return this.fUiMenuItem;
      if ("componentType".equals(parameterName)) return this.fComponentType;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public EObject getJFilter() {
      return this.fJFilter;
    }
    
    public EObject getUiFilter() {
      return this.fUiFilter;
    }
    
    public EObject getUiMenuItem() {
      return this.fUiMenuItem;
    }
    
    public EObject getComponentType() {
      return this.fComponentType;
    }
    
    public EObject getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jFilter".equals(parameterName) ) {
          this.fJFilter = (EObject) newValue;
          return true;
      }
      if ("uiFilter".equals(parameterName) ) {
          this.fUiFilter = (EObject) newValue;
          return true;
      }
      if ("uiMenuItem".equals(parameterName) ) {
          this.fUiMenuItem = (EObject) newValue;
          return true;
      }
      if ("componentType".equals(parameterName) ) {
          this.fComponentType = (EObject) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJFilter(final EObject pJFilter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJFilter = pJFilter;
    }
    
    public void setUiFilter(final EObject pUiFilter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiFilter = pUiFilter;
    }
    
    public void setUiMenuItem(final EObject pUiMenuItem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiMenuItem = pUiMenuItem;
    }
    
    public void setComponentType(final EObject pComponentType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fComponentType = pComponentType;
    }
    
    public void setTrace(final EObject pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JUIFilterQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JUIFilterQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJFilter, fUiFilter, fUiMenuItem, fComponentType, fTrace};
    }
    
    @Override
    public JUIFilterQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJFilter, fUiFilter, fUiMenuItem, fComponentType, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jFilter\"=" + prettyPrintValue(fJFilter) + ", ");
      result.append("\"uiFilter\"=" + prettyPrintValue(fUiFilter) + ", ");
      result.append("\"uiMenuItem\"=" + prettyPrintValue(fUiMenuItem) + ", ");
      result.append("\"componentType\"=" + prettyPrintValue(fComponentType) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJFilter, fUiFilter, fUiMenuItem, fComponentType, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JUIFilterQueryForModify.Match)) {
          JUIFilterQueryForModify.Match other = (JUIFilterQueryForModify.Match) obj;
          return Objects.equals(fJFilter, other.fJFilter) && Objects.equals(fUiFilter, other.fUiFilter) && Objects.equals(fUiMenuItem, other.fUiMenuItem) && Objects.equals(fComponentType, other.fComponentType) && Objects.equals(fTrace, other.fTrace);
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
    public JUIFilterQueryForModify specification() {
      return JUIFilterQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JUIFilterQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JUIFilterQueryForModify.Match newMutableMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return new Mutable(pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JUIFilterQueryForModify.Match newMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return new Immutable(pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace);
    }
    
    private static final class Mutable extends JUIFilterQueryForModify.Match {
      Mutable(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
        super(pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JUIFilterQueryForModify.Match {
      Immutable(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
        super(pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JUIFilterQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JUIFilterQueryForModify(jFilter : JUIFilter, uiFilter : UIFilter, uiMenuItem : UIMenuItem, componentType : UIBaseComponentType, trace : PSMToUITrace) {
   * 	JUIMenuItem.uifilters(jMenuItem, jFilter);
   * 	PSMToUITrace.psmElements(menuTrace, jMenuItem);
   * 	PSMToUITrace.uiElements(menuTrace, uiMenuItem);
   * 	
   * 	JUIFilter.attribute(jFilter, attribute);
   * 	PSMToUITrace.psmElements(componentTrace, attribute);
   * 	PSMToUITrace.uiElements(componentTrace, componentType);
   * 	
   * 	find alreadyTransformed(jFilter, uiFilter, trace);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JUIFilterQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JUIFilterQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JUIFilterQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JUIFilterQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JFILTER = 0;
    
    private final static int POSITION_UIFILTER = 1;
    
    private final static int POSITION_UIMENUITEM = 2;
    
    private final static int POSITION_COMPONENTTYPE = 3;
    
    private final static int POSITION_TRACE = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JUIFilterQueryForModify.Matcher.class);
    
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
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JUIFilterQueryForModify.Match> getAllMatches(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllMatches(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JUIFilterQueryForModify.Match> streamAllMatches(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllMatches(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JUIFilterQueryForModify.Match> getOneArbitraryMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawHasMatch(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawCountMatches(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace, final Consumer<? super JUIFilterQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJFilter the fixed value of pattern parameter jFilter, or null if not bound.
     * @param pUiFilter the fixed value of pattern parameter uiFilter, or null if not bound.
     * @param pUiMenuItem the fixed value of pattern parameter uiMenuItem, or null if not bound.
     * @param pComponentType the fixed value of pattern parameter componentType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JUIFilterQueryForModify.Match newMatch(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return JUIFilterQueryForModify.Match.newMatch(pJFilter, pUiFilter, pUiMenuItem, pComponentType, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjFilter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JFILTER, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjFilter() {
      return rawStreamAllValuesOfjFilter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjFilter() {
      return rawStreamAllValuesOfjFilter(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjFilter(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjFilter(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjFilter(final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfjFilter(new Object[]{null, pUiFilter, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjFilter(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjFilter(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjFilter(final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfjFilter(new Object[]{null, pUiFilter, pUiMenuItem, pComponentType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfuiFilter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIFILTER, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiFilter() {
      return rawStreamAllValuesOfuiFilter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiFilter() {
      return rawStreamAllValuesOfuiFilter(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiFilter(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiFilter(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiFilter(final EObject pJFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfuiFilter(new Object[]{pJFilter, null, pUiMenuItem, pComponentType, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiFilter(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiFilter(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiFilter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiFilter(final EObject pJFilter, final EObject pUiMenuItem, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfuiFilter(new Object[]{pJFilter, null, pUiMenuItem, pComponentType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfuiMenuItem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIMENUITEM, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiMenuItem() {
      return rawStreamAllValuesOfuiMenuItem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfuiMenuItem() {
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
    public Stream<EObject> streamAllValuesOfuiMenuItem(final JUIFilterQueryForModify.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOfuiMenuItem(final EObject pJFilter, final EObject pUiFilter, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfuiMenuItem(new Object[]{pJFilter, pUiFilter, null, pComponentType, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiMenuItem(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiMenuItem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiMenuItem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfuiMenuItem(final EObject pJFilter, final EObject pUiFilter, final EObject pComponentType, final EObject pTrace) {
      return rawStreamAllValuesOfuiMenuItem(new Object[]{pJFilter, pUiFilter, null, pComponentType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfcomponentType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COMPONENTTYPE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcomponentType() {
      return rawStreamAllValuesOfcomponentType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfcomponentType() {
      return rawStreamAllValuesOfcomponentType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfcomponentType(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfcomponentType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfcomponentType(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pTrace) {
      return rawStreamAllValuesOfcomponentType(new Object[]{pJFilter, pUiFilter, pUiMenuItem, null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcomponentType(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfcomponentType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for componentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfcomponentType(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pTrace) {
      return rawStreamAllValuesOfcomponentType(new Object[]{pJFilter, pUiFilter, pUiMenuItem, null, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOftrace() {
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
    public Stream<EObject> streamAllValuesOftrace(final JUIFilterQueryForModify.Match partialMatch) {
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
    public Stream<EObject> streamAllValuesOftrace(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType) {
      return rawStreamAllValuesOftrace(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace(final JUIFilterQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOftrace(final EObject pJFilter, final EObject pUiFilter, final EObject pUiMenuItem, final EObject pComponentType) {
      return rawStreamAllValuesOftrace(new Object[]{pJFilter, pUiFilter, pUiMenuItem, pComponentType, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JUIFilterQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JUIFilterQueryForModify.Match.newMatch((EObject) t.get(POSITION_JFILTER), (EObject) t.get(POSITION_UIFILTER), (EObject) t.get(POSITION_UIMENUITEM), (EObject) t.get(POSITION_COMPONENTTYPE), (EObject) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JUIFilterQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JUIFilterQueryForModify.Match.newMatch((EObject) match[POSITION_JFILTER], (EObject) match[POSITION_UIFILTER], (EObject) match[POSITION_UIMENUITEM], (EObject) match[POSITION_COMPONENTTYPE], (EObject) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JUIFilterQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JUIFilterQueryForModify.Match.newMutableMatch((EObject) match[POSITION_JFILTER], (EObject) match[POSITION_UIFILTER], (EObject) match[POSITION_UIMENUITEM], (EObject) match[POSITION_COMPONENTTYPE], (EObject) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JUIFilterQueryForModify.Matcher> querySpecification() {
      return JUIFilterQueryForModify.instance();
    }
  }
  
  private JUIFilterQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JUIFilterQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JUIFilterQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JUIFilterQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JUIFilterQueryForModify.Matcher instantiate() {
    return JUIFilterQueryForModify.Matcher.create();
  }
  
  @Override
  public JUIFilterQueryForModify.Match newEmptyMatch() {
    return JUIFilterQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JUIFilterQueryForModify.Match newMatch(final Object... parameters) {
    return JUIFilterQueryForModify.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2], (org.eclipse.emf.ecore.EObject) parameters[3], (org.eclipse.emf.ecore.EObject) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JUIFilterQueryForModify (visibility: PUBLIC, simpleName: JUIFilterQueryForModify, identifier: queries.JUIFilterQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JUIFilterQueryForModify (visibility: PUBLIC, simpleName: JUIFilterQueryForModify, identifier: queries.JUIFilterQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JUIFilterQueryForModify INSTANCE = new JUIFilterQueryForModify();
    
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
    private final static JUIFilterQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jFilter = new PParameter("jFilter", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JUIFilter")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiFilter = new PParameter("uiFilter", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIFilter")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiMenuItem = new PParameter("uiMenuItem", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_componentType = new PParameter("componentType", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIBaseComponentType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jFilter, parameter_uiFilter, parameter_uiMenuItem, parameter_componentType, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JUIFilterQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jFilter","uiFilter","uiMenuItem","componentType","trace");
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
          PVariable var_jFilter = body.getOrCreateVariableByName("jFilter");
          PVariable var_uiFilter = body.getOrCreateVariableByName("uiFilter");
          PVariable var_uiMenuItem = body.getOrCreateVariableByName("uiMenuItem");
          PVariable var_componentType = body.getOrCreateVariableByName("componentType");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_jMenuItem = body.getOrCreateVariableByName("jMenuItem");
          PVariable var_menuTrace = body.getOrCreateVariableByName("menuTrace");
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_componentTrace = body.getOrCreateVariableByName("componentTrace");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jFilter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIFilter")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiFilter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIFilter")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIMenuItem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_componentType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIBaseComponentType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jFilter, parameter_jFilter),
             new ExportedParameter(body, var_uiFilter, parameter_uiFilter),
             new ExportedParameter(body, var_uiMenuItem, parameter_uiMenuItem),
             new ExportedParameter(body, var_componentType, parameter_componentType),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	JUIMenuItem.uifilters(jMenuItem, jFilter)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jMenuItem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jMenuItem, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JUIMenuItem", "uifilters")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIFilter")));
          new Equality(body, var__virtual_0_, var_jFilter);
          // 	PSMToUITrace.psmElements(menuTrace, jMenuItem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_menuTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_menuTrace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_1_, var_jMenuItem);
          // 	PSMToUITrace.uiElements(menuTrace, uiMenuItem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_menuTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_menuTrace, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_2_, var_uiMenuItem);
          // 		JUIFilter.attribute(jFilter, attribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jFilter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIFilter")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jFilter, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JUIFilter", "attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JAttribute")));
          new Equality(body, var__virtual_3_, var_attribute);
          // 	PSMToUITrace.psmElements(componentTrace, attribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_componentTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_componentTrace, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_4_, var_attribute);
          // 	PSMToUITrace.uiElements(componentTrace, componentType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_componentTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_componentTrace, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_5_, var_componentType);
          // 		find alreadyTransformed(jFilter, uiFilter, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jFilter, var_uiFilter, var_trace), AlreadyTransformed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
