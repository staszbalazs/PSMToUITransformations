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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import psm.JInfo;
import queries.AlreadyTransformed;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //JInfo Queries
 *         pattern JInfoQuery(jInfo : JInfo, uuid : java String) {
 *         	JInfo(jInfo);
 *         	JClass.representsUser(jClass, true);
 *         	JClass.uuid(jClass, uuid);
 *         	neg find alreadyTransformed(jInfo, _, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class JInfoQuery extends BaseGeneratedEMFQuerySpecification<JInfoQuery.Matcher> {
  /**
   * Pattern-specific match representation of the queries.JInfoQuery pattern,
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
    
    private String fUuid;
    
    private static List<String> parameterNames = makeImmutableList("jInfo", "uuid");
    
    private Match(final JInfo pJInfo, final String pUuid) {
      this.fJInfo = pJInfo;
      this.fUuid = pUuid;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("jInfo".equals(parameterName)) return this.fJInfo;
      if ("uuid".equals(parameterName)) return this.fUuid;
      return null;
    }
    
    public JInfo getJInfo() {
      return this.fJInfo;
    }
    
    public String getUuid() {
      return this.fUuid;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("jInfo".equals(parameterName) ) {
          this.fJInfo = (JInfo) newValue;
          return true;
      }
      if ("uuid".equals(parameterName) ) {
          this.fUuid = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setJInfo(final JInfo pJInfo) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fJInfo = pJInfo;
    }
    
    public void setUuid(final String pUuid) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUuid = pUuid;
    }
    
    @Override
    public String patternName() {
      return "queries.JInfoQuery";
    }
    
    @Override
    public List<String> parameterNames() {
      return JInfoQuery.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fJInfo, fUuid};
    }
    
    @Override
    public JInfoQuery.Match toImmutable() {
      return isMutable() ? newMatch(fJInfo, fUuid) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"jInfo\"=" + prettyPrintValue(fJInfo) + ", ");
      result.append("\"uuid\"=" + prettyPrintValue(fUuid));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fJInfo, fUuid);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof JInfoQuery.Match)) {
          JInfoQuery.Match other = (JInfoQuery.Match) obj;
          return Objects.equals(fJInfo, other.fJInfo) && Objects.equals(fUuid, other.fUuid);
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
    public JInfoQuery specification() {
      return JInfoQuery.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static JInfoQuery.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static JInfoQuery.Match newMutableMatch(final JInfo pJInfo, final String pUuid) {
      return new Mutable(pJInfo, pUuid);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static JInfoQuery.Match newMatch(final JInfo pJInfo, final String pUuid) {
      return new Immutable(pJInfo, pUuid);
    }
    
    private static final class Mutable extends JInfoQuery.Match {
      Mutable(final JInfo pJInfo, final String pUuid) {
        super(pJInfo, pUuid);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends JInfoQuery.Match {
      Immutable(final JInfo pJInfo, final String pUuid) {
        super(pJInfo, pUuid);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.JInfoQuery pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //JInfo Queries
   * pattern JInfoQuery(jInfo : JInfo, uuid : java String) {
   * 	JInfo(jInfo);
   * 	JClass.representsUser(jClass, true);
   * 	JClass.uuid(jClass, uuid);
   * 	neg find alreadyTransformed(jInfo, _, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see JInfoQuery
   * 
   */
  public static class Matcher extends BaseMatcher<JInfoQuery.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static JInfoQuery.Matcher on(final ViatraQueryEngine engine) {
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
    public static JInfoQuery.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_JINFO = 0;
    
    private final static int POSITION_UUID = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(JInfoQuery.Matcher.class);
    
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
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<JInfoQuery.Match> getAllMatches(final JInfo pJInfo, final String pUuid) {
      return rawStreamAllMatches(new Object[]{pJInfo, pUuid}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<JInfoQuery.Match> streamAllMatches(final JInfo pJInfo, final String pUuid) {
      return rawStreamAllMatches(new Object[]{pJInfo, pUuid});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<JInfoQuery.Match> getOneArbitraryMatch(final JInfo pJInfo, final String pUuid) {
      return rawGetOneArbitraryMatch(new Object[]{pJInfo, pUuid});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final JInfo pJInfo, final String pUuid) {
      return rawHasMatch(new Object[]{pJInfo, pUuid});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final JInfo pJInfo, final String pUuid) {
      return rawCountMatches(new Object[]{pJInfo, pUuid});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final JInfo pJInfo, final String pUuid, final Consumer<? super JInfoQuery.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pJInfo, pUuid}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pJInfo the fixed value of pattern parameter jInfo, or null if not bound.
     * @param pUuid the fixed value of pattern parameter uuid, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public JInfoQuery.Match newMatch(final JInfo pJInfo, final String pUuid) {
      return JInfoQuery.Match.newMatch(pJInfo, pUuid);
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
    public Stream<JInfo> streamAllValuesOfjInfo(final JInfoQuery.Match partialMatch) {
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
    public Stream<JInfo> streamAllValuesOfjInfo(final String pUuid) {
      return rawStreamAllValuesOfjInfo(new Object[]{null, pUuid});
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JInfo> getAllValuesOfjInfo(final JInfoQuery.Match partialMatch) {
      return rawStreamAllValuesOfjInfo(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for jInfo.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<JInfo> getAllValuesOfjInfo(final String pUuid) {
      return rawStreamAllValuesOfjInfo(new Object[]{null, pUuid}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfuuid(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UUID, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid() {
      return rawStreamAllValuesOfuuid(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid() {
      return rawStreamAllValuesOfuuid(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid(final JInfoQuery.Match partialMatch) {
      return rawStreamAllValuesOfuuid(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfuuid(final JInfo pJInfo) {
      return rawStreamAllValuesOfuuid(new Object[]{pJInfo, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid(final JInfoQuery.Match partialMatch) {
      return rawStreamAllValuesOfuuid(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uuid.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuuid(final JInfo pJInfo) {
      return rawStreamAllValuesOfuuid(new Object[]{pJInfo, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected JInfoQuery.Match tupleToMatch(final Tuple t) {
      try {
          return JInfoQuery.Match.newMatch((JInfo) t.get(POSITION_JINFO), (String) t.get(POSITION_UUID));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JInfoQuery.Match arrayToMatch(final Object[] match) {
      try {
          return JInfoQuery.Match.newMatch((JInfo) match[POSITION_JINFO], (String) match[POSITION_UUID]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected JInfoQuery.Match arrayToMatchMutable(final Object[] match) {
      try {
          return JInfoQuery.Match.newMutableMatch((JInfo) match[POSITION_JINFO], (String) match[POSITION_UUID]);
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
    public static IQuerySpecification<JInfoQuery.Matcher> querySpecification() {
      return JInfoQuery.instance();
    }
  }
  
  private JInfoQuery() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static JInfoQuery instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected JInfoQuery.Matcher instantiate(final ViatraQueryEngine engine) {
    return JInfoQuery.Matcher.on(engine);
  }
  
  @Override
  public JInfoQuery.Matcher instantiate() {
    return JInfoQuery.Matcher.create();
  }
  
  @Override
  public JInfoQuery.Match newEmptyMatch() {
    return JInfoQuery.Match.newEmptyMatch();
  }
  
  @Override
  public JInfoQuery.Match newMatch(final Object... parameters) {
    return JInfoQuery.Match.newMatch((psm.JInfo) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.JInfoQuery (visibility: PUBLIC, simpleName: JInfoQuery, identifier: queries.JInfoQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.JInfoQuery (visibility: PUBLIC, simpleName: JInfoQuery, identifier: queries.JInfoQuery, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static JInfoQuery INSTANCE = new JInfoQuery();
    
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
    private final static JInfoQuery.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_jInfo = new PParameter("jInfo", "psm.JInfo", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://blackbelt.hu/judo/meta/psm", "JInfo")), PParameterDirection.INOUT);
    
    private final PParameter parameter_uuid = new PParameter("uuid", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_jInfo, parameter_uuid);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.JInfoQuery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("jInfo","uuid");
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
          PVariable var_uuid = body.getOrCreateVariableByName("uuid");
          PVariable var_jClass = body.getOrCreateVariableByName("jClass");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jInfo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JInfo")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_uuid), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_jInfo, parameter_jInfo),
             new ExportedParameter(body, var_uuid, parameter_uuid)
          ));
          // 	JInfo(jInfo)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jInfo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JInfo")));
          // 	JClass.representsUser(jClass, true)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JClass", "representsUser")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	JClass.uuid(jClass, uuid)
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://blackbelt.hu/judo/meta/psm", "JClass")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_jClass, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://blackbelt.hu/judo/meta/psm", "JElement", "uuid")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_2_, var_uuid);
          // 	neg find alreadyTransformed(jInfo, _, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_jInfo, var___0_, var___1_), AlreadyTransformed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return true;
  }
}
