/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.dbhelper;

import coaas.cdql.entities.Query;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ali
 */
@Remote
public interface DbHelperRemote {
    public List<Query> getAllQueries();
    public void setQueryResult(int id,String res);
}
