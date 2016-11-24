package com.xml.mapper.gsnfc;

import com.bean.gsnfc.GChargeTran;
import com.bean.gsnfc.GChargeTranExample;
import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@CacheNamespace(size = 512)
public interface GChargeTranMapper {
    @SelectProvider(type=GChargeTranSqlProvider.class, method="countByExample")
    long countByExample(GChargeTranExample example);

    @DeleteProvider(type=GChargeTranSqlProvider.class, method="deleteByExample")
    int deleteByExample(GChargeTranExample example);

    @Delete({
        "delete from GSNFC.G_CHARGE_TRAN",
        "where TRACEID = #{traceid,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String traceid);

    @Insert({
        "insert into GSNFC.G_CHARGE_TRAN (TRACEID, STATE, ",
        "SETTLEFLAG, BALANCE, ",
        "OPDT, BUSCODE, CARDASN, ",
        "MERID, CITYCODE, MOBILE, ",
        "PLANID, ELECTRSAVEOPCOUNT, ",
        "RPID, RETMSG, CARDFEE, ",
        "RECHARGEWAY, GOODSID, ",
        "ORDERID, ORDERDATE, ",
        "TRADENO, TAC, BANKTRACE, ",
        "STLDATE, TRANSCODE, ",
        "MERCHECK, BANKCHECK, ",
        "MODTIME, CARDTYPE, ",
        "BANKMERID, MBTRADENUM, ",
        "INTIME, MAC1, RANDOM, ",
        "KEYVER, COMPUTTAG, ",
        "RANDOM2, MAC2)",
        "values (#{traceid,jdbcType=CHAR}, #{state,jdbcType=INTEGER}, ",
        "#{settleflag,jdbcType=INTEGER}, #{balance,jdbcType=INTEGER}, ",
        "#{opdt,jdbcType=CHAR}, #{buscode,jdbcType=VARCHAR}, #{cardasn,jdbcType=VARCHAR}, ",
        "#{merid,jdbcType=CHAR}, #{citycode,jdbcType=VARCHAR}, #{mobile,jdbcType=CHAR}, ",
        "#{planid,jdbcType=VARCHAR}, #{electrsaveopcount,jdbcType=VARCHAR}, ",
        "#{rpid,jdbcType=CHAR}, #{retmsg,jdbcType=VARCHAR}, #{cardfee,jdbcType=INTEGER}, ",
        "#{rechargeway,jdbcType=INTEGER}, #{goodsid,jdbcType=VARCHAR}, ",
        "#{orderid,jdbcType=VARCHAR}, #{orderdate,jdbcType=CHAR}, ",
        "#{tradeno,jdbcType=VARCHAR}, #{tac,jdbcType=VARCHAR}, #{banktrace,jdbcType=CHAR}, ",
        "#{stldate,jdbcType=CHAR}, #{transcode,jdbcType=VARCHAR}, ",
        "#{mercheck,jdbcType=SMALLINT}, #{bankcheck,jdbcType=SMALLINT}, ",
        "#{modtime,jdbcType=CHAR}, #{cardtype,jdbcType=INTEGER}, ",
        "#{bankmerid,jdbcType=VARCHAR}, #{mbtradenum,jdbcType=CHAR}, ",
        "#{intime,jdbcType=CHAR}, #{mac1,jdbcType=VARCHAR}, #{random,jdbcType=VARCHAR}, ",
        "#{keyver,jdbcType=VARCHAR}, #{computtag,jdbcType=VARCHAR}, ",
        "#{random2,jdbcType=VARCHAR}, #{mac2,jdbcType=VARCHAR})"
    })
    int insert(GChargeTran record);

    @InsertProvider(type=GChargeTranSqlProvider.class, method="insertSelective")
    int insertSelective(GChargeTran record);

    @SelectProvider(type=GChargeTranSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TRACEID", property="traceid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="STATE", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="SETTLEFLAG", property="settleflag", jdbcType=JdbcType.INTEGER),
        @Result(column="BALANCE", property="balance", jdbcType=JdbcType.INTEGER),
        @Result(column="OPDT", property="opdt", jdbcType=JdbcType.CHAR),
        @Result(column="BUSCODE", property="buscode", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDASN", property="cardasn", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERID", property="merid", jdbcType=JdbcType.CHAR),
        @Result(column="CITYCODE", property="citycode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOBILE", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="PLANID", property="planid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ELECTRSAVEOPCOUNT", property="electrsaveopcount", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPID", property="rpid", jdbcType=JdbcType.CHAR),
        @Result(column="RETMSG", property="retmsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDFEE", property="cardfee", jdbcType=JdbcType.INTEGER),
        @Result(column="RECHARGEWAY", property="rechargeway", jdbcType=JdbcType.INTEGER),
        @Result(column="GOODSID", property="goodsid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERID", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERDATE", property="orderdate", jdbcType=JdbcType.CHAR),
        @Result(column="TRADENO", property="tradeno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TAC", property="tac", jdbcType=JdbcType.VARCHAR),
        @Result(column="BANKTRACE", property="banktrace", jdbcType=JdbcType.CHAR),
        @Result(column="STLDATE", property="stldate", jdbcType=JdbcType.CHAR),
        @Result(column="TRANSCODE", property="transcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHECK", property="mercheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="BANKCHECK", property="bankcheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="MODTIME", property="modtime", jdbcType=JdbcType.CHAR),
        @Result(column="CARDTYPE", property="cardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="BANKMERID", property="bankmerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MBTRADENUM", property="mbtradenum", jdbcType=JdbcType.CHAR),
        @Result(column="INTIME", property="intime", jdbcType=JdbcType.CHAR),
        @Result(column="MAC1", property="mac1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM", property="random", jdbcType=JdbcType.VARCHAR),
        @Result(column="KEYVER", property="keyver", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPUTTAG", property="computtag", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM2", property="random2", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAC2", property="mac2", jdbcType=JdbcType.VARCHAR)
    })
    List<GChargeTran> selectByExampleWithRowbounds(GChargeTranExample example, RowBounds rowBounds);

    @SelectProvider(type=GChargeTranSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TRACEID", property="traceid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="STATE", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="SETTLEFLAG", property="settleflag", jdbcType=JdbcType.INTEGER),
        @Result(column="BALANCE", property="balance", jdbcType=JdbcType.INTEGER),
        @Result(column="OPDT", property="opdt", jdbcType=JdbcType.CHAR),
        @Result(column="BUSCODE", property="buscode", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDASN", property="cardasn", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERID", property="merid", jdbcType=JdbcType.CHAR),
        @Result(column="CITYCODE", property="citycode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOBILE", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="PLANID", property="planid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ELECTRSAVEOPCOUNT", property="electrsaveopcount", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPID", property="rpid", jdbcType=JdbcType.CHAR),
        @Result(column="RETMSG", property="retmsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDFEE", property="cardfee", jdbcType=JdbcType.INTEGER),
        @Result(column="RECHARGEWAY", property="rechargeway", jdbcType=JdbcType.INTEGER),
        @Result(column="GOODSID", property="goodsid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERID", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERDATE", property="orderdate", jdbcType=JdbcType.CHAR),
        @Result(column="TRADENO", property="tradeno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TAC", property="tac", jdbcType=JdbcType.VARCHAR),
        @Result(column="BANKTRACE", property="banktrace", jdbcType=JdbcType.CHAR),
        @Result(column="STLDATE", property="stldate", jdbcType=JdbcType.CHAR),
        @Result(column="TRANSCODE", property="transcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHECK", property="mercheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="BANKCHECK", property="bankcheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="MODTIME", property="modtime", jdbcType=JdbcType.CHAR),
        @Result(column="CARDTYPE", property="cardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="BANKMERID", property="bankmerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MBTRADENUM", property="mbtradenum", jdbcType=JdbcType.CHAR),
        @Result(column="INTIME", property="intime", jdbcType=JdbcType.CHAR),
        @Result(column="MAC1", property="mac1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM", property="random", jdbcType=JdbcType.VARCHAR),
        @Result(column="KEYVER", property="keyver", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPUTTAG", property="computtag", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM2", property="random2", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAC2", property="mac2", jdbcType=JdbcType.VARCHAR)
    })
    List<GChargeTran> selectByExample(GChargeTranExample example);

    @Select({
        "select",
        "TRACEID, STATE, SETTLEFLAG, BALANCE, OPDT, BUSCODE, CARDASN, MERID, CITYCODE, ",
        "MOBILE, PLANID, ELECTRSAVEOPCOUNT, RPID, RETMSG, CARDFEE, RECHARGEWAY, GOODSID, ",
        "ORDERID, ORDERDATE, TRADENO, TAC, BANKTRACE, STLDATE, TRANSCODE, MERCHECK, BANKCHECK, ",
        "MODTIME, CARDTYPE, BANKMERID, MBTRADENUM, INTIME, MAC1, RANDOM, KEYVER, COMPUTTAG, ",
        "RANDOM2, MAC2",
        "from GSNFC.G_CHARGE_TRAN",
        "where TRACEID = #{traceid,jdbcType=CHAR}"
    })
    @Options(useCache = true, flushCache = false, timeout = 400)  
    @Results({
        @Result(column="TRACEID", property="traceid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="STATE", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="SETTLEFLAG", property="settleflag", jdbcType=JdbcType.INTEGER),
        @Result(column="BALANCE", property="balance", jdbcType=JdbcType.INTEGER),
        @Result(column="OPDT", property="opdt", jdbcType=JdbcType.CHAR),
        @Result(column="BUSCODE", property="buscode", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDASN", property="cardasn", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERID", property="merid", jdbcType=JdbcType.CHAR),
        @Result(column="CITYCODE", property="citycode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOBILE", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="PLANID", property="planid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ELECTRSAVEOPCOUNT", property="electrsaveopcount", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPID", property="rpid", jdbcType=JdbcType.CHAR),
        @Result(column="RETMSG", property="retmsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDFEE", property="cardfee", jdbcType=JdbcType.INTEGER),
        @Result(column="RECHARGEWAY", property="rechargeway", jdbcType=JdbcType.INTEGER),
        @Result(column="GOODSID", property="goodsid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERID", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDERDATE", property="orderdate", jdbcType=JdbcType.CHAR),
        @Result(column="TRADENO", property="tradeno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TAC", property="tac", jdbcType=JdbcType.VARCHAR),
        @Result(column="BANKTRACE", property="banktrace", jdbcType=JdbcType.CHAR),
        @Result(column="STLDATE", property="stldate", jdbcType=JdbcType.CHAR),
        @Result(column="TRANSCODE", property="transcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHECK", property="mercheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="BANKCHECK", property="bankcheck", jdbcType=JdbcType.SMALLINT),
        @Result(column="MODTIME", property="modtime", jdbcType=JdbcType.CHAR),
        @Result(column="CARDTYPE", property="cardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="BANKMERID", property="bankmerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MBTRADENUM", property="mbtradenum", jdbcType=JdbcType.CHAR),
        @Result(column="INTIME", property="intime", jdbcType=JdbcType.CHAR),
        @Result(column="MAC1", property="mac1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM", property="random", jdbcType=JdbcType.VARCHAR),
        @Result(column="KEYVER", property="keyver", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPUTTAG", property="computtag", jdbcType=JdbcType.VARCHAR),
        @Result(column="RANDOM2", property="random2", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAC2", property="mac2", jdbcType=JdbcType.VARCHAR)
    })
    GChargeTran selectByPrimaryKey(String traceid);

    @UpdateProvider(type=GChargeTranSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GChargeTran record, @Param("example") GChargeTranExample example);

    @UpdateProvider(type=GChargeTranSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GChargeTran record, @Param("example") GChargeTranExample example);

    @UpdateProvider(type=GChargeTranSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GChargeTran record);

    @Update({
        "update GSNFC.G_CHARGE_TRAN",
        "set STATE = #{state,jdbcType=INTEGER},",
          "SETTLEFLAG = #{settleflag,jdbcType=INTEGER},",
          "BALANCE = #{balance,jdbcType=INTEGER},",
          "OPDT = #{opdt,jdbcType=CHAR},",
          "BUSCODE = #{buscode,jdbcType=VARCHAR},",
          "CARDASN = #{cardasn,jdbcType=VARCHAR},",
          "MERID = #{merid,jdbcType=CHAR},",
          "CITYCODE = #{citycode,jdbcType=VARCHAR},",
          "MOBILE = #{mobile,jdbcType=CHAR},",
          "PLANID = #{planid,jdbcType=VARCHAR},",
          "ELECTRSAVEOPCOUNT = #{electrsaveopcount,jdbcType=VARCHAR},",
          "RPID = #{rpid,jdbcType=CHAR},",
          "RETMSG = #{retmsg,jdbcType=VARCHAR},",
          "CARDFEE = #{cardfee,jdbcType=INTEGER},",
          "RECHARGEWAY = #{rechargeway,jdbcType=INTEGER},",
          "GOODSID = #{goodsid,jdbcType=VARCHAR},",
          "ORDERID = #{orderid,jdbcType=VARCHAR},",
          "ORDERDATE = #{orderdate,jdbcType=CHAR},",
          "TRADENO = #{tradeno,jdbcType=VARCHAR},",
          "TAC = #{tac,jdbcType=VARCHAR},",
          "BANKTRACE = #{banktrace,jdbcType=CHAR},",
          "STLDATE = #{stldate,jdbcType=CHAR},",
          "TRANSCODE = #{transcode,jdbcType=VARCHAR},",
          "MERCHECK = #{mercheck,jdbcType=SMALLINT},",
          "BANKCHECK = #{bankcheck,jdbcType=SMALLINT},",
          "MODTIME = #{modtime,jdbcType=CHAR},",
          "CARDTYPE = #{cardtype,jdbcType=INTEGER},",
          "BANKMERID = #{bankmerid,jdbcType=VARCHAR},",
          "MBTRADENUM = #{mbtradenum,jdbcType=CHAR},",
          "INTIME = #{intime,jdbcType=CHAR},",
          "MAC1 = #{mac1,jdbcType=VARCHAR},",
          "RANDOM = #{random,jdbcType=VARCHAR},",
          "KEYVER = #{keyver,jdbcType=VARCHAR},",
          "COMPUTTAG = #{computtag,jdbcType=VARCHAR},",
          "RANDOM2 = #{random2,jdbcType=VARCHAR},",
          "MAC2 = #{mac2,jdbcType=VARCHAR}",
        "where TRACEID = #{traceid,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(GChargeTran record);
}