package com.triputranto.academy.ui.bookmark

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Before
    fun setUp() {
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val courseEntities = viewModel.getBookmarks()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}