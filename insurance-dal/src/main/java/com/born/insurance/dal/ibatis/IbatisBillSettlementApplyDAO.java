/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.BillSettlementApplyDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.BillSettlementApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.BillSettlementApplyDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/bill_settlement_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisBillSettlementApplyDAO extends SqlMapClientDaoSupport implements BillSettlementApplyDAO {
	/**
	 *  Insert one <tt>BillSettlementApplyDO</tt> object to DB table <tt>bill_settlement_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into bill_settlement_apply(id,business_bill_id,insurance_no,broker_rank,form_id,settlement_no,type,row_add_time,row_update_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param billSettlementApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BillSettlementApplyDO billSettlementApply) throws DataAccessException {
    	if (billSettlementApply == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-BILL-SETTLEMENT-APPLY-INSERT", billSettlementApply);

        return billSettlementApply.getId();
    }

	/**
	 *  Update DB table <tt>bill_settlement_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update bill_settlement_apply set business_bill_id=?, insurance_no=?, broker_rank=?, form_id=?, settlement_no=?, type=?, row_add_time=?, row_update_time=? where (id = ?)</tt>
	 *
	 *	@param billSettlementApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BillSettlementApplyDO billSettlementApply) throws DataAccessException {
    	if (billSettlementApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-BILL-SETTLEMENT-APPLY-UPDATE", billSettlementApply);
    }

	/**
	 *  Query DB table <tt>bill_settlement_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, business_bill_id, insurance_no, broker_rank, form_id, settlement_no, type, row_add_time, row_update_time from bill_settlement_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return BillSettlementApplyDO
	 *	@throws DataAccessException
	 */	 
    public BillSettlementApplyDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (BillSettlementApplyDO) getSqlMapClientTemplate().queryForObject("MS-BILL-SETTLEMENT-APPLY-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>bill_settlement_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from bill_settlement_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-BILL-SETTLEMENT-APPLY-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>bill_settlement_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, business_bill_id, insurance_no, broker_rank, form_id, settlement_no, type, row_add_time, row_update_time from bill_settlement_apply where (1 = 1)</tt>
	 *
	 *	@param billSettlementApply
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BillSettlementApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<BillSettlementApplyDO> findByCondition(BillSettlementApplyDO billSettlementApply, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (billSettlementApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("billSettlementApply", billSettlementApply);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-BILL-SETTLEMENT-APPLY-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>bill_settlement_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from bill_settlement_apply where (1 = 1)</tt>
	 *
	 *	@param billSettlementApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BillSettlementApplyDO billSettlementApply) throws DataAccessException {
    	if (billSettlementApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-BILL-SETTLEMENT-APPLY-FIND-BY-CONDITION-COUNT", billSettlementApply);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>bill_settlement_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, business_bill_id, insurance_no, broker_rank, form_id, settlement_no, type, row_add_time, row_update_time from bill_settlement_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return BillSettlementApplyDO
	 *	@throws DataAccessException
	 */	 
    public BillSettlementApplyDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (BillSettlementApplyDO) getSqlMapClientTemplate().queryForObject("MS-BILL-SETTLEMENT-APPLY-FIND-BY-FORM-ID", param);

    }

}