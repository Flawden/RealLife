package ru.kaxop.reallife

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class JobFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_health, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(getActivity())

        recyclerView.adapter = CustomRecyclerAdapter(fillList())


        return view
    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        data.add("Дворник (50 руб)")
        data.add("Охранник (150 руб)")
        data.add("Подсобник (200 руб)")
        data.add("Сварщик (300 руб)")
        data.add("Мастер (500 руб)")
        data.add("Начальник цеха (1000 руб)")
        return data
    }


}