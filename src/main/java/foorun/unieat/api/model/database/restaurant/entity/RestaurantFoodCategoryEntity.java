package foorun.unieat.api.model.database.restaurant.entity;

import foorun.unieat.api.model.base.jpa.UniEatBaseEntity;
import foorun.unieat.api.model.database.category.entity.FoodCategoryEntity;
import foorun.unieat.api.model.database.restaurant.entity.primary_key.FoodCategory;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 식당 보유 음식 분류항목
 */
@Entity
@Table(name = "restaurant_category_food")
@Getter
@IdClass(FoodCategory.class)
public class RestaurantFoodCategoryEntity extends UniEatBaseEntity {
    /**
     * 식당 ID
     */
    @Id
    @Column(name = "restaurant_id", insertable = false, updatable = false)
    private Long primaryId;

    /**
     * 취급 음식 분류항목
     */
    @Id
    @Column(name = "food_category_id", length = 3, insertable = false, updatable = false)
    private String categoryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_category_id", referencedColumnName = "category_id")
    private FoodCategoryEntity foodCategory;
}