// import React, { Component } from 'react'
import React from 'react'
//路由的总容器管理，管理每个路由、组件、访问路径，匹配的规则
// import { HashRouter as Router, Route, Routes } from 'react-router-dom'
import { Routes, Route, Link, NavLink, Navigate } from 'react-router-dom'
import MainPage from "../pages/mainpage"
import SignUp from "../pages/signup"

// export default class index extends Component {
//     render() {
//         return (
//             <Router>
//                 <Routes>
//                     {/* {//指引到指定的组件上
//                     } */}
//                     <Route exact path = "/" Component = { MainPage }></Route>
//                     <Route path = "/signup" Component = { SignUp }></Route>
//                 </Routes>
//             </Router>
//         )
//     }
// }
const App = () => {
    return (
        <div>
            <Routes>
                <Route path = '/' element = {<MainPage />} />
                <Route path = '/signup' element = {<SignUp />} />
            </Routes>
        </div>
    )
}
export default App