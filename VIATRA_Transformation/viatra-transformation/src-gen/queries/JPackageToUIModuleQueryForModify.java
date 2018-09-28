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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JPackage;
import traceability.PSMToUITrace;
import ui.UIModule;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JPackageToUIModuleQueryForModify(jPackage : JPackage, uiModule : UIModule, trace : PSMToUITrace) {
 *         	PSMToUITrace.psmElements(trace, jPackage);
 *         	PSMToUITrace.uiElements(trace, uiModule);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JPackageToUIModuleQueryForModify extends BaseGeneratedEMFQuerySpecification<JPackageToUIModuleQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JPackageToUIModuleQueryForModify pattern,
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
    private JPackage fJPackage;
    
    private UIModule fUiModule;
    
    private PSMToUITrace fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jPackage", "uiModule", "trace");
    
    private Match(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      this.fJPackage = pJPackage;
      this.fUiModule = pUiModule;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jPackage".equals(parameterName)) return this.fJPackage;
      if ("uiModule".equals(parameterName)) return this.fUiModule;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public JPackage getJPackage() {
      return this.fJPackage;
    }
    
    public UIModule getUiModule() {
      return this.fUiModule;
    }
    
    public PSMToUITrace getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jPackage".equals(parameterName) ) {
          this.fJPackage = (JPackage) newValue;
          return true;
      }
      if ("uiModule".equals(parameterName) ) {
          this.fUiModule = (UIModule) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (PSMToUITrace) newValue;
          return true;
      }
      return false;
    }
    
    public void setJPackage(final JPackage pJPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJPackage = pJPackage;
    }
    
    public void setUiModule(final UIModule pUiModule) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUiModule = pUiModule;
    }
    
    public void setTrace(final PSMToUITrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JPackageToUIModuleQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JPackageToUIModuleQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJPackage, fUiModule, fTrace};
    }
    
    @Override
    public JPackageToUIModuleQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJPackage, fUiModule, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jPackage\"=" + prettyPrintValue(fJPackage) + ", ");
      result.append("\"uiModule\"=" + prettyPrintValue(fUiModule) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJPackage, fUiModule, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JPackageToUIModuleQueryForModify.Match)) {
          JPackageToUIModuleQueryForModify.Match other = (JPackageToUIModuleQueryForModify.Match) obj;
          return Objects.equals(fJPackage, other.fJPackage) && Objects.equals(fUiModule, other.fUiModule) && Objects.equals(fTrace, other.fTrace);
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
    public JPackageToUIModuleQueryForModify specification() {
      return JPackageToUIModuleQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JPackageToUIModuleQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JPackageToUIModuleQueryForModify.Match newMutableMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return new Mutable(pJPackage, pUiModule, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JPackageToUIModuleQueryForModify.Match newMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return new Immutable(pJPackage, pUiModule, pTrace);
    }
    
    private static final class Mutable extends JPackageToUIModuleQueryForModify.Match {
      Mutable(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
        super(pJPackage, pUiModule, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JPackageToUIModuleQueryForModify.Match {
      Immutable(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
        super(pJPackage, pUiModule, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JPackageToUIModuleQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JPackageToUIModuleQueryForModify(jPackage : JPackage, uiModule : UIModule, trace : PSMToUITrace) {
   * 	PSMToUITrace.psmElements(trace, jPackage);
   * 	PSMToUITrace.uiElements(trace, uiModule);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JPackageToUIModuleQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JPackageToUIModuleQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JPackageToUIModuleQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JPackageToUIModuleQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JPACKAGE = 0;
    
    private final static int POSITION_UIMODULE = 1;
    
    private final static int POSITION_TRACE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JPackageToUIModuleQueryForModify.Matcher.class);
    
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
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JPackageToUIModuleQueryForModify.Match> getAllMatches(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJPackage, pUiModule, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JPackageToUIModuleQueryForModify.Match> streamAllMatches(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJPackage, pUiModule, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JPackageToUIModuleQueryForModify.Match> getOneArbitraryMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJPackage, pUiModule, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawHasMatch(new Object[]{pJPackage, pUiModule, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawCountMatches(new Object[]{pJPackage, pUiModule, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace, final Consumer<? super JPackageToUIModuleQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJPackage, pUiModule, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJPackage the fixed value of pattern parameter jPackage, or null if not bound.
     * @param pUiModule the fixed value of pattern parameter uiModule, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JPackageToUIModuleQueryForModify.Match newMatch(final JPackage pJPackage, final UIModule pUiModule, final PSMToUITrace pTrace) {
      return JPackageToUIModuleQueryForModify.Match.newMatch(pJPackage, pUiModule, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JPackage> rawStreamAllValuesOfjPackage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JPACKAGE, parameters).map(JPackage.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JPackage> getAllValuesOfjPackage() {
      return rawStreamAllValuesOfjPackage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JPackage> streamAllValuesOfjPackage() {
      return rawStreamAllValuesOfjPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JPackage> streamAllValuesOfjPackage(final JPackageToUIModuleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JPackage> streamAllValuesOfjPackage(final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjPackage(new Object[]{null, pUiModule, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JPackage> getAllValuesOfjPackage(final JPackageToUIModuleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjPackage(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JPackage> getAllValuesOfjPackage(final UIModule pUiModule, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjPackage(new Object[]{null, pUiModule, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIModule> rawStreamAllValuesOfuiModule(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UIMODULE, parameters).map(UIModule.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIModule> getAllValuesOfuiModule() {
      return rawStreamAllValuesOfuiModule(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIModule> streamAllValuesOfuiModule() {
      return rawStreamAllValuesOfuiModule(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIModule> streamAllValuesOfuiModule(final JPackageToUIModuleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiModule(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIModule> streamAllValuesOfuiModule(final JPackage pJPackage, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiModule(new Object[]{pJPackage, null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIModule> getAllValuesOfuiModule(final JPackageToUIModuleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfuiModule(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uiModule.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIModule> getAllValuesOfuiModule(final JPackage pJPackage, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfuiModule(new Object[]{pJPackage, null, pTrace}).collect(Collectors.toSet());
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JPackageToUIModuleQueryForModify.Match partialMatch) {
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JPackage pJPackage, final UIModule pUiModule) {
      return rawStreamAllValuesOftrace(new Object[]{pJPackage, pUiModule, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JPackageToUIModuleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JPackage pJPackage, final UIModule pUiModule) {
      return rawStreamAllValuesOftrace(new Object[]{pJPackage, pUiModule, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JPackageToUIModuleQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JPackageToUIModuleQueryForModify.Match.newMatch((JPackage) t.get(POSITION_JPACKAGE), (UIModule) t.get(POSITION_UIMODULE), (PSMToUITrace) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JPackageToUIModuleQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JPackageToUIModuleQueryForModify.Match.newMatch((JPackage) match[POSITION_JPACKAGE], (UIModule) match[POSITION_UIMODULE], (PSMToUITrace) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JPackageToUIModuleQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JPackageToUIModuleQueryForModify.Match.newMutableMatch((JPackage) match[POSITION_JPACKAGE], (UIModule) match[POSITION_UIMODULE], (PSMToUITrace) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JPackageToUIModuleQueryForModify.Matcher> querySpecification() {
      return JPackageToUIModuleQueryForModify.instance();
    }
  }
  
  private JPackageToUIModuleQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JPackageToUIModuleQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JPackageToUIModuleQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JPackageToUIModuleQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JPackageToUIModuleQueryForModify.Matcher instantiate() {
    return JPackageToUIModuleQueryForModify.Matcher.create();
  }
  
  @Override
  public JPackageToUIModuleQueryForModify.Match newEmptyMatch() {
    return JPackageToUIModuleQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JPackageToUIModuleQueryForModify.Match newMatch(final Object... parameters) {
    return JPackageToUIModuleQueryForModify.Match.newMatch((psm.JPackage) parameters[0], (ui.UIModule) parameters[1], (traceability.PSMToUITrace) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JPackageToUIModuleQueryForModify (visibility: PUBLIC, simpleName: JPackageToUIModuleQueryForModify, identifier: queries.JPackageToUIModuleQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JPackageToUIModuleQueryForModify (visibility: PUBLIC, simpleName: JPackageToUIModuleQueryForModify, identifier: queries.JPackageToUIModuleQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JPackageToUIModuleQueryForModify INSTANCE = new JPackageToUIModuleQueryForModify();
    
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
    private final static JPackageToUIModuleQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jPackage = new PParameter("jPackage", "psm.JPackage", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JPackage")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uiModule = new PParameter("uiModule", "ui.UIModule", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIModule")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "traceability.PSMToUITrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jPackage, parameter_uiModule, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JPackageToUIModuleQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jPackage","uiModule","trace");
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
          PVariable var_jPackage = body.getOrCreateVariableByName("jPackage");
          PVariable var_uiModule = body.getOrCreateVariableByName("uiModule");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_uiModule), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIModule")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jPackage, parameter_jPackage),
             new ExportedParameter(body, var_uiModule, parameter_uiModule),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	PSMToUITrace.psmElements(trace, jPackage)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_0_, var_jPackage);
          // 	PSMToUITrace.uiElements(trace, uiModule)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_1_, var_uiModule);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
