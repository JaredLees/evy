package com.evy.core.mapper;

import com.evy.core.bean.Goods;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodsMapper {
    @Delete({
        "delete from goods",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into goods (id, account_id, ",
        "store_id, category_id, ",
        "delivery_freight_id, spec_detail_id, ",
        "name, barcode, title, ",
        "pic, video, feature, ",
        "index, share_integral, ",
        "original_price, current_price, ",
        "group_price, min_price, ",
        "all_inventory, weight, ",
        "can_group_buy, sell_start_time, ",
        "sell_end_time, item_up_shelf, ",
        "recom_state, views, ",
        "collections, order_num, ",
        "praise_num, status, ",
        "create_time, modify_time, ",
        "delete, detail)",
        "values (#{id,jdbcType=BIGINT}, #{accountId,jdbcType=BIGINT}, ",
        "#{storeId,jdbcType=BIGINT}, #{categoryId,jdbcType=BIGINT}, ",
        "#{deliveryFreightId,jdbcType=BIGINT}, #{specDetailId,jdbcType=TIMESTAMP}, ",
        "#{name,jdbcType=VARCHAR}, #{barcode,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{pic,jdbcType=VARCHAR}, #{video,jdbcType=VARCHAR}, #{feature,jdbcType=VARCHAR}, ",
        "#{index,jdbcType=INTEGER}, #{shareIntegral,jdbcType=INTEGER}, ",
        "#{originalPrice,jdbcType=DECIMAL}, #{currentPrice,jdbcType=DECIMAL}, ",
        "#{groupPrice,jdbcType=DECIMAL}, #{minPrice,jdbcType=DECIMAL}, ",
        "#{allInventory,jdbcType=INTEGER}, #{weight,jdbcType=DECIMAL}, ",
        "#{canGroupBuy,jdbcType=CHAR}, #{sellStartTime,jdbcType=TIMESTAMP}, ",
        "#{sellEndTime,jdbcType=TIMESTAMP}, #{itemUpShelf,jdbcType=CHAR}, ",
        "#{recomState,jdbcType=CHAR}, #{views,jdbcType=INTEGER}, ",
        "#{collections,jdbcType=INTEGER}, #{orderNum,jdbcType=INTEGER}, ",
        "#{praiseNum,jdbcType=INTEGER}, #{status,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{delete,jdbcType=CHAR}, #{detail,jdbcType=LONGVARCHAR})"
    })
    int insert(Goods record);

    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(Goods record);

    @Select({
        "select",
        "id, account_id, store_id, category_id, delivery_freight_id, spec_detail_id, ",
        "name, barcode, title, pic, video, feature, index, share_integral, original_price, ",
        "current_price, group_price, min_price, all_inventory, weight, can_group_buy, ",
        "sell_start_time, sell_end_time, item_up_shelf, recom_state, views, collections, ",
        "order_num, praise_num, status, create_time, modify_time, delete, detail",
        "from goods",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.BIGINT),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.BIGINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="delivery_freight_id", property="deliveryFreightId", jdbcType=JdbcType.BIGINT),
        @Result(column="spec_detail_id", property="specDetailId", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="video", property="video", jdbcType=JdbcType.VARCHAR),
        @Result(column="feature", property="feature", jdbcType=JdbcType.VARCHAR),
        @Result(column="index", property="index", jdbcType=JdbcType.INTEGER),
        @Result(column="share_integral", property="shareIntegral", jdbcType=JdbcType.INTEGER),
        @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_price", property="currentPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="group_price", property="groupPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_price", property="minPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="all_inventory", property="allInventory", jdbcType=JdbcType.INTEGER),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="can_group_buy", property="canGroupBuy", jdbcType=JdbcType.CHAR),
        @Result(column="sell_start_time", property="sellStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sell_end_time", property="sellEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="item_up_shelf", property="itemUpShelf", jdbcType=JdbcType.CHAR),
        @Result(column="recom_state", property="recomState", jdbcType=JdbcType.CHAR),
        @Result(column="views", property="views", jdbcType=JdbcType.INTEGER),
        @Result(column="collections", property="collections", jdbcType=JdbcType.INTEGER),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="praise_num", property="praiseNum", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="detail", property="detail", jdbcType=JdbcType.LONGVARCHAR)
    })
    Goods selectByPrimaryKey(Long id);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Goods record);

    @Update({
        "update goods",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "category_id = #{categoryId,jdbcType=BIGINT},",
          "delivery_freight_id = #{deliveryFreightId,jdbcType=BIGINT},",
          "spec_detail_id = #{specDetailId,jdbcType=TIMESTAMP},",
          "name = #{name,jdbcType=VARCHAR},",
          "barcode = #{barcode,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "video = #{video,jdbcType=VARCHAR},",
          "feature = #{feature,jdbcType=VARCHAR},",
          "index = #{index,jdbcType=INTEGER},",
          "share_integral = #{shareIntegral,jdbcType=INTEGER},",
          "original_price = #{originalPrice,jdbcType=DECIMAL},",
          "current_price = #{currentPrice,jdbcType=DECIMAL},",
          "group_price = #{groupPrice,jdbcType=DECIMAL},",
          "min_price = #{minPrice,jdbcType=DECIMAL},",
          "all_inventory = #{allInventory,jdbcType=INTEGER},",
          "weight = #{weight,jdbcType=DECIMAL},",
          "can_group_buy = #{canGroupBuy,jdbcType=CHAR},",
          "sell_start_time = #{sellStartTime,jdbcType=TIMESTAMP},",
          "sell_end_time = #{sellEndTime,jdbcType=TIMESTAMP},",
          "item_up_shelf = #{itemUpShelf,jdbcType=CHAR},",
          "recom_state = #{recomState,jdbcType=CHAR},",
          "views = #{views,jdbcType=INTEGER},",
          "collections = #{collections,jdbcType=INTEGER},",
          "order_num = #{orderNum,jdbcType=INTEGER},",
          "praise_num = #{praiseNum,jdbcType=INTEGER},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR},",
          "detail = #{detail,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Goods record);

    @Update({
        "update goods",
        "set account_id = #{accountId,jdbcType=BIGINT},",
          "store_id = #{storeId,jdbcType=BIGINT},",
          "category_id = #{categoryId,jdbcType=BIGINT},",
          "delivery_freight_id = #{deliveryFreightId,jdbcType=BIGINT},",
          "spec_detail_id = #{specDetailId,jdbcType=TIMESTAMP},",
          "name = #{name,jdbcType=VARCHAR},",
          "barcode = #{barcode,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "video = #{video,jdbcType=VARCHAR},",
          "feature = #{feature,jdbcType=VARCHAR},",
          "index = #{index,jdbcType=INTEGER},",
          "share_integral = #{shareIntegral,jdbcType=INTEGER},",
          "original_price = #{originalPrice,jdbcType=DECIMAL},",
          "current_price = #{currentPrice,jdbcType=DECIMAL},",
          "group_price = #{groupPrice,jdbcType=DECIMAL},",
          "min_price = #{minPrice,jdbcType=DECIMAL},",
          "all_inventory = #{allInventory,jdbcType=INTEGER},",
          "weight = #{weight,jdbcType=DECIMAL},",
          "can_group_buy = #{canGroupBuy,jdbcType=CHAR},",
          "sell_start_time = #{sellStartTime,jdbcType=TIMESTAMP},",
          "sell_end_time = #{sellEndTime,jdbcType=TIMESTAMP},",
          "item_up_shelf = #{itemUpShelf,jdbcType=CHAR},",
          "recom_state = #{recomState,jdbcType=CHAR},",
          "views = #{views,jdbcType=INTEGER},",
          "collections = #{collections,jdbcType=INTEGER},",
          "order_num = #{orderNum,jdbcType=INTEGER},",
          "praise_num = #{praiseNum,jdbcType=INTEGER},",
          "status = #{status,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "delete = #{delete,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Goods record);
}