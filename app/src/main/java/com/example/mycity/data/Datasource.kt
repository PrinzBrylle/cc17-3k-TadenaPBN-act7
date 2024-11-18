package com.example.mycity.data

import com.example.mycity.R

object Datasource {

    private val landmarksCategory = Category(
        name = R.string.landmarks_category,
        icon = R.drawable.landmarks,
        list = listOf(
            Place(
                name = R.string.lionshead_title,
                description = R.string.lionshead_description,
                address = R.string.lionshead_address,
                photo = R.drawable.tour1
            ),
            Place(
                name = R.string.diplomat_title,
                description = R.string.diplomat_description,
                address = R.string.diplomat_address,
                photo = R.drawable.tour2
            ),
            Place(
                name = R.string.mansion_title,
                description = R.string.mansion_description,
                address = R.string.mansion_address,
                photo = R.drawable.tour3
            ),
            Place(
                name = R.string.tamawan_title,
                description = R.string.tamawan_description,
                address = R.string.tamawan_address,
                photo = R.drawable.tour4
            ),
            Place(
                name = R.string.pma_title,
                description = R.string.pma_academy_description,
                address = R.string.pma_academy_address,
                photo = R.drawable.tour5
            ),
            Place(
                name = R.string.botanical_title,
                description = R.string.botanical_description,
                address = R.string.botanical_address,
                photo = R.drawable.tour6
            )
        )
    )

    private val barsCategory = Category(
        name = R.string.bars_category,
        icon = R.drawable.bar_icon,
        list = listOf(
            Place(
                name = R.string.bar1_title,
                description = R.string.bar1_description,
                address = R.string.bar1_address,
                photo = R.drawable.bar1
            ),
            Place(
                name = R.string.bar2_title,
                description = R.string.bar2_description,
                address = R.string.bar2_address,
                photo = R.drawable.bar2
            ),
            Place(
                name = R.string.bar3_title,
                description = R.string.bar3_description,
                address = R.string.bar3_address,
                photo = R.drawable.bar3
            ),Place(
                name = R.string.bar4_title,
                description = R.string.bar4_description,
                address = R.string.bar4_address,
                photo = R.drawable.bar4
            ),
            Place(
                name = R.string.bar5_title,
                description = R.string.bar5_description,
                address = R.string.bar5_address,
                photo = R.drawable.bar5
            )
        )
    )
    private val parksCategory=Category(
        name=R.string.parks_category,
        icon = R.drawable.nature_icon,
        list=listOf(
            Place(
                name = R.string.park1_title,
                description = R.string.park1_description,
                address = R.string.park1_address,
                photo = R.drawable.park1
            ),
            Place(
                name = R.string.park2_title,
                description = R.string.park2_description,
                address = R.string.park2_address,
                photo = R.drawable.park2
            ),
            Place(
                name = R.string.park3_title,
                description = R.string.park3_description,
                address = R.string.park3_address,
                photo = R.drawable.park3
            ),
            Place(
                name = R.string.park4_title,
                description = R.string.park4_description,
                address = R.string.park4_address,
                photo = R.drawable.park4
            ),
            Place(
                name = R.string.park5_title,
                description = R.string.park5_description,
                address = R.string.park5_address,
                photo = R.drawable.park5
            )
        )
    )
    private val shopsCategory=Category(
        name=R.string.shops_category,
        icon=R.drawable.shops_icon,
        list = listOf(
            Place(
                name = R.string.shop1_title,
                description = R.string.shop1_description,
                address = R.string.shop1_address,
                photo = R.drawable.shop1
            ),
            Place(
                name = R.string.shop2_title,
                description = R.string.shop2_description,
                address = R.string.shop2_address,
                photo = R.drawable.shop2
            ),
            Place(
                name = R.string.shop3_title,
                description = R.string.shop3_description,
                address = R.string.shop3_address,
                photo = R.drawable.shop3
            ),
            Place(
                name = R.string.shop4_title,
                description = R.string.shop4_description,
                address = R.string.shop4_address,
                photo = R.drawable.shop4
            )
        )
    )

    private val attractionsCategory= Category(
        name = R.string.churches_category,
        icon = R.drawable.baseline_church_24,
        list = listOf(
            Place(
                name = R.string.church1_title,
                description = R.string.church1_description,
                address = R.string.church1_address,
                photo = R.drawable.church1
            ),
            Place(
                name = R.string.church2_title,
                description = R.string.church2_description,
                address = R.string.church2_address,
                photo = R.drawable.church2
            ),
            Place(
                name = R.string.church3_title,
                description = R.string.church3_description,
                address = R.string.church3_address,
                photo = R.drawable.church3
            ),
            Place(
                name = R.string.church4_title,
                description = R.string.church4_description,
                address = R.string.church4_address,
                photo = R.drawable.church4
            ),
            Place(
                name = R.string.church5_title,
                description = R.string.church5_description,
                address = R.string.church5_address,
                photo = R.drawable.church5
            )
        )

    )
    val listOfCategories = listOf(landmarksCategory, barsCategory, parksCategory, shopsCategory, attractionsCategory)

}