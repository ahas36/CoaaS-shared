/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.cqe;

import cdql.graph.Graph;
import javax.ejb.Remote;

/**
 *
 * @author ali
 */
@Remote
public interface ContextQueryExecutorRemote {
    public Graph execute(String query) throws Exception;
}
