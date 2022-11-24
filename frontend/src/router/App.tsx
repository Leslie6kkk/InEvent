// import React, { Component } from 'react'
import React from 'react'
//路由的总容器管理，管理每个路由、组件、访问路径，匹配的规则
// import { HashRouter as Router, Route, Routes } from 'react-router-dom'
import { BrowserRouter as Router, Routes, Route, Link, NavLink, Navigate } from 'react-router-dom'
import HomePage from "../pages/homepage"
import MainPage from "../pages/mainpage"
import SignUp from "../pages/signup/SignupPage"
import HeaderNav from '../components/HeaderNav/HeaderNav'
import "../App.css"
// const App = () => {
//     return (
//         <Router>
//             <Routes>
//                 <Route path = '/homepage' element = {<HomePage />} />
//                 <Route path = '/signup' element = {<SignUp />} />
//                 <Route path = '/mainpage' element = {<MainPage />} />
//             </Routes>
//         </Router>
//     )
// }
function App() {
    return (
        <div>
            <HeaderNav />
            <NavLink className={({isActive}) => isActive?"active":""} to="/signup">sign up</NavLink>
            <Routes>
                <Route path = '/homepage' element = {<HomePage />} />
                <Route path = '/signup' element = {<SignUp />} />
                <Route path = '/mainpage' element = {<MainPage />} />
                <Route path = '/' element = {<Navigate to='/MainPage' />} />
            </Routes>
        </div>
    )
}
export default App
