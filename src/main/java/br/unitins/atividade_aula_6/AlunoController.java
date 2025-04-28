package br.unitins.atividade_aula_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // Operação de Incluir
    @PostMapping
    public Aluno incluir(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Operação de Listar
    @GetMapping
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }
}
