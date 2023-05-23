import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import { Link } from 'react-router-dom'

export default function Navbar() {
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-body-tertiary " style={{ backgroundColor: "whitesmoke" }}>
                <div className="container-fluid">
                    <a className="navbar-brand" href="/home">
                        <img src="/logo.png" alt="Logo" width="60" height="60" />
                    </a>


                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <a className="nav-link active" aria-current="page" href="/home">Home</a>
                            </li>

                        </ul>
                        <ul className="navbar-nav">
                            <li className='nav-item'><Link className='btn btn-outline-dark mx-2' to="/manage_car">Manage Car By Car Employee</Link></li>
                            <li className='nav-item'><Link className='btn btn-outline-dark mx-2' to="/manage_user/list_user">Manage User By Admin</Link></li>
                            <li className='nav-item'><Link className='btn btn-outline-dark mx-2' to="/login">Login</Link></li>
                            
                            
                        </ul>

                    </div>
                </div>
            </nav>
        </div>
    )
}

