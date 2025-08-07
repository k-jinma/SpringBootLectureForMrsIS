package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.CalcForm;

@Controller
public class ValidationController {

    // 初期値設定用のメソッド
    // @ModelAttributeアノテーションを使用して、CalcFormのインスタンスを
    // コントローラのメソッドが呼ばれる前に作成
    // これにより、CalcFormのフィールドに初期値を設定する
    // ことができます。
    @ModelAttribute
    public CalcForm setUpForm(){
        return new CalcForm();
    }

    @GetMapping("show")
    public String showView(){
        return "entry";
    }

    @PostMapping("calc")
    public String confirmView(@Validated CalcForm form, BindingResult bindingResult) {

        if( bindingResult.hasErrors() ) {
            // 入力値にエラーがある場合、エラーメッセージを表示するために
            // entry.htmlに戻る
            return "entry";
        }

        // 入力値にエラーがない場合、確認画面に遷移する
        return "confirm";
    }
}
