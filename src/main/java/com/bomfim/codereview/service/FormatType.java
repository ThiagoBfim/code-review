package com.bomfim.codereview.service;

import com.bomfim.codereview.service.format.FormatWord;
import com.bomfim.codereview.service.format.DoubleSpaceWord;
import com.bomfim.codereview.service.format.UpperCaseWord;

public enum FormatType {

    DOUBLE_SPACE_WORD(new DoubleSpaceWord()),
    UPPER_CASE(new UpperCaseWord());

    private final FormatWord formatWord;
    FormatType(FormatWord formatWord) {
        this.formatWord = formatWord;
    }

    public FormatWord getFormatWord() {
        return formatWord;
    }
}
