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
import psm.JParameter;
import queries.AlreadyTransformed;
import ui.UIViewField;
import ui.UIViewFieldSet;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern JParameterViewFieldQuery(jParameter : JParameter, viewField : UIViewField, viewFieldSet : UIViewFieldSet) {
 *         	find alreadyTransformed(jParameter, parameterType, _);
 *         	UIViewField.componentType(viewField, parameterType);
 *         	UIViewFieldSet.viewFields(viewFieldSet, viewField);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JParameterViewFieldQuery extends BaseGeneratedEMFQuerySpecification<JParameterViewFieldQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JParameterViewFieldQuery pattern,
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
    private JParameter fJParameter;
    
    private UIViewField fViewField;
    
    private UIViewFieldSet fViewFieldSet;
    
    private static List<String> parameterNames = makeImmutableList("jParameter", "viewField", "viewFieldSet");
    
    private Match(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      this.fJParameter = pJParameter;
      this.fViewField = pViewField;
      this.fViewFieldSet = pViewFieldSet;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jParameter".equals(parameterName)) return this.fJParameter;
      if ("viewField".equals(parameterName)) return this.fViewField;
      if ("viewFieldSet".equals(parameterName)) return this.fViewFieldSet;
      return null;
    }
    
    public JParameter getJParameter() {
      return this.fJParameter;
    }
    
    public UIViewField getViewField() {
      return this.fViewField;
    }
    
    public UIViewFieldSet getViewFieldSet() {
      return this.fViewFieldSet;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jParameter".equals(parameterName) ) {
          this.fJParameter = (JParameter) newValue;
          return true;
      }
      if ("viewField".equals(parameterName) ) {
          this.fViewField = (UIViewField) newValue;
          return true;
      }
      if ("viewFieldSet".equals(parameterName) ) {
          this.fViewFieldSet = (UIViewFieldSet) newValue;
          return true;
      }
      return false;
    }
    
    public void setJParameter(final JParameter pJParameter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJParameter = pJParameter;
    }
    
    public void setViewField(final UIViewField pViewField) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fViewField = pViewField;
    }
    
    public void setViewFieldSet(final UIViewFieldSet pViewFieldSet) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fViewFieldSet = pViewFieldSet;
    }
    
    @Override
    public String patternName() {
      return "queries.JParameterViewFieldQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return JParameterViewFieldQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJParameter, fViewField, fViewFieldSet};
    }
    
    @Override
    public JParameterViewFieldQuery.Match toImmutable() {
      return isMutable() ? newMatch(fJParameter, fViewField, fViewFieldSet) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jParameter\"=" + prettyPrintValue(fJParameter) + ", ");
      result.append("\"viewField\"=" + prettyPrintValue(fViewField) + ", ");
      result.append("\"viewFieldSet\"=" + prettyPrintValue(fViewFieldSet));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJParameter, fViewField, fViewFieldSet);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JParameterViewFieldQuery.Match)) {
          JParameterViewFieldQuery.Match other = (JParameterViewFieldQuery.Match) obj;
          return Objects.equals(fJParameter, other.fJParameter) && Objects.equals(fViewField, other.fViewField) && Objects.equals(fViewFieldSet, other.fViewFieldSet);
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
    public JParameterViewFieldQuery specification() {
      return JParameterViewFieldQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JParameterViewFieldQuery.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JParameterViewFieldQuery.Match newMutableMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return new Mutable(pJParameter, pViewField, pViewFieldSet);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JParameterViewFieldQuery.Match newMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return new Immutable(pJParameter, pViewField, pViewFieldSet);
    }
    
    private static final class Mutable extends JParameterViewFieldQuery.Match {
      Mutable(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
        super(pJParameter, pViewField, pViewFieldSet);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JParameterViewFieldQuery.Match {
      Immutable(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
        super(pJParameter, pViewField, pViewFieldSet);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JParameterViewFieldQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern JParameterViewFieldQuery(jParameter : JParameter, viewField : UIViewField, viewFieldSet : UIViewFieldSet) {
   * 	find alreadyTransformed(jParameter, parameterType, _);
   * 	UIViewField.componentType(viewField, parameterType);
   * 	UIViewFieldSet.viewFields(viewFieldSet, viewField);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JParameterViewFieldQuery
   * 
   */
  public static class Matcher extends BaseMatcher<JParameterViewFieldQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JParameterViewFieldQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static JParameterViewFieldQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JPARAMETER = 0;
    
    private final static int POSITION_VIEWFIELD = 1;
    
    private final static int POSITION_VIEWFIELDSET = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JParameterViewFieldQuery.Matcher.class);
    
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
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JParameterViewFieldQuery.Match> getAllMatches(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllMatches(new Object[]{pJParameter, pViewField, pViewFieldSet}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JParameterViewFieldQuery.Match> streamAllMatches(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllMatches(new Object[]{pJParameter, pViewField, pViewFieldSet});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JParameterViewFieldQuery.Match> getOneArbitraryMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawGetOneArbitraryMatch(new Object[]{pJParameter, pViewField, pViewFieldSet});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawHasMatch(new Object[]{pJParameter, pViewField, pViewFieldSet});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawCountMatches(new Object[]{pJParameter, pViewField, pViewFieldSet});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet, final Consumer<? super JParameterViewFieldQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJParameter, pViewField, pViewFieldSet}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJParameter the fixed value of pattern parameter jParameter, or null if not bound.
     * @param pViewField the fixed value of pattern parameter viewField, or null if not bound.
     * @param pViewFieldSet the fixed value of pattern parameter viewFieldSet, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JParameterViewFieldQuery.Match newMatch(final JParameter pJParameter, final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return JParameterViewFieldQuery.Match.newMatch(pJParameter, pViewField, pViewFieldSet);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<JParameter> rawStreamAllValuesOfjParameter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JPARAMETER, parameters).map(JParameter.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter() {
      return rawStreamAllValuesOfjParameter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter() {
      return rawStreamAllValuesOfjParameter(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfjParameter(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<JParameter> streamAllValuesOfjParameter(final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllValuesOfjParameter(new Object[]{null, pViewField, pViewFieldSet});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfjParameter(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jParameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JParameter> getAllValuesOfjParameter(final UIViewField pViewField, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllValuesOfjParameter(new Object[]{null, pViewField, pViewFieldSet}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIViewField> rawStreamAllValuesOfviewField(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VIEWFIELD, parameters).map(UIViewField.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewField> getAllValuesOfviewField() {
      return rawStreamAllValuesOfviewField(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewField> streamAllValuesOfviewField() {
      return rawStreamAllValuesOfviewField(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewField> streamAllValuesOfviewField(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfviewField(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewField> streamAllValuesOfviewField(final JParameter pJParameter, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllValuesOfviewField(new Object[]{pJParameter, null, pViewFieldSet});
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewField> getAllValuesOfviewField(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfviewField(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewField.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewField> getAllValuesOfviewField(final JParameter pJParameter, final UIViewFieldSet pViewFieldSet) {
      return rawStreamAllValuesOfviewField(new Object[]{pJParameter, null, pViewFieldSet}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UIViewFieldSet> rawStreamAllValuesOfviewFieldSet(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VIEWFIELDSET, parameters).map(UIViewFieldSet.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewFieldSet> getAllValuesOfviewFieldSet() {
      return rawStreamAllValuesOfviewFieldSet(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewFieldSet> streamAllValuesOfviewFieldSet() {
      return rawStreamAllValuesOfviewFieldSet(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewFieldSet> streamAllValuesOfviewFieldSet(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfviewFieldSet(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UIViewFieldSet> streamAllValuesOfviewFieldSet(final JParameter pJParameter, final UIViewField pViewField) {
      return rawStreamAllValuesOfviewFieldSet(new Object[]{pJParameter, pViewField, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewFieldSet> getAllValuesOfviewFieldSet(final JParameterViewFieldQuery.Match partialMatch) {
      return rawStreamAllValuesOfviewFieldSet(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewFieldSet.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UIViewFieldSet> getAllValuesOfviewFieldSet(final JParameter pJParameter, final UIViewField pViewField) {
      return rawStreamAllValuesOfviewFieldSet(new Object[]{pJParameter, pViewField, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JParameterViewFieldQuery.Match tupleToMatch(final Tuple t) {
      try {
          return JParameterViewFieldQuery.Match.newMatch((JParameter) t.get(POSITION_JPARAMETER), (UIViewField) t.get(POSITION_VIEWFIELD), (UIViewFieldSet) t.get(POSITION_VIEWFIELDSET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JParameterViewFieldQuery.Match arrayToMatch(final Object[] match) {
      try {
          return JParameterViewFieldQuery.Match.newMatch((JParameter) match[POSITION_JPARAMETER], (UIViewField) match[POSITION_VIEWFIELD], (UIViewFieldSet) match[POSITION_VIEWFIELDSET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JParameterViewFieldQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JParameterViewFieldQuery.Match.newMutableMatch((JParameter) match[POSITION_JPARAMETER], (UIViewField) match[POSITION_VIEWFIELD], (UIViewFieldSet) match[POSITION_VIEWFIELDSET]);
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
    public static IQuerySpecification<JParameterViewFieldQuery.Matcher> querySpecification() {
      return JParameterViewFieldQuery.instance();
    }
  }
  
  private JParameterViewFieldQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JParameterViewFieldQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JParameterViewFieldQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return JParameterViewFieldQuery.Matcher.on(engine);
  }
  
  @Override
  public JParameterViewFieldQuery.Matcher instantiate() {
    return JParameterViewFieldQuery.Matcher.create();
  }
  
  @Override
  public JParameterViewFieldQuery.Match newEmptyMatch() {
    return JParameterViewFieldQuery.Match.newEmptyMatch();
  }
  
  @Override
  public JParameterViewFieldQuery.Match newMatch(final Object... parameters) {
    return JParameterViewFieldQuery.Match.newMatch((psm.JParameter) parameters[0], (ui.UIViewField) parameters[1], (ui.UIViewFieldSet) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JParameterViewFieldQuery (visibility: PUBLIC, simpleName: JParameterViewFieldQuery, identifier: queries.JParameterViewFieldQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JParameterViewFieldQuery (visibility: PUBLIC, simpleName: JParameterViewFieldQuery, identifier: queries.JParameterViewFieldQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JParameterViewFieldQuery INSTANCE = new JParameterViewFieldQuery();
    
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
    private final static JParameterViewFieldQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jParameter = new PParameter("jParameter", "psm.JParameter", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JParameter")), PParameterDirection.INOUT);
    
    private final PParameter parameter_viewField = new PParameter("viewField", "ui.UIViewField", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIViewField")), PParameterDirection.INOUT);
    
    private final PParameter parameter_viewFieldSet = new PParameter("viewFieldSet", "ui.UIViewFieldSet", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm/ui", "UIViewFieldSet")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jParameter, parameter_viewField, parameter_viewFieldSet);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JParameterViewFieldQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jParameter","viewField","viewFieldSet");
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
          PVariable var_jParameter = body.getOrCreateVariableByName("jParameter");
          PVariable var_viewField = body.getOrCreateVariableByName("viewField");
          PVariable var_viewFieldSet = body.getOrCreateVariableByName("viewFieldSet");
          PVariable var_parameterType = body.getOrCreateVariableByName("parameterType");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jParameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JParameter")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewField), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewField")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewFieldSet), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewFieldSet")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jParameter, parameter_jParameter),
             new ExportedParameter(body, var_viewField, parameter_viewField),
             new ExportedParameter(body, var_viewFieldSet, parameter_viewFieldSet)
          ));
          // 	find alreadyTransformed(jParameter, parameterType, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_jParameter, var_parameterType, var___0_), AlreadyTransformed.instance().getInternalQueryRepresentation());
          // 	UIViewField.componentType(viewField, parameterType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewField), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewField")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewField, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewField", "componentType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIComponentType")));
          new Equality(body, var__virtual_0_, var_parameterType);
          // 	UIViewFieldSet.viewFields(viewFieldSet, viewField)
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewFieldSet), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewFieldSet")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewFieldSet, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewFieldSet", "viewFields")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm/ui", "UIViewField")));
          new Equality(body, var__virtual_1_, var_viewField);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
