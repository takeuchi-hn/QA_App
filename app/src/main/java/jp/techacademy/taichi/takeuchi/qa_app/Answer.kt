package jp.techacademy.taichi.takeuchi.qa_app

import java.io.Serializable

// body	Firebaseから取得した回答本文
// name	Firebaseから取得した回答者の名前
// uid	Firebaseから取得した回答者のUID
// answerUid	Firebaseから取得した回答のUID
class Answer(val body: String,
             val name: String,
             val uid: String,
             val answerUid: String
             ) : Serializable