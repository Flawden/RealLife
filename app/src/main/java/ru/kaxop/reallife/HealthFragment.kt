package ru.kaxop.reallife

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HealthFragment : Fragment() {

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
        data.add("Афобазол")
        data.add("Анальгин")
        data.add("Аспирин")
        data.add("Панангин")
        data.add("Панкреатин")
        data.add("Афобазол")
        data.add("Анальгин")
        data.add("Аспирин")
        data.add("Панангин")
        data.add("Панкреатин")
        data.add("Абакавир")
        data.add("Абилифай")
        data.add("Абитаксел")
        data.add("Аванафил")
        data.add("Авандия")
        data.add("Авастин")
        data.add("Авелокс")
        data.add("Авестатин")
        data.add("Авибактам")
        data.add("Аген")
        data.add("Ящик водки")
        data.add("Ящик пива")
        data.add("Ящик спирта")
        data.add("Ящик виски")

        return data
    }

}