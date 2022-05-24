package main.one

import java.util.*

private fun main() {
    // データ準備
    val categoryList = listOf(
        CategoryCode(
            llCategoryCode = "ll001",
            lCategoryCode = "l001",
            mCategoryCode = "m001",
            sCategoryCode = "s001",
        ),
        CategoryCode(
            llCategoryCode = "ll001",
            lCategoryCode = "l001",
            mCategoryCode = "m001",
            sCategoryCode = "s002",
        ),
        CategoryCode(
            llCategoryCode = "ll001",
            lCategoryCode = "l001",
            mCategoryCode = "m002",
            sCategoryCode = "s003",
        ),
        CategoryCode(
            llCategoryCode = "ll001",
            lCategoryCode = "l002",
            mCategoryCode = "m003",
            sCategoryCode = "s004",
        ),
        CategoryCode(
            llCategoryCode = "ll002",
            lCategoryCode = "l003",
            mCategoryCode = "m004",
            sCategoryCode = "s005",
        ),
    )




}

data class CategoryCode(
    val llCategoryCode : String ,
    val lCategoryCode : String,
    val mCategoryCode : String,
    val sCategoryCode : String,
)


data class MCategory(
    val mCategories:List<SCategory>
)

data class SCategory(
    val sCategories: List<Category>
)

data class Category(
    val categoryCode: String,
)