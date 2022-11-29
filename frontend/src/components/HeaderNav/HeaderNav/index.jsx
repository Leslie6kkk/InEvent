import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import "./style.css"

export default class HeaderNav extends Component {
    render() {
        return (
            <nav className='navbar navbar-expand-lg navbar-light'>
                <div className='container-fluid'>
                    {/* <ul ul class="nav nav-tabs"> */}
                    <Link className='navbar-brand' to="/homepage">InEvent</Link>
                    <div className='navbar-collapse'>
                        <ul className='navbar-nav mr-auto'>
                            <li className='nav-item'>
                                {/* <Link className={["nav-link", index===this.state.currentIndex?"nav-link active":null].join(' ')} to="/SignUp">SignUp</Link> */}
                                <Link className='nav-link' to="/signup">SignUp</Link>
                            </li>
                            <li className='nav-item'>
                                <Link className='nav-link' to="/mainpage" data-toggle="tab">Main</Link>
                            </li>
                        </ul>
                    </div>
                    {/* </ul> */}
                </div>
            </nav>
        )
    }
}
// document.querySelectorAll("nav-link").forEach((ele) =>
//   ele.addEventListener("click", function (event) {
//     event.preventDefault();
//     document
//       .querySelectorAll("nav-link")
//       .forEach((ele) => ele.classList.remove("active"));
//     this.classList.add("active")
//   })
// );