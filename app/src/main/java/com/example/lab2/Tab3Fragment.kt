package com.example.lab2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import android.widget.TextView
import android.widget.TableLayout
import android.util.TypedValue
import androidx.fragment.app.Fragment

class Tab3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab3, container, false)

        val tableLayout = view.findViewById<TableLayout>(R.id.tableLayout)
        val textSizeInSp = 18.0f

        for (rowNum in 0 until 2) {
            val row = TableRow(context)
            val layoutParams = TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT)
            row.layoutParams = layoutParams

            for (colNum in 0 until 2) {
                val cell = TextView(context)
                cell.text = "Row $rowNum, Col $colNum"
                cell.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeInSp)
                val cellParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
                cell.layoutParams = cellParams
                row.addView(cell)
            }

            tableLayout.addView(row)
        }

        return view
    }
}