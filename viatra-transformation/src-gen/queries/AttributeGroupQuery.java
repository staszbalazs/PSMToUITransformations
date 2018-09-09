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
 *         pattern attributeGroupQuery(jClass : JClass, group : JUIAttributeGroup, attribute : JAttribute) {
 *         	JClass.attributeOrder(jClass, group);
 *         	JUIAttributeGroup.attributes(group, attribute);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AttributeGroupQuery extends BaseGeneratedEMFQuerySpecification<AttributeGroupQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.attributeGroupQuery pattern,
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
    private EObject fJClass;
    
    private EObject fGroup;
    
    private EObject fAttribute;
    
    private static List<String> parameterNames = makeImmutableList("jClass", "group", "attribute");
    
    private Match(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      this.fJClass = pJClass;
      this.fGroup = pGroup;
      this.fAttribute = pAttribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jClass".equals(parameterName)) return this.fJClass;
      if ("group".equals(parameterName)) return this.fGroup;
      if ("attribute".equals(parameterName)) return this.fAttribute;
      return null;
    }
    
    public EObject getJClass() {
      return this.fJClass;
    }
    
    public EObject getGroup() {
      return this.fGroup;
    }
    
    public EObject getAttribute() {
      return this.fAttribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jClass".equals(parameterName) ) {
          this.fJClass = (EObject) newValue;
          return true;
      }
      if ("group".equals(parameterName) ) {
          this.fGroup = (EObject) newValue;
          return true;
      }
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (EObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setJClass(final EObject pJClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJClass = pJClass;
    }
    
    public void setGroup(final EObject pGroup) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGroup = pGroup;
    }
    
    public void setAttribute(final EObject pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    @Override
    public String patternName() {
      return "queries.attributeGroupQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return AttributeGroupQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJClass, fGroup, fAttribute};
    }
    
    @Override
    public AttributeGroupQuery.Match toImmutable() {
      return isMutable() ? newMatch(fJClass, fGroup, fAttribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jClass\"=" + prettyPrintValue(fJClass) + ", ");
      result.append("\"group\"=" + prettyPrintValue(fGroup) + ", ");
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJClass, fGroup, fAttribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AttributeGroupQuery.Match)) {
          AttributeGroupQuery.Match other = (AttributeGroupQuery.Match) obj;
          return Objects.equals(fJClass, other.fJClass) && Objects.equals(fGroup, other.fGroup) && Objects.equals(fAttribute, other.fAttribute);
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
    public AttributeGroupQuery specification() {
      return AttributeGroupQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AttributeGroupQuery.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AttributeGroupQuery.Match newMutableMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return new Mutable(pJClass, pGroup, pAttribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AttributeGroupQuery.Match newMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return new Immutable(pJClass, pGroup, pAttribute);
    }
    
    private static final class Mutable extends AttributeGroupQuery.Match {
      Mutable(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
        super(pJClass, pGroup, pAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AttributeGroupQuery.Match {
      Immutable(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
        super(pJClass, pGroup, pAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.attributeGroupQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern attributeGroupQuery(jClass : JClass, group : JUIAttributeGroup, attribute : JAttribute) {
   * 	JClass.attributeOrder(jClass, group);
   * 	JUIAttributeGroup.attributes(group, attribute);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AttributeGroupQuery
   * 
   */
  public static class Matcher extends BaseMatcher<AttributeGroupQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AttributeGroupQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static AttributeGroupQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JCLASS = 0;
    
    private final static int POSITION_GROUP = 1;
    
    private final static int POSITION_ATTRIBUTE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AttributeGroupQuery.Matcher.class);
    
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
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AttributeGroupQuery.Match> getAllMatches(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return rawStreamAllMatches(new Object[]{pJClass, pGroup, pAttribute}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AttributeGroupQuery.Match> streamAllMatches(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return rawStreamAllMatches(new Object[]{pJClass, pGroup, pAttribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AttributeGroupQuery.Match> getOneArbitraryMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return rawGetOneArbitraryMatch(new Object[]{pJClass, pGroup, pAttribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return rawHasMatch(new Object[]{pJClass, pGroup, pAttribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return rawCountMatches(new Object[]{pJClass, pGroup, pAttribute});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute, final Consumer<? super AttributeGroupQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJClass, pGroup, pAttribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJClass the fixed value of pattern parameter jClass, or null if not bound.
     * @param pGroup the fixed value of pattern parameter group, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AttributeGroupQuery.Match newMatch(final EObject pJClass, final EObject pGroup, final EObject pAttribute) {
      return AttributeGroupQuery.Match.newMatch(pJClass, pGroup, pAttribute);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfjClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_JCLASS, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjClass() {
      return rawStreamAllValuesOfjClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjClass(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfjClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfjClass(final EObject pGroup, final EObject pAttribute) {
      return rawStreamAllValuesOfjClass(new Object[]{null, pGroup, pAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjClass(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfjClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfjClass(final EObject pGroup, final EObject pAttribute) {
      return rawStreamAllValuesOfjClass(new Object[]{null, pGroup, pAttribute}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfgroup(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GROUP, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfgroup() {
      return rawStreamAllValuesOfgroup(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfgroup() {
      return rawStreamAllValuesOfgroup(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfgroup(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfgroup(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfgroup(final EObject pJClass, final EObject pAttribute) {
      return rawStreamAllValuesOfgroup(new Object[]{pJClass, null, pAttribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfgroup(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfgroup(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for group.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfgroup(final EObject pJClass, final EObject pAttribute) {
      return rawStreamAllValuesOfgroup(new Object[]{pJClass, null, pAttribute}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EObject> rawStreamAllValuesOfattribute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ATTRIBUTE, parameters).map(EObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfattribute() {
      return rawStreamAllValuesOfattribute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfattribute() {
      return rawStreamAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfattribute(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EObject> streamAllValuesOfattribute(final EObject pJClass, final EObject pGroup) {
      return rawStreamAllValuesOfattribute(new Object[]{pJClass, pGroup, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfattribute(final AttributeGroupQuery.Match partialMatch) {
      return rawStreamAllValuesOfattribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EObject> getAllValuesOfattribute(final EObject pJClass, final EObject pGroup) {
      return rawStreamAllValuesOfattribute(new Object[]{pJClass, pGroup, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AttributeGroupQuery.Match tupleToMatch(final Tuple t) {
      try {
          return AttributeGroupQuery.Match.newMatch((EObject) t.get(POSITION_JCLASS), (EObject) t.get(POSITION_GROUP), (EObject) t.get(POSITION_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AttributeGroupQuery.Match arrayToMatch(final Object[] match) {
      try {
          return AttributeGroupQuery.Match.newMatch((EObject) match[POSITION_JCLASS], (EObject) match[POSITION_GROUP], (EObject) match[POSITION_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AttributeGroupQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AttributeGroupQuery.Match.newMutableMatch((EObject) match[POSITION_JCLASS], (EObject) match[POSITION_GROUP], (EObject) match[POSITION_ATTRIBUTE]);
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
    public static IQuerySpecification<AttributeGroupQuery.Matcher> querySpecification() {
      return AttributeGroupQuery.instance();
    }
  }
  
  private AttributeGroupQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AttributeGroupQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AttributeGroupQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return AttributeGroupQuery.Matcher.on(engine);
  }
  
  @Override
  public AttributeGroupQuery.Matcher instantiate() {
    return AttributeGroupQuery.Matcher.create();
  }
  
  @Override
  public AttributeGroupQuery.Match newEmptyMatch() {
    return AttributeGroupQuery.Match.newEmptyMatch();
  }
  
  @Override
  public AttributeGroupQuery.Match newMatch(final Object... parameters) {
    return AttributeGroupQuery.Match.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.AttributeGroupQuery (visibility: PUBLIC, simpleName: AttributeGroupQuery, identifier: queries.AttributeGroupQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.AttributeGroupQuery (visibility: PUBLIC, simpleName: AttributeGroupQuery, identifier: queries.AttributeGroupQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AttributeGroupQuery INSTANCE = new AttributeGroupQuery();
    
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
    private final static AttributeGroupQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jClass = new PParameter("jClass", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_group = new PParameter("group", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JUIAttributeGroup")), PParameterDirection.INOUT);
    
    private final PParameter parameter_attribute = new PParameter("attribute", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JAttribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jClass, parameter_group, parameter_attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.attributeGroupQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jClass","group","attribute");
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
          PVariable var_jClass = body.getOrCreateVariableByName("jClass");
          PVariable var_group = body.getOrCreateVariableByName("group");
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_group), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIAttributeGroup")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JAttribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jClass, parameter_jClass),
             new ExportedParameter(body, var_group, parameter_group),
             new ExportedParameter(body, var_attribute, parameter_attribute)
          ));
          // 	JClass.attributeOrder(jClass, group)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JClass", "attributeOrder")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIAttributeGroup")));
          new Equality(body, var__virtual_0_, var_group);
          // 	JUIAttributeGroup.attributes(group, attribute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_group), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JUIAttributeGroup")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_group, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JUIAttributeGroup", "attributes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JAttribute")));
          new Equality(body, var__virtual_1_, var_attribute);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
