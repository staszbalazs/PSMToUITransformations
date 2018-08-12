/**
 * Generated from platform:/resource/viatra_transformation/src/queries/JClassQueries.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.JClassQuery;

/**
 * A pattern group formed of all public patterns defined in JClassQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file JClassQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>JClassQuery</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class JClassQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static JClassQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new JClassQueries();
    }
    return INSTANCE;
  }
  
  private static JClassQueries INSTANCE;
  
  private JClassQueries() {
    querySpecifications.add(JClassQuery.instance());
  }
  
  public JClassQuery getJClassQuery() {
    return JClassQuery.instance();
  }
  
  public JClassQuery.Matcher getJClassQuery(final ViatraQueryEngine engine) {
    return JClassQuery.Matcher.on(engine);
  }
}
