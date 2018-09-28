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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JRole;
import queries.AlreadyTransformed;
import traceability.PSMToUITrace;
import ui.UIReferenceComponentType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JRoleQueryForModify(jRole : JRole, referenceComponentType : UIReferenceComponentType, oppositeReferenceType : UIReferenceComponentType, trace : PSMToUITrace) {
 *         	find alreadyTransformed(jRole, referenceComponentType, trace);
 *         	
 *         	JRelationship.roles(relation, jRole);
 *         	JRelationship.roles(relation, opposite);
 *         	jRole != opposite;
 *         	
 *         	PSMToUITrace.psmElements(trace2, opposite);
 *         	PSMToUITrace.uiElements(trace2, oppositeReferenceType);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JRoleQueryForModify extends BaseGeneratedEMFQuerySpecification<JRoleQueryForModify.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JRoleQueryForModify pattern,
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
    private JRole fJRole;
    
    private UIReferenceComponentType fReferenceComponentType;
    
    private UIReferenceComponentType fOppositeReferenceType;
    
    private PSMToUITrace fTrace;
    
    private static List<String> parameterNames = makeImmutableList("jRole", "referenceComponentType", "oppositeReferenceType", "trace");
    
    private Match(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      this.fJRole = pJRole;
      this.fReferenceComponentType = pReferenceComponentType;
      this.fOppositeReferenceType = pOppositeReferenceType;
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jRole".equals(parameterName)) return this.fJRole;
      if ("referenceComponentType".equals(parameterName)) return this.fReferenceComponentType;
      if ("oppositeReferenceType".equals(parameterName)) return this.fOppositeReferenceType;
      if ("trace".equals(parameterName)) return this.fTrace;
      return null;
    }
    
    public JRole getJRole() {
      return this.fJRole;
    }
    
    public UIReferenceComponentType getReferenceComponentType() {
      return this.fReferenceComponentType;
    }
    
    public UIReferenceComponentType getOppositeReferenceType() {
      return this.fOppositeReferenceType;
    }
    
    public PSMToUITrace getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jRole".equals(parameterName) ) {
          this.fJRole = (JRole) newValue;
          return true;
      }
      if ("referenceComponentType".equals(parameterName) ) {
          this.fReferenceComponentType = (UIReferenceComponentType) newValue;
          return true;
      }
      if ("oppositeReferenceType".equals(parameterName) ) {
          this.fOppositeReferenceType = (UIReferenceComponentType) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (PSMToUITrace) newValue;
          return true;
      }
      return false;
    }
    
    public void setJRole(final JRole pJRole) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJRole = pJRole;
    }
    
    public void setReferenceComponentType(final UIReferenceComponentType pReferenceComponentType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReferenceComponentType = pReferenceComponentType;
    }
    
    public void setOppositeReferenceType(final UIReferenceComponentType pOppositeReferenceType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOppositeReferenceType = pOppositeReferenceType;
    }
    
    public void setTrace(final PSMToUITrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "queries.JRoleQueryForModify";
    }
    
    @Override
    public List<String> parameterNames() {
      return JRoleQueryForModify.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJRole, fReferenceComponentType, fOppositeReferenceType, fTrace};
    }
    
    @Override
    public JRoleQueryForModify.Match toImmutable() {
      return isMutable() ? newMatch(fJRole, fReferenceComponentType, fOppositeReferenceType, fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jRole\"=" + prettyPrintValue(fJRole) + ", ");
      result.append("\"referenceComponentType\"=" + prettyPrintValue(fReferenceComponentType) + ", ");
      result.append("\"oppositeReferenceType\"=" + prettyPrintValue(fOppositeReferenceType) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJRole, fReferenceComponentType, fOppositeReferenceType, fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JRoleQueryForModify.Match)) {
          JRoleQueryForModify.Match other = (JRoleQueryForModify.Match) obj;
          return Objects.equals(fJRole, other.fJRole) && Objects.equals(fReferenceComponentType, other.fReferenceComponentType) && Objects.equals(fOppositeReferenceType, other.fOppositeReferenceType) && Objects.equals(fTrace, other.fTrace);
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
    public JRoleQueryForModify specification() {
      return JRoleQueryForModify.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JRoleQueryForModify.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JRoleQueryForModify.Match newMutableMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return new Mutable(pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JRoleQueryForModify.Match newMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return new Immutable(pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace);
    }
    
    private static final class Mutable extends JRoleQueryForModify.Match {
      Mutable(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
        super(pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JRoleQueryForModify.Match {
      Immutable(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
        super(pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JRoleQueryForModify pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JRoleQueryForModify(jRole : JRole, referenceComponentType : UIReferenceComponentType, oppositeReferenceType : UIReferenceComponentType, trace : PSMToUITrace) {
   * 	find alreadyTransformed(jRole, referenceComponentType, trace);
   * 	
   * 	JRelationship.roles(relation, jRole);
   * 	JRelationship.roles(relation, opposite);
   * 	jRole != opposite;
   * 	
   * 	PSMToUITrace.psmElements(trace2, opposite);
   * 	PSMToUITrace.uiElements(trace2, oppositeReferenceType);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JRoleQueryForModify
   * 
   */
  public static class Matcher extends BaseMatcher<JRoleQueryForModify.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JRoleQueryForModify.Matcher on(final ViatraQueryEngine engine) {
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
    public static JRoleQueryForModify.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JROLE = 0;
    
    private final static int POSITION_REFERENCECOMPONENTTYPE = 1;
    
    private final static int POSITION_OPPOSITEREFERENCETYPE = 2;
    
    private final static int POSITION_TRACE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JRoleQueryForModify.Matcher.class);
    
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
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JRoleQueryForModify.Match> getAllMatches(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JRoleQueryForModify.Match> streamAllMatches(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllMatches(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JRoleQueryForModify.Match> getOneArbitraryMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawHasMatch(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawCountMatches(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace, final Consumer<? super JRoleQueryForModify.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJRole the fixed value of pattern parameter jRole, or null if not bound.
     * @param pReferenceComponentType the fixed value of pattern parameter referenceComponentType, or null if not bound.
     * @param pOppositeReferenceType the fixed value of pattern parameter oppositeReferenceType, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JRoleQueryForModify.Match newMatch(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return JRoleQueryForModify.Match.newMatch(pJRole, pReferenceComponentType, pOppositeReferenceType, pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JRole> rawStreamAllValuesOfjRole(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JROLE, parameters).map(JRole.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JRole> getAllValuesOfjRole() {
      return rawStreamAllValuesOfjRole(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JRole> streamAllValuesOfjRole() {
      return rawStreamAllValuesOfjRole(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JRole> streamAllValuesOfjRole(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjRole(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JRole> streamAllValuesOfjRole(final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjRole(new Object[]{null, pReferenceComponentType, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JRole> getAllValuesOfjRole(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfjRole(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jRole.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JRole> getAllValuesOfjRole(final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfjRole(new Object[]{null, pReferenceComponentType, pOppositeReferenceType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIReferenceComponentType> rawStreamAllValuesOfreferenceComponentType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REFERENCECOMPONENTTYPE, parameters).map(UIReferenceComponentType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfreferenceComponentType() {
      return rawStreamAllValuesOfreferenceComponentType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfreferenceComponentType() {
      return rawStreamAllValuesOfreferenceComponentType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfreferenceComponentType(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfreferenceComponentType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfreferenceComponentType(final JRole pJRole, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfreferenceComponentType(new Object[]{pJRole, null, pOppositeReferenceType, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfreferenceComponentType(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfreferenceComponentType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for referenceComponentType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfreferenceComponentType(final JRole pJRole, final UIReferenceComponentType pOppositeReferenceType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfreferenceComponentType(new Object[]{pJRole, null, pOppositeReferenceType, pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIReferenceComponentType> rawStreamAllValuesOfoppositeReferenceType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OPPOSITEREFERENCETYPE, parameters).map(UIReferenceComponentType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfoppositeReferenceType() {
      return rawStreamAllValuesOfoppositeReferenceType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfoppositeReferenceType() {
      return rawStreamAllValuesOfoppositeReferenceType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfoppositeReferenceType(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfoppositeReferenceType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIReferenceComponentType> streamAllValuesOfoppositeReferenceType(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfoppositeReferenceType(new Object[]{pJRole, pReferenceComponentType, null, pTrace});
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfoppositeReferenceType(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOfoppositeReferenceType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for oppositeReferenceType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIReferenceComponentType> getAllValuesOfoppositeReferenceType(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final PSMToUITrace pTrace) {
      return rawStreamAllValuesOfoppositeReferenceType(new Object[]{pJRole, pReferenceComponentType, null, pTrace}).collect(Collectors.toSet());
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JRoleQueryForModify.Match partialMatch) {
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
    public Stream<PSMToUITrace> streamAllValuesOftrace(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType) {
      return rawStreamAllValuesOftrace(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JRoleQueryForModify.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PSMToUITrace> getAllValuesOftrace(final JRole pJRole, final UIReferenceComponentType pReferenceComponentType, final UIReferenceComponentType pOppositeReferenceType) {
      return rawStreamAllValuesOftrace(new Object[]{pJRole, pReferenceComponentType, pOppositeReferenceType, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JRoleQueryForModify.Match tupleToMatch(final Tuple t) {
      try {
          return JRoleQueryForModify.Match.newMatch((JRole) t.get(POSITION_JROLE), (UIReferenceComponentType) t.get(POSITION_REFERENCECOMPONENTTYPE), (UIReferenceComponentType) t.get(POSITION_OPPOSITEREFERENCETYPE), (PSMToUITrace) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JRoleQueryForModify.Match arrayToMatch(final Object[] match) {
      try {
          return JRoleQueryForModify.Match.newMatch((JRole) match[POSITION_JROLE], (UIReferenceComponentType) match[POSITION_REFERENCECOMPONENTTYPE], (UIReferenceComponentType) match[POSITION_OPPOSITEREFERENCETYPE], (PSMToUITrace) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JRoleQueryForModify.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JRoleQueryForModify.Match.newMutableMatch((JRole) match[POSITION_JROLE], (UIReferenceComponentType) match[POSITION_REFERENCECOMPONENTTYPE], (UIReferenceComponentType) match[POSITION_OPPOSITEREFERENCETYPE], (PSMToUITrace) match[POSITION_TRACE]);
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
    public static IQuerySpecification<JRoleQueryForModify.Matcher> querySpecification() {
      return JRoleQueryForModify.instance();
    }
  }
  
  private JRoleQueryForModify() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JRoleQueryForModify instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JRoleQueryForModify.Matcher instantiate(final ViatraQueryEngine engine) {
    return JRoleQueryForModify.Matcher.on(engine);
  }
  
  @Override
  public JRoleQueryForModify.Matcher instantiate() {
    return JRoleQueryForModify.Matcher.create();
  }
  
  @Override
  public JRoleQueryForModify.Match newEmptyMatch() {
    return JRoleQueryForModify.Match.newEmptyMatch();
  }
  
  @Override
  public JRoleQueryForModify.Match newMatch(final Object... parameters) {
    return JRoleQueryForModify.Match.newMatch((psm.JRole) parameters[0], (ui.UIReferenceComponentType) parameters[1], (ui.UIReferenceComponentType) parameters[2], (traceability.PSMToUITrace) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JRoleQueryForModify (visibility: PUBLIC, simpleName: JRoleQueryForModify, identifier: queries.JRoleQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JRoleQueryForModify (visibility: PUBLIC, simpleName: JRoleQueryForModify, identifier: queries.JRoleQueryForModify, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JRoleQueryForModify INSTANCE = new JRoleQueryForModify();
    
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
    private final static JRoleQueryForModify.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jRole = new PParameter("jRole", "psm.JRole", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JRole")), PParameterDirection.INOUT);
    
    private final PParameter parameter_referenceComponentType = new PParameter("referenceComponentType", "ui.UIReferenceComponentType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIReferenceComponentType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_oppositeReferenceType = new PParameter("oppositeReferenceType", "ui.UIReferenceComponentType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIReferenceComponentType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trace = new PParameter("trace", "traceability.PSMToUITrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jRole, parameter_referenceComponentType, parameter_oppositeReferenceType, parameter_trace);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JRoleQueryForModify";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jRole","referenceComponentType","oppositeReferenceType","trace");
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
          PVariable var_jRole = body.getOrCreateVariableByName("jRole");
          PVariable var_referenceComponentType = body.getOrCreateVariableByName("referenceComponentType");
          PVariable var_oppositeReferenceType = body.getOrCreateVariableByName("oppositeReferenceType");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_relation = body.getOrCreateVariableByName("relation");
          PVariable var_opposite = body.getOrCreateVariableByName("opposite");
          PVariable var_trace2 = body.getOrCreateVariableByName("trace2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jRole), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JRole")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_referenceComponentType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIReferenceComponentType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_oppositeReferenceType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIReferenceComponentType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jRole, parameter_jRole),
             new ExportedParameter(body, var_referenceComponentType, parameter_referenceComponentType),
             new ExportedParameter(body, var_oppositeReferenceType, parameter_oppositeReferenceType),
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	find alreadyTransformed(jRole, referenceComponentType, trace)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jRole, var_referenceComponentType, var_trace), AlreadyTransformed.instance().getInternalQueryRepresentation());
          // 		JRelationship.roles(relation, jRole)
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JRelationship")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JRelationship", "roles")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JRole")));
          new Equality(body, var__virtual_0_, var_jRole);
          // 	JRelationship.roles(relation, opposite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JRelationship")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JRelationship", "roles")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JRole")));
          new Equality(body, var__virtual_1_, var_opposite);
          // 	jRole != opposite
          new Inequality(body, var_jRole, var_opposite);
          // 		PSMToUITrace.psmElements(trace2, opposite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace2, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "psmElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JElement")));
          new Equality(body, var__virtual_2_, var_opposite);
          // 	PSMToUITrace.uiElements(trace2, oppositeReferenceType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui/traceability", "PSMToUITrace", "uiElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "Identifiable")));
          new Equality(body, var__virtual_3_, var_oppositeReferenceType);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
