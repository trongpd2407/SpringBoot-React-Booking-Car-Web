import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { Link, useParams } from 'react-router-dom'
export default function () {
    const {id} =useParams()
    const [users,setUsers] = useState([])
    useEffect(()=>{
        loadUsers()
    },[])
    const loadUsers = async ()=>{
        const result = await axios.get("http://localhost:8080/manage_user/list_user")
        setUsers(result.data)
    }
    const deleteUser = async(id)=>{
        await axios.delete(`http://localhost:8080/manage_user/delete_user/${id}`)
        loadUsers()
    }
    return (
        
        <div className='container'>
            <h2> Manage User</h2>
            <div className='py-4'>
                <div>
                    
                    <Link className='btn btn-outline-primary mx-2' to="/manage_user/add_user">
                        Add New User
                    </Link>
                </div>
                
                <table className="table">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">FullName</th>
                            <th scope="col">PhoneNumber</th>
                            <th scope="col">Email</th>
                            <th scope="col">Password</th>
                            <th scope="col">Address</th>
                            <th scope="col">Role</th>
                            <th scope='col'>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {users.map((user)=>(
                            <tr>
                            <th scope="row" key={user.uid}>{user.uid}</th>
                            <td>{user.fullname}</td>
                            <td>{user.phonenumber}</td>
                            <td>{user.email}</td>
                            <td>{user.password}</td>
                            <td>{user.address}</td>
                            <td>{user.role}</td>
                            <td>

                                <button className='btn btn-outline-danger mx-2' onClick={()=> deleteUser(user.uid)}>Delete</button>
                                <Link className='btn btn-outline-dark mx-2' to ={`/manage_user/edit_user/${user.uid}`}>Edit</Link>
                            </td>
                        </tr>
                        ))
                        }
                        
                        
                    </tbody>
                </table>
                
            </div>
        </div>
    )
}
