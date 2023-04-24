package com.test.payloads.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.test.payloads.data.model.DisplayPrint

class PagingSoursTest(private val list: List<DisplayPrint>) : PagingSource<Int, DisplayPrint>() {
    override fun getRefreshKey(state: PagingState<Int, DisplayPrint>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DisplayPrint> {
        return LoadResult.Page(
            data = list, nextKey = null, prevKey = null
        )
    }
}