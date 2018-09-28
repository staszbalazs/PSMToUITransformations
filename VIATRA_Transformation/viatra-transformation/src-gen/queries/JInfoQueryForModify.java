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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JInfo;
import queries.AlreadyTransformed;
import traceability.PSMToUITrace;
import ui.UIInfo;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JInfoQueryForModify(jInfo : JInfo, uiInfo : UIInfo, trace : PSMToUITrace) {
 *         	find alreadyTransformed(jInfo, uiInfo, trace);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JInfoQueryForModify extends BaseGeneratedEMFQuerySpecification<JInfoQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JInfoQueryForModify pattern,
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
    private JInfo fJInfo;
    
    private UIInfo fUiInfo;
    
    private PSMToUITrace fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jInfo", "uiInfo", "trace");
    
    private Match(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      this.fJInfo = pJInfo;
      this.fUiInfo = pUiInfo;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jInfo".equals(parameterName)) return this.fJInfo;
      if ("uiInfo".equals(parameterName)) return this.fUiInfo;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public JInfo getJInfo() {
      return this.fJInfo;
    }
    
    public UIInfo getUiInfo() {
      return this.fUiInfo;
    }
    
    public PSMToUITrace getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jInfo".equals(parameterName) ) {
          this.fJInfo = (JInfo) newValue;
          return true;
      }
      if ("uiInfo".equals(parameterName) ) {
          this.fUiInfo = (UIInfo) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (PSMToUITrace) newValue;
          return true;
      }
      return false;
    }
    
    public void setJInfo(final JInfo pJInfo) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJInfo = pJInfo;
    }
    
    public void setUiInfo(final UIInfo pUiInfo) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiInfo = pUiInfo;
    }
    
    public void setTrace(final PSMToUITrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JInfoQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JInfoQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJInfo, fUiInfo, fTrace};
    }
    
    @Override
    public JInfoQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJInfo, fUiInfo, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jInfo\"=" + prettyPrintValue(fJInfo) + ", ");
      result.append("\"uiInfo\"=" + prettyPrintValue(fUiInfo) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJInfo, fUiInfo, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JInfoQueryForModify.Match)) {
          JInfoQueryForModify.Match other = (JInfoQueryForModify.Match) obj;
          return Objects.equals(fJInfo, other.fJInfo) && Objects.equals(fUiInfo, other.fUiInfo) && Objects.equals(fTrace, other.fTrace);
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
    public JInfoQueryForModify specification() {
      return JInfoQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JInfoQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JInfoQueryForModify.Match newMutableMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return new Mutable(pJInfo, pUiInfo, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JInfoQueryForModify.Match newMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return new Immutable(pJInfo, pUiInfo, pTrace);
    }
    
    private static final class Mutable extends JInfoQueryForModify.Match {
      Mutable(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
        super(pJInfo, pUiInfo, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JInfoQueryForModify.Match {
      Immutable(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
        super(pJInfo, pUiInfo, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JInfoQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JInfoQueryForModify(jInfo : JInfo, uiInfo : UIInfo, trace : PSMToUITrace) {
   * 	find alreadyTransformed(jInfo, uiInfo, trace);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JInfoQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JInfoQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JInfoQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JInfoQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JINFO = 0;
    
    private final static int POSITION_UIINFO = 1;
    
    private final static int POSITION_TRACE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JInfoQueryForModify.Matcher.class);
    
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
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JInfoQueryForModify.Match> getAllMatches(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJInfo, pUiInfo, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JInfoQueryForModify.Match> streamAllMatches(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJInfo, pUiInfo, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JInfoQueryForModify.Match> getOneArbitraryMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJInfo, pUiInfo, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawHasMatch(new Object[]{pJInfo, pUiInfo, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawCountMatches(new Object[]{pJInfo, pUiInfo, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace, final Consumer<? super JInfoQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJInfo, pUiInfo, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUiInfo the fixed value of pattern parameter uiInfo, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JInfoQueryForModify.Match newMatch(final JInfo pJInfo, final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return JInfoQueryForModify.Match.newMatch(pJInfo, pUiInfo, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JInfo> rawStreamAllValuesOfjInfo(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JINFO, parameters).map(JInfo.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JInfo> getAllValuesOfjInfo() {
      return rawStreamAllValuesOfjInfo(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JInfo> streamAllValuesOfjInfo() {
      return rawStreamAllValuesOfjInfo(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JInfo> streamAllValuesOfjInfo(final JInfoQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjInfo(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JInfo> streamAllValuesOfjInfo(final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjInfo(new Object[]{null, pUiInfo, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JInfo> getAllValuesOfjInfo(final JInfoQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjInfo(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JInfo> getAllValuesOfjInfo(final UIInfo pUiInfo, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjInfo(new Object[]{null, pUiInfo, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIInfo> rawStreamAllValuesOfuiInfo(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIINFO, parameters).map(UIInfo.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIInfo> getAllValuesOfuiInfo() {
      return rawStreamAllValuesOfuiInfo(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIInfo> streamAllValuesOfuiInfo() {
      return rawStreamAllValuesOfuiInfo(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIInfo> streamAllValuesOfuiInfo(final JInfoQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiInfo(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIInfo> streamAllValuesOfuiInfo(final JInfo pJInfo, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiInfo(new Object[]{pJInfo, null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIInfo> getAllValuesOfuiInfo(final JInfoQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiInfo(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIInfo> getAllValuesOfuiInfo(final JInfo pJInfo, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiInfo(new Object[]{pJInfo, null, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PSMToUITrace> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(PSMToUITrace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PSMToUITrace> streamAllValuesOftrace() {
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JInfoQueryForModify.Match partialMatch) {
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JInfo pJInfo, final UIInfo pUiInfo) {
      return rawStreamAllValuesOftrace(new Object[]{pJInfo, pUiInfo, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JInfoQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JInfo pJInfo, final UIInfo pUiInfo) {
      return rawStreamAllValuesOftrace(new Object[]{pJInfo, pUiInfo, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JInfoQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JInfoQueryForModify.Match.newMatch((JInfo) t.get(POSITION_JINFO), (UIInfo) t.get(POSITION_UIINFO), (PSMToUITrace) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JInfoQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JInfoQueryForModify.Match.newMatch((JInfo) match[POSITION_JINFO], (UIInfo) match[POSITION_UIINFO], (PSMToUITrace) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JInfoQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JInfoQueryForModify.Match.newMutableMatch((JInfo) match[POSITION_JINFO], (UIInfo) match[POSITION_UIINFO], (PSMToUITrace) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JInfoQueryForModify.Matcher> querySpecification() {
      return JInfoQueryForModify.instance();
    }
  }
  
  private JInfoQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JInfoQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JInfoQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JInfoQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JInfoQueryForModify.Matcher instantiate() {
    return JInfoQueryForModify.Matcher.create();
  }
  
  @Override
  public JInfoQueryForModify.Match newEmptyMatch() {
    return JInfoQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JInfoQueryForModify.Match newMatch(final Object... parameters) {
    return JInfoQueryForModify.Match.newMatch((psm.JInfo) parameters[0], (ui.UIInfo) parameters[1], (traceability.PSMToUITrace) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JInfoQueryForModify (visibility: PUBLIC, simpleName: JInfoQueryForModify, identifier: queries.JInfoQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JInfoQueryForModify (visibility: PUBLIC, simpleName: JInfoQueryForModify, identifier: queries.JInfoQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JInfoQueryForModify INSTANCE = new JInfoQueryForModify();
    
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
    private final static JInfoQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jInfo = new PParameter("jInfo", "psm.JInfo", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JInfo")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiInfo = new PParameter("uiInfo", "ui.UIInfo", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIInfo")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "traceability.PSMToUITrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jInfo, parameter_uiInfo, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JInfoQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jInfo","uiInfo","trace");
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
          PVariable var_jInfo = body.getOrCreateVariableByName("jInfo");
          PVariable var_uiInfo = body.getOrCreateVariableByName("uiInfo");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jInfo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JInfo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiInfo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIInfo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jInfo, parameter_jInfo),
             new ExportedParameter(body, var_uiInfo, parameter_uiInfo),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	find alreadyTransformed(jInfo, uiInfo, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jInfo, var_uiInfo, var_trace), AlreadyTransformed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
