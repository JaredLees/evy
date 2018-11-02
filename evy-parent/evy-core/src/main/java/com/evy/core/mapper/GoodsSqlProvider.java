package com.evy.core.mapper;

import com.evy.core.bean.Goods;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class GoodsSqlProvider {

    public String insertSelective(Goods record) {
        BEGIN();
        INSERT_INTO("goods");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            VALUES("store_id", "#{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoryId() != null) {
            VALUES("category_id", "#{categoryId,jdbcType=BIGINT}");
        }
        
        if (record.getDeliveryFreightId() != null) {
            VALUES("delivery_freight_id", "#{deliveryFreightId,jdbcType=BIGINT}");
        }
        
        if (record.getSpecDetailId() != null) {
            VALUES("spec_detail_id", "#{specDetailId,jdbcType=TIMESTAMP}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBarcode() != null) {
            VALUES("barcode", "#{barcode,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPic() != null) {
            VALUES("pic", "#{pic,jdbcType=VARCHAR}");
        }
        
        if (record.getVideo() != null) {
            VALUES("video", "#{video,jdbcType=VARCHAR}");
        }
        
        if (record.getFeature() != null) {
            VALUES("feature", "#{feature,jdbcType=VARCHAR}");
        }
        
        if (record.getIndex() != null) {
            VALUES("index", "#{index,jdbcType=INTEGER}");
        }
        
        if (record.getShareIntegral() != null) {
            VALUES("share_integral", "#{shareIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getOriginalPrice() != null) {
            VALUES("original_price", "#{originalPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCurrentPrice() != null) {
            VALUES("current_price", "#{currentPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGroupPrice() != null) {
            VALUES("group_price", "#{groupPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMinPrice() != null) {
            VALUES("min_price", "#{minPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAllInventory() != null) {
            VALUES("all_inventory", "#{allInventory,jdbcType=INTEGER}");
        }
        
        if (record.getWeight() != null) {
            VALUES("weight", "#{weight,jdbcType=DECIMAL}");
        }
        
        if (record.getCanGroupBuy() != null) {
            VALUES("can_group_buy", "#{canGroupBuy,jdbcType=CHAR}");
        }
        
        if (record.getSellStartTime() != null) {
            VALUES("sell_start_time", "#{sellStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSellEndTime() != null) {
            VALUES("sell_end_time", "#{sellEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getItemUpShelf() != null) {
            VALUES("item_up_shelf", "#{itemUpShelf,jdbcType=CHAR}");
        }
        
        if (record.getRecomState() != null) {
            VALUES("recom_state", "#{recomState,jdbcType=CHAR}");
        }
        
        if (record.getViews() != null) {
            VALUES("views", "#{views,jdbcType=INTEGER}");
        }
        
        if (record.getCollections() != null) {
            VALUES("collections", "#{collections,jdbcType=INTEGER}");
        }
        
        if (record.getOrderNum() != null) {
            VALUES("order_num", "#{orderNum,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseNum() != null) {
            VALUES("praise_num", "#{praiseNum,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            VALUES("delete", "#{delete,jdbcType=CHAR}");
        }
        
        if (record.getDetail() != null) {
            VALUES("detail", "#{detail,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Goods record) {
        BEGIN();
        UPDATE("goods");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=BIGINT}");
        }
        
        if (record.getStoreId() != null) {
            SET("store_id = #{storeId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoryId() != null) {
            SET("category_id = #{categoryId,jdbcType=BIGINT}");
        }
        
        if (record.getDeliveryFreightId() != null) {
            SET("delivery_freight_id = #{deliveryFreightId,jdbcType=BIGINT}");
        }
        
        if (record.getSpecDetailId() != null) {
            SET("spec_detail_id = #{specDetailId,jdbcType=TIMESTAMP}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBarcode() != null) {
            SET("barcode = #{barcode,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPic() != null) {
            SET("pic = #{pic,jdbcType=VARCHAR}");
        }
        
        if (record.getVideo() != null) {
            SET("video = #{video,jdbcType=VARCHAR}");
        }
        
        if (record.getFeature() != null) {
            SET("feature = #{feature,jdbcType=VARCHAR}");
        }
        
        if (record.getIndex() != null) {
            SET("index = #{index,jdbcType=INTEGER}");
        }
        
        if (record.getShareIntegral() != null) {
            SET("share_integral = #{shareIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getOriginalPrice() != null) {
            SET("original_price = #{originalPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCurrentPrice() != null) {
            SET("current_price = #{currentPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGroupPrice() != null) {
            SET("group_price = #{groupPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getMinPrice() != null) {
            SET("min_price = #{minPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAllInventory() != null) {
            SET("all_inventory = #{allInventory,jdbcType=INTEGER}");
        }
        
        if (record.getWeight() != null) {
            SET("weight = #{weight,jdbcType=DECIMAL}");
        }
        
        if (record.getCanGroupBuy() != null) {
            SET("can_group_buy = #{canGroupBuy,jdbcType=CHAR}");
        }
        
        if (record.getSellStartTime() != null) {
            SET("sell_start_time = #{sellStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSellEndTime() != null) {
            SET("sell_end_time = #{sellEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getItemUpShelf() != null) {
            SET("item_up_shelf = #{itemUpShelf,jdbcType=CHAR}");
        }
        
        if (record.getRecomState() != null) {
            SET("recom_state = #{recomState,jdbcType=CHAR}");
        }
        
        if (record.getViews() != null) {
            SET("views = #{views,jdbcType=INTEGER}");
        }
        
        if (record.getCollections() != null) {
            SET("collections = #{collections,jdbcType=INTEGER}");
        }
        
        if (record.getOrderNum() != null) {
            SET("order_num = #{orderNum,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseNum() != null) {
            SET("praise_num = #{praiseNum,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyTime() != null) {
            SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelete() != null) {
            SET("delete = #{delete,jdbcType=CHAR}");
        }
        
        if (record.getDetail() != null) {
            SET("detail = #{detail,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
}