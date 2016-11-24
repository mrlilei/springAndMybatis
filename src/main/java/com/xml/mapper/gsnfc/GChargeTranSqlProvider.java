package com.xml.mapper.gsnfc;

import com.bean.gsnfc.GChargeTran;
import com.bean.gsnfc.GChargeTranExample.Criteria;
import com.bean.gsnfc.GChargeTranExample.Criterion;
import com.bean.gsnfc.GChargeTranExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GChargeTranSqlProvider {

    public String countByExample(GChargeTranExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("GSNFC.G_CHARGE_TRAN");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GChargeTranExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("GSNFC.G_CHARGE_TRAN");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GChargeTran record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("GSNFC.G_CHARGE_TRAN");
        
        if (record.getTraceid() != null) {
            sql.VALUES("TRACEID", "#{traceid,jdbcType=CHAR}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("STATE", "#{state,jdbcType=INTEGER}");
        }
        
        if (record.getSettleflag() != null) {
            sql.VALUES("SETTLEFLAG", "#{settleflag,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("BALANCE", "#{balance,jdbcType=INTEGER}");
        }
        
        if (record.getOpdt() != null) {
            sql.VALUES("OPDT", "#{opdt,jdbcType=CHAR}");
        }
        
        if (record.getBuscode() != null) {
            sql.VALUES("BUSCODE", "#{buscode,jdbcType=VARCHAR}");
        }
        
        if (record.getCardasn() != null) {
            sql.VALUES("CARDASN", "#{cardasn,jdbcType=VARCHAR}");
        }
        
        if (record.getMerid() != null) {
            sql.VALUES("MERID", "#{merid,jdbcType=CHAR}");
        }
        
        if (record.getCitycode() != null) {
            sql.VALUES("CITYCODE", "#{citycode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("MOBILE", "#{mobile,jdbcType=CHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.VALUES("PLANID", "#{planid,jdbcType=VARCHAR}");
        }
        
        if (record.getElectrsaveopcount() != null) {
            sql.VALUES("ELECTRSAVEOPCOUNT", "#{electrsaveopcount,jdbcType=VARCHAR}");
        }
        
        if (record.getRpid() != null) {
            sql.VALUES("RPID", "#{rpid,jdbcType=CHAR}");
        }
        
        if (record.getRetmsg() != null) {
            sql.VALUES("RETMSG", "#{retmsg,jdbcType=VARCHAR}");
        }
        
        if (record.getCardfee() != null) {
            sql.VALUES("CARDFEE", "#{cardfee,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeway() != null) {
            sql.VALUES("RECHARGEWAY", "#{rechargeway,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsid() != null) {
            sql.VALUES("GOODSID", "#{goodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            sql.VALUES("ORDERID", "#{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderdate() != null) {
            sql.VALUES("ORDERDATE", "#{orderdate,jdbcType=CHAR}");
        }
        
        if (record.getTradeno() != null) {
            sql.VALUES("TRADENO", "#{tradeno,jdbcType=VARCHAR}");
        }
        
        if (record.getTac() != null) {
            sql.VALUES("TAC", "#{tac,jdbcType=VARCHAR}");
        }
        
        if (record.getBanktrace() != null) {
            sql.VALUES("BANKTRACE", "#{banktrace,jdbcType=CHAR}");
        }
        
        if (record.getStldate() != null) {
            sql.VALUES("STLDATE", "#{stldate,jdbcType=CHAR}");
        }
        
        if (record.getTranscode() != null) {
            sql.VALUES("TRANSCODE", "#{transcode,jdbcType=VARCHAR}");
        }
        
        if (record.getMercheck() != null) {
            sql.VALUES("MERCHECK", "#{mercheck,jdbcType=SMALLINT}");
        }
        
        if (record.getBankcheck() != null) {
            sql.VALUES("BANKCHECK", "#{bankcheck,jdbcType=SMALLINT}");
        }
        
        if (record.getModtime() != null) {
            sql.VALUES("MODTIME", "#{modtime,jdbcType=CHAR}");
        }
        
        if (record.getCardtype() != null) {
            sql.VALUES("CARDTYPE", "#{cardtype,jdbcType=INTEGER}");
        }
        
        if (record.getBankmerid() != null) {
            sql.VALUES("BANKMERID", "#{bankmerid,jdbcType=VARCHAR}");
        }
        
        if (record.getMbtradenum() != null) {
            sql.VALUES("MBTRADENUM", "#{mbtradenum,jdbcType=CHAR}");
        }
        
        if (record.getIntime() != null) {
            sql.VALUES("INTIME", "#{intime,jdbcType=CHAR}");
        }
        
        if (record.getMac1() != null) {
            sql.VALUES("MAC1", "#{mac1,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom() != null) {
            sql.VALUES("RANDOM", "#{random,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyver() != null) {
            sql.VALUES("KEYVER", "#{keyver,jdbcType=VARCHAR}");
        }
        
        if (record.getComputtag() != null) {
            sql.VALUES("COMPUTTAG", "#{computtag,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom2() != null) {
            sql.VALUES("RANDOM2", "#{random2,jdbcType=VARCHAR}");
        }
        
        if (record.getMac2() != null) {
            sql.VALUES("MAC2", "#{mac2,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(GChargeTranExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TRACEID");
        } else {
            sql.SELECT("TRACEID");
        }
        sql.SELECT("STATE");
        sql.SELECT("SETTLEFLAG");
        sql.SELECT("BALANCE");
        sql.SELECT("OPDT");
        sql.SELECT("BUSCODE");
        sql.SELECT("CARDASN");
        sql.SELECT("MERID");
        sql.SELECT("CITYCODE");
        sql.SELECT("MOBILE");
        sql.SELECT("PLANID");
        sql.SELECT("ELECTRSAVEOPCOUNT");
        sql.SELECT("RPID");
        sql.SELECT("RETMSG");
        sql.SELECT("CARDFEE");
        sql.SELECT("RECHARGEWAY");
        sql.SELECT("GOODSID");
        sql.SELECT("ORDERID");
        sql.SELECT("ORDERDATE");
        sql.SELECT("TRADENO");
        sql.SELECT("TAC");
        sql.SELECT("BANKTRACE");
        sql.SELECT("STLDATE");
        sql.SELECT("TRANSCODE");
        sql.SELECT("MERCHECK");
        sql.SELECT("BANKCHECK");
        sql.SELECT("MODTIME");
        sql.SELECT("CARDTYPE");
        sql.SELECT("BANKMERID");
        sql.SELECT("MBTRADENUM");
        sql.SELECT("INTIME");
        sql.SELECT("MAC1");
        sql.SELECT("RANDOM");
        sql.SELECT("KEYVER");
        sql.SELECT("COMPUTTAG");
        sql.SELECT("RANDOM2");
        sql.SELECT("MAC2");
        sql.FROM("GSNFC.G_CHARGE_TRAN");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GChargeTran record = (GChargeTran) parameter.get("record");
        GChargeTranExample example = (GChargeTranExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("GSNFC.G_CHARGE_TRAN");
        
        if (record.getTraceid() != null) {
            sql.SET("TRACEID = #{record.traceid,jdbcType=CHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("STATE = #{record.state,jdbcType=INTEGER}");
        }
        
        if (record.getSettleflag() != null) {
            sql.SET("SETTLEFLAG = #{record.settleflag,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("BALANCE = #{record.balance,jdbcType=INTEGER}");
        }
        
        if (record.getOpdt() != null) {
            sql.SET("OPDT = #{record.opdt,jdbcType=CHAR}");
        }
        
        if (record.getBuscode() != null) {
            sql.SET("BUSCODE = #{record.buscode,jdbcType=VARCHAR}");
        }
        
        if (record.getCardasn() != null) {
            sql.SET("CARDASN = #{record.cardasn,jdbcType=VARCHAR}");
        }
        
        if (record.getMerid() != null) {
            sql.SET("MERID = #{record.merid,jdbcType=CHAR}");
        }
        
        if (record.getCitycode() != null) {
            sql.SET("CITYCODE = #{record.citycode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("MOBILE = #{record.mobile,jdbcType=CHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.SET("PLANID = #{record.planid,jdbcType=VARCHAR}");
        }
        
        if (record.getElectrsaveopcount() != null) {
            sql.SET("ELECTRSAVEOPCOUNT = #{record.electrsaveopcount,jdbcType=VARCHAR}");
        }
        
        if (record.getRpid() != null) {
            sql.SET("RPID = #{record.rpid,jdbcType=CHAR}");
        }
        
        if (record.getRetmsg() != null) {
            sql.SET("RETMSG = #{record.retmsg,jdbcType=VARCHAR}");
        }
        
        if (record.getCardfee() != null) {
            sql.SET("CARDFEE = #{record.cardfee,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeway() != null) {
            sql.SET("RECHARGEWAY = #{record.rechargeway,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsid() != null) {
            sql.SET("GOODSID = #{record.goodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            sql.SET("ORDERID = #{record.orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderdate() != null) {
            sql.SET("ORDERDATE = #{record.orderdate,jdbcType=CHAR}");
        }
        
        if (record.getTradeno() != null) {
            sql.SET("TRADENO = #{record.tradeno,jdbcType=VARCHAR}");
        }
        
        if (record.getTac() != null) {
            sql.SET("TAC = #{record.tac,jdbcType=VARCHAR}");
        }
        
        if (record.getBanktrace() != null) {
            sql.SET("BANKTRACE = #{record.banktrace,jdbcType=CHAR}");
        }
        
        if (record.getStldate() != null) {
            sql.SET("STLDATE = #{record.stldate,jdbcType=CHAR}");
        }
        
        if (record.getTranscode() != null) {
            sql.SET("TRANSCODE = #{record.transcode,jdbcType=VARCHAR}");
        }
        
        if (record.getMercheck() != null) {
            sql.SET("MERCHECK = #{record.mercheck,jdbcType=SMALLINT}");
        }
        
        if (record.getBankcheck() != null) {
            sql.SET("BANKCHECK = #{record.bankcheck,jdbcType=SMALLINT}");
        }
        
        if (record.getModtime() != null) {
            sql.SET("MODTIME = #{record.modtime,jdbcType=CHAR}");
        }
        
        if (record.getCardtype() != null) {
            sql.SET("CARDTYPE = #{record.cardtype,jdbcType=INTEGER}");
        }
        
        if (record.getBankmerid() != null) {
            sql.SET("BANKMERID = #{record.bankmerid,jdbcType=VARCHAR}");
        }
        
        if (record.getMbtradenum() != null) {
            sql.SET("MBTRADENUM = #{record.mbtradenum,jdbcType=CHAR}");
        }
        
        if (record.getIntime() != null) {
            sql.SET("INTIME = #{record.intime,jdbcType=CHAR}");
        }
        
        if (record.getMac1() != null) {
            sql.SET("MAC1 = #{record.mac1,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom() != null) {
            sql.SET("RANDOM = #{record.random,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyver() != null) {
            sql.SET("KEYVER = #{record.keyver,jdbcType=VARCHAR}");
        }
        
        if (record.getComputtag() != null) {
            sql.SET("COMPUTTAG = #{record.computtag,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom2() != null) {
            sql.SET("RANDOM2 = #{record.random2,jdbcType=VARCHAR}");
        }
        
        if (record.getMac2() != null) {
            sql.SET("MAC2 = #{record.mac2,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("GSNFC.G_CHARGE_TRAN");
        
        sql.SET("TRACEID = #{record.traceid,jdbcType=CHAR}");
        sql.SET("STATE = #{record.state,jdbcType=INTEGER}");
        sql.SET("SETTLEFLAG = #{record.settleflag,jdbcType=INTEGER}");
        sql.SET("BALANCE = #{record.balance,jdbcType=INTEGER}");
        sql.SET("OPDT = #{record.opdt,jdbcType=CHAR}");
        sql.SET("BUSCODE = #{record.buscode,jdbcType=VARCHAR}");
        sql.SET("CARDASN = #{record.cardasn,jdbcType=VARCHAR}");
        sql.SET("MERID = #{record.merid,jdbcType=CHAR}");
        sql.SET("CITYCODE = #{record.citycode,jdbcType=VARCHAR}");
        sql.SET("MOBILE = #{record.mobile,jdbcType=CHAR}");
        sql.SET("PLANID = #{record.planid,jdbcType=VARCHAR}");
        sql.SET("ELECTRSAVEOPCOUNT = #{record.electrsaveopcount,jdbcType=VARCHAR}");
        sql.SET("RPID = #{record.rpid,jdbcType=CHAR}");
        sql.SET("RETMSG = #{record.retmsg,jdbcType=VARCHAR}");
        sql.SET("CARDFEE = #{record.cardfee,jdbcType=INTEGER}");
        sql.SET("RECHARGEWAY = #{record.rechargeway,jdbcType=INTEGER}");
        sql.SET("GOODSID = #{record.goodsid,jdbcType=VARCHAR}");
        sql.SET("ORDERID = #{record.orderid,jdbcType=VARCHAR}");
        sql.SET("ORDERDATE = #{record.orderdate,jdbcType=CHAR}");
        sql.SET("TRADENO = #{record.tradeno,jdbcType=VARCHAR}");
        sql.SET("TAC = #{record.tac,jdbcType=VARCHAR}");
        sql.SET("BANKTRACE = #{record.banktrace,jdbcType=CHAR}");
        sql.SET("STLDATE = #{record.stldate,jdbcType=CHAR}");
        sql.SET("TRANSCODE = #{record.transcode,jdbcType=VARCHAR}");
        sql.SET("MERCHECK = #{record.mercheck,jdbcType=SMALLINT}");
        sql.SET("BANKCHECK = #{record.bankcheck,jdbcType=SMALLINT}");
        sql.SET("MODTIME = #{record.modtime,jdbcType=CHAR}");
        sql.SET("CARDTYPE = #{record.cardtype,jdbcType=INTEGER}");
        sql.SET("BANKMERID = #{record.bankmerid,jdbcType=VARCHAR}");
        sql.SET("MBTRADENUM = #{record.mbtradenum,jdbcType=CHAR}");
        sql.SET("INTIME = #{record.intime,jdbcType=CHAR}");
        sql.SET("MAC1 = #{record.mac1,jdbcType=VARCHAR}");
        sql.SET("RANDOM = #{record.random,jdbcType=VARCHAR}");
        sql.SET("KEYVER = #{record.keyver,jdbcType=VARCHAR}");
        sql.SET("COMPUTTAG = #{record.computtag,jdbcType=VARCHAR}");
        sql.SET("RANDOM2 = #{record.random2,jdbcType=VARCHAR}");
        sql.SET("MAC2 = #{record.mac2,jdbcType=VARCHAR}");
        
        GChargeTranExample example = (GChargeTranExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GChargeTran record) {
        SQL sql = new SQL();
        sql.UPDATE("GSNFC.G_CHARGE_TRAN");
        
        if (record.getState() != null) {
            sql.SET("STATE = #{state,jdbcType=INTEGER}");
        }
        
        if (record.getSettleflag() != null) {
            sql.SET("SETTLEFLAG = #{settleflag,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("BALANCE = #{balance,jdbcType=INTEGER}");
        }
        
        if (record.getOpdt() != null) {
            sql.SET("OPDT = #{opdt,jdbcType=CHAR}");
        }
        
        if (record.getBuscode() != null) {
            sql.SET("BUSCODE = #{buscode,jdbcType=VARCHAR}");
        }
        
        if (record.getCardasn() != null) {
            sql.SET("CARDASN = #{cardasn,jdbcType=VARCHAR}");
        }
        
        if (record.getMerid() != null) {
            sql.SET("MERID = #{merid,jdbcType=CHAR}");
        }
        
        if (record.getCitycode() != null) {
            sql.SET("CITYCODE = #{citycode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("MOBILE = #{mobile,jdbcType=CHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.SET("PLANID = #{planid,jdbcType=VARCHAR}");
        }
        
        if (record.getElectrsaveopcount() != null) {
            sql.SET("ELECTRSAVEOPCOUNT = #{electrsaveopcount,jdbcType=VARCHAR}");
        }
        
        if (record.getRpid() != null) {
            sql.SET("RPID = #{rpid,jdbcType=CHAR}");
        }
        
        if (record.getRetmsg() != null) {
            sql.SET("RETMSG = #{retmsg,jdbcType=VARCHAR}");
        }
        
        if (record.getCardfee() != null) {
            sql.SET("CARDFEE = #{cardfee,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeway() != null) {
            sql.SET("RECHARGEWAY = #{rechargeway,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsid() != null) {
            sql.SET("GOODSID = #{goodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            sql.SET("ORDERID = #{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderdate() != null) {
            sql.SET("ORDERDATE = #{orderdate,jdbcType=CHAR}");
        }
        
        if (record.getTradeno() != null) {
            sql.SET("TRADENO = #{tradeno,jdbcType=VARCHAR}");
        }
        
        if (record.getTac() != null) {
            sql.SET("TAC = #{tac,jdbcType=VARCHAR}");
        }
        
        if (record.getBanktrace() != null) {
            sql.SET("BANKTRACE = #{banktrace,jdbcType=CHAR}");
        }
        
        if (record.getStldate() != null) {
            sql.SET("STLDATE = #{stldate,jdbcType=CHAR}");
        }
        
        if (record.getTranscode() != null) {
            sql.SET("TRANSCODE = #{transcode,jdbcType=VARCHAR}");
        }
        
        if (record.getMercheck() != null) {
            sql.SET("MERCHECK = #{mercheck,jdbcType=SMALLINT}");
        }
        
        if (record.getBankcheck() != null) {
            sql.SET("BANKCHECK = #{bankcheck,jdbcType=SMALLINT}");
        }
        
        if (record.getModtime() != null) {
            sql.SET("MODTIME = #{modtime,jdbcType=CHAR}");
        }
        
        if (record.getCardtype() != null) {
            sql.SET("CARDTYPE = #{cardtype,jdbcType=INTEGER}");
        }
        
        if (record.getBankmerid() != null) {
            sql.SET("BANKMERID = #{bankmerid,jdbcType=VARCHAR}");
        }
        
        if (record.getMbtradenum() != null) {
            sql.SET("MBTRADENUM = #{mbtradenum,jdbcType=CHAR}");
        }
        
        if (record.getIntime() != null) {
            sql.SET("INTIME = #{intime,jdbcType=CHAR}");
        }
        
        if (record.getMac1() != null) {
            sql.SET("MAC1 = #{mac1,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom() != null) {
            sql.SET("RANDOM = #{random,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyver() != null) {
            sql.SET("KEYVER = #{keyver,jdbcType=VARCHAR}");
        }
        
        if (record.getComputtag() != null) {
            sql.SET("COMPUTTAG = #{computtag,jdbcType=VARCHAR}");
        }
        
        if (record.getRandom2() != null) {
            sql.SET("RANDOM2 = #{random2,jdbcType=VARCHAR}");
        }
        
        if (record.getMac2() != null) {
            sql.SET("MAC2 = #{mac2,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("TRACEID = #{traceid,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GChargeTranExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}