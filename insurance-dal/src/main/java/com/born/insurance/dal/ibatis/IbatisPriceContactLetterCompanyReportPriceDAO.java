/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.PriceContactLetterCompanyReportPriceDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterCompanyReportPriceDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.PriceContactLetterCompanyReportPriceDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_company_report_price.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPriceContactLetterCompanyReportPriceDAO extends SqlMapClientDaoSupport implements PriceContactLetterCompanyReportPriceDAO {
	/**
	 *  Insert one <tt>PriceContactLetterCompanyReportPriceDO</tt> object to DB table <tt>price_contact_letter_company_report_price</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter_company_report_price(id,customer_user_id,customer_user_name,report_price_id,premium_amount,broker_amount,broker_amount_rate,create_date,expense_amount,difference_content,special_agreement,quotation_prerequisite,expiry_date,contactUserId,contactUserName,contactUserMobile,contactUserEmail,remark,version,ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPrice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterCompanyReportPriceDO priceContactLetterCompanyReportPrice) throws DataAccessException {
    	if (priceContactLetterCompanyReportPrice == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-INSERT", priceContactLetterCompanyReportPrice);

        return priceContactLetterCompanyReportPrice.getId();
    }

	/**
	 *  Update DB table <tt>price_contact_letter_company_report_price</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter_company_report_price set customer_user_id=?, customer_user_name=?, report_price_id=?, premium_amount=?, broker_amount=?, broker_amount_rate=?, create_date=?, expense_amount=?, difference_content=?, special_agreement=?, quotation_prerequisite=?, expiry_date=?, contactUserId=?, contactUserName=?, contactUserMobile=?, contactUserEmail=?, remark=?, version=?, ext=? where (id = ?)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPrice
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterCompanyReportPriceDO priceContactLetterCompanyReportPrice) throws DataAccessException {
    	if (priceContactLetterCompanyReportPrice == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-UPDATE", priceContactLetterCompanyReportPrice);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_user_id, customer_user_name, report_price_id, premium_amount, broker_amount, broker_amount_rate, create_date, expense_amount, difference_content, special_agreement, quotation_prerequisite, expiry_date, contactUserId, contactUserName, contactUserMobile, contactUserEmail, remark, version, ext from price_contact_letter_company_report_price where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return PriceContactLetterCompanyReportPriceDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterCompanyReportPriceDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (PriceContactLetterCompanyReportPriceDO) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>price_contact_letter_company_report_price</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_company_report_price where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from price_contact_letter_company_report_price where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPrice
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterCompanyReportPriceDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterCompanyReportPriceDO> findByCondition(PriceContactLetterCompanyReportPriceDO priceContactLetterCompanyReportPrice, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (priceContactLetterCompanyReportPrice == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("priceContactLetterCompanyReportPrice", priceContactLetterCompanyReportPrice);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter_company_report_price where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPrice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterCompanyReportPriceDO priceContactLetterCompanyReportPrice) throws DataAccessException {
    	if (priceContactLetterCompanyReportPrice == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-COMPANY-REPORT-PRICE-FIND-BY-CONDITION-COUNT", priceContactLetterCompanyReportPrice);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}